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
	 * @param o
	 * @return
	 */
	public boolean creat(TransportListVO o);
	/**
	 * ǰ�ã�ѡ��鿴������ת��
	 * ���ã���ʾ������ת��
	 * @return
	 */
	public ArrayList<TransportListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
	
}
