import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionTest {
	
	static public Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Class A = ReflectionClassA.class;
		Class B = ReflectionClassB.class;
		Class[] classes = {A, B};
		Method m = null;
		String str = inputClassName();
		
		for(Class c : classes){
			if(c.getName().contains(str)){
				try{
					m = c.getMethod("executeS", null);
				} catch(NoSuchMethodException e) {e.printStackTrace();}
				try{
					m.invoke(null);
				}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	static String inputClassName(){
		System.out.print("Class name > ");
		return scanner.next();
	}
}
