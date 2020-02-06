package service.impl;

import service.ACartService;

public class DefaultACartService implements ACartService {


    @Override
    public void metA() {
    System.out.println("metedo A");
    }

    @Override
    public void metB() {
System.out.println("metodo b");
    }
}
