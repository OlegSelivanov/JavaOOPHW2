public class Stork extends Bird implements BirdFly{

    protected Stork(int height, int weight, String colorEye, int heightFly) {
        super(height, weight, colorEye, heightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на высоте %d метров", super.getHeightFly());
    }

    @Override
    public void animalSay() {
        System.out.println("Аист сказал так-так-так-так");
    }

    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }
}
