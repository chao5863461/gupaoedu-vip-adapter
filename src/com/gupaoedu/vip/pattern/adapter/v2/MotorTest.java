package com.gupaoedu.vip.pattern.adapter.v2;

public class MotorTest {

    public static void main(String[] args) {
        MotorStrategy ms = new MotorStrategy();
        Motor motor = ms.createDriver(ElectricAdapter.class);
        motor.drive();
    }
}
