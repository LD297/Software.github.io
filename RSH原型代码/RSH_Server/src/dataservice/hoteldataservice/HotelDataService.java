package hoteldataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import constant.ResultMessage;
import hotelpo.HotelPO;
import hotelpo.RoomAvailablePO;


public interface HotelDataService extends Remote{
	public HotelPO getHotel(String id)throws RemoteException;
	public ArrayList<HotelPO> getHotelList()throws RemoteException;
	public ResultMessage updateHotel(HotelPO po)throws RemoteException;
	public ResultMessage insertHotel(HotelPO po)throws RemoteException;
	public ResultMessage deleteHotel(HotelPO po)throws RemoteException;
	public ArrayList<RoomAvailablePO> getAvailableRoomList(String id)throws RemoteException;
	public ResultMessage updateAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList)throws RemoteException;
	public ResultMessage insertAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList)throws RemoteException;
	public ResultMessage insertAvailableRoom(RoomAvailablePO po)throws RemoteException;
	public ResultMessage deleteAvailableRoomList(ArrayList<RoomAvailablePO> availableRoomList)throws RemoteException;
	public int getHotelNum(String address)throws RemoteException;
	public int numOfAvailRoom(String id,String RoomType, Date checkIn, Date checkOut)throws RemoteException;
	public ResultMessage changeAvailRoom(String id,String RoomType, int num,Date checkIn, Date checkOut)throws RemoteException;
	public ResultMessage deleteAvailableRoom(RoomAvailablePO po)throws RemoteException;
	public ResultMessage updateGrade(String id,double grade)throws RemoteException;
	public ResultMessage findID(String id)throws RemoteException;
	public ArrayList<HotelPO> getHotelList(String address,String businessArea)throws RemoteException;
}
