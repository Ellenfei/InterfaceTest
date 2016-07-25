/*
 * Date:2016/7/17
 * Name:Wangfei
 * Demo:AutoCloseable�ӿ���ϰ
 */
package InterfaceTest;
public class AutoCloseableDemo {
	public static void main(String[] args){
		try(MyResource mr=new MyResource()){
			mr.doSomething();
		}catch(Exception e){
			e.printStackTrace(); 
		}finally{
			
		}
	}
}
 class MyResource implements AutoCloseable{
	
	@Override
	public void close()  throws Exception{
		System.out.println("��Դ���ر��ˡ���");
	}
	public void doSomething(){
		System.out.println("I'm working....");
	}
}
