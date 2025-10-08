package jdbcprograms.service;

import java.sql.*;
import javax.sql.*;
import jdbcprograms.dao.DbUtil;
public class CRUD {
	static Connection con;
	static PreparedStatement pst;
	
	static {
		con=DbUtil.getConnection();
		if(con!=null)
		{
			System.out.println("connection is success");
		}
	}
	
	//created the table now we have to add the values to table
	public static int addStudent(int sid,String sname)
	{
		int n=0;
		try {
			pst = con.prepareStatement("INSERT INTO student VALUES(?,?)");
			pst.setInt(1, sid);
			pst.setString(2, sname);
			pst.executeUpdate();
		}catch(Exception e)
		{
			
		}
		return n;
	}
	 // Update
    public static int updateStudent(int sid, String sname) {
        int n = 0;
        PreparedStatement pst = null;
        try {
            pst = con.prepareStatement("UPDATE student SET sname = ? WHERE sid = ?");
            pst.setString(1, sname);
            pst.setInt(2, sid);
            n = pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error updating student: " + e.getMessage());
        } 
        return n;
    }
   
	
	
}
