package sort;

import java.util.Arrays;
//implements Comparable<Student> 비교 인터페이스 추가
//비교할 Student를 추가
class Student implements Comparable<Student>{
	private int sno;

	public Student(int sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + "]";
	}
	//정렬 기준 정의 
	//Sorf를 위해서 Comparable interface를 구현하면
	//오름차순 this.sno - s.sno;
	//내림차순 s.sno - this.sno;
    @Override
    public int compareTo(Student other) {
    	Student s = (Student) other;
        return this.sno - s.sno;
    }
}

public class TestClassArraySort {

	public static void main(String[] args) {
		Student [] studArr = new Student [] { 
		new Student(15),new Student(7),new Student(3),
		new Student(1),new Student(12),new Student(6)
		};
		
		dispArr(studArr);
		
		Arrays.sort(studArr);

		dispArr(studArr);

	}

	private static void dispArr(Student[] studArr) {
		for (Student student : studArr) {
			System.out.print(student + " ");
		}
		System.out.println();
		
	}

}
