package businesslogicservice.departmentBLservice;

import java.util.ArrayList;

import vo.StuffVO;

public interface StuffManageBLService {
	/**
	 * ǰ�ã�ѡ��Ա������
	 * ���ã���ʾ����Ա��
	 * @return
	 */
	public ArrayList<StuffVO> showAll();
	/**
	 * ǰ�ã�ѡ������Ա����������Ա����Ϣ
	 * ���ã�����Ա����Ϣ
	 * @param d
	 * @return
	 */
	public boolean add(StuffVO d);
	/**
	 * ǰ�ã�ѡ��ɾ��Ա��
	 * ���ã�����Ա����Ϣ
	 * @param d
	 * @return
	 */
	public boolean delete(StuffVO d);
	
	/**
	 * ǰ�ã�ѡ��ɾ��Ա��
	 * ���ã�����Ա����Ϣ
	 * @param ald
	 * @return
	 */
	public boolean delete(ArrayList<StuffVO> ald);
	/**
	 * ǰ�ã�ѡ���޸�Ա��������Ա������Ϣ
	 * ���ã�����Ա����Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean modify(StuffVO old,StuffVO newone);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * @param s
	 * @return
	 */
	public ArrayList<StuffVO> fuzzySearch(String s);
}
