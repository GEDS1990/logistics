package businesslogicservice.departmentBLService_stub;

import java.util.ArrayList;

import vo.StuffVO;
import businesslogicservice.departmentBLservice.StuffManageBLService;

public class StuffManageBLService_stub implements StuffManageBLService{
	StuffVO svo;
	@Override
	public ArrayList<StuffVO> showAll() {
		// TODO �Զ����ɵķ������
		System.out.println("show all stuff"); 
		return null;
	}

	@Override
	public boolean add(StuffVO d) {
		// TODO �Զ����ɵķ������
		System.out.println("add successfully");
		return false;
	}

	@Override
	public boolean delete(StuffVO d) {
		// TODO �Զ����ɵķ������
		if(d.getIdentity().length() == 9){
			this.svo = d;
			System.out.println("delete successfully");
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(ArrayList<StuffVO> ald) {
		// TODO �Զ����ɵķ������
		
		return false;
	}

	@Override
	public boolean modify(StuffVO newone) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public ArrayList<StuffVO> fuzzySearch(String s) {
		// TODO �Զ����ɵķ������
		return null;
	}
	
}
