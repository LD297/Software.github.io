package userbl;

import constant.ResultMessage;
import po.UserPO;
import userblservice.UserBLService;
import vo.UserVO;


public class UserController implements UserBLService{

	@Override
	public ResultMessage add(UserPO userPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkPassword(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVO getInfo(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setMemberLevel(int[][] gradeWithCredit) {
		// TODO Auto-generated method stub
		return null;
	}

}
