package logindataservice;

import java.rmi.RemoteException;

import po.OnlinePersonPO;


public interface LoginDataService {
	public void addOnline(OnlinePersonPO po);
	public void deteleOnline(OnlinePersonPO po);
	public boolean checkOnline(String id);
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
