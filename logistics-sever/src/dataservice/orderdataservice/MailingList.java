package dataservice.orderdataservice;

import java.util.ArrayList;

import po.MailingListPO;

/**
 * �ļ���
 * @author 
 *
 */
public interface MailingList {
 
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<MailingListPO> getAll();
	/**
	 * ǰ�ã���������ͬID�ļļ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(MailingListPO o);
}
