
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return (ArrayList) this.elements.clone();
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String strVar;
        if (this.elements.size()==1) {
            strVar = "The collection " + this.name + " has " + this.elements.size() + " element:";
        } else {
            strVar = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        }
        for (String item : this.elements) {
            strVar = strVar + "\n" + item;
        }
        return strVar;
    }

}
