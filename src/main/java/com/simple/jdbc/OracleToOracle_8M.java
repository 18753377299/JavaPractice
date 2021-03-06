package com.simple.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OracleToOracle_8M {
	public static void main(String [] args){
		Connection connect = null;
//        Statement statement = null;
        PreparedStatement preState = null;
        ResultSet resultSet = null;
		try {
   
//           Class.forName("oracle.jdbc.OracleDriver");
			 Class.forName("oracle.jdbc.driver.OracleDriver");
           

        
//           Driver driver = new OracleDriver();
//           DriverManager.deregisterDriver(driver);
           
           connect = DriverManager.getConnection("jdbc:oracle:thin:@10.133.174.52:1521:fxdb", "spider", "spider");           

          
           System.out.println(connect);  


           
//           statement = connect.createStatement();

          
           String sql = "select * from fxuser.TF_8M where TFBH  in ('201310','201822')";
//           PreparedStatement preState = connect.prepareStatement("select  * from tb1_dept where id = ?");
           preState = connect.prepareStatement(sql);


           
//           resultSet = statement.executeQuery("select  * from RISKINFO_CLAIM where SERIALNO ='26'");
//           resultSet = statement.executeQuery("select * from SMDTV_45 where SMID=3");
           	
           resultSet = preState.executeQuery();        

          
           while (resultSet.next()){
//        	   byte[] SMGEOMETRY = null;
               Integer  SMID = resultSet.getInt("SMID");
               Integer SMKEY = resultSet.getInt("SMKEY");
               BigDecimal SMSDRIW = new BigDecimal(resultSet.getString("SMSDRIW"));
               BigDecimal SMSDRIN = new BigDecimal(resultSet.getString("SMSDRIN"));
               BigDecimal SMSDRIE = new BigDecimal(resultSet.getString("SMSDRIE"));
               BigDecimal SMSDRIS = new BigDecimal(resultSet.getString("SMSDRIS"));
               BigDecimal SMGRANULE = new BigDecimal(resultSet.getString("SMGRANULE"));
               byte[] SMGEOMETRY =resultSet.getBytes("SMGEOMETRY");
               Integer  SMUSERID = resultSet.getInt("SMUSERID");
               Integer  SMLIBTILEID = resultSet.getInt("SMLIBTILEID");
               BigDecimal SMAREA = new BigDecimal(resultSet.getString("SMAREA"));
               BigDecimal SMPERIMETER = new BigDecimal(resultSet.getString("SMPERIMETER"));
               String  TFBH = resultSet.getString("TFBH");
               BigDecimal VALUE =  BigDecimal.ZERO;
               if(resultSet.getString("VALUE")==null||resultSet.getString("VALUE").length()==0){
               }else{
            	   VALUE = new BigDecimal(resultSet.getString("VALUE"));
               }
               BigDecimal DMAXZVALUE = new BigDecimal(resultSet.getString("DMAXZVALUE"));
               BigDecimal DMINZVALUE = new BigDecimal(resultSet.getString("DMINZVALUE"));
               
               System.out.println(SMID+"   "+SMKEY+"   "+SMSDRIW);  
               OracleToOracle_8M.insertData(SMID,SMKEY,SMSDRIW,SMSDRIN,SMSDRIE,SMSDRIS,SMGRANULE,SMGEOMETRY,
            		   SMUSERID,SMLIBTILEID,SMAREA,SMPERIMETER,TFBH,VALUE,DMAXZVALUE,DMINZVALUE);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }finally {
          
               try {
                   if (resultSet!=null) resultSet.close();
                   
//                   if (statement!=null) statement.close();
//                  
                   if (preState!=null) preState.close();
                   if (connect!=null) connect.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
       }
	}
//	public static void insertData (Integer SMID,Integer SMKEY,BigDecimal SMSDRIW ,byte[] SMGEOMETRY){
	public static void 	insertData(Integer SMID,Integer SMKEY,BigDecimal SMSDRIW,BigDecimal SMSDRIN,BigDecimal SMSDRIE,
			BigDecimal SMSDRIS,BigDecimal SMGRANULE,byte[] SMGEOMETRY,Integer  SMUSERID,Integer  SMLIBTILEID,
			BigDecimal SMAREA,BigDecimal SMPERIMETER,String TFBH,BigDecimal VALUE,BigDecimal DMAXZVALUE,BigDecimal DMINZVALUE){	
		Connection connect = null;
//      Statement statement = null;
		PreparedStatement preState = null;
		ResultSet resultSet = null;
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			connect = DriverManager.getConnection("jdbc:oracle:thin:@10.133.198.50:1521/fcfk ", "fcfkdb", "fcfkdb_1009");

			
			String sql = "insert into TF_8M(SMID,SMKEY,SMSDRIW,SMSDRIN,SMSDRIE,SMSDRIS,SMGRANULE,SMGEOMETRY,SMUSERID,SMLIBTILEID,SMAREA,SMPERIMETER,TFBH,VALUE,DMAXZVALUE,DMINZVALUE)"
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//           PreparedStatement preState = connect.prepareStatement("select  * from tb1_dept where id = ?");
           preState = connect.prepareStatement(sql);
          
           preState.setInt(1, SMID);
           preState.setInt(2, SMKEY);
           preState.setBigDecimal(3, SMSDRIW);
           preState.setBigDecimal(4, SMSDRIN);
           preState.setBigDecimal(5, SMSDRIE);
           preState.setBigDecimal(6, SMSDRIS);
           preState.setBigDecimal(7, SMGRANULE);
           preState.setBytes(8, SMGEOMETRY);
           preState.setInt(9, SMUSERID);
           preState.setInt(10, SMLIBTILEID);
           preState.setBigDecimal(11, SMAREA);
           preState.setBigDecimal(12, SMPERIMETER);
           preState.setString(13, TFBH);
           preState.setBigDecimal(14, VALUE);
           preState.setBigDecimal(15, DMAXZVALUE);
           preState.setBigDecimal(16, DMINZVALUE);
           
           preState.executeUpdate();
		   System.out.println("========success=8M===========");
		}catch (Exception e) {
	           e.printStackTrace();
        }finally {
          
               try {
                   if (resultSet!=null) resultSet.close();
                   
//	                   if (statement!=null) statement.close();
//	                  
                   if (preState!=null) preState.close();
                   if (connect!=null) connect.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
       }

	}
	
}
