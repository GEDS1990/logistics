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
	 * ������DepartmentDataService.getAll ��������PO
	 * @return 
	 */
	public ArrayList<DepartmentVO> showAll();
	
	/**
	 * ǰ�ã�ѡ�����ӻ�������������������Ϣ
	 * ���ã����»�����Ϣ
	 * ������DepartmentDataService.add ����һ��PO
	 * @param d
	 * @return
	 */
	public boolean add(DepartmentVO d);
	/**
	 * ǰ�ã�ѡ��ɾ������
	 * ���ã����»�����Ϣ
	 * ������DepartmentDataService.delete ɾ��һ��PO
	 * @param d
	 * @return
	 */
	public boolean delete(DepartmentVO d);
	/**
	 * ǰ�ã�ѡ����ɾ���Ļ���
	 * ���ã����»�����Ϣ
	 * ������DepartmentDataService.deleteɾ��arraylist�е�PO
	 * @param ald
	 * @return
	 */
	public boolean delete(ArrayList<DepartmentVO> ald);
	/**
	 * ǰ�ã�ѡ����������޸ģ������޸ĺ������Ϣ
	 * ���ã����»�����Ϣ
	 * ������DepartmentDataService.midify �޸�һ��PO
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean modify(DepartmentVO old,DepartmentVO newone);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * ������DepartmentDataService.getAll �õ����е�PO
	 * @param s
	 * @return
	 */
	public ArrayList<DepartmentVO> fuzzySearch(String s);
	
}
