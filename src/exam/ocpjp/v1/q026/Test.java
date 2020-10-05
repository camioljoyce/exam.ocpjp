package exam.ocpjp.v1.q026;

public class Test {

	public static void main(String[] args) {
//		Which action can be used to load a database driver by using JDBC3.0?
//				A. Add the driver class to the META-INF/services folder of the JAR file.
//				B. Include the JDBC driver class in a jdbc.properties file.
//				C. Use the java.lang.Class.forName method to load the driver class.
//				D. Use the DriverManager.getDriver method to load the driver class.
		System.out.println("C");
//		**JDBC4.0之前，載入Driver的方式就是使用Class類別的forName方法，
//		在參數指定Driver的名稱(類別路徑)，程式會自動呼叫DriverManager類別的registerDriver方法來載入(註冊)Driver。**
//
//		選項A，這是JDBC4.0的機制，要將Driver的名稱寫進「META-INF/services/java.sql.Driver」檔案內，即可自動加載。
//		選項B，沒有這樣的用法。
//		選項C，正確載入Driver的方式。
//		選項D，DriverManager類別的getDriver方法只是用來取得已經載入的Driver物件。

	}

}
