class SuperX {
    SuperX(){
        System.out.println("super class constructor called");
    }
    
}
 class Box extends SuperX{
    
    Box(){

        super();
        System.out.println("child class ");
       
    }
    public static void main(String[] args) {
        Box ob  = new Box();
  
        
    }
 }



 
