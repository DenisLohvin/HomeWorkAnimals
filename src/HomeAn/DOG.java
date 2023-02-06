package HomeAn;

public class DOG extends Animals {
    private static int counter;

    public DOG(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.printf("%s ran %dm\n", getName(), distance);
            return;
        }
        System.out.println("Unreachable distance. Change parameter!");
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.printf("%s swam %dm\n", getName(), distance);
            return;
        }
        System.out.println("Unreachable distance. Change parameter!");
    }

    public static void getInstancesNumber() {
        System.out.println("Dog was invoked " + counter + " times.");
    }
}

