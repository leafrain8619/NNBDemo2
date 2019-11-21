import java.io.*;
import java.lang.*;
public class Dog
{
    String name;
    public Dog(String name1)
   {
      name = name1;
      System.out.println("name");
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args)
   {
    Dog dog = new Dog("Amy"); 
    System.out.println(dog.getName());
   }
}