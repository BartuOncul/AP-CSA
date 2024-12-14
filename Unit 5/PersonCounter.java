public class Person
{
    private String name;
    private String email;
    private String phoneNumber;

    public static int personCounter = 0;

    // static method to print out counter
    public static void printPersonCounter()
    {
        System.out.println("Person counter: " + personCounter);
    }

    // constructor: construct a Person copying in the data into the instance
    // variables
    public Person(String initName, String initEmail, String initPhone)
    {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        personCounter++;
    }

    public String toString()
    {
        return name + ": " + email + " " + phoneNumber;
    }

    public static void main(String[] args)
    {
        // call the constructor to create a new person
        Person p1 = new Person("Sana", "sana@gmail.com", "123-456-7890");
        Person p2 = new Person("Jean", "jean@gmail.com", "404 899-9955");

        Person.printPersonCounter();
    }
}

