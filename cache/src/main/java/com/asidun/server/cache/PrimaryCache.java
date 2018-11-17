package com.asidun.server.cache;

import com.asidun.server.CachedServer;

public class PrimaryCache implements CachedServer {

    private CachedServer server;

    private PrimaryCache(){};

    public PrimaryCache(CachedServer server){
        this.server = server;
        server.getValue("obj1");
        server.getValue("obj2");
    }

    @Override
    public Object getValue(String str) {
        return server.getValue(str);
    }
}
