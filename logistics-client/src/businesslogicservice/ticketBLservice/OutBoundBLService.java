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
	 * ������OutBoundListService.add ����һ�����ⵥPO
	 * @param t
	 * @return
	 */
	public boolean creatTicket(OutBoundListVO t);
	/**
	 * ǰ�ã�ѡ����ⵥ�����޸ģ�����������Ϣ
	 * ���ã�����
	 * ������OutBoundListService.update
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(OutBoundListVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * ������OutBoundListService.getall �������еĳ��ⵥPO
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<OutBoundListVO> findTicketByTime(long timeStart,long timeEnd);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * ������OutBoundListService.clear ��ճ��ⵥ����
	 * @return
	 */
	public boolean clear();
	
}
