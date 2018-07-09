
	
class GenericClass<T> extends Exception
{
    //Compile time error
}
public class GenericsInJava
{
    public static void main(String[] args)
    {
        //GenericClass<Number> gen[] = new GenericClass<Number>[10];   //Compile time error
 
        //GenericClass<?> gen1[] = new GenericClass<?>[10];    //But, this is fine
    }
}
