package hoadontiendien;

public class KhachHangNuocNgoai extends KhachHang {
        private String QUOC_TICH;

        /**
         * 
         */
        public KhachHangNuocNgoai() {
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
         * @param qUOC_TICH
         */
        public KhachHangNuocNgoai(int mA_KH, int sO_LUONG, double dON_GIA, double tHANH_TIEN, String nGAY_LAP,
                        String hO_TEN, String qUOC_TICH) {
                super(mA_KH, sO_LUONG, dON_GIA, tHANH_TIEN, nGAY_LAP, hO_TEN);
                this.QUOC_TICH = qUOC_TICH;
                // TODO Auto-generated constructor stub
        }

        public String getQUOC_TICH() {
                return QUOC_TICH;
        }

        public void setQUOC_TICH(String qUOC_TICH) {
                QUOC_TICH = qUOC_TICH;
        }

        @Override
        protected String input() {
                super.nhap();
                System.out.println("Nhập Quốc Tịch: ");
                QUOC_TICH = sc.next();
                System.out.println("=============");
                return "";
        }

        

        @Override
        protected double tinhTien() {

                return this.THANH_TIEN = this.SO_LUONG * this.DON_GIA;
        }
        @Override
        public String toString() {
                return "Khach Hang Nuoc Ngoai " + super.toString() + ", QUOC_TICH=" + QUOC_TICH + " Thành Tiền="
                                + tinhTien() + " ]";
        }

}
