package webstaffbl;

import java.rmi.RemoteException;

import constant.ResultMessage;
import constant.Role;
import promotionpo.WebSalesmanPO;
import webstaffblservice.WebStaffBLService;


public class WebStaffBL implements WebStaffBLService {
	@Override
	public Boolean checkPassword(Role r, String id, String p)throws RemoteException{
		return true;
	}
	@Override
	public ResultMessage addWebSalesman(String id, String password)throws RemoteException{
		return ResultMessage.success;
	}
	@Override
	public ResultMessage updateWebSalesman(WebSalesmanPO po)throws RemoteException{
		return ResultMessage.success;
	}
	@Override
	public ResultMessage delWebSalesman(String id)throws RemoteException{
		return ResultMessage.success;
	}
}
