package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.tintucbean;

public class KetNoiDB {
	public Connection cn;
	public void ketnoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.print("Step 1 : done" + "\n");
			String s2 =  "jdbc:sqlserver://DESKTOP-9E767PR:1433;instance=SQLEXPRESS;databaseName=NguyenHuuMinhNhat;user=sa;password=12345qwert";
			System.out.println("Hello World");
			cn = DriverManager.getConnection(s2);
			System.out.print("Step 2: done" + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		try { // Tao 1 mang luu all loai 
//			 ArrayList<tintucbean> ds = new ArrayList<tintucbean>(); 
//			 // b1: ket noi vao csdl 
//			 KetNoiDB kn = new KetNoiDB();
//			 kn.ketnoi(); 
//			 // b2: lay du lieu ve 
//			 String sql = "select * from News";
//			 PreparedStatement cmd = kn.cn.prepareStatement(sql); 
//			 ResultSet rs = cmd.executeQuery(); 
//			 // b3: dua du lieu vao mang ds 
//			 while (rs.next()) { 
//				 String matin = rs.getString("MaTin");
//				 String tieude = rs.getString("TieuDe");
//				 String tomtat = rs.getString("TomTat");
//				 String ngayduatin = rs.getString("NgayDuaTin");
//				 String anh = rs.getString("anh");
//				 String noidung = rs.getString("NoiDung");
//				 ds.add(new tintucbean(matin, tieude, tomtat, ngayduatin, anh, noidung)); 
//			 } 
//			 // b4: dong ket noi rs.close();
//			 kn.cn.close(); 
//			 
//		} 
//		catch (Exception e) { e.printStackTrace(); 
//			System.out.println(e);
//		 }
//	}
}
