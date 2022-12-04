public class Main {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Baracuda",128,1.80F);
        perangkat1.informasi();
        
        Handphone handphone1 = new Handphone("Iphone Xr",4,3.60F,true);
        handphone1.informasi();
        handphone1.telfon(628126969);
        handphone1.kirimSMS(628893839);
        handphone1.kirimSMS(623827329, 62823938);

        Laptop laptop1 = new Laptop("Asus",32,3.20F,true);
        laptop1.informasi();
        laptop1.bukagame( "Point Blank");
        laptop1.kirimEmail("jokimknngq2@gmail.com");
        laptop1.kirimEmail("yhhha@gmail.com", "yyuuk@gmail.com");

    }
}