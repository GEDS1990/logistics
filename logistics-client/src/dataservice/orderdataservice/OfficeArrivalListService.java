package dataservice.orderdataservice;

import java.util.ArrayList;

import po.OfficeArrivalListPO;

public interface OfficeArrivalListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<OfficeArrivalListPO> getAll();
	/**
	 * ǰ�ã���������ͬID�ļļ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(OfficeArrivalListPO o);
    /**
	 * ǰ�ã����޸ĵ�PO����
	 * ���ã�����PO��Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(OfficeArrivalListPO newone);
    /**
	 * ǰ�ã���
	 * ���ã�ɾ������PO
	 * @return
	 */
	public boolean clear();
}
