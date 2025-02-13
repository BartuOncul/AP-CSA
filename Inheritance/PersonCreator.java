public class PersonCreator 
{
    public class GrandParent
    {
        private String name;
        private int age;

        public GrandParent(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public void gelir()
        {
            System.out.println("emeklilik");
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public void run()
        {
            System.out.println("slow"); 
        }

    }

    public class Parent extends GrandParent
    {
        private double height;
        private String meslek;

        public Parent(String name, int age, String meslek, double height)
        {
            super(name, age);
            this.height = height;
            this.meslek = meslek;
        }

        public void run()
        {
            System.out.println("medium");
        }

        public String getMeslek()
        {
            return meslek;
        }

        public void setMeslek(String yeniMeslek)
        {
            meslek = yeniMeslek;
        }

    }


    public class Child extends Parent
    {
        private String position;
        private double GPA;

        public Child(String name, int age, String meslek, double height, String position, double GPA)
        {
            super(name, age, meslek, height);
            this.position = position;
            this.GPA = GPA;
        }
        
        public void run()
        {
            System.out.println("fast");
        }

        public String getPosition()
        {
            return position;
        }
        public void setPosition(String newPosition)
        {
            position = newPosition;
        }
        public double getGPA()
        {
            return GPA;
        }

        
    }
}
