public class Car 
{
    private String color;
    private int age;
    
    public Car(String color, int age)
    {
        this.color = color;
        this.age = age;
    }
    public Car()
    {
        this.color = null;
        this.age = 0;
    }
    public void infoCar()
    {
        System.out.println("The color is " + color + " the age is " + age);
    }
    

    public static void main(String[] args) 
    {
        Car car1 = new Car("blue", 12);
        Car car2 = new Car("red", 7);
        Car car3 = new Car("yellow", 3);

        car1.infoCar();
        car2.infoCar();
        car3.infoCar();
    }

