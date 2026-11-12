public class part2 {   //CONSTRUCTOR
    public static void main(String[] args) {
        Student s1 = new Student("gauri");  //Default constructor
     Student s2= new Student(s1);
     s2.psd=  4578;
    }
}

class Student{
    String name;
    int roll;
    int psd;

    Student(Student s1){  //(copy constructor)
        this.psd=s1.psd;
    }

     Student( String name){   //self made constructor (parametarize constructor)
    this.name =name;
    System.out.println("Constructor is called");

}

Student(){      //(non parametrize )
        String name;
    }


}

 

