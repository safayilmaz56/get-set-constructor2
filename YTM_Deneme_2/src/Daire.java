public class Daire implements AlanHesapla,CevreHesapla{
    private int r;
    public static final int SABIT= 2;
    public static int PI = 3;



    public Daire(int r) {
        this.r = r;
        setR(r);
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }

    @Override
    public int alanHesapla() {
        return PI * r * r;
    }

    @Override
    public int cevreHesapla() {
        return SABIT * PI * r;
    }
}
