package academy.learnprogramming;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final String duration;
    private final Set<HeavenlyBody> satellities;
  

    public HeavenlyBody(String name, String duration) {
        this.name = name;
        this.duration = duration;
        this.satellities = new HashSet<>();
    }

    public String getName() {
        return name;
    }



    public String getDuration() {
        return duration;
    }

    public void addMoon(HeavenlyBody moon){
        this.satellities.add(moon);
    }

    public Set<HeavenlyBody> getSatellities() {
        return new HashSet<>(satellities);
    }

   @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is equal to "+obj.getClass());
        System.out.println("this.getClass() is equal to "+this.getClass());

        if(obj == null || obj.getClass() !=this.getClass()){
            return false;
        }

        String objName = ((HeavenlyBody)obj).getName();
        return this.getName().equals(objName);
    } 

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
