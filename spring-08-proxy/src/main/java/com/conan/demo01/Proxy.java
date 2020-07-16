package com.conan.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }
    public void seeHouse() {
        System.out.println("中介带看房");
    }
    public void fare() {
        System.out.println("中介收中介费");
    }
    public void hetong() {
        System.out.println("签合同");
    }

}
