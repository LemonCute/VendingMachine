package indi.cc.vendingmachine.bean;



//ȡ�ּ�¼��
public class CashRecords {
	private int id;	//���
	private String administrator;	//��������Ա
	private int beforeCash;	//ȡ��ǰ�Ľ��
	private int cash;	//ȡ�ֽ��
	private int afterCash;	//ȡ�ֺ�Ľ��
	public int getBeforeCash() {
		return beforeCash;
	}
	public void setBeforeCash(int beforeCash) {
		this.beforeCash = beforeCash;
	}
	public int getAfterCash() {
		return afterCash;
	}
	public void setAfterCash(int afterCash) {
		this.afterCash = afterCash;
	}
	private String date;	//ȡ��ʱ��
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
	
}
