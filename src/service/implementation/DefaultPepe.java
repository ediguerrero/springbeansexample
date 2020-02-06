package service.implementation;

import service.BCartService;

public class DefaultPepe extends DefaultCart implements BCartService {
    @Override
    public void metX() {
System.out.println("metodo X");
    }

    @Override
    public void metY() {
System.out.println("metodo Y");


    }
}
