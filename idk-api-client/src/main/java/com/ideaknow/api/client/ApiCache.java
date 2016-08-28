package com.ideaknow.api.client;

import java.util.*;

/**
 * Stores the parsed objects as a response of a WS call.
 */
public class ApiCache {

    private static Hashtable<String, Object> mCache = new Hashtable<String, Object>();

    public static Object get(String key) {
        return mCache.get(key);
    }

    public static void put(String key, Object value) {
        mCache.put(key, value);
    }

    public static void clear() {
        mCache.clear();
    }

    public static boolean isEmpty() {
        return mCache.isEmpty();
    }
}
