public abstract class Bird extends Animal{
    protected int heightFly;

    public int getHeightFly() {
        return this.heightFly;
    }

    protected Bird(int height, int weight, String colorEye, int heightFly) {
        super(height, weight, colorEye);
        this.heightFly = heightFly;
    }
}
