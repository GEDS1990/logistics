package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.ReceiveListVO;

/**
 * �ռ���
 * @author 
 *
 */
public interface ReceiveBLService {
	/**
	 * ǰ�ã��½��ռ���
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(ReceiveListVO o);
	/**
	 * ǰ�ã�ѡ��鿴�����ռ���
	 * ���ã���ʾ�����ռ���
	 * @return
	 */
	public ArrayList<ReceiveListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
