package com.designpatterns.singleton;

public class DateUtil2 {
    private static DateUtil2 instance = new DateUtil2();
    private DateUtil2(){

    }

    public static DateUtil2 getInstance(){
        return instance;
    }

}
