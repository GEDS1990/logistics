package businesslogicservice.ticketBLService_stub;

import java.util.ArrayList;

import po.GoDownEntryListPO;
import vo.GoDownEntryListVO;
import businesslogicservice.ticketBLservice.GoDownEntryBLService;

public class GoDownEntryBLService_stub implements GoDownEntryBLService{
	GoDownEntryListPO gdepo;
	@Override
	public boolean createTicket(GoDownEntryListVO t) {
		// TODO �Զ����ɵķ������
		System.out.println("GodownEntry");
		return false;
	}

	@Override
	public boolean modifyTicket(GoDownEntryListVO newOne) {
		// TODO �Զ����ɵķ������
		System.out.println("GodownEntry");
		return false;
	}

	@Override
	public ArrayList<GoDownEntryListVO> findTicketByTime(long timeStart,
			long timeEnd) {
		// TODO �Զ����ɵķ������
		System.out.println("GodownEntry");
		return null;
	}

	@Override
	public boolean clear() {
		// TODO �Զ����ɵķ������
		System.out.println("GodownEntry");
		return false;
	}

}
