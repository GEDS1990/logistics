package dataservice.orderdataservice;

import java.util.ArrayList;

import po.ReceiveListPO;


/**
 * �ռ���
 * @author 
 *
 */
public interface ReceiveList {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<ReceiveListPO> getAll();
	/**
	 * ǰ�ã���������ͬID���ռ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(ReceiveListPO o);
}
