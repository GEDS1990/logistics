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
	 * @param t
	 * @return
	 */
	public boolean creatTicket(GoDownEntryListVO t);
	/**
	 * ǰ�ã�ѡ�񶩵������޸ģ�����������Ϣ
	 * ���ã�����
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(GoDownEntryListVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<GoDownEntryListVO> findTicketByTime(long timeStart,long timeEnd);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
