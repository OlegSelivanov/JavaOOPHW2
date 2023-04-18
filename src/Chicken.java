public class Chicken extends Bird implements BirdFly{

    protected Chicken (int height, int weight, String colorEye, int heightFly) {
        super(height, weight, colorEye, heightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на %d метрах", super.getHeightFly());
    }

    @Override
    public void animalSay() {
        System.out.println("Курица сказала - куд-куда");
    }

    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }
}
