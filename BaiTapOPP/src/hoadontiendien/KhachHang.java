package hoadontiendien;

import java.util.Scanner;

public abstract class KhachHang {
        protected int MA_KHACH_HANG, SO_LUONG;
        protected double DON_GIA, THANH_TIEN;
        protected String NGAY_LAP, HO_TEN;
        
        Scanner sc = new Scanner(System.in);
        /**
         * 
         */
        public KhachHang() {
                super();
                // TODO Auto-generated constructor stub
        }
        
        /**
         * @param mA_KH
         * @param sO_LUONG
         * @param dON_GIA
         * @param tHANH_TIEN
         * @param nGAY_LAP
         * @param hO_TEN
         */
        public KhachHang(int mA_KH, int sO_LUONG, double dON_GIA, double tHANH_TIEN, String nGAY_LAP, String hO_TEN) {
                super();
                MA_KHACH_HANG = mA_KH;
                SO_LUONG = sO_LUONG;
                DON_GIA = dON_GIA;
                THANH_TIEN = tHANH_TIEN;
                NGAY_LAP = nGAY_LAP;
                HO_TEN = hO_TEN;
        }
        public int getMA_KH() {
                return MA_KHACH_HANG;
        }
        public void setMA_KH(int mA_KH) {
                MA_KHACH_HANG = mA_KH;
        }
        public int getSO_LUONG() {
                return SO_LUONG;
        }
        public void setSO_LUONG(int sO_LUONG) {
                SO_LUONG = sO_LUONG;
        }
        public double getDON_GIA() {
                return DON_GIA;
        }
        public void setDON_GIA(double dON_GIA) {
                DON_GIA = dON_GIA;
        }
        public double getTHANH_TIEN() {
                return THANH_TIEN;
        }
        public void setTHANH_TIEN(double tHANH_TIEN) {
                THANH_TIEN = tHANH_TIEN;
        }
        public String getNGAYLAP() {
                return NGAY_LAP;
        }
        public void setNGAYLAP(String nGAYLAP) {
                NGAY_LAP = nGAYLAP;
        }
        public String getHO_TEN() {
                return HO_TEN;
        }
        public void setHO_TEN(String hO_TEN) {
                HO_TEN = hO_TEN;
        }
        @Override
        public String toString() {
                return " [ Mã Khách Hàng= " + MA_KHACH_HANG + ", Số Lượng= " + SO_LUONG + ", Đơn Giá= " + DON_GIA + ", Ngày Lập= " + NGAY_LAP + ", Họ Tên= " + HO_TEN;
        }
        protected void nhap() {
                System.out.println("Nhập Mã Khách Hàng: ");
                MA_KHACH_HANG = sc.nextInt();
                System.out.println("Nhập Họ Tên Khách Hàng: ");
                HO_TEN =sc.next();
                System.out.println("Ngày Lập Hóa Đơn: ");
                NGAY_LAP = sc.next();
                System.out.println("Nhập Số Lượng: ");
                SO_LUONG = sc.nextInt();
                System.out.println("Đơn Giá: ");
                DON_GIA = sc.nextDouble();
                
        }
        protected abstract String input();
        protected abstract double tinhTien();
        
}
