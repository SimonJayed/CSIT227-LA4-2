package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */
    public void giveRaise(Employee e, double raise) {
        if (e.getSalary() < 0){
            System.out.println("Invalid increase");
        }
        if (raise < 0){
            throw new IllegalArgumentException("Raise must be non-negative");
        }

        if (e == this) {
            setSalary(getSalary() + raise);
            return;
        }

        e.setSalary(e.getSalary() + raise);
        setSalary(getSalary() + (raise / 2));
    }

    @Override
    public String toString() {
        return "Mgr. " +super.toString();
    }
}