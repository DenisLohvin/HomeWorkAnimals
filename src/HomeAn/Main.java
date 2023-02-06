package HomeAn;

public class Main {


    public static void main(String[] args) {
        Animals CatMary = new Cat("Mary");
        CatMary.run(150);
        CatMary.swim(0);

        Animals dogMuhtar = new DOG("Muhtar");
        dogMuhtar.run(495);
        dogMuhtar.swim(10);


        DOG.getInstancesNumber();
        Cat.getInstancesNumber();
        Animals.getInstancesNumber();
    }
}

