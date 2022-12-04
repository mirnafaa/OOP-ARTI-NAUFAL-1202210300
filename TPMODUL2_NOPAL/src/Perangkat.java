public class Perangkat {
    protected String drive;
    protected Integer ram;
    protected Float processor;

    public Perangkat (String merk, int Gb, Float Ghz){
        drive = merk;
        ram = Gb;
        processor = Ghz;
    }
    
    public void informasi(){
        if (this.drive != "baracuda" && this.ram != 2 && this.processor != 1.80F){
            System.out.println("Perangkat tidak memiliki drive bertipe seagate, ram 2 GB dan juga processor berkekuatan 1.80 GHz");
        } else  {
            System.out.println("Perangkat memiliki drive bertipe seagate, ram 2 GB dan juga processor berkekuatan 1.80 GHz");
        }
        
    }
}