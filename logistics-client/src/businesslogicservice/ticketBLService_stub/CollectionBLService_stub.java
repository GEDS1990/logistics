package businesslogicservice.ticketBLService_stub;

import java.util.ArrayList;

import po.ReceiptListPO;
import vo.ReceiptListVO;
import businesslogicservice.ticketBLservice.CollectionBLService;

public class CollectionBLService_stub implements CollectionBLService{
	ReceiptListPO rlpo;
	@Override
	public boolean createTicket(ReceiptListVO t) {
		// TODO �Զ����ɵķ������
		System.out.println("createTicket");
		return false;
	}

	@Override
	public boolean modifyTicket(ReceiptListVO newOne) {
		// TODO �Զ����ɵķ������
		System.out.println("modifyTicket");
		return false;
	}

	@Override
	public ArrayList<ReceiptListVO> findTicketByTime(long timeStart,
			long timeEnd) {
		// TODO �Զ����ɵķ������
		System.out.println("findTicket");
		return null;
	}

	@Override
	public boolean clear() {
		// TODO �Զ����ɵķ������
		System.out.println("clear Ticket");
		return false;
	}

}
