package businesslogicservice.userBLservice;

import vo.UserVO;

public interface UserBLservice {

	/**
	 * ǰ�ã��û����ڣ�������ȷ��ѡ����ȷ���û�����
	 * ���ã���¼
	 * @param u
	 * @return
	 */
	public boolean login(UserVO u);
	/**
	 * ǰ�ã�����Աѡ���û�ɾ��
	 * ���ã�����
	 * @param u
	 * @return
	 */
	public boolean deleteUser(UserVO u);
	/**
	 * ǰ�ã����������û�
	 * ���ã�����
	 * @param u
	 * @return
	 */
	public boolean addUser(UserVO u);
	/**
	 * ǰ�ã��û������˻���Ϣ
	 * ���ã�����
	 * @param u
	 * @return
	 */
	public boolean updata(UserVO u);
}
