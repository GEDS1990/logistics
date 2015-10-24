package businesslogicservice.orderBLservice;

import java.util.ArrayList;

import vo.MailingListVO;
/**
 * �ļ�
 * @author ��˶
 */
public interface MailingBLService {

	/**
	 * ǰ�ã���������
	 * ���ã���ʾ�۸�
	 * @param m
	 * @return
	 */
	public double calculatePrice(MailingListVO m);

	/**
	 * ǰ�ã���������
	 * ���ã���ʾ����ʱ��
	 * @param m
	 * @return
	 */
	public double calculateTime(MailingListVO m);
	/**
	 * ǰ�ã��½��ļ���
	 * ���ã�������Ϣ
	 * @param o
	 * @return
	 */
	public boolean creat(MailingListVO o);
	/**
	 * ǰ�ã�ѡ��鿴���ж���
	 * ���ã���ʾ���ж���
	 * @return
	 */
	public ArrayList<MailingListVO> getAll();
	
}
