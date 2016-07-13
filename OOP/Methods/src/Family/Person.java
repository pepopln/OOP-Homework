package Family;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %d",this.name,this.age);
    }
//    public void sayHelloByName() {
//        this.name = name;
//        System.out.println(String.format("%s says \"Hello\"!",this.name));
//    }


}
