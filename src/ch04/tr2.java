package ch04;

public class tr2 {

	public static void main(String[] args) {

		tr studentLee = new tr();

		studentLee.studentID = 12345;
		studentLee.setStudentName("LLLee");
		studentLee.address = "서울 강남구";
		studentLee.showStudentInfo();
		
		tr studentKim = new tr(555555,"Kimmm","사우디");
		studentKim.showStudentInfo();
		
		System.out.println(studentKim.getStudentName() + studentLee.getStudentName());
	}

}
 