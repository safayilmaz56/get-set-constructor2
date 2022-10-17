public class Ucgen implements AlanHesapla,CevreHesapla{

    private int yukseklik;
    private int taban;
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen(int yukseklik, int taban, int kenar1, int kenar2, int kenar3) {
        this.yukseklik = yukseklik;
        this.taban = taban;
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
        setYukseklik(yukseklik);
        setTaban(taban);
        setKenar1(kenar1);
        setKenar2(kenar2);
        setKenar3(kenar3);
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }

    public int getTaban() {
        return taban;
    }

    public void setTaban(int taban) {
        this.taban = taban;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

    @Override
    public int alanHesapla() {
        return yukseklik * taban /2;
    }

    @Override
    public int cevreHesapla() {
        return kenar1 + kenar2 + kenar3;
    }
}
