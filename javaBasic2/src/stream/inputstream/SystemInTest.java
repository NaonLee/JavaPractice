package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("Input one alphabet: ");
		int i = 0;
		try {
			while((i = System.in.read()) != '\n')
				System.out.println((char)i);
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
