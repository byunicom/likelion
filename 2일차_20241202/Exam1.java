public class Exam1{
	String name="Kim Dong-gyu";
	String gender="Male";
	String email="byunicom@gmail.com";

	public static void main(String[] args){
		Exam1 h = new Exam1();	//실체를 만드는 것! Hello라는 설계도를 이용해서 h 라는 인스턴스가 만들어짐
		System.out.println("이름 : "+ h.name+ ", 성별 : "+h.gender+", 이메일 : "+h.email);
	}
}