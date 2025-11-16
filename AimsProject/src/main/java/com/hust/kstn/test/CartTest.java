package com.hust.kstn.test;

// Import các lớp cần thiết từ các package khác
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main (String args[]) {
        Cart cart = new Cart();

        // Tạo một vài DVD để test
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95, "Roger Allers", 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95, "George Lucas", 124);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99, "John Musker", 90);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Sci-Fi", 22.50, "Wachowski", 136);

        System.out.println("\n--- Kịch bản 1: Kiểm tra giới hạn giỏ hàng ---");
        // Thêm 19 sản phẩm vào giỏ hàng
        for (int i = 0; i < 19; i++) {
            DigitalVideoDisc tempDvd = new DigitalVideoDisc("DVD ", "Category", 10.0, "Director", 120);
            cart.addDVD(tempDvd);
        }
        System.out.println("--> Hiện tại có 19 sản phẩm. Thử thêm 1 sản phẩm nữa (sẽ thành công):");
        cart.addDVD(dvd1); 
        System.out.println("--> Hiện tại có 20 sản phẩm. Thử thêm 1 sản phẩm nữa (sẽ thất bại):");
        cart.addDVD(dvd2); 
        System.out.println("--> Hiện tại có 20 sản phẩm. Thử thêm 2 sản phẩm nữa (sẽ thất bại):");
        cart.addDVD(dvd2, dvd3); 
        System.out.println("--> Hiện tại có 20 sản phẩm. Thử thêm nhiều sản phẩm nữa (sẽ thất bại):");
        cart.addDVD(dvd2, dvd3, dvd4); 

        System.out.println("\n--> In thông tin giỏ hàng sau khi kiểm tra giới hạn:");
        cart.print();


        System.out.println("\n--- Kịch bản 2: Kiểm tra xóa khi giỏ hàng rỗng ---");
        Cart emptyCart = new Cart();
        System.out.println("--> Thử xóa một sản phẩm từ giỏ hàng rỗng (sẽ thất bại):");
        emptyCart.removeDVD(dvd1); 

        
        System.out.println("\n--- Kịch bản 3: Kiểm tra xóa sản phẩm không tồn tại ---");
        System.out.println("--> Thử xóa sản phẩm 'Aladdin' (chưa có trong giỏ hàng) (sẽ thất bại):");
        cart.removeDVD(dvd3); 


        System.out.println("\n--- Kịch bản 4: Kiểm tra in thông tin sau khi thêm/xóa ---");
        System.out.println("--> Thêm sản phẩm 'Aladdin' vào giỏ hàng đang có 20 cái (sẽ thất bại):");
        cart.addDVD(dvd3);
        cart.print(); 

        System.out.println("\n--> Xóa sản phẩm 'The Lion King' (đang có trong giỏ) (sẽ thành công):");
        cart.removeDVD(dvd1); // Thành công
        cart.print();

        System.out.println("\n--> Thêm lại sản phẩm 'Aladdin' (sẽ thành công):");
        cart.addDVD(dvd3); // Thành công
        cart.print();


        System.out.println("\n===== KẾT THÚC KIỂM THỬ =====");
    }
}
