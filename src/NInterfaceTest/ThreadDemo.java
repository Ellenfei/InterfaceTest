/*
 * Date:2016/7/23
 * Name:Wangfei
 * Demo:Thread�ӿ���ϰ
 */

package NInterfaceTest;
class Tick extends Thread{
	private int a=50;
	private String name;
	public Tick(String name){
		this.name=name;
	}
	public void run(){
		while(true){
			if(a>0){
				System.out.println(this.name+"sail---"+a--);
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args){
		Tick t1 =new Tick("����1");
		Tick t2 =new Tick("����2");
		Tick t3 =new Tick("����3");
		t1.start();
		t2.start();
		t3.start();
	}
}
