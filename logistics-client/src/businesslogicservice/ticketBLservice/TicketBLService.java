package businesslogicservice.ticketBLservice;
/**
 * ��Ӧ������Ϣ:(�ļ�����)װ������Ӫҵ�����ﵥ���տ���ɼ�������ת���ĵ��ﵥ ����ⵥ��(��ת��)�����ⵥ�����(�ռ���)
 * ���У�װ������Ӫҵ�����գ��տ����Ӫҵ�����ͣ���ת���Ľ��ա���ת������⣬��ת���ĳ��⣬�½�����
 */
import java.util.ArrayList;

import vo.TicketVO;

public interface TicketBLService {

	/**
	 * ǰ�ã�ѡ���½�
	 * ���ã�����
	 * @param t
	 * @return
	 */
	public boolean creatTicket(TicketVO t);
	/**
	 * ǰ�ã�ѡ�񶩵������޸ģ�����������Ϣ
	 * ���ã�����
	 * @param old
	 * @param newOne
	 * @return
	 */
	public boolean modifyTicket(TicketVO newOne);
	/**
	 * ǰ�ã�ѡ��ʱ��β鿴ticket
	 * ���ã���ʾticket
	 * @param timeStart
	 * @param timeEnd
	 * @return
	 */
	public ArrayList<TicketVO> findTicketByTime(long timeStart,long timeEnd);
	
	
	
}
