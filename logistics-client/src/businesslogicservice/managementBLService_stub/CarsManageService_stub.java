package businesslogicservice.managementBLService_stub;

import java.util.ArrayList;

import po.CarPO;
import vo.CarVO;
import businesslogicservice.managementBLservice.CarsManageService;

public class CarsManageService_stub implements CarsManageService{
	CarPO cp;
	@Override
	public ArrayList<CarVO> showAll() {
		// TODO �Զ����ɵķ������
		System.out.println("car");
		return null;
	}

	@Override
	public boolean add(CarVO c) {
		// TODO �Զ����ɵķ������
		System.out.println("car");
		return false;
	}

	@Override
	public boolean modify(CarVO newone) {
		// TODO �Զ����ɵķ������
		System.out.println("car");
		return false;
	}

	@Override
	public boolean delete(ArrayList<CarVO> al) {
		// TODO �Զ����ɵķ������
		System.out.println("car");
		return false;
	}

	@Override
	public ArrayList<CarVO> fuzzySearch(String s) {
		// TODO �Զ����ɵķ������
		System.out.println("car");
		return null;
	}

}
