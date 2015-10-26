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
	 * ������ReceiptListService.add  ����һ��PO
	 * @param t
	 * @return
	 */
	public boolean creatTicket(ReceiptListVO t);
	/**
	 * ǰ�ã�ѡ���տ�����޸ģ�����������Ϣ
	 * ���ã�����
	 * ������ReceiptListService.update �޸�һ���վ���Ϣ
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(ReceiptListVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * ������ReceiptListService.getAll �������е��վ�PO
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<ReceiptListVO> findTicketByTime(long timeStart,long timeEnd);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 *������ReceiptListService.clear �������
	 * @return
	 */
	public boolean clear();
}
