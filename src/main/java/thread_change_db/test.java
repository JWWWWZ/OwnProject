package thread_change_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/2/29 下午4:39
 * @Created by JWZ
 */
public class test {

    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://127.0.0.1:3306/school?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2b8&useSSL=false";
    private final static String user = "root";
    private final static String password = "admin";

    //  声明 Connection 对象
    private static Connection connection = null;
    //  声明 Statement 对象
    private static Statement statement = null;

    public static Connection getConnection() {
        try {
//          加载驱动
            Class.forName(driver);
//          创建连接
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();

            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

        }

        return connection;
    }

    /**
     * 关闭连接
     */
    public void closeConnection() {
        if (null == connection) {
            return;
        }

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) throws SQLException {


        Connection connection = getConnection();
        statement = connection.createStatement();

        Thread thread1 = new Thread(){

            @Override
            public void run() {
                String sql = "update user set address='成都1' where name = 'ala'";
                try {
                    statement.execute(sql);
                    System.out.println("线程1成功！");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){

            @Override
            public void run() {
                String sql = "update user set address='重庆1' where name = 'bbo'";
                try {
                    statement.execute(sql);
                    System.out.println("线程2成功！");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        };
        thread2.start();

        Thread thread3 = new Thread(){

            @Override
            public void run() {
                String sql = "update user set address='杭州1' where name = 'cul'";
                try {
                    statement.execute(sql);
                    System.out.println("线程3成功！");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        };
        thread3.start();

        Thread thread4 = new Thread(){

            @Override
            public void run() {
                String sql = "update user set address='北京1' where name = 'dele'";
                try {
                    statement.execute(sql);
                    System.out.println("线程4成功！");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        };
        thread4.start();
    }
}
