/*to call private constructor outside the class*/


class Const{
	private void Const(){
		System.out.println("hello guys i'm outside the class");
	}
	public static Const createInstance(){
		return new Const();
	}

}
Const ob = Const.createInstance();
