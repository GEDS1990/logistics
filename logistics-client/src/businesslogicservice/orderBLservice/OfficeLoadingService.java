package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.OfficeLoadingListVO;

public interface OfficeLoadingService {
	/**
	 * ǰ�ã��½��ɼ���
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(OfficeLoadingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴�����ɼ���
	 * ���ã���ʾ�����ռ���
	 * @return
	 */
	public ArrayList<OfficeLoadingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
