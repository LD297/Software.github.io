package loginbl;

import constant.ResultMessage;
import constant.Role;
import loginblservice.LoginBLService;
import vo.UserVO;
import vo.WebManagerVO;

/**
 * deal with login,register and logout
 * @author john
 *
 */
public class LoginController implements LoginBLService{

	@Override
	/**
	 * register for user
	 */
	public ResultMessage register(UserVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * register for webmanager
	 */
	@Override
	public ResultMessage register(WebManagerVO vo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	/**
	 * figure out whether the password matches with the id or not
	 * need the correct form of id and password
	 */
	public ResultMessage checkOnline(Role role, String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * the person has already logged in
	 * remove the online record of this person
	 */
	public ResultMessage logout(Role role, String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
