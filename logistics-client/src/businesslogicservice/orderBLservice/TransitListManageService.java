package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.TransitListVO;

/**
 * ��ת������
 * @author 
 *
 */
public interface TransitListManageService {
	/**
	 * ǰ�ã��½���ת������
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(TransitListVO o);
	/**
	 * ǰ�ã�ѡ��鿴������ת������
	 * ���ã���ʾ������ת������
	 * @return
	 */
	public ArrayList<TransitListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
