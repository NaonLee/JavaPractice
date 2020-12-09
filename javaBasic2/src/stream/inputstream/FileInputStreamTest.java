package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;							//바이트단위로 읽음->문자 깨짐
		FileReader fis2 = null;								//인코딩대로 읽어옴(문자스트림)
		int i = 0;
		try {
			fis = new FileInputStream("input.txt");
			
			while((i = fis.read()) != -1) {				//-1 will be returned if there's nothing to read
				System.out.print((char)i);
			}
			System.out.println();
			fis2 = new FileReader("input.txt");
			while((i = fis2.read()) != -1) {
				System.out.print((char)i);
			}
			
			
			/*System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
				fis2.close();
			} catch (IOException e) {
				System.out.println(e);
			} catch(NullPointerException e) {
				System.out.println(e);
				
			}
		}
		System.out.println("end");					//Exception 처리가 안될 경우 시스템이 중단되서 출력x
	}

}
