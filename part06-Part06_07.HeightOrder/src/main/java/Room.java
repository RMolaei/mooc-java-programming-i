/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Molaei
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return (ArrayList) this.persons.clone();
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        int index = 0;
        Person shortestPerson = this.persons.get(index);
        index++;
        while (index < this.persons.size()) {
            Person personVar = this.persons.get(index);
            if (shortestPerson.getHeight() > personVar.getHeight()) {
                shortestPerson = personVar;
            }
            index++;
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}
