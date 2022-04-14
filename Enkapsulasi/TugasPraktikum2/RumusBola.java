package Kelas_X.Semester2.Enkapsulasi.TugasPraktikum2;

public class RumusBola {
    public static void main(String[] args) {
        double jarijari = 14;
        Bola bola = new Bola(7);
        bola.showDiameter();
        bola.showLp();
        bola.showV();
            System.out.println("\n");

        bola.setJarijari(jarijari);
        bola.showDiameter();
        bola.showLp();
        bola.showV();
    }
}
