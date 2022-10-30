public class Hero {
    private String imie;
    private String  klasa;
    //private String [] klasa =new String[] {"warrior", "blader", "wizard", "force archer", "force shielder", "force blader", "gladiator", "force gunner"};
    private int punkty_sily;
    private int punkty_many;
    private boolean nowa_stara; //True jeśli postać jest nowa, False jeśli postać jest stara
    Hero(String imie, String klasa, int punkty_sily, int punkty_many, boolean nowa_stara){
        this.imie = imie;
        this.klasa = klasa;
        this.punkty_sily = punkty_sily;
        this.punkty_many = punkty_many;
        this.nowa_stara = nowa_stara;
    }
    Hero(String imie, String klasa, boolean nowa_stara){
        this.imie = imie;
        this.klasa = klasa;
        this.nowa_stara = nowa_stara;
    }
    public String getImie(){
        return imie;
    }
    public String getKlasa(){
        return klasa;
    }
    public int getPunkty_sily(){
        return punkty_sily;
    }
    public int getPunkty_many(){
        return punkty_many;
    }
    public boolean getNowa_stara(){
        return nowa_stara;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public void setKlasa(String klasa){ this.klasa = klasa; }
    public void setPunkty_sily(int punkty_sily){
        this.punkty_sily = punkty_sily;
    }
    public void setPunkty_many(int punkty_many){
        this.punkty_many = punkty_many;
    }
    public void setNowa_stara(boolean nowa_stara){
        this.nowa_stara = nowa_stara;
    }
    public double moc_bohatera(){
        double moc= (punkty_sily * punkty_many) / 2.0;
        return moc;
    }
}
