package abstract_interface.animal_edible.animal;

import abstract_interface.animal_edible.animal.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal:animals) {
            System.out.println(animal.makeSound());;

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
