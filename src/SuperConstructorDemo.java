class Person {

    // Parent class constructor
    Person() {
        System.out.println("Person class");
    }
}

class Student extends Person {

    // Child class constructor
    Student() {
        super(); // calls Person class constructor
        System.out.println("Student class");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {

        Student s = new Student();

    }
}
