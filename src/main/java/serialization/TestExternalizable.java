package serialization;

import java.io.*;

public class TestExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student_Ext st= new Student_Ext();
		st.setId(1000);
		st.setName("Raghu");
		st.setSalary(20000);
		FileOutputStream fos= new FileOutputStream("stu.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(st);
		oos.close();
		
		FileInputStream fis= new FileInputStream("stu.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Student_Ext stu=(Student_Ext)ois.readObject();
		System.out.println(stu);
		ois.close();
		
	}

}
