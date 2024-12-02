public class Hello{
	//String name="kang";		//#1 
	
	static String name="kang";	//#2

	public static void main(String[] args){
		System.out.println("1");
		System.out.println("hello");
		System.out.println(name);	//#1 이렇게 하면 오류 발생 (#2 static 이라는 keyword 를 붙여주면 실행된다.)

		Hello h = new Hello();	//실체를 만드는 것! Hello라는 설계도를 이용해서 h 라는 인스턴스가 만들어짐
		System.out.println(h.name);
	}
}