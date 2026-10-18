package model;

public class Lada {

    private String szin;
    private String felirat;
    private boolean vanKulcs;

    public Lada(String szin, String felirat, boolean vanKulcs) {
        this.szin = szin;
        this.felirat = felirat;
        this.vanKulcs = vanKulcs;
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
        return "Lada{" + "szin=" + szin + ", felirat=" + felirat + ", vanKulcs=" + vanKulcs + '}';
    }

}
