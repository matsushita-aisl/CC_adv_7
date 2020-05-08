import java.lang.invoke.MethodHandles;



public class ReflectionClassA{
	
	
	public void execute(){	//オブジェクトから呼び出すならここもフレキシブルにできる
		System.out.println(this.getClass().getName() + "のexecute()メソッドが実行されました");
	}
	
	
	public static void executeS(){	//staticでもMethodHandles::lookupにより可能
		System.out.println(MethodHandles.lookup().toString() + "のexecuteS()メソッドが実行されました");
	}
}
