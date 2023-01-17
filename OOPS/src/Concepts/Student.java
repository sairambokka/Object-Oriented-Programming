package Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private int rollNo;
    private int mathScore;
    private int physicsScore;
    private int chemistryScore;
    private int rank;
    private static int idGen = 400;
    
    
    public Student(String name, int mathScore, int physicsScore, int chemistryScore) {
		super();
		this.name = name;
		this.rollNo = ++idGen;
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
		this.rollNo = ++idGen;
	}

	@Override
	public String toString() {
		return rollNo +"----"+ name +"----"+ String.format("%.2f", calPercentage()) + "----" + rank;
	}
	

	double calPercentage() {
        return (mathScore + physicsScore + chemistryScore) / 3.0;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.mathScore = 54;
        student1.physicsScore = 57;
        student1.chemistryScore = 56;
        
        
        Student student2 = new Student("Johnson", 65, 32, 86);
       
        Student student3 = new Student("Derek", 72, 56, 81);
        
        Student student4 = new Student("Monica", 89, 59, 77);
        
        Student student5 = new Student("Chandler", 50, 45, 65);
        
        
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        
        Collections.sort(students, new compareByPercentage());
        
        System.out.println("Roll No----Student Name----Percentage----Rank");
       
        for(int i = 0; i < students.size(); i++)
        {
        	students.get((students.size() - i) - 1).setRank(i + 1);
        }
        
        for(int j = 0; j < students.size(); j++)
        {
        	System.out.println(students.get(students.size()-1 - j));
        }
    }
}

class compareByPercentage implements Comparator<Student>
{
	public int compare(Student std1, Student std2)
	{
		return (int) (std1.calPercentage() - std2.calPercentage());
	}
}