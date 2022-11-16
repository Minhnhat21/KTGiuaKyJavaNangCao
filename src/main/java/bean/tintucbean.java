package bean;

public class tintucbean {
	private String maTin;
	private String tieuDe;
	private String tomTat;
	private String ngayDuaTin;
	private String anh;
	private String noiDung;
	
	public tintucbean(String maTin, String tieuDe, String tomTat, String ngayDuaTin, String anh, String noiDung) {
		super();
		this.maTin = maTin;
		this.tieuDe = tieuDe;
		this.tomTat = tomTat;
		this.ngayDuaTin = ngayDuaTin;
		this.anh = anh;
		this.noiDung = noiDung;
	}

	public String getMaTin() {
		return maTin;
	}

	public void setMaTin(String maTin) {
		this.maTin = maTin;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getTomTat() {
		return tomTat;
	}

	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}

	public String getNgayDuaTin() {
		return ngayDuaTin;
	}

	public void setNgayDuaTin(String ngayDuaTin) {
		this.ngayDuaTin = ngayDuaTin;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
	
	
	
}
