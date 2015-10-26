package dataservice.userdataservice;
/**
 * 20151022
 * �û��˺���Ϣ
 * @author ��
 */
import java.util.ArrayList;

import po.UserPO;

public interface UserDataService {

	
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return ���е��û���Ϣ
	 */
	public ArrayList<UserPO> allUsers();
	/**
	 * ǰ�ã������ڸ�PO��ID
	 * ���ã�����һ��PO
	 * @param user �����ӵ��û�
	 * @return  ��ӳɹ�����true
	 */
	public boolean add(UserPO user);
	/**
	 * ǰ�ã���
	 * ���ã������û���Ϣ
	 * @param id
	 * @return PO
	 */
	public UserPO find(String id);
	/**
	 * ǰ�ã����ڸ�UserPO
	 * ���ã�ɾ��һ��PO
	 * @param user
	 * @return
	 */
	public boolean delete(UserPO user);
	/**
	 * ǰ�ã����ڸ�PO��id
	 * ���ã�����һ��PO
	 * @param user �޸ĳɹ�����true
	 * @return
	 */
	public boolean update(UserPO old);
}
