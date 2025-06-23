// we cannot make abstract class object.
// if we want to implement their method then we have to extend it then only we can override their method.
// if method is abstract then class will also be an abstract type.

abstract class B{
   abstract void show();
}

public class A extends B {
    void show(){
        System.out.println("parent class abstract method called");
    }
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
    }
}
