package loginbl;

import constant.ResultMessage;
import constant.Role;
import loginblservice.LoginBLService;
import loginvo.PersonVO;

public class LoginBLService_Stub implements LoginBLService {

	// 注册
	@Override
	public PersonVO register(Role role) {
		// 根据role注册不同的账户
		return new PersonVO(role, null, null, null);
	}

	// 验证登录信息
	@Override
	public ResultMessage check(Role role, String id, String password) {
		if(role==Role.user){
			//调用同层模块相应的checkPassword
			return ResultMessage.pass;
		} else if(role==Role.hotel){
			//调用同层模块相应的checkPassword
			return ResultMessage.pass;
		} else if(role==Role.webSalesman){
			//调用同层模块相应的checkPassword
			return ResultMessage.pass;
		} else {
			//调用同层模块相应的checkPassword
			return ResultMessage.pass;
		}
	}

	// 登出
	@Override
	public ResultMessage logout(Role role, String id) {
		return ResultMessage.successfullyLogout;
	}

	public class LoginView{
		LoginBLService loginBL = new LoginBLService_Stub();

		public void register(){
			loginBL.register(Role.user);
		}
		
		public void check(){
			loginBL.check(Role.user, "007", "233");
		}
		
		public void logout(){
			loginBL.logout(Role.user, "2333");
		}
	}
}
