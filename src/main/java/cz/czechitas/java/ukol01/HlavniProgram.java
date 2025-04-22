package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;


    public static void main(String[] args) {
        new HlavniProgram().start();
    }


    public void start() {
//      zofka = new Turtle();
//      zofka.penUp();
//      zofka.turnLeft(90);
//      zofka.move(100);
//      zofka.penDown();
//      zofka.turnRight(90);
//
//      nakresliPrasatko();
//      zofka.penUp();
//      zofka.move(50.0);
//      zofka.turnRight(90.0);
//      zofka.move(50.0);
//      zofka.turnLeft(90.0);
//      zofka.move(50.0);
//      zofka.penDown();
//
//      nakresliOsmiuhelnik();
//      zofka.penUp();
//      zofka.turnLeft(180);
//      zofka.move(300.0);
//      zofka.penDown();
//
//      nakresliKruh();
//      zofka.penUp();
//      zofka.turnRight(180.0);
//      zofka.move(200.0);
//      zofka.penDown();
//
//      nakresliSlunicko(16,30,30);

        zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(300);
        zofka.penDown();

        nakresliSlunicko(12, 20, 25);

        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(300);
        zofka.penDown();
        zofka.turnRight(180);
        nakresliDomecek();
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek();
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.penDown();
        zofka.turnRight(270);
        nakresliPrasatko();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek();

        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(900);
        zofka.turnRight(90);

        nakresliJmenoPetra();
    }

    public void nakresliJmenoPetra() {

        nakresliP();
        nakresliE();
        nakresliT();
        nakresliR();
        nakresliA();
    }

    public void nakresliPrasatko() {
        nakresliCtverec();

        nakresliTrojuhelnik();

        nakresliNozicky();
    }

    public void nakresliDomecek() {
        nakresliCtverec();
        zofka.move(100);
        zofka.turnRight(90);
        nakresliTrojuhelnik();
        zofka.turnRight(90);
        zofka.move(100);
    }

    public void nakresliOsmiuhelnik() {
        nakresliMnohouhelnik(8, 50);

        zofka.penUp();
        zofka.move(100.0);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void nakresliKruh() {
        nakresliMnohouhelnik(16, 20);
        zofka.penUp();
        zofka.move(100.0);
        zofka.turnRight(90);
        zofka.penDown();
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
            zofka.move(delkaStrany / 2.0);
            zofka.turnLeft(90);
            zofka.move(delkaPaprsku);
            zofka.turnRight(180);
            zofka.move(delkaPaprsku);
            zofka.turnLeft(90);
            zofka.move(delkaStrany / 2.0);
            zofka.turnRight(uhel);
        }
    }

    public void nakresliP() {
        zofka.penDown();
        zofka.move(100); // nožička P
        zofka.turnRight(90);
        zofka.move(50); // vršek
        zofka.turnRight(90);
        zofka.move(50); // dolů k obloučku
        zofka.turnRight(90);
        zofka.move(50); // zpět k nožičce
        zofka.penUp();


        // Vrátíme se dolů a natočíme želvu zpět nahoru
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);

    }


    public void nakresliE() {
        zofka.penDown();
        zofka.move(100); // svislá čára
        zofka.turnRight(90);
        zofka.move(50);  // horní vodorovná
        zofka.turnLeft(180);
        zofka.move(50); // do středu
        zofka.turnLeft(90);
        zofka.move(50); // prostřední
        zofka.turnLeft(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30); // dolů
        zofka.turnLeft(90);
        zofka.move(50); // dolní
        zofka.turnLeft(90);
        zofka.move(50);

    }


    public void nakresliT() {
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(100);
    }


    public void nakresliR() {
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(100);      // svislá noha
        zofka.turnRight(90);
        zofka.move(50);       // horní vodorovná
        zofka.turnRight(90);
        zofka.move(50);       // dolů
        zofka.turnRight(90);
        zofka.move(50);       // zpět k noze
        zofka.turnLeft(135);  // příprava na diagonálu
        zofka.move(70);       // diagonální noha R
        zofka.penUp();


        // návrat nahoru
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(90);
    }


    public void nakresliA() {
        zofka.penDown();
        zofka.turnRight(20);   // naklonění levé nohy A
        zofka.move(106);       // přibližně délka šikmé nohy (100 / cos(20°))
        zofka.turnRight(140);  // natočit doprava na druhou nohu
        zofka.move(106);
        zofka.penUp();
        zofka.turnRight(180);    // otočit se o 180° (dáme si pomocnou metodu níž)
        zofka.move(53);        // na střed "příčky"
        zofka.turnLeft(70);    // natočit na příčku
        zofka.penDown();
        zofka.move(40);        // příčka A
        zofka.penUp();


        // návrat nahoru a do výchozí pozice
        zofka.turnLeft(110);   // natočíme se zpět nahoru
        zofka.move(53);


    }
}