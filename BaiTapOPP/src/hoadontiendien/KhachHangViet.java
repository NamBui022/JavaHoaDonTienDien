package hoadontiendien;

public class KhachHangViet extends KhachHang {
        private int DOI_TUONG;
        private int DINH_MUC;

        /**
         * 
         */
        public KhachHangViet() {
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
        public KhachHangViet(int mA_KH, int sO_LUONG, double dON_GIA, double tHANH_TIEN, String nGAY_LAP, String hO_TEN,
                        int dINH_MUC, int dOI_TUONG) {
                super(mA_KH, sO_LUONG, dON_GIA, tHANH_TIEN, nGAY_LAP, hO_TEN);
                this.DINH_MUC = dINH_MUC;
                this.DOI_TUONG = dOI_TUONG;
                // TODO Auto-generated constructor stub
        }

        public int getDOI_TUONG() {
                return DOI_TUONG;
        }

        public void setDOI_TUONG(int dOI_TUONG) {
                DOI_TUONG = dOI_TUONG;
        }

        public int getDINH_MUC() {
                return DINH_MUC;
        }

        public void setDINH_MUC(int dINH_MUC) {
                DINH_MUC = dINH_MUC;
        }

        @Override
        protected double tinhTien() {
                if (SO_LUONG <= DINH_MUC) {
                        THANH_TIEN = SO_LUONG * DON_GIA;
                } else {
                        THANH_TIEN = (DON_GIA * DINH_MUC) + ((SO_LUONG - DINH_MUC) * DON_GIA * 2.5);
                }
                return THANH_TIEN;
        }

        @Override
        protected String input() {
                super.nhap();
                System.out.println("Nhập Đối Tượng(1.Sinh Hoạt 2. Kinh Doanh 3.Sản Xuất): ");
                DOI_TUONG = sc.nextInt();
                System.out.println("Định Mức: ");
                DINH_MUC = sc.nextInt();
                System.out.println("=========");
                return "";
        }

        @Override
        public String toString() {
                return "Khach Hang Viet " + super.toString() + " ,Đối Tượng Loại= " + DOI_TUONG + ", Định Mức= "
                                + DINH_MUC + " ,Thành Tiền=" + tinhTien() + " ]";
        }
}
