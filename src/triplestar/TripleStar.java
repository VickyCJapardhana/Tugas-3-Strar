/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triplestar;

/**
 *
 * @author ASUS TUF
 */
public class TripleStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //untuk menentukan batasan baris yang akan dibuat//
        for (int vertikal=1; vertikal<=4; vertikal++) {
// untuk jumbalhnya semakin kebawah agar semakin banyak//
 for (int horisontal=1; horisontal<vertikal; horisontal++)

{  System.out.print("*");
}
System.out.println();

}
    }
    
}
