package HomeWork;

public class Employee {
    enum Position {
        DIRECTOR(1.5), WORKER(1);
        double coefficient;
        Position(double coefficient) {
            this.coefficient = coefficient;
        }
    }

    private Position position;
    private int experience;

    public Employee(Position position, int experience) {
        this.position = position;
        this.experience = experience;
    }

    public double calculateSalary(double baseRate) {
        return baseRate * position.coefficient * experience;
    }

    public abstract void setPosition(Position position);

}
}
