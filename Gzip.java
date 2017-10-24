import java.io.*;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

class Gzip {

	static void zip(String args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(args);
		FileOutputStream fileOutputStream = new FileOutputStream(args + ".gz");
		GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream);

		int data;
		while ((data = fileInputStream.read()) != -1) {
			gzipOutputStream.write(data);
		}

		fileInputStream.close();
		gzipOutputStream.close();
	}

	static void unzip(String args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(args);
		GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);
		FileOutputStream fileOutputStream = new FileOutputStream(args + "_unpacked");

		int data;
		while ((data = gzipInputStream.read()) != -1) {
			fileOutputStream.write(data);
		}

		gzipInputStream.close();
		fileOutputStream.close();
	}

	public static void main(String[] args) throws IOException {
		if (args.length < 1)
			System.out.println("Poprawne wlaczenie programu: Java Gzip plik");
		else {
			System.out.println("0.EXIT\n1.ZIP\n2.UNZIP");
			int choice;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				zip(args[0]);
				System.out.println("Plik "+ args[0] + " spakowany!");
				break;
			case 2:
				unzip(args[0]);
				System.out.println("Plik "+ args[0]+".gz" + " rozpakowany!");
				break;
			}
		}
	}

}