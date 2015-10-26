package dataservice.managementdataservice;

import java.util.ArrayList;

import po.DriverPO;

public interface DriversDataService {
	/**
	 * ǰ�ã���
	 * ���ã���������˾��PO
	 * @param s
	 * @return
	 */
	public ArrayList<DriverPO> getAll();
	/**
	 * ǰ�ã����ݿ��в�������ͬIDֵ��PO
	 * ���ã�����һ��PO
	 * @param cp
	 * @return
	 */
	public boolean add(DriverPO cp);
	/**
	 * ǰ�ã����ݿ����Ѿ����ڸ�PO
	 * ���ã�ɾ��һ��PO
	 * @param cp
	 * @return
	 */
	public boolean delete(DriverPO cp);
	/**
	 * ǰ�ã����ݿ��д�����ЩPO
	 * ���ã�ɾ����ЩPO
	 * @return
	 */
	public boolean delete(ArrayList<DriverPO> al);
	/**
	 * ǰ�ã����ݿ��д���ԭPO
	 * ���ã��޸ĸ�PO
	 * @param
	 * @return
	 */
	public boolean updata(DriverPO newone);
}
