public class Zak {
    private String jmenoPrijmeni;
    private int cisloChodu;

    public Zak(String jmenoPrijmeni, int cisloChodu) {
        this.jmenoPrijmeni = jmenoPrijmeni;
        this.cisloChodu = cisloChodu;
    }

    public String getPrijmeni(){
        String[] jp = jmenoPrijmeni.split(" ");
        return jp[1];
    }

    public String getJmenoPrijmeni() {
        return jmenoPrijmeni;
    }

    public void setJmenoPrijmeni(String jmenoPrijmeni) {
        this.jmenoPrijmeni = jmenoPrijmeni;
    }

    public int getCisloChodu() {
        return cisloChodu;
    }

    public void setCisloChodu(int cisloChodu) {
        this.cisloChodu = cisloChodu;
    }
}
