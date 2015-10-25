package businesslogicservice.ticketBLservice;

import java.util.ArrayList;

import vo.ReceiptListVO;


/**
 * �տ����
 * @author 
 *
 */
public interface CollectionBLService {
	/**
	 * ǰ�ã�ѡ���½�
	 * ���ã�����
	 * @param t
	 * @return
	 */
	public boolean creatTicket(ReceiptListVO t);
	/**
	 * ǰ�ã�ѡ�񶩵������޸ģ�����������Ϣ
	 * ���ã�����
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(ReceiptListVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<ReceiptListVO> findTicketByTime(long timeStart,long timeEnd);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
