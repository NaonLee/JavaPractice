package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{		//직렬화 허용 (객체 유출)

//class Person implements Externalizable
//Custom serialization
	private static final long serialVersionUID = -8979042624550852984L;		//serial number
	
	String name;
	transient String title;				//transient: 직렬화 시 저장 x, null 로 저장됨

	public Person() {}

	public Person(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}

	public String toString() {
		return name+ ", " + title;
	}
	
}


public class SerializatonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person("Lee", "Manager");
		
		try( FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){			//save object
	
			oos.writeObject(person);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try( FileInputStream fis = new FileInputStream("serial.dat");			
				ObjectInputStream ois = new ObjectInputStream(fis)){			//save object
	
			Object obj = ois.readObject();
			if( obj instanceof Person) {
				Person p = (Person) obj;			//down cast
				System.out.println(p);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
