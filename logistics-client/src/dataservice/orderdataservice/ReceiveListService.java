package dataservice.orderdataservice;

import java.util.ArrayList;
import po.ReceiveListPO;


/**
 * �ռ���
 * @author 
 *
 */
public interface ReceiveListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<ReceiveListPO> getAll();
	/**
	 * ǰ�ã���������ͬID���ռ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(ReceiveListPO o);
    /**
	 * ǰ�ã����޸ĵ�PO����
	 * ���ã�����PO��Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(ReceiveListPO newone);
    /**
	 * ǰ�ã���
	 * ���ã�ɾ������PO
	 * @return
	 */
	public boolean clear();
}
