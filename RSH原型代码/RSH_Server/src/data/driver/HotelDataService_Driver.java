package driver;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import hoteldataservice.HotelDataService;
import po.HotelPO;
import po.RoomAvailablePO;


public class HotelDataService_Driver {
	public void drive(HotelDataService hotelDataService) throws RemoteException{
		hotelDataService.getHotel("01397915");
		hotelDataService.getHotelList();
		HotelPO po = new HotelPO("082907", "agfjasgj", 21474958, "ɣ��", "����", 
				"��������Ȧ", "good", "good", 4, 93, 20);
		hotelDataService.updateHotel(po);
		hotelDataService.insertHotel(po);
		hotelDataService.deleteHotel(po);
		hotelDataService.getAvailableRoomList("01741016");
		Date date = new Date(10000);
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(10);
		RoomAvailablePO po2 = new RoomAvailablePO("017497592", date, "���˼�", 10, 20,
				100, "basic", aList);
		ArrayList<RoomAvailablePO> availableRoomList = new ArrayList<>();
		availableRoomList.add(po2);
		hotelDataService.updateAvailableRoomList(availableRoomList);
		hotelDataService.insertAvailableRoomList(availableRoomList);
		hotelDataService.insertAvailableRoom(po2);
		hotelDataService.deleteAvailableRoomList(availableRoomList);
		hotelDataService.deleteAvailableRoom(po2);
		hotelDataService.getHotelNum("����");
		Date checkIn  = new Date(103915);
		Date checkOut = new Date(824915);
		hotelDataService.numOfAvailRoom("1280475", "���˼�", checkIn, checkOut);
		hotelDataService.changeAvailRoom("1280475", "���˼�",10, checkIn, checkOut);
		hotelDataService.deleteAvailableRoom(po2);
		hotelDataService.updateGrade("89q69", 100);
		hotelDataService.findID("18940265");
		hotelDataService.getHotelList("����","��������Ȧ");
	}
}
