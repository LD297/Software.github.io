package orderblservice;

import java.util.Date;

import constant.ResultMessage;
import constant.RoomType;
import constant.OrderState;

public class OrderBLService_Driver {

	public void drive(OrderBLService orderBLService){
		Date checkIn = new Date(2017-1-1);
		Date checkOut = new Date(2017-1-2);
		ResultMessage res = ResultMessage.success;
		
		ResultMessage result = orderBLService.addRoom(RoomType.doubleRoom,1,checkIn,checkOut);
		if(result==ResultMessage.success)
			System.out.println("Room exists");
		
		result = orderBLService.delRoom(RoomType.doubleRoom, 1,checkIn,checkOut);
		if(result==res)
			System.out.println("delete Room");
		
		double price = orderBLService.getPrice(RoomType.doubleRoom);
		System.out.println("the price is "+price);
		
		OrderState state = orderBLService.getState("000001");
		System.out.println("the state is"+ state);
		
		double total = orderBLService.getTotal();
		System.out.println("the total money is "+total);
		
		result = orderBLService.cancelAbnormal("0000001");
		if(result==res)
			System.out.println("cancel abnormal success");
		
		
		result = orderBLService.execute("000001");
		if(result ==res)
			System.out.println("execute success");
		
		result = orderBLService.cancel("000001");
		if(result==res)
			System.out.println("cancel success");

		result = orderBLService.end();
		if (result==res)
			System.out.println("finish");
	}
}


