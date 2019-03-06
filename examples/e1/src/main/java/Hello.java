import com.google.gson.*;

public class Hello{
  public static String sayHello(String name){
    return "Hello " + name;
  }
  public static void main(String[] args) {
    System.out.println(Hello.sayHello("lishuai "));
  }
}