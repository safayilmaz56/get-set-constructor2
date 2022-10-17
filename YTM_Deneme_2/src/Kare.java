public class Kare implements AlanHesapla,CevreHesapla{
    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
        setKenar(kenar);
    }

    public int getKenar() {
        return kenar;
    }
    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public int alanHesapla() {
        return kenar * kenar;
    }

    @Override
    public int cevreHesapla() {
        return 4 * kenar;
    }
}
