package InheritanceWithConstructor;

public class Grand_Child extends Child{

    String gender="";

    public Grand_Child(String n,int a,String g){
        super(n,a);
        gender=g;
    }
    public void show_gender(){
        System.out.println("Gender is :" + gender);
    }

}
