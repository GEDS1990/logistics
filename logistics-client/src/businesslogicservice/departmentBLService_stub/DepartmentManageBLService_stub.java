package businesslogicservice.departmentBLService_stub;

import java.util.ArrayList;

import vo.DepartmentVO;
import businesslogicservice.departmentBLservice.DepartmentManageBLService;

public class DepartmentManageBLService_stub implements DepartmentManageBLService {
	DepartmentVO dpvo;
	@Override
	public ArrayList<DepartmentVO> showAll() {
		System.out.println("show all departments");
		return null;
	}

	@Override
	public boolean add(DepartmentVO d) {
		System.out.println("add successfully");
		return false;
	}

	@Override
	public boolean delete(DepartmentVO d) {
		// TODO �Զ����ɵķ������
		System.out.println("delete successfully");
		return false;
	}

	@Override
	public boolean delete(ArrayList<DepartmentVO> ald) {
		// TODO �Զ����ɵķ������
		System.out.println("delete successfully");
		return false;
	}

	@Override
	public boolean modify(DepartmentVO old, DepartmentVO newone) {
		// TODO �Զ����ɵķ������
		System.out.println("modify successfully");
		return false;
	}

	@Override
	public ArrayList<DepartmentVO> fuzzySearch(String s) {
		// TODO �Զ����ɵķ������
		System.out.println("find!");
		return null;
	}

}
