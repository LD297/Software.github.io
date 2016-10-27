package driver;

import java.rmi.RemoteException;

import constant.Role;
import logindataservice.LoginDataService;
import po.OnlinePersonPO;

public class LoginDataService_Driver {
	
	public void drive(LoginDataService loginDataService) throws RemoteException{
		
		loginDataService.init();
		
		loginDataService.addOnline(new OnlinePersonPO(Role.user, "007"));
		
		loginDataService.deteleOnline(new OnlinePersonPO(Role.user, "007"));

		if(loginDataService.checkOnline("007")){
			System.out.println("Has been already online.");
		} else {
			System.out.println("Not online.");
		}
	
		loginDataService.finish();
			
	}

}
