package HomeWork2;

public class Interface {
    public Employee(String name, Employee[] subordinates) {
        this.name = name;
        this.subordinates = subordinates;
    }

    public boolean isDirector() {
        return false;
    }

    public String getName() {
        return name;
    }

    public Employee[] getSubordinates() {
        return subordinates;
    }
}
