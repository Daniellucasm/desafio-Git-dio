import java.util.Scanner;
import java.io.*;

public class Arquivo {

	public static void main(String[] args) {
		try {
			RandomAccessFile random = new RandomAccessFile("saida.txt", "rw");
			int n = MyIO.readInt();

			for (int i = 0; i < n; i++) {
				random.seek(i * 8);
				random.writeDouble(MyIO.readDouble());
			}
			random.close();

			RandomAccessFile rnNovo = new RandomAccessFile("saida.txt", "r");

			for (int i = n - 1; i >= 0; i--) {
				rnNovo.seek(i * 8);
				MyIO.println(rnNovo.readDouble());
			}

			rnNovo.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
