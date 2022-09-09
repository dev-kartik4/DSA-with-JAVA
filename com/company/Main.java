package com.company;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Department{
    int id;
    List<Building> buildings;

    public Department() {
    }

    public Department(int id, List<Building> buildings) {
        this.id = id;
        this.buildings = buildings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }
}

class Building{
    int id;
    String name;

    public Building() {
    }

    public Building(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {

        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building(1,"HRITHIK"));
        buildingList.add(new Building(2,"HRIDAY"));
        buildingList.add(new Building(3,"HARMAN"));
        buildingList.add(new Building(4,"KARTIK"));
        buildingList.add(new Building(5,"SHASHANK"));
        buildingList.add(new Building(6,"HARSHA"));
        Department dept = new Department();
        dept.setId(1);
        dept.setBuildings(buildingList);

        System.out.println(dept.getBuildings().stream().filter(building -> building.getName().startsWith("H")).map(building -> building.getName()).collect(Collectors.toList()));

        //dept.getBuildings().stream().map(building -> building.getName().startsWith("H")).forEach(System.out::println);


        //        HashMap<String,String> friends = new HashMap<>();
//        friends.put("1","SHASHANK");
//        friends.put("2","KARTIK");
//        friends.put("3","HARISH");
//        friends.put("4","SRINIVAS");
//        friends.put("5","HARSHA");
//        friends.put("6","NIKHIL");
//        friends.put("7","KIRAN");
//        friends.put("8","AYYAPPA");
//
//        for (Map.Entry<String,String> entry : friends.entrySet()){
//            System.out.println(entry.getKey() + " => "
//                    + ": " + entry.getValue());
//        }

//        String input1 =  "happyhours";
//        char ch = 'h';
//        String output = "";
//        for(int i=0;i<input1.length();i++){
//            if(input1.charAt(i) == ch)
//                continue;
//            else
//                output = output + input1.charAt(i);
//        }
//        System.out.print(output);

//        Set<Integer> numbers = Set.of(2,4,6,8);
//        numbers.stream().takeWhile(n->n%2==0).forEach(System.out::println);


//        String[] array = {"a","b","c","null"};
//        List<String> list = List.of(array);
//
//        array[1]="d";
//        System.out.println(list);

    }
}
