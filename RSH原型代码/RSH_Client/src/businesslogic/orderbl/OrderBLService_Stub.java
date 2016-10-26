package orderbl;

import java.util.Date;

import constant.OrderState;
import constant.ResultMessage;
import constant.RoomType;
import orderblservice.OrderBLService;

public class OrderBLService_Stub implements OrderBLService {

	double total;
	double price;
	
	public OrderBLService_Stub(double t, double p){
		total=t;
		price = p;
	}
	
	@Override
	public ResultMessage addRoom(RoomType type,int num, Date CheckIn, Date CheckOut) {
		// TODO Auto-generated method stub
		return ResultMessage.success;
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public double getPrice(RoomType type) {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public ResultMessage end() {
		// TODO Auto-generated method stub
		return ResultMessage.success;
	}

	@Override
	public ResultMessage delRoom(RoomType type, int num,Date checkIn,Date checkOut) {
		// TODO Auto-generated method stub
		return ResultMessage.success;
	}

	@Override
	public OrderState getState(String id) {
		// TODO Auto-generated method stub
		return OrderState.normal;
	}

	@Override
	public ResultMessage execute(String id) {
		// TODO Auto-generated method stub
		return ResultMessage.success;
	}

	@Override
	public ResultMessage cancel(String id) {
		// TODO Auto-generated method stub
		return ResultMessage.success;
	}

	@Override
	public ResultMessage cancelAbnormal(String id) {
		// TODO Auto-generated method stub
		return ResultMessage.success;
	}

}
