package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.TranCenterLoadingListVO;

public interface TranCenterLoadingService {

	/**
	 * ǰ�ã��½��ɼ���
	 * ���ã�����
	 * @param o
	 * @return
	 */
	public boolean creat(TranCenterLoadingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴�����ɼ���
	 * ���ã���ʾ�����ռ���
	 * @return
	 */
	public ArrayList<TranCenterLoadingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
