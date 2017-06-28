/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class BoundedCounter {

    private int value;
    private int upperBound;

    public BoundedCounter(int upperBound) {
        this.value = 0;
        this.upperBound = upperBound;

    }

    public void next() {
        this.value++;

        if (this.value > upperBound) {
            this.value = 0;
        }
    }

    public String toString() {

        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= upperBound) {
            this.value = value;
        }
    }

}
