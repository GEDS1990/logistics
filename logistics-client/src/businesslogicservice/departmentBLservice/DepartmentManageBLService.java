package businesslogicservice.departmentBLservice;

import java.util.ArrayList;

import vo.DepartmentVO;
/**
 * 20151024
 * ���������Ի�������ɾ�Ĳ�
 * @author 
 *
 */
public interface DepartmentManageBLService {

	/**
	 * ǰ�ã�������������
	 * ���ã���ʾ���л�����Ϣ
	 * @return 
	 */
	public ArrayList<DepartmentVO> showAll();
	
	/**
	 * ǰ�ã�ѡ�����ӻ�������������������Ϣ
	 * ���ã����»�����Ϣ
	 * @param d
	 * @return
	 */
	public boolean add(DepartmentVO d);
	/**
	 * ǰ�ã�ѡ��ɾ������
	 * ���ã����»�����Ϣ
	 * @param d
	 * @return
	 */
	public boolean delete(DepartmentVO d);
	/**
	 * ǰ�ã�ѡ����ɾ���Ļ���
	 * ���ã����»�����Ϣ
	 * @param ald
	 * @return
	 */
	public boolean delete(ArrayList<DepartmentVO> ald);
	/**
	 * ǰ�ã�ѡ����������޸ģ������޸ĺ������Ϣ
	 * ���ã����»�����Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean modify(DepartmentVO old,DepartmentVO newone);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * @param s
	 * @return
	 */
	public ArrayList<DepartmentVO> fuzzySearch(String s);
	
}
