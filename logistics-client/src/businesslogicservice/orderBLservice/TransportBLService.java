package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.TransportListVO;


/**
 * ��ת��
 * @author 
 *
 */
public interface TransportBLService {
	/**
	 * ǰ�ã��½���ת��
	 * ���ã�����
	 * ������TransportListService.add ����һ����ת��PO
	 * @param o
	 * @return
	 */
	public boolean creat(TransportListVO o);
	/**
	 * ǰ�ã�ѡ��鿴������ת��
	 * ���ã���ʾ������ת��
	 * ������TransportListService.getAll ����������ת��PO
	 * @return
	 */
	public ArrayList<TransportListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������TransportListService.clear �������
	 * @return
	 */
	public boolean clear();
	
}
