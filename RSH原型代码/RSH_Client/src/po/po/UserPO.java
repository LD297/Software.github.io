package po;

import java.io.Serializable;
import java.util.Date;

import constant.MemberType;
import constant.Sexuality;

public class UserPO implements Serializable{
	String id;
	String password;
	String nickName;
	Date birth;
	String imageAddress;
	int level;
	MemberType menberType;
	String commerceName;
	String name;
	Sexuality sexuality;
	String phone;
	String eMail;
	int credit;
	public UserPO(String id,String password, String nickName, Date birth,String imageAddress,
			int level, MemberType menberType, String commerceName,String name,
			Sexuality sexuality, String phone, String eMail, int credit) {
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.birth = birth;
		this.imageAddress = imageAddress;
		this.level = level;
		this.menberType = menberType;
		this.commerceName = commerceName;
		this.name = name;
		this.sexuality = sexuality;
		this.phone = phone;
		this.eMail = eMail;
		this.credit = credit;
	}
	public String getId() {
		return id;
	}
	public String getPassword(){
		return password;
	}
	public String getNickName() {
		return nickName;
	}
	public Date getBirth() {
		return birth;
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
	public String getCommerceName() {
		return commerceName;
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
