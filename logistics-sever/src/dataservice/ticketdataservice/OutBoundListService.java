package dataservice.ticketdataservice;

import java.util.ArrayList;

import po.OutBoundListPO;

public interface OutBoundListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��б���Ϣ
	 */
	public ArrayList<OutBoundListPO> getAll();
	/**
	 * ǰ�ã����ݿ��в�������ͬID��PO
	 * ���ã�����һ��PO
	 * @param   �����ӵĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(OutBoundListPO ticket);
	
	/**
	 * ǰ�ã����ݿ��к��и�PO
	 * ���ã�ɾ��һ��PO
	 * @param   ��ɾ���ĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	
	public boolean delete(OutBoundListPO ticket);
	/**
	 * ǰ�ã���
	 * ���ã�ɾ����ЩPO
	 * @param ticket
	 * @return
	 */
	public boolean clear();
	/**
	 * ǰ�ã���PO���������ݿ�
	 * ���ã��޸�һ��PO
	 * @param user �޸ĳɹ�����true
	 * @return
	 */
	public boolean updata(OutBoundListPO newone);
}
