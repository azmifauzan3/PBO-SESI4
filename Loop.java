
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD AZMI FAUZAN
 */
public class Loop {
    public static void main(String[] args) {
    String kalimat = "mari kita belajar pbo";
    String reversedKalimat = "";

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Kalimat : ");
    kalimat = input.next();

    for (int i = kalimat.length() - 1; i >= 0; i--) {
      reversedKalimat += kalimat.substring(i, i + 1);
    }

    System.out.println(reversedKalimat);
  }
}
