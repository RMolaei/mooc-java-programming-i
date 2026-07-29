
public class HealthStation {

    private int numOfweightCall;

    public HealthStation() {
        this.numOfweightCall = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numOfweightCall++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int newWeight = person.getWeight() + 1;
        person.setWeight(newWeight);
    }

    public int weighings() {
        return this.numOfweightCall;
    }
}
