package org.module.client.businesslogic.orderbl;

import java.util.ArrayList;

import org.module.client.businesslogicservice.order.TransportService;
import org.module.client.businesslogicservice.orderBLservice.TransportBLService;
import org.module.client.vo.TransportListVO;
import org.module.common.po.State;

public class TransportController implements TransportBLService {

	private TransportService transport;
//	private LogisticsService logistics;
	
	public TransportController() {

		this.transport = new Transport();
//		this.logistics = new Logistics();
	}

	public TransportController(TransportService transport ) {
		super();
		this.transport = transport;
//		this.logistics = logistics;
	}

	public boolean creat(String car, String loadingDate, String transId,
			String carId, String origin, String arrival, String counterId,
			String supervision, String[] shippingId, String price,String state) {
		// TODO Auto-generated method stub
		return this.transport.creat(new TransportListVO( car,  loadingDate,  transId,
			 carId,  origin,  arrival,  counterId,
			 supervision,  shippingId,  price,state));
	}

	public ArrayList<TransportListVO> getAll(State s) {
		// TODO Auto-generated method stub
		return this.transport.getAll(s);
	}

}
