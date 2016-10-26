package Server;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import driver.HotelDataService_Driver;
import driver.LoginDataService_Driver;
import driver.OrderDataService_Driver;
import driver.PromotionDataService_Driver;
import driver.UserDataService_Driver;
import driver.WebStaffDataService_Driver;
import hoteldata.HotelDataService_Stub;
import hoteldataservice.HotelDataService;
import logindata.LoginDataService_Stub;
import logindataservice.LoginDataService;
import orderData.OrderDataService_Stub;
import orderdataservice.OrderDataService;
import promotionData.PromotionDataService_Stub;
import promotionDataService.PromotionDataService;
import userdata.UserDataService_Stub;
import userdataservice.UserDataService;
import webstaffData.WebStaffDataService_Stub;
import webstaffDataService.WebStaffDataService;

public class Main {
	public static void main(String[] args) throws RemoteException {
		// login
		LoginDataService loginDataController = new LoginDataService_Stub();
		LoginDataService_Driver loginDriver = new LoginDataService_Driver();
		loginDriver.drive(loginDataController);

		// user
		UserDataService userDataController = new UserDataService_Stub();
		UserDataService_Driver userDriver = new UserDataService_Driver();
		userDriver.drive(userDataController);

		// promotion
		PromotionDataService proDataController = new PromotionDataService_Stub();
		PromotionDataService_Driver promotionDataDriver = new PromotionDataService_Driver();
		promotionDataDriver.drive(proDataController);

		// webStaff
		WebStaffDataService webController = new WebStaffDataService_Stub();
		WebStaffDataService_Driver webStaffDriver = new WebStaffDataService_Driver();
		webStaffDriver.drive(webController);
        
		// hotel
        Date date = new Date(1000084);
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        HotelDataService hotelDataController = new HotelDataService_Stub("017492615", "ahfksg", 198641597,
                                                                         "…£ª™", "œ…¡÷",
                                                                         "∑Ú◊”√Ì…Ã»¶", "good", "good", 4, 100, 20, date, "»˝»Àº‰", 20,
                                                                         30, 200, "basic", aList);
        HotelDataService_Driver hotelDataService_Driver = new HotelDataService_Driver();
        hotelDataService_Driver.drive(hotelDataController);
        
        // order
        OrderDataService orderDataController = new OrderDataService_Stub(20, "18964265", "9146265", "92659");
		OrderDataService_Driver orderDataService_Driver = new OrderDataService_Driver();
		orderDataService_Driver.drive(orderDataController);
        
	}
}
