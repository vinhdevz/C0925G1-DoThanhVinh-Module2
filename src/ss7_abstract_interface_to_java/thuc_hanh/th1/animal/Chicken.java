package ss7_abstract_interface_to_java.thuc_hanh.th1.animal;

import ss7_abstract_interface_to_java.thuc_hanh.th1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "Could be fried";
    }
}
