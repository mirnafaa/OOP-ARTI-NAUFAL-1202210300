public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String merk, int Gb, Float Ghz, boolean TF) {
        super(merk, Gb, Ghz);
        drive = merk;
        ram = Gb;
        processor = Ghz;
        webcam = TF;
    }
    public void informasi(){
        System.out.println("Perangkat memiliki drive tipe " + this.drive + ", ram sebesar " + this.ram + "GB dan processor berkekuatan " + this.processor + "GHz");
    }
    public void bukagame(String nama_game){
        System.out.println("Laptop berhasil membuka game" + nama_game);
    }
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke  " + email);
    }
    public void kirimEmail(String email_a, String email_b){
        System.out.println("Laptop berhasil mengirim email ke " + email_a + "dan " + email_b);
    }


}