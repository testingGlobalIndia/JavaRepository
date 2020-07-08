package academy.learnprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {


    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planet = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury","22");
        solarSystem.put(temp.getName(),temp);
        planet.add(temp);

        temp = new HeavenlyBody("Venus","30");
        solarSystem.put(temp.getName(),temp);
        planet.add(temp);

        temp = new HeavenlyBody("Pluto","30");
        solarSystem.put(temp.getName(),temp);
        planet.add(temp);

        temp = new HeavenlyBody("Earth","44");
        solarSystem.put(temp.getName(),temp);
        planet.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Chand","44");
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Sitare","55");
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);


        tempMoon = new HeavenlyBody("Star","65");
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);


        System.out.println("List of all planets are");
        for(HeavenlyBody body: planet){
            System.out.println(body.getName());
        }


        System.out.println("List of moons of earth are");
        HeavenlyBody body = solarSystem.get("Earth");
        for(HeavenlyBody body2 : body.getSatellities()){
            System.out.println(body2.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();

        for(HeavenlyBody moon : planet){
            moons.addAll(moon.getSatellities());
        }

        System.out.println("List of all moons are");
        for(HeavenlyBody moon : moons){
            System.out.println(moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto","234");
        planet.add(pluto);
    }
}
