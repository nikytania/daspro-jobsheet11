public class Kubus18 {
    private double sisi;

    public Kubus18(double sisi) {
        this.sisi = sisi;
    }
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        Kubus18 kubus = new Kubus18(4);

        double volume = kubus.hitungVolume();
        System.out.println("Volume kubus: " + volume);

        double luasPermukaan = kubus.hitungLuasPermukaan();
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}