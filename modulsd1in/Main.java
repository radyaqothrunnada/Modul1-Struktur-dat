public class Main {
    public static void main(String[] args) {
       ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
       Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
       Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

       Makanan ayam = new Makanan();
       ayam.setNamaHidangan("Ayam BAkar");
       Minuman esteh = new Minuman();
       esteh.setNamaHidangan("Es teh Manis");
       breakfast.setKonsumsi(ayam, esteh); 
       listKonsumsi.add(breakfast);

       Makanan burger = new Makanan();
       burger.setNamaHidangan("burger ayam");
       Minuman jus = new Minuman();
       jus.setNamaHidangan(" Jus Stroberi");
       lunch.setKonsumsi(burger, jus);
       listKonsumsi.add(lunch);

       System.out.println("Menu Konsumsi");

       for (Konsumsi<Makanan,Minuman> konsumsi: listKonsumsi){
        Makanan makanan = konsumsi.getM();
        Minuman minuman = konsumsi.getI();

        System.out.println(makanan.disantap());
        System.out.println(minuman.disantap());
       }
    }
    
}
