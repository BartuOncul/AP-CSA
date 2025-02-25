public class Greeter 
{
    public String greet()
    {
        return "Hi";
    }
    public String greet(String name)
    {
        return "Hello " + name;
    }

    public static void main(String[] args)
    {
        Greeter g1 = new Greeter();
        System.out.println(g1.greet());
        System.out.println(g1.greet("Bartu"));

        Greeter g2 = new MeanGreeter();
        System.out.println(g2.greet());
        System.out.println(g2.greet("Bartu"));

    }
}

class MeanGreeter extends Greeter
{
    public String greet()
    {
        return "Go away";
    }
    public String greet(String name)
    {
        return "Go away " + name +"!";
    }
}
