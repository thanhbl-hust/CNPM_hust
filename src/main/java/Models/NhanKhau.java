package Models;

import java.time.LocalDate;

public class NhanKhau {
   private int id;
   private String hoten;
   private String cccd;
   private String noisinh;
   private String nguyenquan;
   private String dantoc;
   private String nghenghiep;
   private LocalDate ngaysinh;
   private String gioiTinh;
   private int idtronghokhau;




   public NhanKhau(int id, String hoten, String cccd, String noisinh, String nguyenquan, String dantoc,
         String nghenghiep, LocalDate ngaysinh, String gioiTinh, int idtronghokhau) {
      this.id = id;
      this.hoten = hoten;
      this.cccd = cccd;
      this.noisinh = noisinh;
      this.nguyenquan = nguyenquan;
      this.dantoc = dantoc;
      this.nghenghiep = nghenghiep;
      this.ngaysinh = ngaysinh;
      this.gioiTinh = gioiTinh;
      this.idtronghokhau = idtronghokhau;
   }
   public String getNoisinh() {
      return noisinh;
   }
   public void setNoisinh(String noisinh) {
      this.noisinh = noisinh;
   }
   public String getNguyenquan() {
      return nguyenquan;
   }
   public void setNguyenquan(String nguyenquan) {
      this.nguyenquan = nguyenquan;
   }
   public String getDantoc() {
      return dantoc;
   }
   public void setDantoc(String dantoc) {
      this.dantoc = dantoc;
   }
   public String getNghenghiep() {
      return nghenghiep;
   }
   public void setNghenghiep(String nghenghiep) {
      this.nghenghiep = nghenghiep;
   }
<<<<<<< HEAD
   public LocalDate getNgaysinh() {
      return ngaysinh;
   }
   public void setNgaysinh(LocalDate ngaysinh) {
      this.ngaysinh = ngaysinh;
   }
   public String getCccd() {
      return cccd;
   }
   public void setCccd(String cccd) {
      this.cccd = cccd;
   }
  
   public String getHoten() {
      return hoten;
   }
   public void setHoten(String hoten) {
      this.hoten = hoten;
   }


   public String getGioiTinh() {
      return gioiTinh;
   }


   public void setGioiTinh(String gioiTinh) {
      this.gioiTinh = gioiTinh;
   }


   public int getId() {
      return id;
   }


   public void setId(int id) {
      this.id = id;
   }
   public int getIdtronghokhau() {
      return idtronghokhau;
   }
   public void setIdtronghokhau(int idtronghokhau) {
      this.idtronghokhau = idtronghokhau;
   }
=======
   public Date getNgaysinh() {
      return ngaysinh;
   }
   public void setNgaysinh(Date ngaysinh) {
      this.ngaysinh = ngaysinh;
   }
   public CCCD getCccd() {
      return cccd;
   }
   public void setCccd(CCCD cccd) {
      this.cccd = cccd;
   }
   public int getIdtronghokhau() {
      return idtronghokhau;
   }   
   public void setIdtronghokhau(int idtronghokhau) {
      this.idtronghokhau = idtronghokhau;
   }
   public int getIdhokhau() {
      return idhokhau;
   }
   public void setIdhokhau(int idhokhau) {
      this.idhokhau = idhokhau;
   }
   public Boolean getTamtru() {
      return tamtru;
   }
   public void setTamtru(Boolean tamtru) {
      this.tamtru = tamtru;
   }
   public Boolean getTamvang() {
      return tamvang;
   }
   public void setTamvang(Boolean tamvang) {
      this.tamvang = tamvang;
   }
>>>>>>> 3cd8550bf0f4af35b86d7471c66146233cc5665b
   
}
 