package loginbl;

import constant.ResultMessage;
import constant.Role;
import loginblservice.LoginBLService;
import vo.UserVO;
import vo.WebManagerVO;


public class LoginBLService_Stub implements LoginBLService {

	// 娉ㄥ唽
	@Override
	public ResultMessage register(UserVO vo) {
		// 鏍规嵁role娉ㄥ唽涓嶅悓鐨勮处鎴�
		return ResultMessage.exists;
	}

	// 楠岃瘉鐧诲綍淇℃伅
	@Override
	public ResultMessage checkOnline(Role role, String id, String password) {
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

	@Override
	public ResultMessage register(WebManagerVO vo) {
		// TODO Auto-generated method stub
		return ResultMessage.pass;
	}
}
