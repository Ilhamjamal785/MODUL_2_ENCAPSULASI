package Kelas_X.Semester2.Enkapsulasi.TugasPraktikum2;

import static java.lang.Math.PI;

public class Bola {
    private double jarijari;

    public Bola(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        System.out.println("Diameter bola adalah : " + 2 * jarijari);
    }

    public void showLp() {
        System.out.println("Luas permukaan bola adalah : " + 4 / 3 * PI * Math.pow(jarijari, 3));
    }

    public void showV() {
        System.out.println("Volume bola adalah : " + 4 * Math.PI * Math.pow(jarijari, 2));
    }
}
