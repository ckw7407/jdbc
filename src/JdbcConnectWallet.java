import java.sql.*;

public class JdbcConnectWallet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String url = "jdbc:oracle:thin:@jev1fl2da41r2qvn_high?TNS_ADMIN=D://ckw//oracle//oracleWalletSetting//Wallet_JEV1FL2DA41R2QVN//";
			String user = "admin";
			String password = "Ckw7407Jjung6284!";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection(url,user,password);
			System.out.println("연결 성공");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


