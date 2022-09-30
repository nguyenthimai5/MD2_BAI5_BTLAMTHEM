package ra.dev;

import java.util.Scanner;

public class Product {
    private String productId, productName, title, descriptions;
    private float importPrice, exportPrice;
    private int quantity, soLuong;
    private boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, String title, String descriptions, float importPrice, float exportPrice, int quantity, int soLuong, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.productStatus = productStatus;
        this.soLuong = soLuong;
    }

    public String getProductId() {
        return productId;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public int getSoLuong() {
        return soLuong;
    }

    Scanner scanner = new Scanner(System.in);

    public void inputData() {
        System.out.println("Nhập thông tin sản phẩm:");
        System.out.println("Mã sản phẩm: ");
        this.productId = scanner.nextLine();
        System.out.println("Tên sản phẩm: ");
        this.productName = scanner.nextLine();
        System.out.println("Tiêu đề sản phẩm");
        this.title = scanner.nextLine();
        System.out.println("Giá nhập của sản phẩm: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Số lượng còn lại của sản phẩm: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Trạng thái của sản phẩm: ");
        this.productStatus = scanner.nextBoolean();
    }



    public void calExportPrice() {
        this.exportPrice=this.importPrice * 1.2F;
    }

    public void displayData() {

        System.out.println("Mã sản phẩm " + this.productId);
        System.out.println("Tên sản phẩm " + this.productName);
        System.out.println("Tiêu đề sản phẩm " + this.title);
        System.out.println(" Giá nhập của sản phẩm" + this.importPrice);
        System.out.println("Giá bán của sản phẩm là: " + this.exportPrice);
        System.out.println("Số lượng còn lại của sản phẩm " + this.quantity);
        System.out.println("Mô tả sản phẩm " + this.descriptions);
        System.out.println("Trạng thái sản phẩm " + this.productStatus);

    }


}
