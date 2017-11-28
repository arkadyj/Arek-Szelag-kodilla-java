package homeWork.practise._enum_;

public class Masa {

    public static void main(String[] args) {
        double masaZiemi = 100;
        double masa = masaZiemi / Planeta.ZIEMIA.przeliczGrawitacje();
        for (Planeta p : Planeta.values())
            System.out.printf("twoja masa na %s wynosi %f kilogramów\n", p, p
                    .przeliczMasy(masa));

    }

    public enum Planeta {
        MERKURY(3.303e+23, 2.4397e6), WENUS(4.869e+24, 6.0518e6), ZIEMIA(
                5.976e+24, 6.37814e6), MARS(6.421e+23, 3.3972e6), JOWISZ(
                1.9e+27, 7.1492e7), SATURN(5.688e+26, 6.0268e7), URAN(
                8.686e+25, 2.5559e7), NEPTUN(1.024e+26, 2.4746e7), PLUTON(
                1.27e+22, 1.137e6);

        private final double masa; // w kilogramach
        private final double promien; // w metrach

        Planeta(double masa, double promien) {
            this.masa = masa;
            this.promien = promien;
        }

        public double masa() {
            return masa;
        }

        public double radius() {
            return promien;
        }

        // uniwersalna stała grawitacyjna (m3 kg-1 s-2)
        public static final double G = 6.67300E-11;

        public double przeliczGrawitacje() {
            return G * masa / (promien * promien);
        }

        public double przeliczMasy(double innaMasa) {
            return innaMasa * przeliczGrawitacje();
        }
    }

}