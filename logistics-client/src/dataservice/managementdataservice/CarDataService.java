package dataservice.managementdataservice;

import java.util.ArrayList;

import po.CarPO;

/**
* 20151022
* ������Ϣ
* @author ��
*/
public interface CarDataService {
	/**
	 * ǰ�ã���
	 * ���ã�������������PO
	 * @param s
	 * @return
	 */
	public ArrayList<CarPO> getAll();
	/**
	 * ǰ�ã����ݿ��в�������ͬIDֵ��PO
	 * ���ã�����һ��PO
	 * @param cp
	 * @return
	 */
	public boolean add(CarPO cp);
	/**
	 * ǰ�ã����ݿ����Ѿ����ڸ�PO
	 * ���ã�ɾ��һ��PO
	 * @param cp
	 * @return
	 */
	public boolean delete(CarPO cp);
	/**
	 * ǰ�ã����ݿ��д�����ЩPO
	 * ���ã�ɾ����ЩPO
	 * @return
	 */
	public boolean delete(ArrayList<CarPO> al);
	/**
	 * ǰ�ã����ݿ��д���ԭPO
	 * ���ã��޸ĸ�PO
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(CarPO old,CarPO newone);
}
