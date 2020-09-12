package InheritanceWithConstructor;

public class Child extends Parent{
    int age=0;

    public Child (String n,int a){
        super(n);
        age=a;
    }
    public void show_age(){
        System.out.println("Age is:"+age);
    }
}
