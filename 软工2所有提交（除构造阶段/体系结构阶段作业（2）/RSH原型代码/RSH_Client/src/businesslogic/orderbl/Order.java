package orderbl;
import java.util.ArrayList;
import java.util.Date;

import constant.OrderState;
import constant.OrderStateOfUser;
import constant.ResultMessage;
import constant.RoomType;

public class Order {

	String orderId;
	String userId;
	boolean isMember;
	Date birthday;
	ArrayList <Room> rooms ;
	
	public Order(String id, String userid, boolean isMem, Date bir ){
		orderId = id;
		userId = userid;
		isMember = isMem;
		birthday = bir;
	}
	public ResultMessage addRoom(RoomType type, int num, Date checkIn, Date checkOut){
		return null;
	}
	
	public double getTotal(){
		return 0;
	}
	public double getPrice(RoomType type){
		return 0;
	}
	public ResultMessage end(){
		return null;
	}
	public ResultMessage delRoom(RoomType type, int num,Date checkIn, Date checkOut){
		return null;
	}
	public OrderState getState(String id){
		return null;
	}
	
	public ResultMessage execute(String id){
		return null;
	}
	
	public ResultMessage cancel(String id){
		return null;
	}
	public ResultMessage cancelAbnormal(String id){
		return null;	
	}
	
	public ArrayList<Order> search(String con){
		return null;
	}

	/*
	 * public ArrayList<Order> search(String userID);
	 */
	
	public OrderStateOfUser getOrderStateOfUser(String userId,String hotelId){
		return null;
	}
}

