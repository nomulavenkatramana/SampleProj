public class SingletonClass {
    private static String name;
private SingletonClass(){

    }
    public static void getFullName(String firstName,String lastName ){
        name=firstName+" " +lastName;
        System.out.println(name);
    }
    public static void main(String[] args) {
        SingletonClass sc=new SingletonClass();
        sc.getFullName("jhon","walker");
    }
}
//class A extends SingletonClass{
//
//}
//To achieve inheritance in singleton class constructor needs to be in public/protected
