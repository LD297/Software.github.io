package orderData;

import java.rmi.RemoteException;

import constant.ResultMessage;
import orderdataservice.OrderDataService;
import po.OrderPO;
public class OrderDataService_Stub implements OrderDataService{

	ResultMessage result = ResultMessage.success;
	double total;
	String userId;
	String orderId;
	String hotelId;
	public OrderDataService_Stub(double to, String us,String or,String ho){
		total = to;
		userId = us;
		orderId = or;
		hotelId = ho;
	}
	@Override
	public OrderPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		OrderPO po = new OrderPO(orderId, hotelId, userId);
		return po;
	}

	@Override
	public void insert(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("inser successfully");
	}

	@Override
	public void delete(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("delete successfully");
	}

	@Override
	public void update(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("upsdate successfully");
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("init successfully");
	}

	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("finish");
	}

}
