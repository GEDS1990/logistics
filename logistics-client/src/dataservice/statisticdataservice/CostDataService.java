package dataservice.statisticdataservice;

import java.util.ArrayList;

import po.CostListPO;


public interface CostDataService {

	/**
	 * ǰ�ã����ݿ��в����ڸ�PO��ID
	 * ���ã�����һ��PO
	 * @param c
	 * @return
	 */
	public boolean addCostList(CostListPO c);
	/**
	 * ǰ�ã���
	 * ���ã���������IO
	 * @return
	 */
	public ArrayList<CostListPO> getAll();
}
