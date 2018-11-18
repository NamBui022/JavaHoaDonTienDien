package hoadontiendien;

public class XuLy {
        int n;
        String DSKhachNN[];
        String DSKhachViet[];
        // Scanner sc = new Scanner(System.in);
        KhachHangNuocNgoai knn = new KhachHangNuocNgoai();
        KhachHangViet kv = new KhachHangViet();

        public String[] nhapKhachNN() {
                do {
                        System.out.println("Nhập số lượng khách NN : ");
                        n = knn.sc.nextInt();
                } while (n < 0);
                DSKhachNN = new String[n];
                for (int i = 0; i < DSKhachNN.length; i++) {
                        System.out.println("Khách nước ngoài [" + i + "]");
                        knn.input();
                }
                return DSKhachNN;
        }

        public String[] nhapKhachViet() {
                do {
                        System.out.println("Nhập số lượng khách Việt : ");
                        n = kv.sc.nextInt();
                } while (n < 0);
                DSKhachViet = new String[n];
                
                for (int i = 0; i < DSKhachViet.length; i++) {
                        System.out.println("Khách Việt [" + i + "]");
                        kv.input();
                        //kv.input() = DSKhachViet[i];
                }
                return DSKhachViet;
        }

        public String[] xuatKhachNN() {
                for (int i = 0; i < DSKhachNN.length; i++) {
                        System.out.println("Danh Sách Khách Nước Ngoài [" + (i + 1) + "] :");
                        System.out.println(knn.toString());
                }
                return DSKhachNN;
        }

        public String[] xuatKhachViet() {
                for (int i = 0; i < DSKhachViet.length; i++) {
                        System.out.println("Danh Sách Khách Việt [" + (i + 1) + "] :");
                        System.out.println(DSKhachViet[i]);
                }
                return DSKhachViet;
        }

        public int sumKNN() {
                int sum = 0;
                for (int i = 0; i < DSKhachNN.length; i++) {
                        sum += knn.SO_LUONG;
                }
                System.out.println("Tổng Số Lượng Của Khách Nước Ngoài: " + sum);
                return 0;
        }

        public int sumKV() {
                int SUM = 0;
                for (int i = 0; i < DSKhachViet.length; i++) {
                        SUM += kv.SO_LUONG;
                }
                System.out.println("Tổng Số Lượng Của Khách Nước Ngoài: " + SUM);
                return 0;
        }
        public double avgTTNN() {
                double AVG_ThanhTien=0;
                double SUM_ThanhTien =0;
                for (int i = 0; i < DSKhachNN.length; i++) {
                        SUM_ThanhTien += knn.THANH_TIEN;
                        AVG_ThanhTien = SUM_ThanhTien/(i+1);
                }
                System.out.println("Trung bình thành tiền của khách nước ngoài: "+AVG_ThanhTien);
                return 0;
        }
        public void in() {
                
                        System.out.println("1.Nhập danh sách khách hàng nước ngoài");
                        System.out.println("2.Nhập danh sách khách hàng việt nam");
                        System.out.println("3.Xuất danh sách khách nước ngoài");
                        System.out.println("4.Xuất dánh sách khách việt");
                        System.out.println("5.Tính tổng số lượng của từng loại khách");
                        System.out.println("6.Tính trung bình thành tiền của khách nước ngoài");
                        System.out.println("7.Tìm và xuất hóa đơn");
                        System.out.println("0.Đóng");
                        System.out.println("===========================");
                        System.out.println("Nhập số bạn muốn chọn: ");
                        
                
        }
}
