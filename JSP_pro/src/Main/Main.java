package Main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {

		String url =  "jdbc:oracle:thin:@ezenac1_high?TNS_ADMIN=C://Users/JSW/Desktop/Wallet_Ezenac1";
		String userid = "admin";
		String pwd = "Ez1234567890";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("�����ͺ��̽� ���� �غ�");
			Connection con = DriverManager.getConnection(url, userid, pwd);
			if(con != null) {
				System.out.println("�����ͺ��̽� ���� ����");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// d
	}

}
