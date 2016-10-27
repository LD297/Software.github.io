package webstaffData;

import java.rmi.RemoteException;

import po.WebSalesmanPO;
import webstaffDataService.WebStaffDataService;


public class WebStaffData implements WebStaffDataService{
	@Override
	public WebSalesmanPO checkWebSalesman(String id) throws RemoteException{
		return null;
	}
	@Override
	public void addWebSalesman(WebSalesmanPO po) throws RemoteException{
	
	}
	@Override
	public void updateWebSalesman(WebSalesmanPO po) throws RemoteException{
		
	}
	@Override
	public void delWebSalesman(WebSalesmanPO po) throws RemoteException{
		
	}
	@Override
	public void init()throws RemoteException{
		
	}
	@Override
	public void finish()throws RemoteException{
		
	}
}
