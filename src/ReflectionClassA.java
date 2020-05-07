
public class ReflectionClassA{
	public void execute(){
		System.out.println(this.getClass().getName() + "のexecute()メソッドが実行されました");
	}
	
	
	public static void executeS(){
		System.out.println("ReflectionClassAのexecuteS()メソッドが実行されました");
	}
}
