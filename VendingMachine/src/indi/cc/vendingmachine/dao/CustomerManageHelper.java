package indi.cc.vendingmachine.dao;

import indi.cc.vendingmachine.bean.Drink;
import indi.cc.vendingmachine.bean.PurchaseRecords;

//�˿Ͳ������ݿ������
public class CustomerManageHelper {
	private SqlHelper helper;
	/**
	 * ��ӹ˿͹����¼
	 * @param record �����¼
	 */
	public void addPurchaseRecords(PurchaseRecords record){
		helper = new SqlHelper();
		helper.addPurchaseRecords(record);
		helper.close();
	}
	
	/**
	 * ��������
	 * @param drink ���϶���
	 */
	public void buyDrink(Drink drink){
		helper = new SqlHelper();
		helper.buyDrink(drink);
		helper.close();
		
	}
	
}
