package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		try( FileInputStream fis = new FileInputStream("input2.txt")){		//auto closeable
			byte[] arr = new byte[10];
			int i = 0;
			
			/*while((i = fis.read(arr)) != -1) {
				for(byte b : arr)
					System.out.print((char)b);				//Garbage value will be printed as well
				System.out.println();
			}*/
			
			while((i = fis.read(arr)) != -1) {
			for(int j = 0; j < i; j++) 
				System.out.print((char)arr[j]);		
			System.out.println();	
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
