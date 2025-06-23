package DynamicMethodDispatch;

 class B {
    void show(){
    System.out.println("class b");
    }
}
public class A extends B{
    void get(){
        System.out.println("class a");
    }
    public static void main(String[] args) {
    A ob = new B();
        ob.get();
    }
}

 