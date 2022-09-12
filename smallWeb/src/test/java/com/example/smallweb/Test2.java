package com.example.smallweb;

public class Test2 {

    @org.junit.jupiter.api.Test
    public void  Test1(){
        int x =5;
        x += x -= x*x;
        System.out.println(x);//输出是-15
    }
}
