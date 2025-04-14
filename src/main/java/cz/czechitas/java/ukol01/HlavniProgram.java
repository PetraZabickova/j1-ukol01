package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.penDown();
        zofka.turnRight(90);

        nakresliPrasatko();

        zofka.penUp();
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnLeft(90.0);
        zofka.penDown();

        nakresliSlunicka();
    }

    public void nakresliPrasatko() {
        nakresliCtverec();

        nakresliTrojuhelnik();

        nakresliNozicky();
    }
public void nakresliSlunicka()  {
        nakresliMnohouhelnik(8,50);

    zofka.penUp();
    zofka.move(100.0);
    zofka.turnLeft(90);
    zofka.penDown();

        nakresliMnohouhelnik(12,20);

    zofka.penUp();
    zofka.move(200.0);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliSlunicko(8,30,20);
}




    public void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
    }

    public void nakresliTrojuhelnik() {
        for (int i = 0; i < 3; i++) {
            zofka.move(100);
            zofka.turnLeft(120);
        }
    }


    public void nakresliNozicky() {

        zofka.turnLeft(135);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnLeft(225);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
    }

    public void nakresliMnohouhelnik(int pocetStran, int delkaStrany) {
        int uhel = 360 / pocetStran;

        for (int i = 0; i < pocetStran; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
        }
    }

    public void nakresliSlunicko(int pocetStran, int delkaStrany, int delkaPaprsku) {
        int uhel = 360 / pocetStran;

        for (int i = 0; i < pocetStran; i++) {

            // Krátká strana sluníčka (hrana mnohoúhelníku)
            zofka.move(delkaStrany);
            zofka.turnRight(90);
            zofka.move(delkaPaprsku);
            zofka.turnRight(180);
            zofka.move(delkaPaprsku);
            zofka.turnRight(uhel);
        }
    }

}