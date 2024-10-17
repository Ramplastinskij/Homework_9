class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int desireForPower;

    public Slytherin(String name, int magicPower, int apparitionDistance,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int desireForPower) {
        super(name, magicPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Cunning: " + cunning);
        System.out.println("Determination: " + determination);
        System.out.println("Ambition: " + ambition);
        System.out.println("Resourcefulness: " + resourcefulness);
        System.out.println("Desire for Power: " + desireForPower);
    }

    public static void compare(Slytherin student1, Slytherin student2) {
        int score1 = student1.cunning + student1.determination + student1.ambition +
                student1.resourcefulness + student1.desireForPower;
        int score2 = student2.cunning + student2.determination + student2.ambition +
                student2.resourcefulness + student2.desireForPower;

        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны.");
        }
    }
}