package dataservice.userdataservice;
/**
 * 20151022
 * �û��˺���Ϣ
 * @author ��
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.UserPO;

public interface UserDataService extends Remote{

	
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��û���Ϣ
	 */
	public ArrayList<UserPO> allUsers()throws RemoteException;
	/**
	 * ǰ�ã������ڸ�PO��ID
	 * ���ã�����һ��PO
	 * @param user �����ӵ��û�
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(UserPO user)throws RemoteException;
	/**
	 * ǰ�ã���
	 * ���ã������û���Ϣ
	 * @param id
	 * @return PO
	 */
	public UserPO find(String id)throws RemoteException;
	/**
	 * ǰ�ã����ڸ�UserPO
	 * ���ã�ɾ��һ��PO
	 * @param user
	 * @return
	 */
	public boolean delete(UserPO user)throws RemoteException;
	/**
	 * ǰ�ã����ڸ�PO��id
	 * ���ã�����һ��PO
	 * @param user �޸ĳɹ�����true
	 * @return
	 */
	public boolean update(UserPO old)throws RemoteException;
}
