package wedding_venue_admin;

import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

public class Connect {

	/**
	 * @param args
	 */
	public Connection conn() throws Exception                  
	{
		Connection con=null;// con = Connection class reference
		try{                        
		Driver d=(Driver)(Class.forName("oracle.jdbc.OracleDriver").newInstance());//using driver class reference d
		Properties pro=new Properties();// Properties class reference pro
		pro.put("user","system");//assign variable user and its value 
		pro.put("password","admin");// password and its value
		con=d.connect("jdbc:oracle:thin:@127.0.0.1:1521:xe",pro);//establishing the connection between database & java
		}catch(Exception e){
			// TODO: handle exception
		}  
		return con;// return true if connection established
	}

}
