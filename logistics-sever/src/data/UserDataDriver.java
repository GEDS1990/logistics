package data.userdata;

import java.util.ArrayList;

import data.userdata.UserDataImpl;
import po.UserPO;

public class UserDataDriver {

	public static void main(String[] args) {
		UserDataImpl u = new UserDataImpl();
		ArrayList<UserPO> al = u.allUsers();
		for (UserPO userPO : al) {
			System.out.println(userPO.toString());
		}
		
		u.add( new UserPO( "140020001", "����", "123456", "Ӫҵ��ҵ��Ա" ) );
		
	}

}
