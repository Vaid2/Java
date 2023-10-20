/*class Student implements Serializable
	rollno
	name

create 2 objects of Student , store them inside ArrayList and store that ArrayList inside the file.

now read from file , the ArrayList and traverse it using Iterator
*/


import java.io.*;
import java.util.*;
class Student implements Serializable
{
		private int rollno;
		private String name;
		
		public int getRollno() {
			return rollno;
		}
			public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + "]";
		}
		
}
public class ArrayList_Serialization_Demo
{
	public static void main(String args[])
	{
		List<Student>mylist=new ArrayList<Student>();
		Student s1=new Student();
		Student s2=new Student();
		s1.setRollno(1);
		s1.setName("Abc");
		s2.setRollno(2);
		s2.setName("Xyz");
		mylist.add(s1);
		mylist.add(s2);
		FileOutputStream fos=null;
		FileInputStream fis=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		try
		{
			fos=new FileOutputStream("C:\\CDAC\\Java SE\\Day_13\\Generics_and_Collection\\Collection_API\\Serialization_in_Collection\\vaibhav\\vaibhav.txt");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try
		 {
			oos=new ObjectOutputStream(fos);
		}
		 catch (IOException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			oos.writeObject(mylist);
		} 
		catch (IOException e) 
		{		
			e.printStackTrace();
		} // serialization
		try 
		{
			fis=new FileInputStream("C:\\CDAC\\Java SE\\Day_13\\Generics_and_Collection\\Collection_API\\Serialization_in_Collection\\vaibhav\\vaibhav.txt");
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}
		try 
		{
			ois=new ObjectInputStream(fis);
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		List<?> ref=null;
		try {
			ref=(List<?>) ois.readObject();
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		Iterator<?> itr=ref.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}