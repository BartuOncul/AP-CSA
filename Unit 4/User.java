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
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[]args)
    {
        User u1 = new User();
        User u2 = new User("Emre", 28, 96.28);

        //u1.userInfo();
       // u2.userInfo();
       u1.setName("Bartu");
       System.out.println(u1.getName() + ", " + u2.getName());
       
        
    }

}
