import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;



public class ReflectionTest {
	static String str;

	
	public static void main(String[] args) {
		Class<?> C = null;		
		Method m = null, m1 = null;
		Object O = null;
		
		inputClassName();
		
		try{
			C = Class.forName("ReflectionClass" + str);	//入力に合わせてClassのインスタンス生成
			O = C.newInstance();	//メソッドを呼び出すためのインスタンス生成
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			e.printStackTrace();
		}
		
		try{
			m = C.getMethod("execute");	//メソッド
			m1 = C.getMethod("executeS");	//静的メソッド
		}catch(NoSuchMethodException | SecurityException e){
			e.printStackTrace();
		}
		
		try{
			m.invoke(O);	//メソッド呼び出し
			m1.invoke(null);	//静的メソッドの呼び出しにはオブジェクトインスタンスはいらない
		}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
			e.printStackTrace();
		}
	}
	
	
	static void inputClassName(){
		try(Scanner scanner = new Scanner(System.in)){
			while(true){
				System.out.print("実行するクラス名の入力してください [A/B] > ");
				str = scanner.next();
				
				if(str.equals("A") || str.equals("B")){
					break;
				}
				System.out.println("[Error]不正な入力です");
			}
		}
	}
}
