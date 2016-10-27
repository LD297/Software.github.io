package loginblservice;

import constant.ResultMessage;
import constant.Role;
import vo.UserVO;

public interface LoginBLService {
	public ResultMessage register(UserVO vo);
	public ResultMessage check(Role role, String id, String password);
	public ResultMessage logout(Role role, String id);
	
}
