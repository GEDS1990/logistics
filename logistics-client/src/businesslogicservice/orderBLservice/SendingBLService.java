package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.SendingListVO;

/**
 * �ɼ�����
 * @author ��
 *
 */
public interface SendingBLService {

	/**
	 * ǰ�ã��½��ɼ���
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(SendingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴�����ɼ���
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
