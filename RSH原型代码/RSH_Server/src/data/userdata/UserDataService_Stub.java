package userdata;

import java.rmi.RemoteException;

import po.UserPO;
import userdataservice.UserDataService;

public class UserDataService_Stub implements UserDataService {

	@Override
	public void add(UserPO userPO) {
		System.out.println("Add successfully!");
	}

	@Override
	public void detele(String id) {
		System.out.println("Delete successfully!");
		
	}

	@Override
	public void update(UserPO userPO) {
		System.out.println("Update successfully!");
		
	}

	@Override
	public UserPO check(String id) {
		return new UserPO(null, null, null, null, 0, null, null, null, null, null, 0);
	}

	@Override
	public void init() throws RemoteException {
		System.out.println("Init successfully!");
		
	}

	@Override
	public void finish() throws RemoteException {
		System.out.println("Finish successfully!");		
		
	}

}
