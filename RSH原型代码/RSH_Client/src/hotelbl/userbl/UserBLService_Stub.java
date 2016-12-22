package userbl;

import constant.ResultMessage;
import po.UserPO;
import userblservice.UserBLService;
import vo.UserVO;

public class UserBLService_Stub implements UserBLService{

	@Override
	public ResultMessage add(UserPO userPO) {
		return ResultMessage.succeed;
	}

	@Override
	public boolean checkPassword(String id, String password) {
		return true;
	}

	@Override
	public UserVO getInfo(String userid) {
		return new UserVO(userid, null, null, null, 0, null, null, null, null, 0);
	}

	@Override
	public ResultMessage update(UserVO userVO) {
		return ResultMessage.succeed;
	}

	@Override
	public ResultMessage setMemberLevel(int[][] gradeWithCredit) {
		return ResultMessage.succeed;
	}
	
}
