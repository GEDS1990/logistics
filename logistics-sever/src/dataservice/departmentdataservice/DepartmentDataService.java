package dataservice.departmentdataservice;

import java.util.ArrayList;

import po.DepartmentPO;

/**
 * 20151022
 * ������Ϣ
 * @author ��
 */
public interface DepartmentDataService {
	/**
	 * ǰ�ã���
	 * ���ã��������еĻ�����Ϣ
	 * @return
	 */
	public ArrayList<DepartmentPO> getAll();
	/**
	 * ǰ�ã�ͬ��ID��po�ڻ�δ����
	 * ���ã�������������һ��PO
	 * @param dp
	 * @return
	 */
	public boolean add(DepartmentPO dp);
	/**
	 * ǰ�ã���PO�Ѿ�����������
	 * ���ã���������ɾ��һ��PO
	 * @param dp
	 * @return
	 */
	public boolean delete(DepartmentPO dp);
	/**
	 * ǰ�ã���ЩPO�Ѿ�����������
	 * ���ã���������ɾ����ЩPO
	 * @param al
	 * @return
	 */
	public boolean delete(ArrayList<DepartmentPO> al);
	/**
	 * ǰ�ã���PO�Ѿ�����������
	 * ���ã����������޸�һ��PO
	 * @param 
	 * @return
	 */
	public boolean updata(DepartmentPO old,DepartmentPO newone);
}
