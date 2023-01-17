package collegeToCorporate;


public class Student {
    private String name;
    private int rollNo;
    private int mathScore;
    private int physicsScore;
    private int chemistryScore;
    private int rank;
    
    
    public Student(String name, int rollNo, int mathScore, int physicsScore, int chemistryScore) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.mathScore = mathScore;
		this.physicsScore = physicsScore;
		this.chemistryScore = chemistryScore;
	}
    
    public void setRank(int rank)
    {
    	this.rank = rank;
    }
    
    public int getRank()
    {
    	return rank;
    }
    
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return rollNo +"----"+ name +"----"+ String.format("%.2f", calPercentage()) + "----" + rank;
	}
	

	double calPercentage() {
        return (mathScore + physicsScore + chemistryScore) / 3.0;
    }
	
	public static Student[] sortByPercentage(Student s[])
	{
		Student temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=1;j<s.length;j++)
			{
				if(s[j-1].calPercentage()<s[j].calPercentage())
				{
					temp=s[j-1];
                    s[j-1]=s[j];
                    s[j]=temp;
				}
			}
		}
		return s;
	}
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.rollNo = 1001;
        student1.mathScore = 54;
        student1.physicsScore = 57;
        student1.chemistryScore = 56;
        
        
        Student student2 = new Student("Johnson", 1002, 65, 32, 86);
       
        Student student3 = new Student("Derek", 1003, 72, 56, 81);
        
        Student student4 = new Student("Monica", 1004, 89, 59, 77);
        
        Student student5 = new Student("Chandler", 1005, 50, 45, 65);
        
        Student[] studentList = {student1, student2, student3, student4, student5};
        
        System.out.println("Roll No----Name----Percentage----Rank");
        
        Student[] updatedStudentList = sortByPercentage(studentList);
        
        for(int i=0; i<studentList.length; i++)
        {
        	updatedStudentList[i].rank = (i + 1);
        }
        
        for(int j = 0; j < updatedStudentList.length; j++)
        {
        	System.out.println(updatedStudentList[j]);
        }
        
    }
}

