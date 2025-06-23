/*program to print default value of all datatype*/
class dataType{
	byte b;
	short s;
	int i;
	long l;
	char c;
	float f;
	double d;
	boolean B;
		public void def(){
			System.out.println(b);
			System.out.println(s);
			System.out.println(i);
			System.out.println(l);
			System.out.println(c);
			System.out.println(f);
			System.out.println(d);
			System.out.println(B);
	}
	public static void main(String aa[]){
		dataType ob = new dataType();
		ob.def();
	}
}
		