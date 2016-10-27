package driver;

import java.rmi.RemoteException;

import promotionpo.WebSalesmanPO;
import webstaffDataService.WebStaffDataService;

public class WebStaffDataService_Driver {
	
	 public void drive(WebStaffDataService wsds)throws RemoteException{
	    	WebSalesmanPO webpo= wsds. checkWebSalesman("000000");
	    	if(webpo==null)System.out.println("pro check success!");
	    	wsds.addWebSalesman(webpo);
	    	wsds.updateWebSalesman(webpo);
	    	wsds.delWebSalesman(webpo);
	    	wsds.init();
	    	wsds.finish();

	    }
}
