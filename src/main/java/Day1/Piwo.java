package Day1;

public class Piwo {
    private int wiekDozwolony = 18;
    protected double moc;
    protected String nazwa;
    private String ibu;

    public String czyPiwo(int wiek) {
        if (wiek >= wiekDozwolony) {
            return "Moze pic piwo " + nazwa + " o mocy " + moc+ "%";
        } else {
            return "Nie Moze pic piwa " + nazwa + "";
        }
    }

    public Piwo(String nazwa, double moc) {
        this.nazwa = nazwa;
        this.moc = moc;
        this.ibu = ibu;
    }

    @Override
    public String toString() {
        return "Piwo{" +
                "ibu=" + ibu +
                ", moc=" + moc +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
