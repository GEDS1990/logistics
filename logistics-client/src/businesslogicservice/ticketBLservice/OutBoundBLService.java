package businesslogicservice.ticketBLservice;

import java.util.ArrayList;

import vo.OutBoundListVO;

/**
 * �������
 * @author ��
 *
 */
public interface OutBoundBLService {
	/**
	 * ǰ�ã�ѡ���½�
	 * ���ã�����
	 * @param t
	 * @return
	 */
	public boolean creatTicket(OutBoundListVO t);
	/**
	 * ǰ�ã�ѡ�񶩵������޸ģ�����������Ϣ
	 * ���ã�����
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(OutBoundListVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<OutBoundListVO> findTicketByTime(long timeStart,long timeEnd);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
	
}
