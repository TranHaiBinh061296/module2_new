package abstract_interface.animal_edible.animal;

import abstract_interface.animal_edible.animal.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "chicken KFC";
    }
}
