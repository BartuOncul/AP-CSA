public class PersonMain 
{
    public static void main(String[] args)
    {
        PersonCreator creator = new PersonCreator();

        PersonCreator.GrandParent myGrandParent = creator.new GrandParent("Arda", 97);
        PersonCreator.Parent myParent = creator.new Parent("Ramazan", 72, "Bekçi", 1.73);
        PersonCreator.Child myChild = creator.new Child("Bartu", 18, "student", 1.84, "Hisar", 93.03);

        System.out.println("My Grandparent's name is : " + myGrandParent.getName());
        System.out.println("His age is " + myGrandParent.getAge());
        myGrandParent.run();
        myGrandParent.gelir();

        System.out.println(); // 1 SPACE BOSLUK

        System.out.println("My parent's name is " + myParent.getName());
        System.out.println("His age is " + myParent.getAge());
        myParent.run();

        System.out.println("My parent's job is " + myParent.getMeslek());
        myParent.setMeslek("Tamirci");
        System.out.println("My parent's NEW job is " + myParent.getMeslek());

        System.out.println();  // 1 SPACE BOSLUK

        System.out.println("My child's name is " + myChild.getName());
        System.out.println("His age is: " + myChild.getAge());
        myChild.run();

        System.out.println("My child's position is " + myChild.getPosition());
        myChild.setPosition("CIO");
        System.out.println("My child's NEW position is " +myChild.getPosition());
        System.out.println("His GPA was " + myChild.getGPA());








        }
}
