
public class ReflectionClassB{
	
	
	public void execute(){
		System.out.println(this.getClass().getName() + "のexecute()メソッドが実行されました");
	}
	
	
	public static void executeS(){
		System.out.println("ReflectionClassBのexecuteS()メソッドが実行されました");
	}
}
