package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {

//		문자 깨짐
//		try(FileInputStream fis = new FileInputStream("reader.txt")){
//			int i = 0;
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);
//			}
//		}catch(IOException e) {
//			System.out.println(e);
//		}

		//InputStreamReader: 보조스트림-생성자 매개변수로 스트림, 문자로 변환해줌(FileReader를 쓸 수도 있지만 System.in같은 바이트 단위의 경우 변환필요)
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt")) ){
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( socket.getInputStream()) );		
			//byte type -> inputstreamreader -> 문자
			br.readLine();	//read one line
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
