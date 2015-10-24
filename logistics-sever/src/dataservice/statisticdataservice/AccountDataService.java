package dataservice.statisticdataservice;

import java.util.ArrayList;

import po.AccountPO;


public interface AccountDataService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��б���Ϣ
	 */
	public ArrayList<AccountPO> getAll();
	/**
	 * ǰ�ã����ݿ��в�������ͬID��PO
	 * ���ã�����һ��PO
	 * @param   �����ӵĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(AccountPO ticket);
	
	/**
	 * ǰ�ã����ݿ��к��и�PO
	 * ���ã�ɾ��һ��PO
	 * @param   ��ɾ���ĳ־û�����
	 * @return  ��ӳɹ�����true
	 */
	
	public boolean delete(AccountPO ticket);
	/**
	 * ǰ�ã����ݿ��к�����ЩPO
	 * ���ã�ɾ����ЩPO
	 * @param ticket
	 * @return
	 */
	public boolean delete(ArrayList<AccountPO> ticket);
	/**
	 * ǰ�ã���PO���������ݿ�
	 * ���ã��޸�һ��PO
	 * @param user �޸ĳɹ�����true
	 * @return
	 */
	public boolean updata(AccountPO newone);
}
