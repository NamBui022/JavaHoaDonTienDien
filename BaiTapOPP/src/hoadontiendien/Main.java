package hoadontiendien;

public class Main {
        public static void main(String[] args) {
                int a;
                XuLy xl = new XuLy();
               /* xl.nhapKhachViet();
                xl.xuatKhachViet();*/
                do {    
                        System.out.println("=============>>>>>>>");
                    xl.in();
                    a= xl.kv.sc.nextInt();
                
                    switch (a) {
                    case 1:
                            xl.nhapKhachNN();
                            break;
                    case 2:
                            xl.nhapKhachViet();
                            break;
                    case 3:
                            xl.xuatKhachNN();
                            break;
                    case 4:
                            xl.xuatKhachViet();
                            break;
                    case 5:
                            xl.sumKNN();
                            xl.sumKV();
                            break;
                    case 6:
                            xl.avgTTNN();
                            break;
                    case 7:
                            System.out.println(" chưa làm được ");
                            break;
                    
                    case 0:
                            System.out.println(" chưa làm được ");
                            break;
    
                    default:
                            System.out.println("Bạn đã nhập sai !-------");
                            break;
                    }
                    
                }while(a!=0);
                
        }
}
