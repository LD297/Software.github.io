package driver;

import javax.naming.spi.DirStateFactory.Result;

import constant.ResultMessage;
import userbl.UserBLService_Stub;
import userblservice.UserBLService;
import userpo.UserPO;
import uservo.UserVO;

public class UserBLService_Driver {
	
	public void drive(UserBLService userBLService){
		ResultMessage result1 = userBLService.add(new UserPO(null, null, null, null, 0, null, null, null, null, null, 0));
		if(result1==ResultMessage.succeed){
			System.out.println("Add succeed!");
		}
		
		if(userBLService.checkPassword("007", "233")){
			System.out.println("Match succeed!");
		} else {
			System.out.println("Match failed.");
		}
		
		UserVO userVO = userBLService.getInfo("007");
		if(userVO.getPassword().equals("233")){
			System.out.println("Find!");
		} else {
			System.out.println("Failed!");
		}
		
		ResultMessage result2 = userBLService.update(new UserVO(null, null, null, null, 0, null, null, null, null, null, 0));
		if(result2==ResultMessage.succeed){
			System.out.println("Update succeed!");
		}
		
		ResultMessage result3 = userBLService.setMemberLevel(new int[][]{{0},{1}});
		if(result3==ResultMessage.succeed){
			System.out.println("Succeed!");
		}
	}
		public static void main(String[] args){
			UserBLService useController = new UserBLService_Stub();
			UserBLService_Driver driver = new UserBLService_Driver();
			driver.drive(useController);
		}
}
