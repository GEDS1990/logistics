package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.PriceAndCityVO;

public interface PriceAndCityManageService {

	/**
	 * ǰ�ã�����۸�����й���
	 * ���ã���ʾ���г���
	 * ������PriceAndCityDataService.getAll ��������PO
	 * @return
	 */
	public ArrayList<String> showAllCity();
	/**
	 * ǰ�ã�����۸�����й������������ҵĳ���
	 * ���ã���ʾ�������������֮��ľ���
	 * ������PriceAndCityDataService.getAll ��������PO
	 * @param city
	 * @return
	 */
	public ArrayList<PriceAndCityVO> showPartDirection(String city);
	/**
	 * ǰ�ã�����۸�����й���
	 * ���ã���ʾ���г��м�۸�
	 * ������PriceAndCityDataService.getAll ��������PO
	 * @return
	 */
	public ArrayList<PriceAndCityVO> showAllDirection();
	/**
	 * ǰ�ã�ѡ�����ӳ��У�������
	 * ���ã�Ĭ���³������������м���붼��0������
	 * ������PriceAndCityDataService.getAll ��������PO
	 * @return
	 */
	public boolean addCity(String city);
	
	/**
	 * ǰ�ã�ѡ����У���������м����
	 * ���ã�����
	 * ������PriceAndCityDataService.add ����һ��PO
	 * @param old
	 * @param direction
	 * @return
	 */
	public boolean setDiretion(PriceAndCityVO old,int direction);
	/**
	 * ǰ�ã�ѡ�����ø����ã���װ��/Ԫ���˷�/Ԫ/km��
	 * ���ã�����
	 * ������PriceAndCityDataService.update ����һ��PO
	 * @return
	 */
	public boolean setPrice(PriceAndCityVO old,double price);
}
