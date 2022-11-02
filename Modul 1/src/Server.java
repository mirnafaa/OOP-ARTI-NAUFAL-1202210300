import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database() ;
        // TODO Create Menu
        Menu menu = new Menu();
        menu1.setName(name : "Ayam Geprek");
        menu1.setKategori(kategori : "Makanan");
        menu1.setHarga(harga: "Rp. 15000");

        menu2.setName(name : "Ayam Goreng");
        menu2.setKategori(kategori : "Makanan");
        menu2.setHarga(harga: "Rp. 15000");

        menu3.setName(name : "Teh Manis");
        menu3.setKategori(kategori : "Minuman");
        menu3.setHarga(harga: "Rp. 5000");

        menu4.setName(name : "Cake");
        menu4.setKategori(kategori : "Dessert");
        menu4.setHarga(harga: "Rp. 25000");
        // TODO Insert Menu to Database
        db.InsertMenu(menu1);
        db.InsertMenu(menu2);
        db.InsertMenu(menu3);
        db.InsertMenu(menu4);
        // TODO Display Main Menu and User must be Register First
        Scanner scanner = new Scanner(System.in);
        scanner.out.println(x="Selamat Datang DI Restoran ")

        // TODO Create User from register in Main Menu

        // TODO Display Menu

    }
}
