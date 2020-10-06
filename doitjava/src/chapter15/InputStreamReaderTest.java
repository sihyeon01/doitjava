package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\yn-16\\git\\doitjava\\doitjava\\bin\\chapter15\\reader.txt"))) {
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
