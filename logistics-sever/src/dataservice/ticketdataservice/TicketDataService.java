package dataservice.ticketdataservice;

import java.util.ArrayList;

import po.TicketPO;

/**
 * 20151022
 * ������Ϣ:(�ļ�����)װ������Ӫҵ�����ﵥ���տ���ɼ�������ת���ĵ��ﵥ ����ⵥ��(��ת��)�����ⵥ�����(�ռ���)
 * @author ��
 *
 */
public interface TicketDataService {

	
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��б���Ϣ
	 */
	public ArrayList<TicketPO> getAll();
	/**
	 * ǰ�ã����ݿ��в�������ͬID��PO
	 * ���ã�����һ��PO
	 * @param   �����ӵĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(TicketPO ticket);
	
	/**
	 * ǰ�ã����ݿ��к��и�PO
	 * ���ã�ɾ��һ��PO
	 * @param   ��ɾ���ĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	
	public boolean delete(TicketPO ticket);
	/**
	 * ǰ�ã����ݿ��к�����ЩPO
	 * ���ã�ɾ����ЩPO
	 * @param ticket
	 * @return
	 */
	public boolean delete(ArrayList<TicketPO> ticket);
	/**
	 * ǰ�ã���PO���������ݿ�
	 * ���ã��޸�һ��PO
	 * @param user �޸ĳɹ�����true
	 * @return
	 */
	public boolean updata(TicketPO newone);
}
