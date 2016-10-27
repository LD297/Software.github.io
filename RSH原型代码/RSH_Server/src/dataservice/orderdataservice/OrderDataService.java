package orderdataservice;
import java.rmi.RemoteException;

import po.OrderPO;

public interface OrderDataService {

	
public OrderPO find(String id) throws RemoteException;
	public void insert (OrderPO po)throws RemoteException;
	public void delete(OrderPO po) throws RemoteException;
	public void update(OrderPO po) throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
