package businesslogicservice.statisticBLservice;

import java.util.ArrayList;

import vo.ReceiptListVO;

/**
 * �տͳ��
 * @author 
 *
 */
public interface IncomeManageService {

	/**
	 * ǰ�ã�ѡ��鿴�����տ�
	 * ���ã���ʾ�����տ
	 * @return
	 */
	public ArrayList<ReceiptListVO> showIncomeList(double startTime,double endTime);

}
