package loginblservice;

import constant.ResultMessage;
import constant.Role;
import vo.UserVO;
import vo.WebManagerVO;
/**
 * deal with login,register and logout
 * @author john
 *
 */
public interface LoginBLService {
	/**
	 * register for user
	 */
	public ResultMessage register(UserVO vo);
	/**
	 * register for webmanager
	 */
	public ResultMessage register(WebManagerVO vo) ;
	/**
	 * figure out whether the password matches with the id or not
	 * need the correct form of id and password
	 */
	public ResultMessage checkOnline(Role role, String id, String password);
	/**
	 * the person has already logged in
	 * remove the online record of this person
	 */
	public ResultMessage logout(Role role, String id);
	
}
