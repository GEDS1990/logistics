package businesslogicservice.statisticBLservice;


/**
 * 
 * @author 
 *
 */
public interface CostAndIncomeService {

	/**
	 * ǰ�ã� ѡ��鿴�ɱ������
	 * ���ã���ʾ�ܳɱ�
	 * ������CostDataService.getAll �������еĸ����Ϣ
	 * @return
	 */
	public double getCost();
	/**
	 * ǰ�ã�ѡ��鿴�ɱ������
	 * ���ã���ʾ������
	 * ������ReceiptListService.getAll �������е��տ
	 * @return
	 */
	public double getIncome();
	
	}
