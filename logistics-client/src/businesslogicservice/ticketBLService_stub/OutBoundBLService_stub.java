package businesslogicservice.ticketBLService_stub;

import java.util.ArrayList;

import vo.OutBoundListVO;
import businesslogicservice.ticketBLservice.OutBoundBLService;

public class OutBoundBLService_stub implements OutBoundBLService{

	@Override
	public boolean creatTicket(OutBoundListVO t) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean modifyTicket(OutBoundListVO newOne) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public ArrayList<OutBoundListVO> findTicketByTime(long timeStart,
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
