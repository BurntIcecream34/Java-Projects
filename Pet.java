public class Pet
{
    private String name;
    private String type;

    public Pet(String n, String t)
    {
       name = n;
       type = t;
    }
    public String getType(){
      return type;
    }
    public String getName(){
      return name;
    }

    public void speak()
    {
      System.out.println("grr!");
    }
    public static void main(String[] args)
    {
        Pet p = new Pet("Sammy","hamster");
        System.out.println(p.getType());
        p.speak();

        Dog d = new Dog("Fido");
        System.out.println(d.getType());
        d.speak();
        Cat c = new Cat("Fluffy");
        System.out.println(c.getType());
        c.speak();
        Lion l = new Lion("Fluffy");
        System.out.println(l.getType());
        l.speak();
        
    }
 }

 // Complete the Dog class
 class Dog extends Pet
 {
     public Dog(String theName) {
         super(theName, "dog");
     }
     
     @Override
     public void speak() {
         System.out.println("Woof!");
     }
 }

 // Add a Cat class
 class Cat extends Pet
 {
     public Cat(String theName) {
         super(theName, "cat");
     }
     
     @Override
     public void speak() {
         System.out.println("Meow!");
     }
 }
 
 class Lion extends Pet
 {
     public Lion(String theName) {
         super(theName, "lion");
     }
     
     @Override
     public void speak() {
         System.out.println("Roar!");
     }
 }
