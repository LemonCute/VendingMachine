package indi.cc.vendingmachine.bean;



//�����¼��
public class PurchaseRecords {
	private int customerId;	//�˿ͱ��
	private String date;	//����ʱ��
	private String drinkName;	//�������ϵ�����
	private int price;	//�۸�
	private int payment;	//֧�����
	private int repayment;	//�һؽ��
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getRepayment() {
		return repayment;
	}
	public void setRepayment(int repayment) {
		this.repayment = repayment;
	}
	
	
}
