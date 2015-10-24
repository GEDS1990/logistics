package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.GoDownEntryVO;
import vo.OutBoundListVO;
import vo.WarehouseVO;
/**
 * �ֿ�����Ϣ����
 */
public interface WarehouseManageService {

	/**
	 * ǰ�ã� ����̵�
	 * ���ã���ʾ���ж��������Ϣ
	 * @return
	 */
	public ArrayList<WarehouseVO> getAll();
	/**
	 * ǰ�ã�����
	 * ���ã����¿����Ϣ
	 * @param w
	 * @return
	 */
	public WarehouseVO outBound(OutBoundListVO w);
	/**
	 * ǰ�ã����
	 * ���ã����¿��
	 * @param w
	 * @return
	 */
	public WarehouseVO goDown(GoDownEntryVO w);
	/**
	 * ǰ�ã����þ������
	 * ���ã�����
	 * @param a
	 */
	public void setBorderline(double a); 
}
