package hoteldata;

import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hoteldataservice.HotelDataService;
import po.HotelPO;
import po.RoomAvailablePO;



public class HotelData implements HotelDataService{

	@Override
	public HotelPO getHotel(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelPO> getHotelList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateHotel(HotelPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage insertHotel(HotelPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage deleteHotel(HotelPO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<RoomAvailablePO> getAvailableRoomList(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage insertAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage insertAvailableRoom(RoomAvailablePO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage deleteAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHotelNum(String address) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numOfAvailRoom(String id, String RoomType, Date checkIn, Date checkOut) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage changeAvailRoom(String id, String RoomType, int num, Date checkIn, Date checkOut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage deleteAvailableRoom(RoomAvailablePO po) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateGrade(String id, double grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage findID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelPO> getHotelList(String address, String businessArea) {
		// TODO Auto-generated method stub
		return null;
	}

}
