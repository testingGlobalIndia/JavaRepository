package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> location = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String,Integer> maps = new HashMap<>();
        location.put(0, new Location(0,"You are in front of your pc",maps));

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("W",2);
        map1.put("E",3);
        location.put(1, new Location(1,"You are in a road",map1));

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("S",4);
        map2.put("N",5);
        location.put(2, new Location(2,"You are in hill",map2));

        HashMap<String,Integer> map3 = new HashMap<>();
        map3.put("N",5);
        map3.put("W",1);
        location.put(3, new Location(3,"You are in building",map3));

        HashMap<String,Integer> map4 = new HashMap<>();
        map4.put("N",1);
        map4.put("W",2);
        location.put(4, new Location(4,"You are in forest",map4));

        HashMap<String,Integer> map5 = new HashMap<>();
        map5.put("S",1);
        map5.put("W",2);
        location.put(5, new Location(5,"You are in terrace",map5));


        HashMap<String,String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");

        int loc =1;
        while (true){
            System.out.println(location.get(loc).getDescription());
            if(loc ==0){
                break;
            }

            Map<String, Integer> exists = location.get(loc).getExits();
            System.out.print("Available exist are ");
            for(String exist : exists.keySet()){
                System.out.print(exist +",");
            }
            System.out.println();


            String[] words = scanner.nextLine().toUpperCase().split(" ");
            String direction = null;
            for(String word : words){
                if(vocabulary.containsKey(word)){
                    direction = vocabulary.get(word);
                    break;
                }
            }
                if(exists.containsKey(direction)){
                    loc = exists.get(direction);
                }else{
                    System.out.println("you cannot go in that direction");
                }
            }

        }

    }
