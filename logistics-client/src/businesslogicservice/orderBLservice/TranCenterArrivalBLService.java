package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.SendingListVO;

/**
 * ��ת���Ľ���
 * @author ��˶
 *
 */
public interface TranCenterArrivalBLService {
	/**
	 * ǰ�ã��½���ת���Ľ��յ�
	 * ���ã�����
	 * ������TranCenterArrivalListService.add ����һ�����ܵ�PO
	 * @param o
	 * @return
	 */
	public boolean creat(SendingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴������ת���Ľ��յ�
	 * ���ã���ʾ�����ռ���
	 * ������TranCenterArrivalListService.getAll �������еĽ��ܵ�PO
	 * @return
	 */
	public ArrayList<SendingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������TranCenterArrivalListService.clear  �������
	 * @return
	 */
	public boolean clear();
}
