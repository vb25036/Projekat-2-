
package hellyeah;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner imei = new Scanner(System.in);

        System.out.println("Unesite ime igraca:");
        String ime = imei.nextLine();

        while (ime.trim().isEmpty()) {
            System.out.println("Ime ne smije biti prazno.");
            ime = imei.nextLine();
        }

        Player p = new Player(ime, 10, 5, 32, 32, 100);

        Enemy e1 = new Enemy("Ork", 10, 5, 16, 16, 10);

        String zapis = "Goblin;12,5;16x16;20";

        String[] podaci = zapis.split(";");
        String[] pozicija = podaci[1].split(",");
        String[] dimenzije = podaci[2].split("x");

        Enemy e2 = new Enemy(
            podaci[0],
            Integer.parseInt(pozicija[0]),
            Integer.parseInt(pozicija[1]),
            Integer.parseInt(dimenzije[0]),
            Integer.parseInt(dimenzije[1]),
            Integer.parseInt(podaci[3])
        );

        Enemy[] niz = {};

        Game g = new Game(p, niz);

        g.addEnemy(e1);
        g.addEnemy(e2);

        System.out.println();
        System.out.println("Svi neprijatelji:");

        for (Enemy e : g.getNeprijatelji()) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("PRETRAGA: gob");

        for (Enemy e : g.findByType("gob")) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("Igrac prije sudara:");
        System.out.println(p);

        System.out.println("Neprijatelnji koji se sudaraju:");

        for (Enemy e : g.collidingWithPlayer()) {
            System.out.println(e);
        }

        g.resolveCollisions();

        System.out.println();
        System.out.println("Igrac nakon sudara:");
        System.out.println(p);

        System.out.println();
        System.out.println("Event log:");

        for (String dogadjaj : g.getEventLog()) {
            System.out.println(dogadjaj);
        }

        imei.close();
    }
}
