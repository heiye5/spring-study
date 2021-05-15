package com.kuang.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        seeHouse();
        fare();
        heTong();
    }

    //看房
    public void seeHouse(){
        System.out.println("看房");
    }

    //收中介费
    public void fare(){
        System.out.println("中介费");
    }

    //合同
    public void heTong(){
        System.out.println("合同");
    }

}
