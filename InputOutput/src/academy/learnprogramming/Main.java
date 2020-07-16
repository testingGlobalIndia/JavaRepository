package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Locations locations = new Locations();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");

        int loc =1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc ==0){
                break;
            }

            Map<String, Integer> exists = locations.get(loc).getExits();
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
