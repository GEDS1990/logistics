package dataservice.logisticsdataservice;

import java.util.ArrayList;

import po.LogisticsPO;


/**
 * 20151022
 * ������Ϣ
 * @author ��
 */
public interface LogisticsDataService {

	/**
	 * ǰ�ã���
	 * ���ã���������������Ϣ
	 * @return
	 */
	public ArrayList<LogisticsPO> getAll();
	/**
	 * ǰ�ã������Ŵ���
	 * ���ã����ض�����Ϣ
	 * @return
	 */
	public LogisticsPO getOrder(String id);
	/**
	 * ǰ�ã����޸ĵ�PO����
	 * ���ã�����PO��Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(LogisticsPO old,LogisticsPO newone);
	/**
	 * ǰ�ã���
	 * ���ã�ɾ������PO
	 * @return
	 */
	public boolean clear();
}
