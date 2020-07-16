package academy.learnprogramming;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer,Location> {

    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) throws IOException {
        /*FileWriter locaFile = null;
        try {
            locaFile = new FileWriter("location.txt");
            for (Location location : locations.values()) {
                locaFile.write(location.getLocationID() + " , " + location.getDescription() + "\n");
            }
        } finally {
                if (locaFile != null)
                    locaFile.close();
        }*/

        try(FileWriter locFile = new FileWriter("location_big.txt");
            FileWriter dirFile = new FileWriter("direction_big.txt")){
            for(Location location: locations.values()){
                locFile.write(location.getLocationID() + " , "+location.getDescription()+"\n");
                for(String direction:location.getExits().keySet()){
                    dirFile.write(location.getLocationID() +" , "+direction + location.getExits().get(direction));
                }
            }
        }
    }

    static {
        /*HashMap<String,Integer> maps = new HashMap<>();
        locations.put(0, new Location(0,"You are in front of your pc",maps));

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("W",2);
        map1.put("E",3);
        locations.put(1, new Location(1,"You are in a road",map1));

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("S",4);
        map2.put("N",5);
        locations.put(2, new Location(2,"You are in hill",map2));

        HashMap<String,Integer> map3 = new HashMap<>();
        map3.put("N",5);
        map3.put("W",1);
        locations.put(3, new Location(3,"You are in building",map3));

        HashMap<String,Integer> map4 = new HashMap<>();
        map4.put("N",1);
        map4.put("W",2);
        locations.put(4, new Location(4,"You are in forest",map4));

        HashMap<String,Integer> map5 = new HashMap<>();
        map5.put("S",1);
        map5.put("W",2);
        locations.put(5, new Location(5,"You are in terrace",map5));*/

        Scanner scanner = null;
        try{
            scanner = new Scanner(new FileReader("location_big.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()){
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc :"+loc + ": "+ description);
                Map<String,Integer> tempExist = new HashMap<>();
                locations.put(loc, new Location(loc,description, tempExist));
            }

        }catch (IOException e){
            e.printStackTrace();
            if(scanner != null){
                scanner.close();
            }
        }

        try{
            scanner = new Scanner(new BufferedReader(new FileReader("direction_big.txt")));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()){
                /*int loc = scanner.nextInt();
                String direction = scanner.nextLine();
                String dest = scanner.nextLine();
                scanner.skip(scanner.delimiter());
                int destination = Integer.parseInt(dest);*/
                String input = scanner.nextLine();
                String[] data =input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);
                System.out.println(loc + ","+direction+": "+destination);
                Location location = locations.get(loc);
                location.addExists(direction,destination);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if(scanner !=null){
                scanner.close();
            }
        }
    }


    @Override
    public int size() {
        return  locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key,value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
