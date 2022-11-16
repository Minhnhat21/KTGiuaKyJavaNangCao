package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.tintucbean;



public class tintucdao {
public ArrayList<tintucbean> getTin() {
		
		try { // Tao 1 mang luu all loai 
			 ArrayList<tintucbean> ds = new ArrayList<tintucbean>(); 
			 // b1: ket noi vao csdl 
			 KetNoiDB kn = new KetNoiDB();
			 kn.ketnoi(); 
			 // b2: lay du lieu ve 
			 String sql = "select * from News";
			 PreparedStatement cmd = kn.cn.prepareStatement(sql); 
			 ResultSet rs = cmd.executeQuery(); 
			 // b3: dua du lieu vao mang ds 
			 while (rs.next()) { 
				 String matin = rs.getString("MaTin");
				 String tieude = rs.getString("TieuDe");
				 String tomtat = rs.getString("TomTat");
				 String ngayduatin = rs.getString("NgayDuaTin");
				 String anh = rs.getString("anh");
				 String noidung = rs.getString("NoiDung");
				 ds.add(new tintucbean(matin, tieude, tomtat, ngayduatin, anh, noidung)); 
			 } 
			 // b4: dong ket noi rs.close();
			 kn.cn.close(); 
			 return ds; 
		} 
		catch (Exception e) { e.printStackTrace(); 
			return null; 
		 }
	}


//	public ArrayList<tintucbean> getTinByYear(String year) {
//		
//		try { // Tao 1 mang luu all loai 
//			 ArrayList<tintucbean> ds = new ArrayList<tintucbean>(); 
//			 // b1: ket noi vao csdl 
//			 KetNoiDB kn = new KetNoiDB();
//			 kn.ketnoi(); 
//			 // b2: lay du lieu ve 
//			 String sql = "select * from News as n\r\n"
//			 		+ "where YEAR(n.NgayDuaTin) = ?";
//			 PreparedStatement cmd = kn.cn.prepareStatement(sql); 
//			 cmd.setString(1, year);
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
//			 return ds; 
//		} 
//		catch (Exception e) { e.printStackTrace(); 
//			return null; 
//		 }
//	}
}
