package facade.impl;

import facade.IFacade;
import service.BCartService;

public class DefaultIFacade implements IFacade {
    private BCartService bCartService;

    public void setBcart(BCartService x) {
        bCartService = x;
    }

    public BCartService getBcart() {
        return bCartService;
    }

    @Override
    public String mycart() {
        boolean c= bCartService instanceof BCartService;
        if(c){
            return "es b cart";


        }
            return "es a cart";
    }
}
