/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
    }

    public void add(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        birds.add(newBird);
    }

    public boolean observation(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().contains(name)) {
                bird.observed();
                return true;
            }
        }
        return false;
    }

    public void statistics() {
        for (Bird bird : this.birds) {
            bird.print();
        }
    }

    public boolean show(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().contains(name)) {
                bird.print();
                return true;
            }
        }
        return false;
    }

}
