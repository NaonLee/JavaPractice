package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
//From java 10		
//		FileOutputStream fos = new FileOutputStream("");
//		try(fos){
//		
//		}catch(IOException e) {
//			
//		}

		byte[] arr = new byte[26];
		byte data = 65;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = data++;
		}

		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){		//default:false - overwrite, true: append
			fos.write(arr);
			fos.write(arr, 2, 10);		//write array, from index 2, amount length 10
		}catch(IOException e) {
			
		}
		System.out.println("End");
	}

}
