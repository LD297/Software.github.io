package driver;

import hotelblservice.ManageHotelBLService;

public class ManageHotelBLService_Driver {
	public void drive(ManageHotelBLService manageHotelBLService) {
		manageHotelBLService.addHotel("008324", "ahfiugi");
		manageHotelBLService.deleteHotel("0001");
		manageHotelBLService.getNewHotelID("���ִ��");
		manageHotelBLService.updateHotelStaff("00001", "bdjsgfjsg");
	}
}
