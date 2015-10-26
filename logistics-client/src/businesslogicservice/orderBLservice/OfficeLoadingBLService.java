package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.OfficeLoadingListVO;

public interface OfficeLoadingBLService {
	/**
	 * ǰ�ã��½�װ����
	 * ���ã�����
	 * ������OfficeLoadingListService.add ����һ��Ӫҵ��װ���� PO
	 * @param o
	 * @return
	 */
	public boolean creat(OfficeLoadingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴����װ����
	 * ���ã���ʾ�����ռ���
	 * ������OfficeLoadingListService.getAll �������е�Ӫҵ��װ����PO
	 * @return
	 */
	public ArrayList<OfficeLoadingListVO> getAll();
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������OfficeLoadingListService.clear �������
	 * @return
	 */
	public boolean clear();
}
