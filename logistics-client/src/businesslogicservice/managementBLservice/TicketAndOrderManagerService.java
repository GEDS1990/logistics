package businesslogicservice.managementBLservice;

import java.util.ArrayList;

public interface TicketAndOrderManagerService {

	/**
	 * ǰ�ã��ܾ����½�����ظ��ж�
	 * ���ã��ж��Ƿ��д��ύ����δ����
	 * @return
	 */
	public boolean hasTicketToManage();
	
	/**
	 * ǰ�ã�����鿴δ��������
	 * ���ã���ʾδ��������
	 * @param tickettype
	 * @param state
	 * @return
	 */
	public ArrayList<Object> getTicket(String tickettype,String state);
	/**
	 * ǰ�ã�������������
	 * ���ã�����
	 * @param type
	 * @param o
	 * @return
	 */
	public boolean update(String type,Object o);
	/**
	 * ǰ�ã�������������
	 * ���ã�����
	 * @param type
	 * @param o
	 * @return
	 */
	public boolean update(ArrayList<Object> al);
}
