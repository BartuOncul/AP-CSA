public class Name {
    public static void main(String[] args) 
    {
        Person p1 = new Person("Ada", "CS");
        System.out.println(p1); 

        Student stu1 = new Student("Kal", "Di", 1235); 
        System.out.println(stu1);

        Person p2 = new Student("Ret", "Think", 4543);
        System.out.println(p2); 
    }
}


class Person 
{
    private String firstName;
    private String lastName;

    public Person(String f, String l) 
    {
        firstName = f;
        lastName = l;
    }

    public String toString() 
    {
        return firstName + " " + lastName;
    }
}

class Student extends Person 
{
    private int ID;

    public Student(String f, String l, int idNum) 
    {
        super(f, l);
        ID = idNum;
    }

    @Override
    public String toString() 
    {
        return super.toString() + " ID# " + ID;
    }
}
