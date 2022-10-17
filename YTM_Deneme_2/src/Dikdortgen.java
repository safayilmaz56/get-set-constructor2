public class Dikdortgen implements AlanHesapla,CevreHesapla{

    private int kenar1;
    private int kenar2;

    public Dikdortgen(int kenar1, int kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        setKenar1(kenar1);
        setKenar2(kenar2);
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

    @Override
    public int alanHesapla() {
        return kenar1 * kenar2;
    }

    @Override
    public int cevreHesapla() {
        return (kenar1 + kenar2) * 2;
    }
}
