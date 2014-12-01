/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labs;

/**
 *
 * @author alexb
 */
public class Projectile {
    private static final double DELTA_T = 0.0001;
    private static final double GRAVITY = 9.81;
    private double velocity;
    private double position;
    
    public Projectile(double initialVelocity, double initialPosition){
        this.velocity = initialVelocity;
        this.position = initialPosition;
    }
    
    public void runSimulation(){
        double t = 0;
        int i = 0;
        do{
            this.position = this.position + this.velocity*DELTA_T;
            this.velocity = this.velocity - GRAVITY*DELTA_T;
            i++;
            t=i*DELTA_T;
            if(i%10000 == 0){
                System.out.println("t: "+ t + ", y: " + this.position + ", v: " + this.velocity);
            }
        }while(this.position > 0);
    }
    
    public static void main(String[] args){
        Projectile cannonball = new Projectile(100 , 0);
        cannonball.runSimulation();
    }
    
}
