package hotelblservice;

import constant.ResultMessage;

public interface ManageHotelBLService {
	public ResultMessage addHotel(String id,String password);
	public ResultMessage deleteHotel(String id);
	public String getNewHotelID(String address); 
	public ResultMessage updateHotelStaff(String id,String password);
}
