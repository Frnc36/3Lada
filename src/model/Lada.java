package model;

public class Lada {

    private int id;
    private String szin;
    private String felirat;

    public Lada(int id, String szin, String felirat) {
        this.id = id;
        this.szin = szin;
        this.felirat = felirat;
    }

    public int getId() {
        return id;
    }

    public String getSzin() {
        return szin;
    }

    public String getFelirat() {
        return felirat;
    }

}
