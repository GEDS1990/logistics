package dataservice.orderdataservice;

import java.util.ArrayList;

import po.TranCenterArrivalListPO;

public interface TranCenterArrivalListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<TranCenterArrivalListPO> getAll();
	/**
	 * ǰ�ã���������ͬID�ļļ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(TranCenterArrivalListPO o);
    /**
	 * ǰ�ã����޸ĵ�PO����
	 * ���ã�����PO��Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(TranCenterArrivalListPO newone);
    /**
	 * ǰ�ã���
	 * ���ã�ɾ������PO
	 * @return
	 */
	public boolean clear();
}
