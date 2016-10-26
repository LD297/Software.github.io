package hotelblservice;

import java.util.ArrayList;

import constant.HotelOrderStateOfUser;
import constant.SortBy;
import constant.SortMethod;
import hotelvo.HotelVO;
import hotelvo.SelectConditionVO;


public interface SearchHotelBLService {
	public ArrayList<HotelVO> getHotelList(String address,String businessArea);
	public ArrayList<HotelVO> sort(SortBy sortBy,SortMethod sortM);
	public ArrayList<HotelVO> select(SelectConditionVO sConditionVO);
	public HotelOrderStateOfUser getOrderStateOfUser(String userID,String hotelID);
}
