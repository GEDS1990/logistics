package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.TranCenterLoadingListVO;

public interface TranCenterLoadingBLService {

	/**
	 * ǰ�ã��½�װ����
	 * ���ã�����
	 * ������TranCenterLoadingService.add ����һ��װ����
	 * @param o
	 * @return
	 */
	public boolean creat(TranCenterLoadingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴����װ����
	 * ���ã���ʾ����װ����
	 * ������TranCenterLoadingService.getAll��������װ����PO
	 * @return
	 */
	public ArrayList<TranCenterLoadingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������TranCenterLoadingService.clear �������
	 * @return
	 */
	public boolean clear();
}
