package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentKimmm = new Student(01, "kimmm");
		studentKimmm.korea.subjectName = "국어";
		studentKimmm.korea.score = 80;
		studentKimmm.setMathSubject("수학", 100);
		studentKimmm.showScoreInFo();

		Student studentLeee = new Student(02, "Leee");
		studentLeee.korea.subjectName = "국어";
		studentLeee.korea.score = 95;
		studentLeee.setMathSubject("수학", 95);
		studentLeee.showScoreInFo();
	}

}
