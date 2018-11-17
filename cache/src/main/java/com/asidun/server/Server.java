package com.asidun.server;

public class Server implements CachedServer {
    public Object getValue(String str){
        if (str.equals("obj1")){
            return new Obj1();
        }else if (str.equals("obj2")){
            return new Obj2();
        }else {
            return null;
        }
    }
}
