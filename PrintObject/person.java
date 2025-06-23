// program to print object and print specific message

public class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "person{name = " + name + ", age = " + age + "}";

    }

    public static void main(String aa[]) {
        person ob = new person("peter", 32);
        System.out.println("printing object :" + ob.toString());
        System.out.println("file would be checked on 20 march 24");
    }
}
