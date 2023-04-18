import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    static {
        allAnimal.add(new Cat("Соня", "Двор терьер", "Да", "Хреновый", "21.04.2017", 10, 8, "Голубые", "да"));
        allAnimal.add(new Tiger(10, 60, "Голубые", "Африка", "12.04.2010"));
        allAnimal.add(new Dog("Тузик", "Двор терьер", "Нет", "Серо-буро-малиновый", "10.10.2010", 15, 20, "Карие", "Нет"));
        allAnimal.add(new Wolf(90, 54, "Голубые", "Россия", "06.03.1969", "Да"));
        allAnimal.add(new Chicken(10, 3, "Розовые", 20));
        allAnimal.add(new Stork(40, 15, "Желтые", 200));
    }

    public void addCat(Scanner input){
        String name;
        String breed;
        String vaccination;
        String color;
        String dateBirthday;
        int height;
        int weight;
        String colorEye;
        String wool;

        System.out.print("Кличка: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинация: ");
        vaccination = input.next();
        System.out.print("Окрас: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.allAnimal.add(new Cat(name, breed, vaccination, color, dateBirthday, height, weight, colorEye, wool));
    }

    public void addDog(Scanner input){
        String name;
        String breed;
        String vaccination;
        String color;
        String dateBirthday;
        int height;
        int weight;
        String colorEye;
        String training;

        System.out.print("Кличка: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Вакцинация: ");
        vaccination = input.next();
        System.out.print("Окрас: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие дрессировки: ");
        training = input.next();

        allAnimal.add(new Dog(name, breed, vaccination, color, dateBirthday, height, weight, colorEye, training));
    }

    public void addTiger(Scanner input){
        int height;
        int weight;
        String colorEye;
        String place;
        String date;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();

        allAnimal.add(new Tiger(height, weight, colorEye, place, date));
    }

    public void addWolf(Scanner input){
        int height;
        int weight;
        String colorEye;
        String place;
        String date;
        String leader;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();
        System.out.print("Вожак стаи: ");
        leader = input.next();

        allAnimal.add(new Wolf(height, weight, colorEye, place, date, leader));
    }

    public void addChicken(Scanner input){
        int height;
        int weight;
        String colorEye;
        int heightFly;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        heightFly = input.nextInt();

        allAnimal.add(new Chicken(height, weight, colorEye, heightFly));
    }

    public void addStork(Scanner input){
        int height;
        int weight;
        String colorEye;
        int heightFly;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        heightFly = input.nextInt();

        allAnimal.add(new Stork(height, weight, colorEye, heightFly));
    }

    void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println("----");
            index++;
        }
    }

    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showAnimal(int num){
        System.out.println(allAnimal.get(num));
        if (allAnimal.get(num) instanceof Home){
            ((Home)allAnimal.get(num)). impact();
        }
        if (allAnimal.get(num) instanceof BirdFly){
            ((BirdFly)allAnimal.get(num)).toFly();
        }
    }

    void animalSay(int num) {
        allAnimal.get(num).animalSay();
    }

    void sayAllAnimals(){
        for (Animal animal : allAnimal) {
            animal.animalSay();
        }
    }
}
