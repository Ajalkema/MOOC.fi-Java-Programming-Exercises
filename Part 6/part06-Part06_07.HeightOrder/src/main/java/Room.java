import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty(){
        if (this.persons.isEmpty()) return true;
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.isEmpty()) return null;

        Person shorty = this.persons.get(0);

        for (Person p : persons) {
            if (p.getHeight() < shorty.getHeight()) {
                shorty = p;
            }
        }

        return shorty;
    }

    public Person take() {
        if (this.isEmpty()) return null;

        Person shorty = this.shortest();
        this.persons.remove(shorty);
        return shorty;

    }
}
