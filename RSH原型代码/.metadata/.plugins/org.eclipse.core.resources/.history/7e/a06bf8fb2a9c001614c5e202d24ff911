package driver;

import java.rmi.RemoteException;

import userdata.UserDataService_Stub;
import userdataservice.UserDataService;
import userpo.UserPO;

public class UserDataService_Driver {
	
	public void drive(UserDataService userDataService) throws RemoteException{
		
		userDataService.init();
		
		userDataService.add(new UserPO(null, null, null, null, 0, null, null, null, null, null, 0));
		
		userDataService.detele("007");
		
		userDataService.update(new UserPO(null, null, null, null, 0, null, null, null, null, null, 0));
		
		UserPO userPO = userDataService.check("007");
		if(userPO.getId().equals("007")){
			System.out.println("Done!");
		} else {
			System.out.println("Error.Please try again.");
		}
		
		userDataService.finish();

	}
	
}
