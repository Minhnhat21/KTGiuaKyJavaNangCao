package bo;

import java.util.ArrayList;


import bean.tintucbean;
import dao.tintucdao;

public class tintucbo {
	ArrayList<tintucbean> ds;
	tintucdao tdao = new tintucdao();
	
	public ArrayList<tintucbean> getTinTuc() {
		ds = tdao.getTin();
		return ds;
	}
	
	public ArrayList<tintucbean> searchTitle(String keyword) {
		ArrayList<tintucbean> temp = new ArrayList<tintucbean>();
		for (tintucbean tinTuc : ds) {
			if (tinTuc.getTieuDe().toLowerCase().contains(keyword.toLowerCase())) {
				temp.add(tinTuc);
			}
		}
		return temp;
	}
	public ArrayList<tintucbean> searchByYear(String year) {
		ArrayList<tintucbean> temp = new ArrayList<tintucbean>();
		for (tintucbean tinTuc: ds) {
			if (tinTuc.getNgayDuaTin().toLowerCase().contains(year.trim())) {
				temp.add(tinTuc);
			}
		}
		return temp;
	}
}
