package com.designpatterns.singleton;

public class DateUtil3 {

        private static volatile DateUtil3 instance;
        private DateUtil3(){

        }

        public static DateUtil3 getInstance() {
            if (instance == null) {
                synchronized (DateUtil3.class) {
                    if (instance == null) {
                        instance = new DateUtil3();
                    }
                }
            }
            return instance;
        }
    }
