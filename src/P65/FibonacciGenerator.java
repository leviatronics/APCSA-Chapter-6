/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P65;

/**
 *
 * @author alexb
 */
public class FibonacciGenerator {
    public static int get(int n){
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        for(int i=3; i<=n; i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
