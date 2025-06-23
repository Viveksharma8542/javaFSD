// calling of constructor
//example of method overloading
public class Const {
    int x;
    int y;
    Const(){
        System.out.println("constructor  called");
    }
    
    Const(int p,int q)
    {
        x = p;
        y = q;
    }
    public static void main(String[] args) {
        Const ob1 = new Const();
        // Const ob = new Const(5,6);
        System.out.println(ob1.x);
        System.out.println(ob1.y);
    }
}  