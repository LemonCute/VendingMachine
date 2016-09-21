package indi.cc.vendingmachine.model;

import indi.cc.vendingmachine.bean.AddRecords;
import indi.cc.vendingmachine.dao.AdminManageHelper;




import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
//��Ǯ�����¼����ģ��
public class AddRecordModel extends AbstractTableModel{
	AdminManageHelper helper = null;
	private  Vector<String> columnNames = null;	//����
	private Vector<Vector<String>> rowData = null;	//������
	
	 public AddRecordModel(JDialog jd) {
			helper = new AdminManageHelper();
			Vector<AddRecords> records = helper.getAllAddRecords();	//�õ����е���Ǯ�����¼
			
			columnNames = new Vector<String>();
			rowData = new Vector<Vector<String>>();
			columnNames.add("���");
			columnNames.add("��������Ա");
			columnNames.add("����ǰ�Ľ��");
			columnNames.add("������");
			columnNames.add("�����Ľ��");
			columnNames.add("�����ʱ��");
			
			if(records!=null){
				for(AddRecords record : records){
					Vector<String> hang = new Vector<String>();
					hang.add(String.valueOf(record.getId()));
					hang.add(record.getAdministrator());
					hang.add(record.getBeforeAdd()+"Ԫ");
					hang.add(record.getAddAmount()+"Ԫ");
					hang.add(record.getAfterAdd()+"Ԫ");
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
