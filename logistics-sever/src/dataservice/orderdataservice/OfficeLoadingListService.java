package dataservice.orderdataservice;

import java.util.ArrayList;

import po.OfficeLoadingListPO;

public interface OfficeLoadingListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<OfficeLoadingListPO> getAll();
	/**
	 * ǰ�ã���������ͬID�ļļ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(OfficeLoadingListPO o);
    /**
	 * ǰ�ã����޸ĵ�PO����
	 * ���ã�����PO��Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(OfficeLoadingListPO newone);
    /**
	 * ǰ�ã���
	 * ���ã�ɾ������PO
	 * @return
	 */
	public boolean clear();
}
