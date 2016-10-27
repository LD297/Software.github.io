package po;

import java.io.Serializable;

public class OrderPO implements Serializable{

	String orderId;
	String userId;
	String hotelId;
	
	public OrderPO(String or,String us,String ho){
		orderId = or;
		userId = us;
		hotelId = ho;
	}
	
	public String getOrderId(){
		return orderId;
	}
	
	public String getUserId(){
		return userId;
	}
	
	public String getHotelId(){
		return hotelId;
	}

}
