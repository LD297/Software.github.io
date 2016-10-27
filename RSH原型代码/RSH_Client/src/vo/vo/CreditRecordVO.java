package vo;

import java.util.Date;

import constant.CreditAction;

public class CreditRecordVO {
	String userid;
	Date date;
	String orderid;
	CreditAction creditAction;
	/**
	 * for example    "+200"
	 */
	String change;
	int credit;
	public CreditRecordVO(String userid,Date date,String orderid,
			CreditAction creditAction,String change,int credit) {
		this.creditAction = creditAction;
		this.date = date;
		this.change = change;
		this.credit = credit;
		this.orderid = orderid;
		this.userid = userid;
	}
}
