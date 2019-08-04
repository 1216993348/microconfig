package cn.xhy;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartProvicerDetp_8001 {
	public static void main(String[] args) throws Exception{
		 SpringApplication.run(StartProvicerDetp_8001.class,args);
		/*Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mldn8001?user=rwoot&password=12d3456");

		// 2. 下面就是获取表的信息。
		DatabaseMetaData d = conn.getMetaData();
		ResultSet tableRet = d.getTables(null, "mldn8001sd2", "%", new String[] { "TABLE" });
		/*
		 * 其中"%"就是表示*的意思，也就是任意所有的意思。其中m_TableName就是要获取的数据表的名字，如果想获取所有的表的名字，
		 * 就可以使用"%"来作为参数了。
		 
		// 3. 提取表的名字。
		while (tableRet.next()) {
			System.out.println(tableRet.getString(4));
		}
			

		
		 * 通过getString("TABLE_NAME")，就可以获取表的名字了。
		 * 从这里可以看出，前面通过getTables的接口的返回，JDBC是将其所有的结果，保存在一个类似table的内存结构中，
		 * 而其中TABLE_NAME这个名字的字段就是每个表的名字。
		 

		// 4. 提取表内的字段的名字和类型
		String columnName;
		String columnType;
		ResultSet colRet = d.getColumns(null, "%", "user", "%");
		while (colRet.next()) {
			columnName = colRet.getString("COLUMN_NAME");
			columnType = colRet.getString("TYPE_NAME");
			int datasize = colRet.getInt("COLUMN_SIZE");
			int digits = colRet.getInt("DECIMAL_DIGITS");
			int nullable = colRet.getInt("NULLABLE");
			System.out.println(columnName + " " + columnType + " " + datasize + " " + digits + " " + nullable);
		}*/

	}
}
