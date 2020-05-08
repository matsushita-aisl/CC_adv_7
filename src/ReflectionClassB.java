import java.lang.invoke.MethodHandles;



public class ReflectionClassB{
	
	
	public void execute(){
		System.out.println(this.getClass().getName() + "のexecute()メソッドが実行されました");
	}
	
	
	public static void executeS(){
		System.out.println(MethodHandles.lookup().toString() + "のexecuteS()メソッドが実行されました");
	}
}
