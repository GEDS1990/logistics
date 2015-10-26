package dataservice.managementdataservice;

import java.util.ArrayList;

import po.WarehousePO;

/**
 * 20151022
 * �ֿ���Ϣ
 * @author ��
 */
public interface WarahouseDataService {
	/**
	 * ǰ�ã���
	 * ���ã��������п��PO
	 * @return
	 */
	public ArrayList<WarehousePO> getAll();
	/**
	 * ǰ�ã�ԭPO������
	 * ���ã�����һ��PO
	 * @param cp
	 * @return
	 */
	public boolean add(WarehousePO cp);
	/**
	 * ǰ�ã�ԭPO����
	 * ���ã�ɾ��һ��PO
	 * @param cp
	 * @return
	 */
	public boolean delete(WarehousePO cp);
    /**
     * ǰ�ã�ԭ���PO����
     * ���ã��޸�һ��PO
     * @param old
     * @param newone
     * @return
     */
	public boolean update(WarehousePO old,WarehousePO newone);
	/**
	 * ǰ�ã���
	 * ���ã�����
	 * @param a
	 */
	public void setBorderline(double a); 
}
