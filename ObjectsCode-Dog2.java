public class Dog2
{
    private String breed, name;

    Dog2(String name)
    {           
        this.name = name;       
    }

    public void setBreed(String name)
    {
        breed =  name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void bark() 
    { 
        System.out.println("My " + breed + " " + name + " is barking!"); 
    }
 }
