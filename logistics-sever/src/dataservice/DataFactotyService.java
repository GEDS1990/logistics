package dataservice;

import java.rmi.RemoteException;

public interface DataFactotyService {

	/**
	 * ǰ�ã�  ��Ϊs �Ķ���Ӧ���ǿ͹۴��ڵ�
	 * ���ã�  ���ض�Ӧ�Ķ���
	 * @param s
	 * @return
	 * @throws RemoteException 
	 */
	public Object creatDataObject(String s) throws RemoteException;
}
