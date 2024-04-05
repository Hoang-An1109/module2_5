package animal;
import java.util.*;


public class Dog extends Animal{
    public Dog() {
        super("Con cho");
        System.out.println("Day la lop con");
        System.out.println(super.getName());
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Con cho an xuong");
    }

    @Override
    public int num() {
        return super.num()+5;
    }
}
