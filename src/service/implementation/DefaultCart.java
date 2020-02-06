package service.implementation;

import service.ACartService;

public class DefaultCart implements ACartService {


    @Override
    public void metA() {
    System.out.println("metedo A");
    }

    @Override
    public void metB() {
System.out.println("metodo b");
    }
}
