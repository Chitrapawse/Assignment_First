/*
        Q.1] Concept of Class and Object
        i. Write a program to create ‘Student’ class with rollNo and name as two instance
        variables.
        ii. Create two objects student1, student2 for the Student class and assign any
        appropriate values to the objects. Display the Object content on a Console
  */
package Assignment1;
class  Student
{
    int rollNo;
    String name;

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.rollNo = 1;
        s1.name = "Chitra";
        s2.rollNo = 2;
        s2.name = "Madhuri";


        System.out.println("Roll no of Student1 is:\t"+s1.rollNo);
        System.out.println("Name  of  Student1 is:\t"+s1.name);
        System.out.println("Roll no of Student2 is:\t"+s2.rollNo);
        System.out.println("Name  of  Student2 is:\t"+s2.name);

    }
}

/*output
Roll no of Student1 is:	1
Name  of  Student1 is:	Chitra
Roll no of Student2 is:	2
Name  of  Student2 is:	Madhuri

 */