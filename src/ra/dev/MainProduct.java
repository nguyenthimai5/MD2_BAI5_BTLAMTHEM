package ra.dev;

import java.util.Scanner;

public class MainProduct {
    static int index = 0;
    static Product[] listProduct = new Product[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--------MENU---------");
            System.out.println("1. Nhập thông tin cho n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Tính giá bán cho tất cả sản phẩm");
            System.out.println("3. Hiển thị thông tin các sản phẩm");
            System.out.println("4. Sắp xếp sản phẩm theo giá bán tăng dần");
            System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm");
            System.out.println("6. Thống kê số lượng và in thông tin các sản phẩm sắp hết hàng");
            System.out.println("7. Cập nhật trạng thái của sản phẩm theo mã sản phẩm");
            System.out.println("8.Thoát");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn:");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("So san pham muon nhap: ");
                    int number = sc.nextInt();
                    for (int i = index; i < number; i++) {
                        System.out.printf("San pham thu %d la: \n",index+1);
                        listProduct[index] = new Product();
                        listProduct[index].inputData();
                        index++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < index; i++) {
                        listProduct[i].calExportPrice();
                    }
                    System.out.println("Da tinh gia ban tat ca cac san pham");
                    break;
                case 3:
                    for (int i = 0; i < index; i++) {
                        listProduct[i].displayData();
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    Product gia=listProduct[0];
                    for (int i = 0; i <index-1; i++) {
                        for (int j = i+1; j < index; j++) {
                          if (listProduct[j].getExportPrice()<listProduct[i].getExportPrice()){
                          gia=listProduct[i];
                          listProduct[i]=listProduct[j];
                          listProduct[j]=gia;
                          }
                            }
                        }
                    System.out.println("Đã sắp xếp xong theo giá tăng dần");
                    break;
                case 5:
                    String seach="";
                    System.out.println("Nhập tên sp muốn tìm kiếm");
                    sc.nextLine();
                     seach=sc.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (listProduct[i].getProductName().startsWith(seach)){
                            listProduct[i].displayData();
                        }
                    }
                    break;
                case 6:

                    int cnt=0;
                    System.out.println("Thống kê các sản phẩm sắp hết hàng");
                    for (int i = 0; i < index; i++) {
                        if (listProduct[i].getQuantity()<=5){
                            cnt++;
                            listProduct[i].displayData();
                        }
                    }
                    break;
                case 7:
                    String update="";
                    System.out.println("Nhập vào sp cần cần nhật trạng thái");
                    sc.nextLine();
                     update=sc.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (listProduct[i].getProductId().equals(update)){
                            listProduct[i].setProductStatus(!listProduct[i].isProductStatus());
                        }
                    }
                    System.out.println("Đã cập nhật trạng thái sp thành công");
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-8");
            }
        } while (true);
    }
}
