package businesslogicservice.ticketBLservice;

import java.util.ArrayList;

import vo.GoDownEntryListVO;

/**
 * ������
 * @author ��
 *
 */
public interface GoDownEntryBLService {
    /**
	 * ǰ�ã�ѡ���½�
	 * ���ã�����
	 * ������GoDownEntryListService.
	 * @param t
	 * @return
	 */
	public boolean createTicket(GoDownEntryListVO t);
	/**
	 * ǰ�ã�ѡ����ⵥ�����޸ģ�����������Ϣ
	 * ���ã�����
	 * ������GoDownEntryListService.update
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(GoDownEntryListVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * ������GoDownEntryListService.getAll
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<GoDownEntryListVO> findTicketByTime(long timeStart,long timeEnd);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������GoDownEntryListService.clear
	 * @return
	 */
	public boolean clear();
}
