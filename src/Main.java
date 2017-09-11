public class Main {

	public static void main(String[] args) implements StudentGroup {

	    StudentGroup sg=new StudentGroup();
		Date d=new Date(1997,8,10);
		Student s1 =new Student(20,"rak",c,89,0);
		sg.addFirst(s1);
		System.out.println(sg.getStudent(0).getId());//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}
