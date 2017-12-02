
public class StudentRecord {

	private int studentID;
	private String name;
	private float gpa;

	public StudentRecord() { 
		studentID = 0;
		name = new String(" ");
		gpa = 0f;
	}
	public StudentRecord(int studentID, String name, float gpa) {
		this.studentID = studentID;
		this.name = name;
		this.gpa = gpa;
	}
	public int getStudentID() { return studentID; }
	public void setStudentID(int studentID) { this.studentID = studentID;}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public float getGpa() { return gpa; }
	public void setGpa(float gpa) { this.gpa = gpa; }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentRecord [studentID=");
		builder.append(studentID);
		builder.append(", name=");
		builder.append(name);
		builder.append(", gpa=");
		builder.append(gpa);
		builder.append("]");
		return builder.toString();
	}
}
