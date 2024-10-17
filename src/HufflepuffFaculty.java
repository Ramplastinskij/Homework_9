class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public void printDescription() {
        super.printDescription();
        System.out.println("Diligence: " + diligence);
        System.out.println("Loyalty: " + loyalty);
        System.out.println("Honesty: " + honesty);
    }
    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.diligence + student1.loyalty + student1.honesty;
        int score2 = student2.diligence + student2.loyalty + student2.honesty;

        if (score1 > score2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны.");
        }
    }
}