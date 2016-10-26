package orderblservice;

import java.util.Date;

import constant.OrderState;
import constant.ResultMessage;
import constant.RoomType;

public interface OrderBLService {
	
	public ResultMessage addRoom(RoomType type, int num, Date checkIn, Date checkOut);
	
	public double getTotal();
	
	public double getPrice(RoomType type);
	
	public ResultMessage end();
	
	public ResultMessage delRoom(RoomType type, int num,Date checkIn, Date checkOut);
	
	public OrderState getState(String id);
	
	public ResultMessage execute(String id);
	
	public ResultMessage cancel(String id);
	
	public ResultMessage cancelAbnormal(String id);
	
}
	
