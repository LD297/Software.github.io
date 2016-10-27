package userblservice;

import constant.ResultMessage;
import po.UserPO;
import vo.UserVO;

public interface UserBLService {
	public ResultMessage add(UserPO userPO);
	public boolean checkPassword(String id, String password);
	public UserVO getInfo(String userid);
	public ResultMessage update(UserVO userVO);
	public ResultMessage setMemberLevel(int[][] gradeWithCredit);
	
}
