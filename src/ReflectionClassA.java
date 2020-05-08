
public class ReflectionClassA{
	
	
	public void execute(){	//オブジェクトから呼び出すならここもフレキシブルにできる
		System.out.println(this.getClass().getName() + "のexecute()メソッドが実行されました");
	}
	
	
	public static void executeS(){	//Staticメソッド
		System.out.println("ReflectionClassAのexecuteS()メソッドが実行されました");
	}
}
