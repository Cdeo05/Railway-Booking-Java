
package com.model;

import com.mysql.jdbc.Connection;
import com.travel.Login;
import com.travel.Mainscreen;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class dbaseAccount {
    
String dburl = "jdbc:mysql://localhost:3306/project";
String dbname = "root";
String dbpwd="";
String dbdriver="com.mysql.jdbc.Driver";
Connection dbcon;

void dbConnect() throws SQLException
{
    dbcon=(Connection) DriverManager.getConnection(dburl,dbname,dbpwd);
}

void dbClose() throws SQLException
{
    dbcon.close();
}
    
public ResultSet getSourceCity() throws SQLException
{
    dbConnect();
    String sql="select distinct source from train";
    PreparedStatement pstm=dbcon.prepareStatement(sql);
    ResultSet rs=pstm.executeQuery();
    return(rs);

}
public ResultSet getDestinationCity() throws SQLException
{
    dbConnect();
    String sql="select distinct destination from train";
    PreparedStatement pstm=dbcon.prepareStatement(sql);
    ResultSet rs=pstm.executeQuery();
    return(rs);

}
public ResultSet getclass() throws SQLException
{
    dbConnect();
    String sql="select distinct class from train";
    PreparedStatement pstm=dbcon.prepareStatement(sql);
    ResultSet rs=pstm.executeQuery();
    return(rs);

}
public void register(String username,String password) throws SQLException
{
    dbConnect();
    String query="INSERT INTO `login`(`username`, `password`) VALUES ('"+username+"','"+password+"');";
    PreparedStatement pstm=dbcon.prepareStatement(query);
    pstm.executeUpdate();
    JOptionPane.showMessageDialog(null, "REGISTERED SUCCESSFULLY");
  
    
}
public boolean login(String username,String password) throws SQLException
{
    dbConnect();
    String query="SELECT `username`, `password` FROM `login` WHERE username=? and password=?";
    PreparedStatement pstm=dbcon.prepareStatement(query);
    pstm.setString(1,username);
    pstm.setString(2, password);
    ResultSet rs=pstm.executeQuery();
    if(rs.next())
    {
        
        Mainscreen m=new Mainscreen();
        m.lblwel(username);
        return(true);
    
}
    else
    {
            JOptionPane.showMessageDialog(null,"INVALID CREDENTIALS");
            return(false);

    }
}

public ResultSet getoneway(String source,String destination,String acclass) throws SQLException
{
    dbConnect();
    String sql = "select * from train where source = " + "'" + source + "'" + " and destination =" + "'" + destination + "' and class = " + "'" + acclass+ "'" + "" ;
    PreparedStatement pstmt = dbcon.prepareStatement(sql); 
    ResultSet rs = pstmt.executeQuery(); 
    return (rs);
}
public ResultSet getreturn(String source,String destination,String acclass) throws SQLException
{
    dbConnect();
    String sql = "select * from train where source = " + "'" + destination + "'" + " and destination =" + "'" + source + "' and class = " + "'" + acclass+ "'" + "" ;
    PreparedStatement pstmt = dbcon.prepareStatement(sql); 
    ResultSet rs = pstmt.executeQuery(); 
    return (rs);
}
public ResultSet finaldepart(String id,String ac) throws ClassNotFoundException, SQLException
{
dbConnect();
String sql = "select source,destination,trainname,dept,fare,class,arrival from train where trainno = '" + id + "'and class='" + ac + "'" ;
PreparedStatement pstmt = dbcon.prepareStatement(sql); 
ResultSet rst = pstmt.executeQuery();
return (rst);
}
public ResultSet finaldepartret(String id,String ac) throws ClassNotFoundException, SQLException
{
dbConnect();
String sql = "select source,destination,trainname,dept,fare,arrival from train where trainno = '" + id + "'and class='" + ac + "'" ;
PreparedStatement pstmt = dbcon.prepareStatement(sql); 
ResultSet rst = pstmt.executeQuery();
return (rst);
}
public void insertdata(String source, String destination, String trainno, String trainname, String fare,String name, String contact,String user,String ac,String date,String dept,String arr) throws ClassNotFoundException, SQLException
{
dbConnect();
String sql = "INSERT INTO `history`(`USER`,`NAME`, `CONTACT`, `SOURCE`, `DEST.`, `TRAIN NO.`, `TRAIN NAME`, `CLASS`, `DATE`, `DEPT.`, `ARR.`, `FARE`) VALUES ('"+user+"','"+name+"','"+contact+"','"+source+"','"+destination+"','"+trainno+"','"+trainname+"','"+ac+"','"+date+"','"+dept+"','"+arr+"','"+fare+"')";
PreparedStatement pstmt = dbcon.prepareStatement(sql); 
pstmt.executeUpdate();

}

public ResultSet history(String username) throws SQLException
{
    dbConnect();
    String sql="SELECT * FROM `history` WHERE USER=" + "'" + username + "'" + "";
    PreparedStatement pstmt = dbcon.prepareStatement(sql); 
    ResultSet rst = pstmt.executeQuery();
    return (rst);
}
}