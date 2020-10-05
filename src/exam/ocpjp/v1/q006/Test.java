package exam.ocpjp.v1.q006;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	private static final String url="";
	private static final String user="";
	private static final String password="";
    public static void main(String[] args) {
        /*  Employee table資料
            eid    ename
            111    Tom
            112    Jerry
            113    Donald
         */
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            //ResultSet.TYPE_SCROLL_INSENSITIVE 會保留原先結果
            //ResultSet.CONCUR_UPDATABLE 會對資料庫進行修改的操作
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            st.execute("SELECT * FROM Employee");
            ResultSet rs = st.getResultSet();
            while(rs.next()) {
                if(rs.getInt(1)==112) {
                    rs.updateString(2, "Jack");
                }
            }
            rs.absolute(2);
            //因為ResultSet.TYPE_SCROLL_INSENSITIVE 會保留原先結果, 所以結果不變
            System.out.println(rs.getInt(1)+""+rs.getString(2));
        } catch (SQLException ex) {
           System.out.println("Exception is raised");
        }
    }

}
