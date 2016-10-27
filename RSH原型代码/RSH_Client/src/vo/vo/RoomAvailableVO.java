package vo;

import java.util.ArrayList;
import java.util.Date;

public class RoomAvailableVO {
	public String id;//�Ƶ��id
	public Date date;
	public String type;
	public int amountAvailable;
	public int amountTotal;
	public double price;
	public String basicOrSpecial;
//	public ArrayList<Integer> aList;
	public RoomAvailableVO(String id,Date date,String type,int amountAvailable,int amountTotal,double price,String basicOrSpecial) {
		this.id = id;
		this.date = date;
		this.type = type;
		this.amountAvailable = amountAvailable;
		this.amountTotal = amountTotal;
		this.price = price;
		this.basicOrSpecial = basicOrSpecial;
//		this.aList = aList;
	}
}
