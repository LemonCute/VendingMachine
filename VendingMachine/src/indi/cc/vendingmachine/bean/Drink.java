package indi.cc.vendingmachine.bean;
//������
public class Drink {
	private String id;	//���ϱ��
	private String drinkName;	//��������
	private String drinkImg;	//����ͼƬ
	private int price;	//���ϼ۸�
	private int quantity;	//��������
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public String getDrinkImg() {
		return drinkImg;
	}
	public void setDrinkImg(String drinkImg) {
		this.drinkImg = drinkImg;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
