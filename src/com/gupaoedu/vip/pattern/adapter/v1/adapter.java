package com.gupaoedu.vip.pattern.adapter.v1;

public class adapter implements DC5V{

    private AC220 ac220;

    public adapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
       int output =  ac220.outputAC220V();
       System.out.println("转换后输出"+output/44+"V");
        return output/44;
    }

    public static void main(String[] args) {
        DC5V dc = new adapter(new AC220());
        dc.output5V();
    }
}
