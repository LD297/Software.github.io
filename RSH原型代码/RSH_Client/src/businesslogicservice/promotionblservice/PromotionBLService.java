package promotionblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import constant.ResultMessage;
import constant.condition;
import po.PromotionPO;

public interface PromotionBLService extends Remote {
	
	public ArrayList<PromotionPO> show(String id)throws RemoteException;
	
	public ResultMessage add(String id, int number, String name, condition con, int ratio)throws RemoteException;
	
	public ResultMessage update(String id, int number, String name, condition con, int ratio)throws RemoteException;
	
	public ResultMessage del(String id, int number)throws RemoteException;
	
	public int totalDiscount(String hotelid, String date, Boolean IsBirthday, Boolean IsEnterprise, int roomNumber, int consumption)throws RemoteException;
	
	public int totalDiscount(String id, String type, String date)throws RemoteException;
	
	public int roomDiscount(String id, String type, String date)throws RemoteException;
	
	public String getName(String id, String date,Boolean IsBirthday, Boolean IsEnterprise, int roomNumber, int consumption)throws RemoteException;
	
	public String getName(String date, String id, int memberLevel)throws RemoteException;

}
