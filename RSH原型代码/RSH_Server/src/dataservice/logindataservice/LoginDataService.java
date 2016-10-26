package logindataservice;

import java.rmi.RemoteException;
import loginpo.LoginRecordItemPO;

public interface LoginDataService {
	public void add(LoginRecordItemPO  loginRecordItemPO);
	public void detele(LoginRecordItemPO  loginRecordItemPO);
	public void update(LoginRecordItemPO  loginRecordItemPO);
	public LoginRecordItemPO check(String id);
	public boolean checkOnline(String id);
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
