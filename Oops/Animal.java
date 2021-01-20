package oops;

public class Animal {
    public void animalsound()
    {
        System.out.println("This how animal sounds");
    }
}
class pig extends Animal
    {
        public void animalsound()
            {
                System.out.println("wee eee");
            } 
    }
class dog extends Animal
{
     public void animalsound()
    {
        System.out.println("bow bow");
    }
}
class mymainclass
{
    public static void main(String[]args)
    {
        Animal myAnimal=new Animal();
        Animal myPig = new pig();
        Animal myDog = new dog();
        
        myAnimal.animalsound();
        myPig.animalsound();
        myDog.animalsound();
    }
}
