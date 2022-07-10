package ch04;

public class tr {
	public int studentID;
	public String studentName;
	public String address;
	
	public tr() {}
	public tr(int studentID, String studentName, String address) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println( studentID + "학번 학생의 이름은" + studentName +"이고, 주소는" + address +"입니다.");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
