package businesslogicservice.ticketBLService_stub;

import java.util.ArrayList;

import vo.GoDownEntryListVO;
import businesslogicservice.ticketBLservice.GoDownEntryBLService;

public class GoDownEntryBLService_stub implements GoDownEntryBLService{

	@Override
	public boolean creatTicket(GoDownEntryListVO t) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean modifyTicket(GoDownEntryListVO newOne) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public ArrayList<GoDownEntryListVO> findTicketByTime(long timeStart,
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
