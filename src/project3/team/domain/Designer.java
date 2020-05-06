package project3.team.domain;

public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, int memberId, double bonus) {
        super(id, name, age, salary, memberId);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
