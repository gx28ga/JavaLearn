package project3.team.domain;

import project3.team.service.Status;

public class Programmer extends Employee{
    private int memberId;
    private Status status;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, int memberId) {
        super(id, name, age, salary);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer() {
    }
}
