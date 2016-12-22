package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import constant.ResultMessage;
import constant.Role;
import data.dao.logindao.LoginDao;
import data.dao.userdao.CreditRecordListDao;
import data.dao.userdao.UserDao;
import data.daoimpl.logindaoimpl.LoginDaoImpl;
import data.daoimpl.userdaoimpl.CreditRecordListDaoImpl;
import data.daoimpl.userdaoimpl.UserDaoImpl;
import po.CreditRecordPO;
import po.OnlinePersonPO;
import po.UserPO;

public class DataRemoteObject extends UnicastRemoteObject implements LoginDao,CreditRecordListDao,UserDao{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4029039744279087114L;
	private LoginDao loginDao;
	private CreditRecordListDao creditRecordListDao;
	private UserDao userDao;
	protected DataRemoteObject() throws RemoteException {
		loginDao = new LoginDaoImpl();
		creditRecordListDao = new CreditRecordListDaoImpl();
		userDao = new UserDaoImpl();
	}
	@Override
	public UserPO getInfo(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.getInfo(id);
	}
	@Override
	public ResultMessage update(UserPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.update(po);
	}
	@Override
	public ResultMessage add(UserPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.add(po);
	}
	@Override
	public ResultMessage checkPassword(String id, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.checkPassword(id, password);
	}
	@Override
	public ResultMessage register(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.register(id);
	}
	@Override
	public ResultMessage register(String id, String commerceName) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.register(id,commerceName);
	}
	@Override
	public ResultMessage setMemberLevel(int[][] gradeWithCredit) throws RemoteException {
		// TODO Auto-generated method stub
		return userDao.setMemberLevel(gradeWithCredit);
	}
	@Override
	public ArrayList<CreditRecordPO> getCreditRecordList() throws RemoteException {
		// TODO Auto-generated method stub
		return creditRecordListDao.getCreditRecordList();
	}
	@Override
	public ResultMessage addCreditRecord(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return creditRecordListDao.addCreditRecord(po);
	}
	@Override
	public ResultMessage addOnline(OnlinePersonPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return loginDao.addOnline(po);
	}
	@Override
	public ResultMessage deleteOnline(Role role, String id) throws RemoteException {
		// TODO Auto-generated method stub
		return loginDao.deleteOnline(role, id);
	}

	
}
