package businesslogicservice.logisticsBLservice;

import java.util.ArrayList;

import vo.LogisticsVO;

public interface LogisticsBLService {

	/**
	 * ǰ�ã������������Ų�ѯ������Ϣ�Ҹõ��Ŵ���
	 * ���ã���ʾ������Ϣ
	 * @param id
	 * @return
	 */
	public LogisticsVO showState(String id);
	/**
	 * ǰ�ã������������Ų��޸�������Ϣ
	 * ���ã�����
	 * @param id
	 * @param state
	 * @return
	 */
	public boolean setState(String id,String state);
	public boolean setState(LogisticsVO o);
	public boolean setState(ArrayList<LogisticsVO> al);
	/**
	 * ǰ�ã��ڳ����˽��г�ʼ��
	 * ���ã����¡�������������ɾ����
	 * @return
	 */
	public boolean clear();
}
