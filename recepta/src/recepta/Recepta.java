/*
Escriu un programa que visualitza les quantitats necessàries per a realitzar una recepta.
Llig de teclat per a quantes persones és la recepta. Si s’introdueix un valor inferior a 1,
llavors es calcula les quantitats per a una persona.
La recepta per a sis persones té: 600gr de coliflor, 1 ceba tendra, 3 carlotes, 500gr de pit
de pollastre, 25gr de pinyons, 75gr de panses, 220ml de caldo i 1.5 culleretes de curri.
Tin en compte que, les carlotes, sempre, són senceres, i com a mínim en la recepta hi ha
mitja ceba tendra, una carlota, 10gr de pinyons, 20gr de panses i 0.5 culleretes de curri.

visualitza les quantitats necessàries per a realitzar una recepta
Llig de teclat per a quantes persones és la recepta.
       Si s’introdueix un valor inferior a 1, llavors es calcula les quantitats per a una persona.

nPersones >> int


 */
package recepta;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Recepta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("entra el nombre de persones");
        int nPersones = scn.nextInt();
        if (nPersones < 1) {
            nPersones = 1;
        }
        int coliflor = 600 * nPersones / 6;
        int pollastre = 500 * nPersones / 6;
        int caldo = 220 * nPersones / 6;
        double ceba = 1.0 * nPersones / 6;
        if (ceba < 0.5) {
            ceba = 0.5;
        }
        double curry = 1.5 * nPersones / 6;
        curry = curry < .5 ? .5 : curry;
        int pinyons = 25 * nPersones / 6;
        if (pinyons < 10) {
            pinyons = 10;
        }
        int panses = 75 * nPersones / 6;
        if (panses < 25) {
            panses = 25;
        }

        int carlotes = Math.round(3 * nPersones / 6);
        if (carlotes < 1) {
            carlotes = 1;
        }

        System.out.printf("Per a %d persones necessites\n"
                + "%dgr de coliflor\n%dgr de pit de pollastre\n%d carlotes\n"
                + "%dml de caldo\n%dgr de pinyons\n%.2f cebes tendres\n"
                + "%dgr de panses\n%.2f culleretes de curry\n",
                nPersones, coliflor, pollastre, carlotes,
                caldo, pinyons, ceba, panses, curry
        );
    }

}
