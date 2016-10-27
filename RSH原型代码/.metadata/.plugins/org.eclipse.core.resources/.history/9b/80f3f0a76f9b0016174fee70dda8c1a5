package driver;

import constant.ResultMessage;
import constant.Role;
import loginbl.LoginBLService_Stub;
import loginblservice.LoginBLService;
import loginvo.PersonVO;

public class LoginBLService_Driver {
	
	public void drive(LoginBLService loginBLService){
		
		PersonVO personVO = loginBLService.register(Role.user);
		if(personVO.getRole()==Role.user){
			System.out.println("Register succeed!");
		}
		
		ResultMessage result1 = loginBLService.check(Role.user, "007", "233");
		if(result1==ResultMessage.pass){
			System.out.println("Login succeed!");
		} else {
			System.out.println("Login failed!");
		}
		
		ResultMessage result2 = loginBLService.logout(Role.user, "007");
		if(result2==ResultMessage.successfullyLogout){
			System.out.println("Logout succeed!");

		} else {
			System.out.println("Error.Please try again.");
		}
	}
	
}
