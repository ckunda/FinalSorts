
public class Student extends GenericItemType {

	private StudentRecord sr;
	
	public Student() { sr = new StudentRecord(); }
	public Student(int studentID, String name, float gpa) {
		sr = new StudentRecord(); 
		sr.setStudentID(studentID);
		sr.setName(name);
		sr.setGpa(gpa);
	}
	public Student(Student s1) {
		sr = new StudentRecord(); 
		sr.setStudentID(s1.sr.getStudentID());
		sr.setName(s1.sr.getName());
		sr.setGpa(s1.sr.getGpa());
	}
	public Student(StudentRecord sr) {
		sr = new StudentRecord(); 
		sr.setStudentID(sr.getStudentID());
		sr.setName(sr.getName());
		sr.setGpa(sr.getGpa());
	}
	public StudentRecord get() { return sr; }
	public void set(StudentRecord sr) { this.sr = sr; }
	@Override
	public boolean isLess(GenericItemType git) {
		return (sr.getName().compareTo(((Student) git).sr.getName()) < 0);
	}
	@Override
	public boolean isEqual(GenericItemType git) {
		return (sr.getName().compareTo(((Student) git).sr.getName()) == 0);
	}
	@Override
	public boolean isGreater(GenericItemType git) {
		return (sr.getName().compareTo(((Student) git).sr.getName()) > 0);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [s=");
		builder.append(sr);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public Object getValue() { return sr; }
}
