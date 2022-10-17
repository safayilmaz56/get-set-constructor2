public class Main {
    public static void main(String[] args) {
        Kare kare = new Kare(5);
        Dikdortgen dikdortgen = new Dikdortgen(6,8);
        Daire daire = new Daire(4);
        Ucgen ucgen = new Ucgen(2,3,4,5,6);

        System.out.println("Karenin cevresi:"+kare.cevreHesapla()+" karenin alani:"+kare.alanHesapla());
        System.out.println("Dikdortgenin cevresi:"+dikdortgen.cevreHesapla()+" dikdortgenin alani:"+kare.alanHesapla());
        System.out.println("dairenin cevresi:"+daire.cevreHesapla()+" dairenin alani:"+ daire.alanHesapla());
        System.out.println("ucgenin cevresi:"+ucgen.cevreHesapla()+" ucgenin alani:"+ucgen.alanHesapla());
    }
}