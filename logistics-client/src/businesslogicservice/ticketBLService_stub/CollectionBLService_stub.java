package businesslogicservice.ticketBLService_stub;

import java.util.ArrayList;

import vo.ReceiptListVO;
import businesslogicservice.ticketBLservice.CollectionBLService;

public class CollectionBLService_stub implements CollectionBLService{

	@Override
	public boolean creatTicket(ReceiptListVO t) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean modifyTicket(ReceiptListVO newOne) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public ArrayList<ReceiptListVO> findTicketByTime(long timeStart,
			long timeEnd) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean clear() {
		// TODO �Զ����ɵķ������
		return false;
	}

}
