package HomeAn;

public abstract class Animals {
    private static int counter;
    private final String name;

    public Animals(String name){
        this.name = name;
        counter++;
    }
    public  String getName(){
        return name;
    }
    public abstract void run(int distance);
    public abstract void swim(int distance);
    public static void getInstancesNumber(){
        System.out.println("Number of animals running on the track :" + counter );
    }
}

