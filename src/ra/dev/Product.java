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
        System.out.println("Nh???p th??ng tin s???n ph???m:");
        System.out.println("M?? s???n ph???m: ");
        this.productId = scanner.nextLine();
        System.out.println("T??n s???n ph???m: ");
        this.productName = scanner.nextLine();
        System.out.println("Ti??u ????? s???n ph???m");
        this.title = scanner.nextLine();
        System.out.println("Gi?? nh???p c???a s???n ph???m: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("S??? l?????ng c??n l???i c???a s???n ph???m: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("M?? t??? s???n ph???m: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Tr???ng th??i c???a s???n ph???m: ");
        this.productStatus = scanner.nextBoolean();
    }



    public void calExportPrice() {
        this.exportPrice=this.importPrice * 1.2F;
    }

    public void displayData() {

        System.out.println("M?? s???n ph???m " + this.productId);
        System.out.println("T??n s???n ph???m " + this.productName);
        System.out.println("Ti??u ????? s???n ph???m " + this.title);
        System.out.println(" Gi?? nh???p c???a s???n ph???m" + this.importPrice);
        System.out.println("Gi?? b??n c???a s???n ph???m l??: " + this.exportPrice);
        System.out.println("S??? l?????ng c??n l???i c???a s???n ph???m " + this.quantity);
        System.out.println("M?? t??? s???n ph???m " + this.descriptions);
        System.out.println("Tr???ng th??i s???n ph???m " + this.productStatus);

    }


}
