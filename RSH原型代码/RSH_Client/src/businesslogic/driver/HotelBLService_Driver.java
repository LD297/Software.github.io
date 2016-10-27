package driver;

import java.util.ArrayList;
import java.util.Date;

import hotelblservice.HotelBLService;
import vo.HotelVO;
import vo.RoomAvailableVO;
import vo.RoomVO;


public class HotelBLService_Driver {

	public void drive(HotelBLService hotelBLService) {
		hotelBLService.getHotel();
		HotelVO vo3 = new HotelVO("00001", "sgfsgrsg", 13814792, "桑锟斤拷", "锟斤拷锟街达拷锟�",
				"锟斤拷锟斤拷锟斤拷锟斤拷圈", "锟杰猴拷", "锟斤拷锟斤拷", 3, 95, 20);
		hotelBLService.updateHotel(vo3);
		hotelBLService.getRoomList();
		ArrayList<RoomVO> roomList = new ArrayList<>();
		RoomVO vo = new RoomVO("00000000001", "锟斤拷锟剿硷拷", 12, 100, "basic");
		roomList.add(vo);
		hotelBLService.updateRoomList(roomList);
		hotelBLService.addSpecialRoom(vo);
		hotelBLService.deleteSpecialRoom(vo);
		Date date = new Date(10000);
		hotelBLService.getAvailableRoomList(date);	
		ArrayList<RoomAvailableVO> availableRoomList = new ArrayList<>();
		RoomAvailableVO vo2 = new RoomAvailableVO("000001", date, "锟斤拷锟剿硷拷", 10, 20, 100, "basic");
		availableRoomList.add(vo2);
		hotelBLService.updateAvailableRoomList(availableRoomList);
	}
}
