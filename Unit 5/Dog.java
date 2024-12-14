public class Dog 
{
    private String breed;
    private int age;

    public Dog(String breed, int age)
    {
        this.breed = breed;
        this.age = age;
    }
    public void updateInfo(String breed, int age)
    {
        this.breed = breed;
        this.age = age;
    }

    public void printInfo()
    {
        System.out.println("Breed: " + this.breed + ", Age: " + this.age);
    }
    public void passToAnotherMethod()
    {
        helperMethod(this);
    }
    private void helperMethod(Dog dog)
    {
        System.out.println("Helper method received: " + dog.breed);
    }


}

public class TestThis 
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Beagle", 3);

        System.out.println("Testing this Keyword:");
        dog1.printInfo();
        System.out.println("Updating Dog Info...");
        dog1.updateInfo("Labrador",5);

        dog1.printInfo();
        System.out.println("Passing Dog to Helper Method...");
        dog1.passToAnotherMethod();
    }

    
}

