package uservo;

import constant.Role;
import loginvo.PersonVO;
import userpo.MemberType;
import userpo.Sexuality;

public class UserVO extends PersonVO{
	
	String id;
	String password;
	String nickName;
	String imageAddress;
	int level;
	MemberType menberType;
	String name;
	Sexuality sexuality;
	String phone;
	String eMail;
	int credit;
	
	public UserVO(String id, String password, String nickName, String imageAddress, int level, MemberType menberType, String name,
			Sexuality sexuality, String phone, String eMail, int credit) {
		super(Role.user, null, null, null);
		this.id = id;
		this.nickName = nickName;
		this.imageAddress = imageAddress;
		this.level = level;
		this.menberType = menberType;
		this.name = name;
		this.sexuality = sexuality;
		this.phone = phone;
		this.eMail = eMail;
		this.credit = credit;
	}
	public String getId() {
		return id;
	}
	public String getNickName() {
		return nickName;
	}
	public String getImageAddress() {
		return imageAddress;
	}
	public int getLevel() {
		return level;
	}
	public MemberType getMenberType() {
		return menberType;
	}
	public String getName() {
		return name;
	}
	public Sexuality getSexuality() {
		return sexuality;
	}
	public String getPhone() {
		return phone;
	}
	public String geteMail() {
		return eMail;
	}
	public int getCredit() {
		return credit;
	}
	
}
