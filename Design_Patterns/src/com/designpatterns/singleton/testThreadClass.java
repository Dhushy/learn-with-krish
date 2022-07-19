package com.designpatterns.singleton;

public class testThreadClass {
    public static void main (String[] args){
        DateUtil3 dateUtil1 = DateUtil3.getInstance();
        DateUtil3 dateUtil2 = DateUtil3.getInstance();

        System.out.println( dateUtil1 == dateUtil2);

    }
}
