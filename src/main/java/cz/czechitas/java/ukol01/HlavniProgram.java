package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        nakresliPrasatko();
    }

    public void nakresliPrasatko() {
        nakresliCtverec();

        nakresliTrojuhelnik();

        nakresliNozicky();
    }

    public void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(200);
            zofka.turnRight(90);
        }
    }

    public void nakresliTrojuhelnik() {
        for (int i = 0; i < 3; i++) {
            zofka.move(200);
            zofka.turnLeft(120);
        }
    }


    public void nakresliNozicky() {

        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(200);
        zofka.turnLeft(225);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
    }


}