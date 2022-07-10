package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentKimmm = new Student(01, "kimmm");
		studentKimmm.setKoreaSubject("국어", 95);
		studentKimmm.setMathSubject("수학", 100);
		studentKimmm.korea.score = 80;
		studentKimmm.showScoreInFo();
	}

}
