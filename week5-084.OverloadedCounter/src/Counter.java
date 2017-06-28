/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class Counter {

    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        if (!this.check) {
            this.value--;
        } else {
            if (this.value > 0) {
                this.value--;
            } else {
                this.value = 0;
            }
        }
    }

    public void increase(int amount) {
        if (amount >= 0) {
            this.value += amount;
        }
    }

    public void decrease(int amount) {
        if (amount >= 0) {
            if (!this.check) {
                this.value -= amount;
            } else {
                if ((this.value - amount) >= 0) {
                    this.value--;
                } else {
                    this.value = 0;
                }
            }
        }
    }
}
