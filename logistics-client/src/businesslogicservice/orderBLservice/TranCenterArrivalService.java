package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.SendingListVO;

/**
 * ��ת���Ľ���
 * @author ��˶
 *
 */
public interface TranCenterArrivalService {
	/**
	 * ǰ�ã��½���ת���Ľ��յ�
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(SendingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴������ת���Ľ��յ�
	 * ���ã���ʾ�����ռ���
	 * @return
	 */
	public ArrayList<SendingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
