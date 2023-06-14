package employee;

public class Manager extends Employee {
    private int yearsOfExperience;

    public Manager(String name, double salary, int yearsOfExperience) {
        super(name, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() + " Years of experience: " + yearsOfExperience;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager m = (Manager) obj;
        return m.yearsOfExperience == yearsOfExperience;
    }
    
}
