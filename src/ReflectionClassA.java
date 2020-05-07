
public class ReflectionClassA {
	public void execute(){
		System.out.println(this.getClass().getName() + "のexecute()が実行されました");
	}
	public static void executeS(){
		System.out.println("ReflectionClassAのexecute()が実行されました");
	}
}
