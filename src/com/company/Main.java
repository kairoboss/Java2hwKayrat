package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Soldier objectA = new Soldier(56,30, "Генерал Армии", 7,10,new BaseLocation("Токио"), Countries.JAPAN);
        objectA.stopService(6,"July");
        System.out.println(objectA.soldierInfo());
        System.out.println("--------------------------");
        Sergeant objectB = new Sergeant(30,10,"Сержант",9,15,new BaseLocation("Washington"),Countries.USA,18000);
        objectB.stopService("February",23);
        System.out.println(objectB.soldierInfo());
        System.out.println("--------------------------");
        Sergeant objectC = new Sergeant(45,15,"Младший Сержант",25,99,new BaseLocation("Montreal"),Countries.FRANCE,25000);
        objectC.stopService("May",25);
        System.out.println(objectC.soldierInfo());
    }
}
