package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.CarVO;

public interface CarsManageService {

	/**
	 * ǰ�ã�ѡ��������Ϣ����
	 * ���ã���ʾ����������Ϣ
	 * ������CarDataService.getAll ��������PO
	 * @return
	 */
	public ArrayList<CarVO> showAll();
	/**
	 * ǰ�ã�ѡ����������������������Ϣ
	 * ���ã�����
	 * ������CarDataService.add ����һ��PO
	 * @param c
	 * @return
	 */
	public boolean add(CarVO c);
	/**
	 * ǰ�ã�ѡ���������и���
	 * ���ã�����
	 * ������CarDataService.update �޸�һ��PO
	 * @param
	 * @return
	 */
	public boolean modify(CarVO newone);
	/**
	 * ǰ�ã�����ѡ��������Ϣ��ɾ��
	 * ���ã�����
	 * ������CarDataService.ɾ��һЩPO
	 * @param al
	 * @return
	 */
	public boolean delete(ArrayList<CarVO> al);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * ������CarDataService.getAll ��������PO
	 * @param s
	 * @return
	 */
	public ArrayList<CarVO> fuzzySearch(String s);
}
