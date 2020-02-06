package facade.implementation;

import facade.IFacade;
import service.BCartService;

public class Facade implements IFacade {
private BCartService bcart;

public void setBcart(BCartService x){
    bcart=x;


}

    public BCartService getBcart() {
        return bcart;
    }

    @Override
    public String mycart() {
        return "HOLIS";
    }
}
