package userdataservice;

import java.rmi.RemoteException;

import userpo.UserPO;

public interface UserDataService {
	public void add(UserPO userPO);
	public void detele(String id);
	public void update(UserPO userPO);
	public UserPO check(String id);
	public void init() throws RemoteException;;
	public void finish() throws RemoteException;

}
