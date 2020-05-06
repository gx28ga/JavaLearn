package project3.team.domain;

public class Architect extends Designer {
    private int Stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, int memberId, double bonus, int stock) {
        super(id, name, age, salary, memberId, bonus);
        Stock = stock;
    }
}
