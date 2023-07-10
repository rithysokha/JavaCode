package exercise8;
class Animal {

    public void makeSound() {
        System.out.println("Animal make sound.");
    }
}
//class Dog inherit from class animal
class Dog extends Animal {
    public void makeSound() {
        System.out.print("Sound of Dog: ");
    }
    public void speak(){
        System.out.println("wof wof");
    }
}
//class Cat inherit from class animal
class Cat extends Animal {
    public void makeSound() {
        System.out.print("Sound of Cat: ");
    }
    public void speak(){
        System.out.println("meow meow");
    }
}
//take collection of animall
class Zoo{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.makeSound();
        dog.makeSound();
        dog.speak();
        cat.makeSound();
        cat.speak();
    }
}