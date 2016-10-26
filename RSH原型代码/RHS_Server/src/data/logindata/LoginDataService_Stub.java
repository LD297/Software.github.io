package logindata;

import java.rmi.RemoteException;

import constant.Role;
import logindataservice.LoginDataService;
import loginpo.LoginRecordItemPO;

public class LoginDataService_Stub implements LoginDataService{

	@Override
	public void add(LoginRecordItemPO loginRecordItemPO) {
		System.out.println("Add successfully!");
		
	}

	@Override
	public void detele(LoginRecordItemPO loginRecordItemPO) {
		System.out.println("Delete successfully!");
		
	}

	@Override
	public void update(LoginRecordItemPO loginRecordItemPO) {
		System.out.println("Update successfully!");
		
	}

	@Override
	public LoginRecordItemPO check(String id) {
		return new LoginRecordItemPO(Role.user, "007", "2020-01-01");
	}

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
	
	
}
