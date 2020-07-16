package com.company;

public class Army {
    private int companyNumber;
    private int squadNumber;
    private BaseLocation location;
    private Countries country;
    public Army(int companyNumber,int squadNumber,BaseLocation location, Countries country){
        this.companyNumber=companyNumber;
        this.squadNumber=squadNumber;
        this.location = location;
        this.country = country;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }

    public int getSquadNumber() {
        return squadNumber;
    }
    public BaseLocation location(){
        return location;
    }


    public Countries getCountry() {
        return country;
    }

    public String soldierInfo() {
        return "Номер роты: " + companyNumber +
                "\nНомер отряда: " + squadNumber +
                "\nМестоположение базы: " + location.getCity() +
                "\nСтрана: " + country;
    }
}
