package com.gupaoedu.vip.pattern.adapter.v2;

public class MotorStrategy {

    public Motor createDriver(Class<? extends  Motor> clazz){
        try {
            if(null!=clazz){
               return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
