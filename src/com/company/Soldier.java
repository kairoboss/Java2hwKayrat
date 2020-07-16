package com.company;

public class Soldier extends Army {
    private int age;
    private int militaryServiceExperience;
    private String rank;


    public Soldier(int age, int militaryServiceExperience, String rank,int companyNumber, int squadNumber, BaseLocation location, Countries country) {
        super(companyNumber, squadNumber, location, country);
        this.age = age;
        this.militaryServiceExperience = militaryServiceExperience;
        this.rank = rank;

    }

    public int getAge() {
        return age;
    }

    public int getMilitaryServiceExperience() {
        return militaryServiceExperience;
    }

    public String getRank() {
        return rank;
    }


    public void stopService(String month, int day) {
        System.out.println("Дата ухода в отставку: " + day +" "+ month);
    }

    final public void stopService(int day, String month) {
        System.out.println("Дата ухода в отставку: " + day +" "+ month);
    }
    @Override
    public String soldierInfo(){
        return super.soldierInfo()+
                "\nВозраст солдата: " + age+
                "\nОпыт службы: " + militaryServiceExperience+
                "\nВоенное звание: "+ rank;
    }
}
