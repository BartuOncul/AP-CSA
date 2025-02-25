public class Polygon 
{
    public class Triangle extends Polygon
    {
        private double base;
        private double height;

        public Triangle(double base, double height)
        {
            this.base = base;
            this.height = height;
        }
        
        public double getArea()
        {
            return 0.5 * base * height;
        }
    }

    public class Rectange extends Polygon
    {
        private double length;
        private double width;

        public double getArea()
        {
            return 1.0*length*width/2;
        }
        public String toString()
        {
            return "area: " + getArea();
        }
    }

    public class Circle extends Polygon
    {
        private double radius;

        public double getArea()
        {
            return Math.PI * radius * radius;
        }
        public String toString()
        {
            return "area:" + getArea();
        }
    }
    

    
}
