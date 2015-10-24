package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.DriverVO;

public interface DriversMangeService {

	/**
	 * ǰ�ã�ѡ��˾����Ϣ����
	 * ���ã���ʾ����˾����Ϣ
	 * @return
	 */
	public ArrayList<DriverVO> showAll();
	/**
	 * ǰ�ã�ѡ������˾��������˾����Ϣ
	 * ���ã�����
	 * @param c
	 * @return
	 */
	public boolean add(DriverVO c);
	/**
	 * ǰ�ã�ѡ��˾�����и���
	 * ���ã�����
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean modify(DriverVO old,DriverVO newone);
	/**
	 * ǰ�ã�����ѡ��˾����Ϣ��ɾ��
	 * ���ã�����
	 * @param al
	 * @return
	 */
	public boolean delete(ArrayList<DriverVO> al);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * @param s
	 * @return
	 */
	public ArrayList<DriverVO> fuzzySearch(String s);
	
}
