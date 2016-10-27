package vo;

import constant.Role;

public class OnlinePersonVO {
	Role role;
	String id;
	public OnlinePersonVO(Role role,String id) {
		this.id = id;
		this.role = role;
	}
}
