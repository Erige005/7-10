public class Farm {
    public static void main(String[] args) {
        Animal[] animals = {
                new Pig("Pig"),
                new Duck("Duck"),
                new Fish("Fish")
        };

        for (Animal a : animals) {
            if (a.canSwim()) {
                System.out.println(a.getName() + " có thể bơi.");
            }
        }

        for (Animal a : animals) {
            if (a.canWalk()) {
                System.out.println(a.getName() + " có thể đi.");
            }
        }
    }
}