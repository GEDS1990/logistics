package dataservice.orderdataservice;

import java.util.ArrayList;
import po.TransportListPO;


/**
 * ��ת��
 * @author 
 *
 */
public interface TransportListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<TransportListPO> getAll();
	/**
	 * ǰ�ã���������ͬID���ռ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(TransportListPO o);
    /**
   	 * ǰ�ã����޸ĵ�PO����
   	 * ���ã�����PO��Ϣ
   	 * @param old
   	 * @param newone
   	 * @return
   	 */
   	public boolean updata(TransportListPO newone);
       /**
   	 * ǰ�ã���
   	 * ���ã�ɾ������PO
   	 * @return
   	 */
   	public boolean clear();
}
