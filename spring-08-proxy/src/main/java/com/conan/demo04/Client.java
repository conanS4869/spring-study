package com.conan.demo04;

import com.conan.demo02.UserService;
import com.conan.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService= new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setTarget(userService);

        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();

    }
}
