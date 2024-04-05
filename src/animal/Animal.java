package animal;
import java.util.*;

public class Animal {
    private String name;

    public Animal() {
        name="Dong vat";
        System.out.println("Day la lop cha.");
    }
    public void eat(){
        System.out.println("Dong vat dang an");
    }

    public int num(){
        int num=1;
        return num;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
