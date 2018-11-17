package com.asidun.server.cache;

import com.asidun.server.CachedServer;

import java.util.HashMap;
import java.util.Map;

public class CacheStatistic implements CachedServer {

    private CachedServer server;
    private Map<String, Integer> statistic = new HashMap<>();

    private CacheStatistic(){}

    public CacheStatistic(CachedServer server){
        this.server = server;
    }

    @Override
    public Object getValue(String str) {
        Integer count = statistic.get(str);
        if (count == null){
            count = 1;
        }else{
            count++;
        }
        statistic.put(str, count);
        return server.getValue(str);
    }

    public Integer getStatistic(String str){
        return statistic.get(str);
    }
}
