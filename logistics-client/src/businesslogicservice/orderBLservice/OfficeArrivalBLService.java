package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.ReceiveListVO;

/**
 * 
 * @author Ӫҵ���ӵ�
 *
 */
public interface OfficeArrivalBLService {
	/**
	 * ǰ�ã��½�Ӫҵ�����յ�
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(ReceiveListVO o);
	/**
	 * ǰ�ã�ѡ��鿴����Ӫҵ�����յ�
	 * ���ã���ʾ����Ӫҵ�����յ�
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
