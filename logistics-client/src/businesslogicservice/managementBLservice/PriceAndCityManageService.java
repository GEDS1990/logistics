package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.PriceAndCityVO;
import vo.PriceVO;

public interface PriceAndCityManageService {

	/**
	 * ǰ�ã�����۸�����й���
	 * ���ã���ʾ���г���
	 * @return
	 */
	public ArrayList<String> showAllCity();
	/**
	 * ǰ�ã�����۸�����й������������ҵĳ���
	 * ���ã���ʾ�������������֮��ľ���
	 * @param city
	 * @return
	 */
	public ArrayList<PriceAndCityVO> showPartDirection(String city);
	/**
	 * ǰ�ã�����۸�����й���
	 * ���ã���ʾ���г��м�۸�
	 * @return
	 */
	public ArrayList<PriceAndCityVO> showAllDirection();
	/**
	 * ǰ�ã�ѡ�����ӳ��У�������
	 * ���ã�Ĭ���³������������м���붼��0������
	 * @return
	 */
	public boolean addCity();
	/**
	 * ǰ�ã�ѡ����У���������м����
	 * ���ã�����
	 * @param old
	 * @param direction
	 * @return
	 */
	public boolean setDiretion(PriceAndCityVO old,int direction);
	/**
	 * ǰ�ã�ѡ�����ø����ã���װ��/Ԫ���˷�/Ԫ/km��
	 * ���ã�����
	 * @return
	 */
	public boolean setPrice(PriceVO p);
}
