package dataservice.ticketdataservice;

import java.util.ArrayList;

import po.GoDownEntryListPO;

public interface GoDownEntryListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��б���Ϣ
	 */
	public ArrayList<GoDownEntryListPO> getAll();
	/**
	 * ǰ�ã����ݿ��в�������ͬID��PO
	 * ���ã�����һ��PO
	 * @param   �����ӵĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(GoDownEntryListPO ticket);
	
	/**
	 * ǰ�ã����ݿ��к��и�PO
	 * ���ã�ɾ��һ��PO
	 * @param   ��ɾ���ĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	
	public boolean delete(GoDownEntryListPO ticket);
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
	public boolean updata(GoDownEntryListPO newone);
}
