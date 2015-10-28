package dataservice.ticketdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.GoDownEntryListPO;

public interface GoDownEntryListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��б���Ϣ
	 */
	public ArrayList<GoDownEntryListPO> getAll()throws RemoteException;
	/**
	 * ǰ�ã����ݿ��в�������ͬID��PO
	 * ���ã�����һ��PO
	 * @param   �����ӵĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(GoDownEntryListPO ticket)throws RemoteException;
	
	/**
	 * ǰ�ã����ݿ��к��и�PO
	 * ���ã�ɾ��һ��PO
	 * @param   ��ɾ���ĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	
	public boolean delete(GoDownEntryListPO ticket)throws RemoteException;
	/**
	 * ǰ�ã���
	 * ���ã�ɾ����ЩPO
	 * @param ticket
	 * @return
	 */
	public boolean clear()throws RemoteException;
	/**
	 * ǰ�ã���PO���������ݿ�
	 * ���ã��޸�һ��PO
	 * @param user �޸ĳɹ�����true
	 * @return
	 */
	public boolean update(GoDownEntryListPO newone)throws RemoteException;
}
