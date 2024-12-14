public class User 
{
    private String name;
    private int age;
    private double GPA;

    public User()
    {
        name = "guest";
        age = 18;
        GPA = 90.0;
    }

    public User(String name, int age, double GPA)
    {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public void userInfo()
    {
        System.out.println("Name is " + name +", age is " + age + ", and the GPA is " + GPA);
    }

    public static void main(String[]args)
    {
        User u1 = new User();
        User u2 = new User("Emre", 28, 96.28);

        u1.userInfo();
        u2.userInfo();
        
    }

}
