public class Handphone extends Perangkat{
    
    protected boolean fingerprint;

    public Handphone(String merk, int Gb, Float Ghz, boolean TF) {
        super(merk, Gb, Ghz);
        drive = merk;
        ram = Gb;
        processor = Ghz;
        fingerprint = TF;
    }

    
    
    
    public void informasi(){
        System.out.println("Perangkat memiliki drive tipe " + this.drive + ", ram sebesar " + this.ram + "GB dan processor berkekuatan " + this.processor + "GHz");
    }
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke nomor " + no_hp);
    }
    public void kirimSMS(int no_sms){
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_sms);
    }
    public void kirimSMS(int no_sms1, int no_sms2){
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_sms1 + "dan " + no_sms2);
    }
}