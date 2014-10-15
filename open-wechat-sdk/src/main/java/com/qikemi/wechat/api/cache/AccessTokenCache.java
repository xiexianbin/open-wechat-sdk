package com.qikemi.wechat.api.cache;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * wechat access_token cache 
 * @author Administrator
 *
 */
public class AccessTokenCache {
	
	/**
     * save virtual access token Map
     */
    private static Map<String, AccessTokenEntity> tokenCache = new ConcurrentHashMap<String, AccessTokenEntity>();
    
    /**
     * Save out-of-service time Map
     */
    private static Map<String,Long> tasks = new ConcurrentHashMap<String,Long>();
    
    /**
     * default constructor
     */
	public AccessTokenCache() {
		super();
	}
    
	/**
	 * save 
	 */
    public synchronized static void set(String key, AccessTokenEntity accessToken){
        tokenCache.put(key, accessToken);
        tasks.put(key, System.currentTimeMillis());
    }
	
	/**
	 * get access token cache 
	 * @param key
	 * @return
	 */
	public synchronized static Object get(String key){
		if(tasks.containsKey(key)){
			if(tasks.get(key) > 0){
				return tokenCache.get(key);
			}
		}
		return null;
    }
	
	/**
	 * delete appoint cache 
	 * @param key
	 */
    public synchronized static void delete(String key){
    	tokenCache.remove(key);
       	tasks.remove(key);
    }
    
    /**
     * judge is exist the appoint token 
     * @param key
     * @return
     */
    public synchronized static boolean hasCache(String key) {
		return tokenCache.containsKey(key);
	}
    
    /**
     * clear all cache access_token
     */
    public synchronized static void clearAll() {
    	tokenCache.clear();
	}
    
    /**
     * clear expired access_token 
     */
    public synchronized static void clearExpired(){
    	Set<String> keys = tokenCache.keySet();
    	for(Iterator<String> it = keys.iterator(); it.hasNext(); ){
    		String key = it.next();
    		if( (Long)tasks.get(key) > 0){
    			tokenCache.remove(key);
    	       	tasks.remove(key);
    		}
    	}
    }
    
    /**
     * get all cache key 
     */
    public synchronized static ArrayList<String> getAllKey(){
    	ArrayList<String> keyList = new ArrayList<String>();
    	Iterator<String> its = tokenCache.keySet().iterator();
    	while(its.hasNext()) {
    		keyList.add((String)its.next());
    	}
    	return keyList;
    }
    
    
}
