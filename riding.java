package demo;
class Animal{
	void sound() {
		System.out.println("animals make sound");
	}
	
}
class Dog extends Animal{
	void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("cat meows");
	}
}

public class Riding {
	public static void main(String[] args) {
		Animal a1=new Animal();
		Animal a2=new Dog();
		Animal a3=new Cat();
		a1.sound();
		a2.sound();
		a3.sound();
	}

}s