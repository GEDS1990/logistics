package businesslogicservice.managementBLservice;

import java.util.ArrayList;

import vo.GoDownEntryListVO;
import vo.OutBoundListVO;
import vo.WarehouseVO;
/**
 * �ֿ�����Ϣ����
 */
public interface WarehouseManageService {

	/**
	 * ǰ�ã� ����̵�
	 * ���ã���ʾ���ж��������Ϣ
	 * ������WarahouseDataService.getAll �õ�����PO
	 * @return
	 */
	public ArrayList<WarehouseVO> getAll();
	/**
	 * ǰ�ã�����
	 * ���ã����¿����Ϣ
	 * ������WarahouseDataService.delete ɾ��һ��PO OutBoundListService.creatTiket �½����ⵥ
	 * @param w
	 * @return
	 */
	public WarehouseVO outBound(OutBoundListVO w);
	/**
	 * ǰ�ã����
	 * ���ã����¿��
	 * ������WarahouseDataService.add����һ��PO  GoDownEntryListService.createTicket �½���ⵥ
	 * @param w
	 * @return
	 */
	public WarehouseVO goDown(GoDownEntryListVO w);
	/**
	 * ǰ�ã����þ������
	 * ���ã�����
	 * ������WarahouseDataService.setBorderLint �洢�������
	 * @param a
	 */
	public void setBorderline(double a); 
}
