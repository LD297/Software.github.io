package driver;
import java.rmi.RemoteException;

import orderdataservice.OrderDataService;
import po.OrderPO;

public class OrderDataService_Driver {

	OrderPO po = new OrderPO("orderId","userId","hoteId");
	
	public void drive(OrderDataService orderDataService) throws RemoteException{
		orderDataService.insert(po);
		orderDataService.delete(po);
		orderDataService.update(po);
		orderDataService.init();
		orderDataService.finish();		
	}
	

}
