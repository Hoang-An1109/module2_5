package animal;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();

        Animal animal=new Animal();

        dog.eat();
        animal.eat();

        System.out.println("Con so: "+dog.num());
        System.out.println("Con so: "+animal.num());
    }
}
