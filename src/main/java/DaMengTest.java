import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/07/02 0002
 * @author jiangwenzhu
 * @version 1.0
 */

public class DaMengTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("dm.jdbc.driver.DmDriver");
		String url = "jdbc:dm://192.168.200.128";   // 主库 IP = 223.254.254.19
		String userID = "HYCLOUD";
		String passwd = "admin1234";
		Connection con = DriverManager.getConnection(url, userID, passwd);
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from WCMADDRESS");
		System.out.println("hello");
	}
}
