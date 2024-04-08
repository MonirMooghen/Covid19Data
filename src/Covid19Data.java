public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekr�ftedeTilf�ldeIAlt;
    private int d�de;
    private int indlagteP�Intensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekr�ftedeTilf�ldeIAlt,
                       int d�de, int indlagteP�Intensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekr�ftedeTilf�ldeIAlt = bekr�ftedeTilf�ldeIAlt;
        this.d�de = d�de;
        this.indlagteP�Intensiv = indlagteP�Intensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    @Override
    public String toString() {
        return "Region: " + region +
                "\nAldersgruppe: " + aldersgruppe +
                "\nBekr�ftede tilf�lde i alt: " + bekr�ftedeTilf�ldeIAlt +
                "\nD�dsfald: " + d�de +
                "\nIndlagte p� intensiv afdeling: " + indlagteP�Intensiv +
                "\nIndlagte: " + indlagte +
                "\nDato: " + dato
                + "\n"
                ;
    }
}
