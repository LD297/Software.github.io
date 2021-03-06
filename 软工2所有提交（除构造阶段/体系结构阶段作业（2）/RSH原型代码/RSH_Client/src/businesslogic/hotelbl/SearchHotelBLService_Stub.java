package hotelbl;

import java.util.ArrayList;

import constant.HotelOrderStateOfUser;
import constant.SortBy;
import constant.SortMethod;
import hotelblservice.SearchHotelBLService;
import hotelvo.HotelVO;
import hotelvo.SelectConditionVO;

public class SearchHotelBLService_Stub implements SearchHotelBLService{
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
	 public SearchHotelBLService_Stub(String id,String password,int phoneNumber,String name,String addr,String businessArea,
			 String briefIntro,String facility,int level,int grade,int latestCheckinTime) {
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
	}
	@Override
	public ArrayList<HotelVO> getHotelList(String address, String businessArea) {
		HotelVO vo = new HotelVO(id, password, phoneNumber, name, addr, businessArea, 
				briefIntro, facility, level, grade, latestCheckinTime);
		ArrayList<HotelVO> arrayList = new ArrayList<>();
		arrayList.add(vo);
		return arrayList;
	}

	@Override
	public ArrayList<HotelVO> sort(SortBy sortBy, SortMethod sortM) {
		HotelVO vo = new HotelVO(id, password, phoneNumber, name, addr, businessArea, 
				briefIntro, facility, level, grade, latestCheckinTime);
		ArrayList<HotelVO> arrayList = new ArrayList<>();
		arrayList.add(vo);
		return arrayList;
	}

	@Override
	public ArrayList<HotelVO> select(SelectConditionVO sConditionVO) {
		HotelVO vo = new HotelVO(id, password, phoneNumber, name, addr, businessArea, 
				briefIntro, facility, level, grade, latestCheckinTime);
		ArrayList<HotelVO> arrayList = new ArrayList<>();
		arrayList.add(vo);
		return arrayList;
	}

	@Override
	public HotelOrderStateOfUser getOrderStateOfUser(String userID, String hotelID) {
		return HotelOrderStateOfUser.normal;
	}

}
