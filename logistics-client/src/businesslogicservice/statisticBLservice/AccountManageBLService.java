package businesslogicservice.statisticBLservice;

import java.util.ArrayList;

import vo.AccountVO;

/**
 * �˻�����
 * @author 
 *
 */
public interface AccountManageBLService {

	/**
	 * ǰ�ã�����ؼ��ֲ����˻�
	 * ���ã���ʾģ�����ҽ��
	 * ������AccountDataService.getAll ���������˻���Ϣ
	 * @param s
	 * @return
	 */
	public boolean fuzzySearch(String s);
	/**
	 * ǰ�ã��½�һ���˻���������Ϣ
	 * ���ã���ʾ���˻��б�
	 * ������AccountDataService.add ����һ���˻�PO
	 * @param a
	 * @return
	 */
	public boolean add(AccountVO a);
	/**
	 * ǰ�ã�ѡ���˻�ɾ��
	 * ���ã���ʾ���˻��б� 
	 * ������AccountDataService.delete ɾ��һ���˻�PO 
	 * @param a
	 * @return
	 */
	public boolean delete(AccountVO a);
	/**
	 * ǰ�ã�ѡ���˻�ɾ��
	 * ���ã���ʾ���˻��б�
	 * ������AccountDataService.delete ɾ���˻�
	 * @param a
	 * @return
	 */
	public boolean delete(ArrayList<AccountVO> a);
	/**
	 * ǰ�ã�ѡ���˻��޸���Ϣ
	 * ���ã���ʾ���˻��б�
	 * ������AccountDataService.update �����˻���Ϣ
	 * @param a
	 * @return
	 */
	public boolean updata(AccountVO a);
	/**
	 * ǰ�ã��½��տ
	 * ���ã��������
	 * ������AccountDataService.update �����˻���Ϣ
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean income(AccountVO a,double b);
	/**
	 * ǰ�ã��½����
	 * ���ã��������
	 * ������AccountDataService.update �����˻���Ϣ
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean pay(AccountVO a,double b);
}
