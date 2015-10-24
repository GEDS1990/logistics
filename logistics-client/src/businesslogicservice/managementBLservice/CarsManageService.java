package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.CarVO;

public interface CarsManageService {

	/**
	 * ǰ�ã�ѡ��������Ϣ����
	 * ���ã���ʾ����������Ϣ
	 * @return
	 */
	public ArrayList<CarVO> showAll();
	/**
	 * ǰ�ã�ѡ����������������������Ϣ
	 * ���ã�����
	 * @param c
	 * @return
	 */
	public boolean add(CarVO c);
	/**
	 * ǰ�ã�ѡ���������и���
	 * ���ã�����
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean modify(CarVO old,CarVO newone);
	/**
	 * ǰ�ã�����ѡ��������Ϣ��ɾ��
	 * ���ã�����
	 * @param al
	 * @return
	 */
	public boolean delete(ArrayList<CarVO> al);
	/**
	 * ǰ�ã�����ؼ���ģ������
	 * ���ã����ز��ҽ��
	 * @param s
	 * @return
	 */
	public ArrayList<CarVO> fuzzySearch(String s);
}
