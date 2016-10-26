package loginvo;

import constant.Role;

public class PersonVO {
	Role role;
	String id;
	String name;
	String password;
	
	public PersonVO(Role role, String id, String name, String password) {
		this.role = role;
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
}
