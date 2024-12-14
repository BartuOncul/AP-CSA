public class Test 
{
    private String breed;
    private static int dogNum;

    public Test(String breed)
    {
        this.breed = breed;
        dogNum++;
    }
    public String getBreed()
    {
        return breed;
    }
    public static int getDogCount()
    {
        return dogNum;
    }


}
public class TestStatic 
{
    public static void main(String[] args) {
        {
            Test dog1 = new Test("Golden Retriever");
            Test dog2 = new Test("Boeage");
            Test dog3 = new Test("Poodle");

            System.out.println("Testing Static Field and Method");
            System.out.println("Dog1 Breed: " + dog1.getBreed());
            System.out.println("Dog2 Breed: " + dog2.getBreed());
            System.out.println("Dog3 Breed: " + dog3.getBreed());

            System.out.println("Total dogs created: " + Test.getDogCount());
        }
    }
}
