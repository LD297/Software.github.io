package hotelbl;

import constant.ResultMessage;
import hotelblservice.ManageHotelBLService;

public class ManageHotelBLService_Stub implements ManageHotelBLService{
	String id;
	public ManageHotelBLService_Stub(String id) {
		this.id = id;
	}
	@Override
	public ResultMessage addHotel(String id, String password) {
		return ResultMessage.success;
	}

	@Override
	public ResultMessage deleteHotel(String id) {
		return ResultMessage.success;
	}

	@Override
	public String getNewHotelID(String address) {
		return id;
	}

	@Override
	public ResultMessage updateHotelStaff(String id, String password) {
		return ResultMessage.success;
	}

}
