package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.DriverVO;

public interface DriversMangeService {

	/**
	 * ǰ�ã�ѡ��˾����Ϣ����
	 * ���ã���ʾ����˾����Ϣ
	 * ������DriversDataService.getAll ��������PO
	 * @return
	 */
	public ArrayList<DriverVO> showAll();
	/**
	 * ǰ�ã�ѡ������˾��������˾����Ϣ
	 * ���ã�����
	 * ������DriversDataService.add  ����һ��PO
	 * @param c
	 * @return
	 */
	public boolean add(DriverVO c);
	/**
	 * ǰ�ã�ѡ��˾�����и���
	 * ���ã�����
	 * ������DriversDataService.update �޸�һ��PO
	 * @param 
	 * @return
	 */
	public boolean modify(DriverVO newone);
	/**
	 * ǰ�ã�����ѡ��˾����Ϣ��ɾ��
	 * ���ã�����
	 * ������DriversDataService.delete ɾ��һЩPO
	 * @param al
	 * @return
	 */
	public boolean delete(ArrayList<DriverVO> al);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * ������DriversDataService.getAll ��������PO
	 * @param s
	 * @return
	 */
	public ArrayList<DriverVO> fuzzySearch(String s);
	
}
