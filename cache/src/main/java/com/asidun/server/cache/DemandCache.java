package com.asidun.server.cache;

import com.asidun.server.CachedServer;

import java.util.HashMap;

public class DemandCache implements CachedServer {
    private CachedServer server;
    HashMap<String, Object> cache = new HashMap<String, Object>();

    private DemandCache (){}

    public DemandCache(CachedServer server){
        this.server = server;
    }

    public Object getValue(String str) {
        Object result = cache.get(str);
        if(result == null){
            result = server.getValue(str);
            cache.put(str, result);
        }
        return result;
    }
}
