package businesslogicservice.logisticsBLService_stub;

import java.util.ArrayList;

import po.LogisticsPO;
import vo.LogisticsVO;
import businesslogicservice.logisticsBLservice.LogisticsBLService;

public class LogisticsBLService_stub implements LogisticsBLService{
	LogisticsPO lgpo;
	@Override
	public LogisticsVO showState(String id) {
		// TODO �Զ����ɵķ������
		if(id.equals("140010001")){
			lgpo.getLocation();
			System.out.println("state");
		}
		return null;
	}

	@Override
	public boolean setState(String id, String state) {
		// TODO �Զ����ɵķ������
		if(id.equals("")){
			lgpo.setLocation(state);
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean setState(LogisticsVO o) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean setState(ArrayList<LogisticsVO> al) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean clear() {
		// TODO �Զ����ɵķ������
		return false;
	}

}
