package dataservice.departmentdataservice;

import java.util.ArrayList;

import po.StuffPO;

/**
 * 20151022
 * Ա����Ϣ
 * @author ��
 */
public interface StuffDataService {
	
	/**
	 * ǰ�ã���
	 * ���ã��������е�Ա��PO��Ϣ
	 * @return
	 */
	public ArrayList<StuffPO> getAll();
	/**
	 * ǰ�ã�ͬ��ID��po�ڻ�δ����
	 * ���ã�������������һ��PO
	 * @param dp
	 * @return
	 */
	public boolean add(StuffPO dp);
	/**
	 * ǰ�ã���PO�Ѿ�����������
	 * ���ã���������ɾ��һ��PO
	 * @param dp
	 * @return
	 */
	public boolean delete(StuffPO dp);
	/**
	 * ǰ�ã���ЩPO�Ѿ�����������
	 * ���ã���������ɾ����ЩPO
	 * @param al
	 * @return
	 */
	public boolean delete(ArrayList<StuffPO> al);
	/**
	 * ǰ�ã���PO�Ѿ�����������
	 * ���ã����������޸�һ��PO
	 * @param 
	 * @return
	 */
	public boolean updata(StuffPO old,StuffPO newone);
	
}
