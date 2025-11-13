package ss7_abstract_interface_to_java.thuc_hanh.th1;

import ss7_abstract_interface_to_java.thuc_hanh.th1.animal.Animal;
import ss7_abstract_interface_to_java.thuc_hanh.th1.animal.Chicken;
import ss7_abstract_interface_to_java.thuc_hanh.th1.animal.Tiger;
import ss7_abstract_interface_to_java.thuc_hanh.th1.edible.Edible;
import ss7_abstract_interface_to_java.thuc_hanh.th1.fruit.Apple;
import ss7_abstract_interface_to_java.thuc_hanh.th1.fruit.Fruit;
import ss7_abstract_interface_to_java.thuc_hanh.th1.fruit.Orange;

public class AnimalAndInterfaceEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
