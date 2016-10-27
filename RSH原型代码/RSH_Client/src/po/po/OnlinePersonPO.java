package po;


import java.io.Serializable;

import constant.Role;

public class OnlinePersonPO  implements Serializable{
	Role role;
	String id;
	public OnlinePersonPO(Role role,String id) {
		this.id = id;
		this.role = role;
	}
}
