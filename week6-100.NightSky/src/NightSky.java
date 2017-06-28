/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int depth;
    private int starsInLastPrint;

    public NightSky(double density, int width, int depth) {
        this.density = density;
        this.width = width;
        this.depth = depth;  
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }

    public void printLine() {
            Random random = new Random();
     
        for (int i = 0; i < this.width; i++) {
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInLastPrint += 1;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print() {
        this.starsInLastPrint=0;
        for (int i = 0; i < this.depth; i++) {
            printLine();
        }
    }

}
