package dataservice.managementdataservice;

import java.util.ArrayList;

import po.PriceAndCityPO;
import po.PricePO;

public interface PriceAndCityDataService {

	/**
	 * ǰ�ã���
	 * ���ã��������гǼʾ���
	 * @return
	 */
	public ArrayList<PriceAndCityPO> getAll();
	/**
	 * ǰ�ã���
	 * ���ã��������г���
	 * @return
	 */
	public ArrayList<String>  getCity();
	/**
	 * ǰ�ã���PO�����������ݿ���
	 * ���ã����һ��PO
	 * @param p
	 * @return
	 */
	public boolean addCity(String city);
	/**
	 * ǰ�ã���PO�����������ݿ���
	 * ���ã����һ��PO
	 * @param p
	 * @return
	 */
	public boolean addPriceAndCity(PriceAndCityPO p);
	/**
	 * ǰ�ã���PO���������ݿ���
	 * ���ã��޸�һ��PO
	 * @param p
	 * @return
	 */
	public boolean update(PriceAndCityPO p);
	/**
	 * ǰ�ã���PO���������ݿ���
	 * ���ã��޸�һ��PO
	 * @param p
	 * @return
	 */
	public boolean setPrice(PricePO p);
}
