package webstaffData;

import java.rmi.RemoteException;

import po.WebSalesmanPO;
import webstaffDataService.WebStaffDataService;


public class WebStaffDataService_Stub implements WebStaffDataService{
    
	public WebSalesmanPO checkWebSalesman(String id) throws RemoteException{
		return null;
	}
	
	public void addWebSalesman(WebSalesmanPO po) throws RemoteException{
		System.out.println("web add success");
	}
	
	public void updateWebSalesman(WebSalesmanPO po) throws RemoteException{
		System.out.println("web update success");
	}
	
	public void delWebSalesman(WebSalesmanPO po) throws RemoteException{
		System.out.println("web del success");
	}
	
	public void init()throws RemoteException{
		System.out.println("web init success");
	}
		
	public void finish()throws RemoteException{
		System.out.println("web finish success");
	}
}
