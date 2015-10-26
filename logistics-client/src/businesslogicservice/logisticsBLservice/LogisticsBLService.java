package businesslogicservice.logisticsBLservice;

import java.util.ArrayList;

import vo.LogisticsVO;

public interface LogisticsBLService {

	/**
	 * ǰ�ã������������Ų�ѯ������Ϣ�Ҹõ��Ŵ���
	 * ���ã���ʾ������Ϣ
	 * ������LogisticsDataService.getAll ��������PO
	 * @param id
	 * @return
	 */
	public LogisticsVO showState(String id);
	/**
	 * ǰ�ã������������Ų��޸�������Ϣ
	 * ���ã�����
	 * ������LogisticsDataService.update �޸�һ��PO
	 * @param id
	 * @param state
	 * @return
	 */
	public boolean setState(String id,String state);
	/**
	 * ǰ�ã������������Ų��޸�������Ϣ
	 * ���ã�����
	 * ������LogisticsDataService.update �޸�һ��PO
	 * @param 
	 * @return
	 */
	public boolean setState(LogisticsVO o);
	/**
	 * ǰ�ã������������Ų��޸�������Ϣ
	 * ���ã�����
	 * ������LogisticsDataService.update �޸�PO
	 * @param 
	 * @return
	 */
	public boolean setState(ArrayList<LogisticsVO> al);
	/**
	 * ǰ�ã��ڳ����˽��г�ʼ��
	 * ���ã����¡�������������ɾ����
	 * ������LogisticsDataService.clear
	 * @return
	 */
	public boolean clear();
}
