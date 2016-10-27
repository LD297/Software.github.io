package hoteldata;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hoteldataservice.HotelDataService;
import hotelpo.HotelPO;
import hotelpo.RoomAvailablePO;


public class HotelDataService_Stub implements HotelDataService{
	public String id;
	public String password;
	public int phoneNumber;
	public String name;
	public String addr;
	public String businessArea;
	public String briefIntro;
	public String facility;
	public int level;
	public int grade;
	public int latestCheckinTime;
	
	public Date date;
	public String type;
	public int amountAvailable;
	public int amountTotal;
	public double price;
	public String basicOrSpecial;
	public ArrayList<Integer> aList;
	public HotelDataService_Stub(String id,String password,int phoneNumber,String name,String addr,
			String businessArea,
			String briefIntro,String facility,int level,int grade,int latestCheckinTime,
			Date date,String type,int amountAvailable,int amountTotal,double price,
			String basicOrSpecial,ArrayList<Integer> aList) {
		this.id = id;
		this.addr = addr;
		this.briefIntro = briefIntro;
		this.businessArea = businessArea;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
		this.businessArea = businessArea;
		this.facility = facility;
		this.level = level;
		this.latestCheckinTime = latestCheckinTime;
		
		this.date = date;
		this.type = type;
		this.amountAvailable = amountAvailable;
		this.amountTotal = amountTotal;
		this.price = price;
		this.basicOrSpecial = basicOrSpecial;
		this.aList = aList;
		
		System.out.println("Welcome!HotelDataService");
	}
	@Override
	public HotelPO getHotel(String id) throws RemoteException {
		HotelPO po = new HotelPO(id, password, phoneNumber, name, addr, businessArea, briefIntro,
				facility, level, grade, latestCheckinTime);
		System.out.println("Success!--getHotel");
		return po;
	}

	@Override
	public ArrayList<HotelPO> getHotelList() throws RemoteException {
		System.out.println("Success!--getHotelList");
		HotelPO po = new HotelPO(id, password, phoneNumber, name, addr, businessArea, briefIntro,
				facility, level, grade, latestCheckinTime);
		ArrayList<HotelPO> arrayList = new ArrayList<>();
		return arrayList;
	}

	@Override
	public ResultMessage updateHotel(HotelPO po) throws RemoteException {
		System.out.println("Success!--updateHotel");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage insertHotel(HotelPO po) throws RemoteException {
		System.out.println("Success!--insertHotel");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage deleteHotel(HotelPO po) throws RemoteException {
		System.out.println("Success!--deleteHotel");
		return ResultMessage.success;
	}

	@Override
	public ArrayList<RoomAvailablePO> getAvailableRoomList(String id) throws RemoteException {
		System.out.println("Success!--getAvailableRoomList");
		RoomAvailablePO po = new RoomAvailablePO(id, date, type, amountAvailable, amountTotal,
				price, basicOrSpecial, aList);
		ArrayList<RoomAvailablePO> arrayList = new ArrayList<>();
		arrayList.add(po);
		return arrayList;
	}

	@Override
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList) throws RemoteException {
		System.out.println("Success!--updateAvailableRoomList");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage insertAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList) 
			throws RemoteException {
		System.out.println("Success!--insertAvailableRoomList");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage insertAvailableRoom(RoomAvailablePO po) throws RemoteException {
		System.out.println("Success!--insertAvailableRoom");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage deleteAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList) 
			throws RemoteException {
		System.out.println("Success!--deleteAvailableRoomList");
		return ResultMessage.success;
	}

	@Override
	public int getHotelNum(String address) throws RemoteException {
		System.out.println("Success!--getHotelNum");
		return 0;
	}

	@Override
	public int numOfAvailRoom(String id, String RoomType, Date checkIn, Date checkOut) throws RemoteException {
		System.out.println("Success!--numOfAvailRoom");
		return 0;
	}

	@Override
	public ResultMessage changeAvailRoom(String id, String RoomType, int num, Date checkIn, Date checkOut)
			throws RemoteException {
		System.out.println("Success!--changeAvailRoom");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage deleteAvailableRoom(RoomAvailablePO po) throws RemoteException {
		System.out.println("Success!--deleteAvailableRoom");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage updateGrade(String id, double grade) throws RemoteException {
		System.out.println("Success!--updateGrade");
		return ResultMessage.success;
	}

	@Override
	public ResultMessage findID(String id) throws RemoteException {
		System.out.println("Success!--findID");
		return ResultMessage.success;
	}

	@Override
	public ArrayList<HotelPO> getHotelList(String address, String businessArea) throws RemoteException {
		System.out.println("Success!--getHotelList");
		HotelPO po = new HotelPO(id, password, phoneNumber, name, addr, businessArea, briefIntro,
				facility, level, grade, latestCheckinTime);
		ArrayList<HotelPO> arrayList = new ArrayList<>();
		return arrayList;
	}

}
