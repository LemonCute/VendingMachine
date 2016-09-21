package indi.cc.vendingmachine.bean;

import indi.cc.vendingmachine.dao.AdminManageHelper;

//�Զ��ۻ�����
public class VendingMachine {
	private int totalAmount;	//�ܽ��
	private int coin;	//Ӳ����Ǯ

	
	 //ʹ�þ�̬���Ա�������һ��ʵ��  
    private static VendingMachine instance;  
    //������˽�л���������౻���ʵ����  
    private VendingMachine(){  
      
    }  
    //�ṩ��̬�������ظ���ʵ��   
    public static VendingMachine getInstance(){  
        //ʵ������ʵ��ǰ���ȼ���ʵ���Ƿ����  
        if(instance == null){  
            //��������ڣ����½�һ��ʵ��  
            instance = new VendingMachine();  
        }  
        //���ظ���ĳ�Ա�����������ʵ��   
        return instance;      
    }  
	
	

	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getCoin() {
		return coin;
	}
	public void setCoin(int coin) {
		this.coin = coin;
	}

	
}
