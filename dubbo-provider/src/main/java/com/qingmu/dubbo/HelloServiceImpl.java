package com.qingmu.dubbo;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String msg) {
        return "hello:"+msg;
    }
}
