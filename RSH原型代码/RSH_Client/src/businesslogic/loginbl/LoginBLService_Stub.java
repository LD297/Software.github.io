package loginbl;

import constant.ResultMessage;
import constant.Role;
import loginblservice.LoginBLService;
import vo.UserVO;


public class LoginBLService_Stub implements LoginBLService {

	// 娉ㄥ唽
	@Override
	public ResultMessage register(UserVO vo) {
		// 鏍规嵁role娉ㄥ唽涓嶅悓鐨勮处鎴�
		return ResultMessage.exists;
	}

	// 楠岃瘉鐧诲綍淇℃伅
	@Override
	public ResultMessage check(Role role, String id, String password) {
		if(role==Role.user){
			//璋冪敤鍚屽眰妯″潡鐩稿簲鐨刢heckPassword
			return ResultMessage.pass;
		} else if(role==Role.hotel){
			//璋冪敤鍚屽眰妯″潡鐩稿簲鐨刢heckPassword
			return ResultMessage.pass;
		} else if(role==Role.webSalesman){
			//璋冪敤鍚屽眰妯″潡鐩稿簲鐨刢heckPassword
			return ResultMessage.pass;
		} else {
			//璋冪敤鍚屽眰妯″潡鐩稿簲鐨刢heckPassword
			return ResultMessage.pass;
		}
	}

	// 鐧诲嚭
	@Override
	public ResultMessage logout(Role role, String id) {
		return ResultMessage.successfullyLogout;
	}

	public class LoginView{
		LoginBLService loginBL = new LoginBLService_Stub();

		public void register(){
			loginBL.register(new UserVO(null, null, null, null, 0, null, null, null, null, 0));
		}
		
		public void check(){
			loginBL.check(Role.user, "007", "233");
		}
		
		public void logout(){
			loginBL.logout(Role.user, "2333");
		}
	}
}
