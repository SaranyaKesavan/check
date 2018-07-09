	
	
interface GenericInterface<T>
{
    void setT(T t);
 
    T getT();
}
 
//Changing the type of parameter passed to GenericInterface while implementing
 
class GenericClass<V> implements GenericInterface<V>
{
    V t;
 
    @Override
    public void setT(T t)    //Changing the type of parameter
    {
        this.t = t;
    }
 
    @Override
    public V getT()          //Changing the return type
    {
        return t;
    }
}
/*public class NewClass {
    public static void main(String []args)
    {
        
    }
    
}*/

