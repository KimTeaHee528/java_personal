package ch09;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		korea = new Subject();
		math = new Subject();
	}
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showScoreInFo() {
		int total = korea.score + math.score;

		System.out.println(korea.subjectName + "학생의 점수는");
		System.out.println("국어" + korea.score + " 수학" + math.score);
		System.out.println("총점은" + total + "입니다.");
	}
}
