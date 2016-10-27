package po;


import java.io.Serializable;

enum condition {

	Date,
	IsBirthday,
	IsEnterprise,
	RoomNumber,
	Consumption
}

public class PromotionPO implements Serializable{
	String id;
	String name;
	condition con;//��������
	int ratio;
	
	public PromotionPO(String s, String n, condition c, int r){
		id = s;
		name = n;
		con = c;
		ratio = r;
	}
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public condition getCon(){
		return con;
	}
	public int getRatio(){
		return ratio;
	}
}
