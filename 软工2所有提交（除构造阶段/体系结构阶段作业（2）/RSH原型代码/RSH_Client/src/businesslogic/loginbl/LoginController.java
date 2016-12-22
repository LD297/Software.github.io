package loginbl;

import constant.ResultMessage;
import constant.Role;
import loginblservice.LoginBLService;
import loginvo.PersonVO;

public class LoginController implements LoginBLService{

	@Override
	public PersonVO register(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage check(Role role, String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage logout(Role role, String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
