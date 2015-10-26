package businesslogicservice.departmentBLservice;

import java.util.ArrayList;

import vo.StuffVO;

public interface StuffManageBLService {
	/**
	 * ǰ�ã�ѡ��Ա������
	 * ���ã���ʾ����Ա��
	 * ������StuffDataService.getAll �õ�����Ա����Ϣ
	 * @return
	 */
	public ArrayList<StuffVO> showAll();
	/**
	 * ǰ�ã�ѡ������Ա����������Ա����Ϣ
	 * ���ã�����Ա����Ϣ
	 * ������StuffDataService.add ����һ��PO
	 * @param d
	 * @return
	 */
	public boolean add(StuffVO d);
	/**
	 * ǰ�ã�ѡ��ɾ��Ա��
	 * ���ã�����Ա����Ϣ
	 * ������StuffDataService.delete ɾ��һ��PO
	 * @param d
	 * @return
	 */
	public boolean delete(StuffVO d);
	
	/**
	 * ǰ�ã�ѡ��ɾ��Ա��
	 * ���ã�����Ա����Ϣ
	 * ������StuffDataService.delete ɾ��arraylist���� ��PO
	 * @param ald
	 * @return
	 */
	public boolean delete(ArrayList<StuffVO> ald);
	/**
	 * ǰ�ã�ѡ���޸�Ա��������Ա������Ϣ
	 * ���ã�����Ա����Ϣ
	 * ������StuffDataService.update �޸�һ��PO
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean modify(StuffVO  newone);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * ������StuffDataService.getAll ��������PO
	 * @param s
	 * @return
	 */
	public ArrayList<StuffVO> fuzzySearch(String s);
}
