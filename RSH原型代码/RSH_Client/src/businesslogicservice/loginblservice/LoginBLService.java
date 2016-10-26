package loginblservice;

import constant.ResultMessage;
import constant.Role;
import loginvo.PersonVO;

public interface LoginBLService {
	public PersonVO register(Role role);
	public ResultMessage check(Role role, String id, String password);
	public ResultMessage logout(Role role, String id);
	
}
