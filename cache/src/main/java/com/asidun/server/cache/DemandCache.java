package com.asidun.server.cache;

import com.asidun.server.CachedServer;

import java.util.HashMap;
import java.util.Map;

public class DemandCache implements CachedServer {
    private CachedServer server;
    Map<String, Object> cache = new HashMap<String, Object>();

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
