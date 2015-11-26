package org.module.client.businesslogic.orderbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.module.client.businesslogicservice.order.TransportService;
import org.module.client.javaRMI.RmiClient;
import org.module.client.vo.TransportListVO;
import org.module.common.dataservice.orderdataservice.TransportListService;
import org.module.common.po.State;
import org.module.common.po.TransportListPO;

public class Transport implements TransportService {
	private TransportListService transportData ;
	public Transport() {
		transportData = new RmiClient().get(TransportListService.class);
	}

	public boolean creat(TransportListVO o) {
		TransportListPO newPO = new TransportListPO(o.getCar(),o.getLoadingDate(),
				o.getTransId(),o.getCarId(),o.getOrigin(),o.getArrival(),o.getCounterId()
				,o.getSupervision(),o.getShippingId(),o.getPrice(),o.getState().toString()); 
		try {
			return transportData.add(newPO);
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return false;
		}
	}

	public ArrayList<TransportListVO> getAll(State s) {
		// TODO Auto-generated method stub
		ArrayList<TransportListVO> newVOs = new ArrayList<TransportListVO>();
		ArrayList<TransportListPO> POs = null;
		try {
			 POs = transportData.getByState(s);
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		for(int i =0;i<POs.size();i++){
			newVOs.add(new TransportListVO(POs.get(i).getCar(),POs.get(i).getLoadingDate(),
					POs.get(i).getTransListId(),POs.get(i).getCarId(),POs.get(i).getOrigin(),
					POs.get(i).getArrival(),POs.get(i).getCounterId()
					,POs.get(i).getSupervision(),POs.get(i).getShippingId(),POs.get(i).getPrice(),POs.get(i).getState().toString()));
		}
		return newVOs;
	}

}
