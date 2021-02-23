package _07_abstract_class_interface.Practices;

import _07_abstract_class_interface.Practices._animal.Animal;
import _07_abstract_class_interface.Practices._animal.Tiger;
import _07_abstract_class_interface.Practices._animal.Chicken;
import _07_abstract_class_interface.Practices._edible.Edible;
import _07_abstract_class_interface.Practices._fruit.Apple;
import _07_abstract_class_interface.Practices._fruit.Fruit;
import _07_abstract_class_interface.Practices._fruit.Orange;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
