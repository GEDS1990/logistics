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
	 * ������SendingListService.add ����һ��PO
	 * @param o
	 * @return
	 */
	public boolean creat(SendingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴�����ɼ���
	 * ���ã���ʾ�����ռ���
	 * ������SendingListService.getAll ���������ɼ��� PO
	 * @return
	 */
	public ArrayList<SendingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������SendingListService.clear �������
	 * @return
	 */
	public boolean clear();
}
