/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P65;
import java.util.Scanner;
/**
 *
 * @author alexb
 */
public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What term of the Fibonacci Sequence do you want to see? ");
        if(scan.hasNextInt()){
            System.out.println("The term is " + FibonacciGenerator.get(scan.nextInt()));
        }
        else{
            System.out.println("Input unusable.  Sorry!");
            scan.close();
        }
        
    }
}
