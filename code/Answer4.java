public class Answer4 {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("DOG");
        a1.sound();

        Animal a2 = AnimalFactory.getAnimal("CAT");
        a2.sound();
    }
}

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: woof!");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat says: meow!");
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}


