
public class App
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("worlder"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
