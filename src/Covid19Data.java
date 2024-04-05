public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfældeIAlt,
                       int døde, int indlagtePåIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19 data{" +
                "Region=" + region +
                ", Aldersgruppe='" + aldersgruppe + '\'' +
                ", Bekræftede tilfælde i alt='" + bekræftedeTilfældeIAlt + '\'' +
                ", Døde='" + døde + '\'' +
                ", Indlagte på intensiv='" + indlagtePåIntensiv + '\'' +
                ", Indlagte='" + indlagte + '\'' +
                ", Dato='" + dato + '\'' +
                '}';
    }

}
