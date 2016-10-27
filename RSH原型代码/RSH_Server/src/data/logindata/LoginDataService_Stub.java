package logindata;

import java.rmi.RemoteException;

import logindataservice.LoginDataService;
import po.OnlinePersonPO;

public class LoginDataService_Stub implements LoginDataService{


	@Override
	public boolean checkOnline(String id) {
		return false;
	}

	@Override
	public void init() throws RemoteException {
		System.out.println("Init successfully!");
		
	}

	@Override
	public void finish() throws RemoteException {
		System.out.println("Finish successfully!");		
	}

	@Override
	public void addOnline(OnlinePersonPO po) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deteleOnline(OnlinePersonPO po) {
		// TODO Auto-generated method stub
		
	}
	
	
}
