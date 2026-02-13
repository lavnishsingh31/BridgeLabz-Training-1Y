public class ConstructorDemo {
    int id;
    String name;
    int age;
    
    public ConstructorDemo(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
}

    
    void display() {
        System.out.println(id + " id");
        System.out.println(name + " name");
        System.out.println(age + " age");
    }
    
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo(1,"jay",25);
        cd.display();
    }
}
