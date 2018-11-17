package com.asidun.client;

import com.asidun.server.CachedServer;
import com.asidun.server.Server;
import com.asidun.server.cache.CacheStatistic;
import com.asidun.server.cache.DemandCache;
import com.asidun.server.cache.PrimaryCache;

public class Client {
    public static void main(String[] args){
        CachedServer server = new Server();
        System.out.println(server.getValue("obj1"));
        System.out.println(server.getValue("obj1"));

        server = new DemandCache(new Server());
        System.out.println(server.getValue("obj1"));
        System.out.println(server.getValue("obj1"));

        server = new CacheStatistic(new PrimaryCache(new DemandCache(new Server())));
        System.out.println(server.getValue("obj1"));
        System.out.println(server.getValue("obj1"));
        System.out.println(((CacheStatistic) server).getStatistic("obj1"));

    }
}
