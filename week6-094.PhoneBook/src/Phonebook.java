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
        
public class Phonebook {
    
    private ArrayList<Person> persons;
    
    public Phonebook(){
        persons = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        Person person = new Person(name,number);
        persons.add(person);
    }
    
    public String searchNumber(String name){
        for (Person person: persons){
            if (person.getName()==name){
                return person.getNumber();
            }
        }
        
        return "Number not known";
    }
    
    public void printAll(){
        for (Person person: persons){
            System.out.println(person);
        }
    }
    
}
