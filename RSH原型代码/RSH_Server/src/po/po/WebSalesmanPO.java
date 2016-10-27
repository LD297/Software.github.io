package po;

import java.io.Serializable;

public class WebSalesmanPO implements Serializable{
	String id;
	String password;
	String name;
	String contact;
	
	public WebSalesmanPO (String i, String p){
		id = i;
		password = p;
	}
	public String getId(){
		return id;
	}
	public String getPassword(){
		return password;
	}
	public String getName(){
		return name;
	}
	public String getContact(){
		return contact;
	}
}
