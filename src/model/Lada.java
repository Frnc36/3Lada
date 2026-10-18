package model;

public class Lada {

    private int id;
    private String szin;
    private String felirat;
    private boolean vanKulcs;

    public Lada(int id, String szin, String felirat, boolean vanKulcs) {
        this.id = id;
        this.szin = szin;
        this.felirat = felirat;
        this.vanKulcs = vanKulcs;
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

    public boolean isVanKulcs() {
        return vanKulcs;
    }

    @Override
    public String toString() {
        return "Lada{" + "id=" + id + ", szin=" + szin + ", felirat=" + felirat + ", vanKulcs=" + vanKulcs + '}';
    }

}
