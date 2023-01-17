package CollectionsDemo;


class School {
	private String sclName;

	public School(String sclName) {
		super();
		this.sclName = sclName;
	}

	public School() {
		super();
	}
	
	
	
	public String getSclName() {
		return sclName;
	}

	public void setSclName(String sclName) {
		this.sclName = sclName;
	}



	ClassRoom cls1 = new ClassRoom("Alpha");
	ClassRoom cls2 = new ClassRoom("Beta");
	ClassRoom cls3 = new ClassRoom("Gamma"); 
}

class Student1 {
	private String stdName;
	private int rollNo;
	public Student1(String stdName, int rollNo) {
		super();
		this.stdName = stdName;
		this.rollNo = rollNo;
	}
	public Student1() {
		super();
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	
}

public class ClassRoom {
	
	
	
	public ClassRoom() {
		super();
	}
	public ClassRoom(String className) {
		super();
		this.className = className;
	}
	private String className;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	Discipline disp1 = new Discipline("English", 10, 15);
	Discipline disp2 = new Discipline("Maths", 14, 20);
	Discipline disp3 = new Discipline("Science", 8, 12);
	
	Teacher tech1 = new Teacher("Murali",disp1);
	Teacher tech2 = new Teacher("Mahesh", disp2);
	
	Student1 std1 = new Student1("Sairam", 401);
	Student1 std2 = new Student1("Vishnu", 402);
	Student1 std3 = new Student1("Manish", 403);
	Student1 std4 = new Student1("Srujan", 404);
}

class Teacher
{
	private String teacherName;
	private Discipline disp;
	public Teacher(String teacherName, Discipline disp) {
		super();
		this.teacherName = teacherName;
		this.disp = disp;
	}
	public Teacher() {
		super();
	}
	
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Discipline getDisp() {
		return disp;
	}
	public void setDisp(Discipline disp) {
		this.disp = disp;
	}



	Discipline disp1 = new Discipline("English", 10, 15);
	Discipline disp2 = new Discipline("Maths", 14, 20);
	Discipline disp3 = new Discipline("Science", 8, 12);
	
	
	
}

class Discipline
{
	private String dispName;
	private int numOfLect;
	private int numOfExercise;
	public Discipline(String dispName, int numOfLect, int numOfExercise) {
		super();
		this.dispName = dispName;
		this.numOfLect = numOfLect;
		this.numOfExercise = numOfExercise;
	}
	public Discipline() {
		super();
	}
	public String getDispName() {
		return dispName;
	}
	public void setDispName(String dispName) {
		this.dispName = dispName;
	}
	public int getNumOfLect() {
		return numOfLect;
	}
	public void setNumOfLect(int numOfLect) {
		this.numOfLect = numOfLect;
	}
	public int getNumOfExercise() {
		return numOfExercise;
	}
	public void setNumOfExercise(int numOfExercise) {
		this.numOfExercise = numOfExercise;
	}
	
	
}
