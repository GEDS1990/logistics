package dataservice.orderdataservice;

import java.util.ArrayList;

import po.TransportListPO;


/**
 * ��ת��
 * @author 
 *
 */
public interface TransportList {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<TransportListPO> getAll();
	/**
	 * ǰ�ã���������ͬID���ռ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(TransportListPO o);
}
