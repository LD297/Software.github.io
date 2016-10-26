package orderData;
import java.rmi.RemoteException;

import orderdataservice.OrderDataService;
import orderpo.OrderPO;

public class OrderData implements OrderDataService {

	@Override
	public OrderPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
