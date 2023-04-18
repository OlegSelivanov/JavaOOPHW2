public class Tiger extends WildAnimal {

    protected Tiger(int height, int weight, String colorEye, String place, String date) {
        super(height, weight, colorEye, place, date);
    }

    @Override
    public void animalSay() {
        System.out.println("Тигр сказал - Р-р-р-р-р");
    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
    }
}

