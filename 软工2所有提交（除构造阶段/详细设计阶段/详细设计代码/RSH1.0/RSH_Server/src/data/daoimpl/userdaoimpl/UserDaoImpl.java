package data.daoimpl.userdaoimpl;

import java.rmi.RemoteException;

import constant.ResultMessage;
import data.dao.userdao.UserDao;
import po.UserPO;

public class UserDaoImpl implements UserDao{

	@Override
	public UserPO getInfo(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(UserPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(UserPO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkPassword(String id, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage register(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage register(String id, String commerceName) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setMemberLevel(int[][] gradeWithCredit) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
