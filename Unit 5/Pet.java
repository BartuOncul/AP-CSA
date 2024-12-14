
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
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public String toString()
    {
        return name + ", " + age + ", " + weight + ", " + type + ", " + breed;
    }

}

public class TesterClass
{
    // main method for testing
    public static void main(String[] args)
    {
        Pet p1 = new Pet("Max", 12, 14.3, "Golden", "white");
        Pet p2 = new Pet("Piyer", 17, 21.2, "Stugish", "black");
        System.out.println(p1);
        System.out.println(p2);
        p1.setName("Toby");
        p1.setAge(4);
        p1.setWeight(9.2);
        p1.setType("Sesan");
        p1.setBreed("Grey");
        System.out.println(p1);
              

    }
}

 
