package indi.cc.vendingmachine.model;


import indi.cc.vendingmachine.bean.CashRecords;
import indi.cc.vendingmachine.dao.AdminManageHelper;

import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

//ȡ�ּ�¼����ģ��
public class CashRecordsModel extends AbstractTableModel{
	AdminManageHelper helper = null;
	private  Vector<String> columnNames = null;	//����
	private Vector<Vector<String>> rowData = null;	//������
	
	
	 public CashRecordsModel(JDialog jd) {
			helper = new AdminManageHelper();
			Vector<CashRecords> records = helper.getAllCashRecords();	//�õ����е�ȡ�ֲ����¼
			
			columnNames = new Vector<String>();
			rowData = new Vector<Vector<String>>();
			columnNames.add("���");
			columnNames.add("��������Ա");
			columnNames.add("ȡ��ǰ�Ľ��");
			columnNames.add("ȡ�ֽ��");
			columnNames.add("ȡ�ֺ�Ľ��");
			columnNames.add("ȡ�ֵ�ʱ��");
			
			if(records!=null){
				for(CashRecords record : records){
					Vector<String> hang = new Vector<String>();
					hang.add(String.valueOf(record.getId()));
					hang.add(record.getAdministrator());
					hang.add(record.getBeforeCash()+"Ԫ");
					hang.add(record.getCash()+"Ԫ");
					hang.add(record.getAfterCash()+"Ԫ");
					hang.add(record.getDate());
					rowData.add(hang);
					
				}
			}
			
			
			
			if(getRowCount()!=0){
				JOptionPane.showMessageDialog(jd, "һ����"+getRowCount()+"����¼��");
				return ;
			}else{
				JOptionPane.showMessageDialog(jd, "û���κμ�¼��");
				return ;
			}
		}
	
	
	
	//�õ����ж�����
			@Override
			public int getRowCount() {
				// TODO Auto-generated method stub
				return this.rowData.size();
			}
			//�õ����ж�����
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return this.columnNames.size();
			}
			//�õ�ĳ��ĳ�е�����
			@Override
			public Object getValueAt(int rowIndex, int columnIndex) {
				// TODO Auto-generated method stub
				return ((Vector)this.rowData.get(rowIndex)).get(columnIndex);
			}
			
			//��д���� getColumnName
			@Override  
			public String getColumnName(int column) {
				// TODO Auto-generated method stub
				return (String)this.columnNames.get(column);
			}


}
