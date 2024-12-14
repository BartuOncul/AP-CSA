/**
 * Pet class (complete comments)
 *
 * @author
 * @since
 */
class Pet
{
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;
    
    public Pet(String name, int age, double weight, String type, String breed)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.breed = breed;
    }
    
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getType()
    {
        return type;
    }
    public String getBreed()
    {
        return breed;
    }
    
    public String toString()
    {
        return "his name is " + name + ", age is " + age + ", weight is " + weight + ", type is " + type + ", breed is " + breed;
    }
    
    // keep track of the name, age, weight, type of animal, and breed of the pet

    // Write a constructor, accessor (get) methods, and a toString method. Use good
    // commenting.

    // Don't forget to complete the main method in the TesterClass below!
}

public class TesterClass
{
    // main method for testing
    public static void main(String[] args)
    {
        Pet p1 = new Pet("Jack", 11, 22.5, "Golden", "white");
        Pet p2 = new Pet("Max", 17, 24.1, "Golden", "black");
        System.out.println(p1);
        System.out.println(p2);
    }
}

 
