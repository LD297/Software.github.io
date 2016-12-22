
package Client;

import java.rmi.RemoteException;

import constant.condition;
import driver.HotelBLService_Driver;
import driver.LoginBLService_Driver;
import driver.ManageHotelBLService_Driver;
import driver.PromotionBLService_Driver;
import driver.SearchHotelBLService_Driver;
import driver.UserBLService_Driver;
import driver.WebStaffBLService_Driver;
import hotelbl.HotelBLService_Stub;
import hotelbl.ManageHotelBLService_Stub;
import hotelbl.SearchHotelBLService_Stub;
import hotelblservice.HotelBLService;
import hotelblservice.ManageHotelBLService;
import hotelblservice.SearchHotelBLService;
import loginbl.LoginBLService_Stub;
import loginblservice.LoginBLService;
import promotionbl.PromotionBLService_Stub;
import promotionblservice.PromotionBLService;
import userbl.UserBLService_Stub;
import userblservice.UserBLService;
import webstaffbl.WebStaffBLService_Stub;
import webstaffblservice.WebStaffBLService;

public class Main {
	public static void main(String[] args) throws RemoteException{
		
		// login
		LoginBLService loginController = new LoginBLService_Stub();
		LoginBLService_Driver loginDriver = new LoginBLService_Driver();
		loginDriver.drive(loginController);
		
		// user
		UserBLService userController = new UserBLService_Stub();
		UserBLService_Driver userDriver = new UserBLService_Driver();
		userDriver.drive(userController);
        
		// promotion
        PromotionBLService proController = new PromotionBLService_Stub("000000",1,"name",condition.Date,100);
		PromotionBLService_Driver proDriver = new PromotionBLService_Driver();
		proDriver.drivepro(proController);

		// webStaff
        WebStaffBLService webController = new WebStaffBLService_Stub("000000","abcdef");
        WebStaffBLService_Driver webDriver = new WebStaffBLService_Driver();
		webDriver.driveweb(webController);
        
        HotelBLService hotelController = new HotelBLService_Stub("017492615", "ahfksg", 198641597, "…£ª™", "œ…¡÷",
                                                                 "∑Ú◊”√Ì…Ã»¶", "good", "good", 4, 100, 20, "»˝»Àº‰", 20,
                                                                 200, "basic", 10);
        HotelBLService_Driver hotelBLService_Driver = new HotelBLService_Driver();
        hotelBLService_Driver.drive(hotelController);
        
        ManageHotelBLService manageHotelController = new ManageHotelBLService_Stub("29412551");
        ManageHotelBLService_Driver manageHotelBLService_Driver = new ManageHotelBLService_Driver();
        manageHotelBLService_Driver.drive(manageHotelController);
        
        SearchHotelBLService searchHotelController = new SearchHotelBLService_Stub("017492615", "ahfksg", 198641597, "…£ª™", "œ…¡÷",
                                                                                   "∑Ú◊”√Ì…Ã»¶", "good", "good", 4, 100, 20);
        SearchHotelBLService_Driver searchHotelBLService_Driver = new SearchHotelBLService_Driver();
        searchHotelBLService_Driver.drive(searchHotelController);
        
        
    }

}
