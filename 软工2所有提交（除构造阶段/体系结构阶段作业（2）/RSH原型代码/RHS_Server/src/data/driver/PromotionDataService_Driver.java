package driver;

import java.rmi.RemoteException;

import promotionDataService.PromotionDataService;
import promotionpo.PromotionPO;

public class PromotionDataService_Driver {
	
    public void drive(PromotionDataService pds)throws RemoteException{
    	PromotionPO propo= pds. check("000000");
    	if(propo==null)System.out.println("pro check success!");
    	pds.add(propo);
    	pds.update(propo);
    	pds.del(propo);
    	pds.init();
    	pds.finish();
}
}
