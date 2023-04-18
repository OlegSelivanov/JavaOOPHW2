public abstract class Animal {
    private final int height;
    private final int weight;
    private final String colorEye;

    protected Animal(int height, int weight, String colorEye) {
        this.height = height;
        this.weight = weight;
        this.colorEye = colorEye;
    }

    public abstract void animalSay();

    @Override
    public String toString() {
        return String.format("Рост: %d; Вес: %d; Цвет глаз: %s", this.height, this.weight, this.colorEye);
    }
}
