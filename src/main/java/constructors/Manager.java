package constructors;
class Student {
	String id;
	String name;
	int age;
	String course;

	
	Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	Student(String id, String name, int age, String course) {

/*		this.id = id;
		this.name = name;
		this.age = age;*/
		this(id, name, age);
		this.course = course;

	}

	void display() {
		System.out.println(id + " " + name + " " + age + " " + course);
	}
}

public class Manager {
	public static void main(String args[]) {
		//Student s1 = new Student("100", "John", 18);
		//Student s11 = new Student("100", "John", 18, "Java"); // Calling parameterized constructor
		Student s2 = new Student("101", "Adam", 20, "Hadoop"); // Calling parameterized constructor
		//s1.display();
		s2.display();
	}
}