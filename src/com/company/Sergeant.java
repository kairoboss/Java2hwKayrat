package com.company;

public final class Sergeant extends Soldier {
    private int salary;

    public Sergeant(int age, int militaryServiceExperience, String rank, int companyNumber, int squadNumber, BaseLocation location, Countries country, int salary) {
        super(age, militaryServiceExperience, rank, companyNumber, squadNumber, location, country);
        this.salary = salary;
    }

    @Override
    public void stopService(String month, int day) {
        System.out.println("Дата ухода в отпуск: " + day + month);
    }
    @Override
    public String soldierInfo(){
        return super.soldierInfo()+
                "\nЗарплата: "+ salary;
    }
}
