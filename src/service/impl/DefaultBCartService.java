package service.impl;

import service.BCartService;

public class DefaultBCartService extends DefaultACartService implements BCartService {
    @Override
    public void metX() {
System.out.println("metodo X");
    }

    @Override
    public void metY() {
System.out.println("metodo Y");


    }
}
