package businesslogicservice.statisticBLservice;


import java.util.ArrayList;

import vo.CostListVO;

/**
 * ��������ɱ�����
 * @author 
 *
 */
public interface CostManageService {

	/**
	 * ǰ�ã��½������������Ϣ
	 * ���ã����渶�
	 * @param c
	 * @return
	 */
	public boolean creatCostList(CostListVO c);
	/**
	 * ǰ�ã�ѡ��鿴���гɱ�֧��
	 * ���ã���ʾ���и��
	 * @return
	 */
	public ArrayList<CostListVO> showCostList(double startTime,double endTime);
	/**
	 *ǰ�ã�ѡ��������˻����г�ʼ��
	 *���ã���ն���
	 * @return
	 */
	public boolean clear();
}
