package businesslogicservice.orderBLService_stub;

import java.util.ArrayList;

import vo.MailingListVO;
import businesslogicservice.orderBLservice.MailingBLService;

public class MailingBLService_stub implements MailingBLService{

	@Override
	public double calculatePrice(MailingListVO m) {
		// TODO �Զ����ɵķ������
		System.out.println("price");
		return 0;
	}

	@Override
	public double calculateTime(MailingListVO m) {
		// TODO �Զ����ɵķ������
		System.out.println("time");
		return 0;
	}

	@Override
	public boolean creat(MailingListVO o) {
		// TODO �Զ����ɵķ������
		System.out.println("mail");
		return false;
	}

	@Override
	public ArrayList<MailingListVO> getAll() {
		// TODO �Զ����ɵķ������
		return null;
	}

}
