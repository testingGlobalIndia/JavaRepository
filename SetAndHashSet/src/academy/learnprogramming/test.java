package academy.learnprogramming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        Set<A> setting = new HashSet<>();
        A a = new A("hello");
        setting.add(a);

        A b = new A("hello");
        setting.add(b);
        Iterator<A> i1 = setting.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next().getName());
        }
    }
}

class  A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
