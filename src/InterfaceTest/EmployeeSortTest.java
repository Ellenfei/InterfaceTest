/*
 * Date:2016/7/17
 * Name:Wangfei
 * Demo:Comparable�ӿ���ϰ
 */
package InterfaceTest;

import java.util.Arrays;
import java.util.Random;

class Employee implements Comparable<Employee>{
	private String name ;
	private int id;
	private double salary ;
	public Employee(String n,double s){
		name=n;
		salary=s;
		Random ID=new Random();
		id=ID.nextInt(10000000);
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public double getSalary(){
		return salary;
	}
	public int compareTo(Employee other){
		if(id<other.id){
			return -1;
		}else if(id>other.id){
			return 1;
		}else{
			return 0;
		}
	}
}
public class EmployeeSortTest {
	public static void main(String[] args){
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("Harry",30000);
		staff[1]=new Employee("Carl",35000);
		staff[2]=new Employee("Tony",80000);
		Arrays.sort(staff);//sort��������ʵ�ֶԶ����������򣬵��Ǳ���ʵ�� Comparable�ӿ�
		for(Employee e:staff)
            System.out.println("id="+e.getId()+" name��"+e.getName()+
                    " salary="+e.getSalary());
	}
}
