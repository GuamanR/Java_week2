import sun.tools.jstat.SymbolResolutionClosure;

/**
 * Javahw_1008
 */


//  Hw for problem 1
//  k=80 
//  i=0
//  k=k-12
//  k=68
//  i=1
//  k=k-12
//  k=56
//  i=2
//  k=k-12
//  k=44
//  i=3
//  k=k-12
//  k=32
//  i=4
//  k=k-12
//  k=20
//  i=5
//  function does not run therefore the solution is k=20 which corresponds to C)
import java.util.Scanner;
public class Javahw_1008 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines of code would you like?");
        int timez = input.nextInt();
        for (int i = 0; i <=timez; i++){
            char thang = '*';
            for (int j = 0; j<i; j++){
                System.out.printf("%s", thang);
            }
        System.out.println("\n");   
        }
        
    }
}