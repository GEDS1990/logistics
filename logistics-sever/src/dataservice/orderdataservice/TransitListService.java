package dataservice.orderdataservice;

import java.util.ArrayList;

import po.TransitListPO;

public interface TransitListService {
	/**
	 * ǰ�ã���
	 * ���ã���������PO
	 * @return
	 */
	public ArrayList<TransitListPO> getAll();
	/**
	 * ǰ�ã���������ͬID�ļļ���
	 * ���ã�����һ��PO
	 * @return
	 */
    public boolean add(TransitListPO o);
    /**
	 * ǰ�ã����޸ĵ�PO����
	 * ���ã�����PO��Ϣ
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean updata(TransitListPO newone);
    /**
	 * ǰ�ã���
	 * ���ã�ɾ������PO
	 * @return
	 */
	public boolean clear();
}
