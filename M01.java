// 12S24001 - Fredrick Aritonang
// 12S24019 - Winda N.V. Sitorus
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int kredit;
        double nilaiangka;
        double performa;
        String nilaihuruf;
        String a, aB, b, bC, c, d, e;

        kredit = Integer.parseInt(input.nextLine());
        do {
            nilaihuruf = input.nextLine();
            if (nilaihuruf.equals("A")) {
                nilaiangka = 4.0;
                a = "nilaihuruf*kredit";
            } else {
                if (nilaihuruf.equals("AB")) {
                    nilaiangka = 3.5;
                    aB = "nilaihuruf*kredit";
                } else {
                    if (nilaihuruf.equals("B")) {
                        nilaiangka = 3.0;
                        b = "nilaihuruf*kredit";
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            nilaiangka = 2.5;
                            bC = "nilaihuruf*kredit";
                        } else {
                            if (nilaihuruf.equals("C")) {
                                nilaiangka = 2.0;
                                c = "nilaihuruf*kredit";
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    nilaiangka = 1.0;
                                    d = "nilaihuruf*kredit";
                                } else {
                                    nilaiangka = 0.0;
                                    e = "nilaihuruf*kredit";
                                }
                            }
                        }
                    }
                }
            }
            performa = nilaiangka * kredit;
            System.out.println(performa);
        } while (kredit != "---");
    }
}
