<<<<<<< HEAD
<<<<<<< HEAD
import java.io.*;

class Czytanie {
	final static int ogr = 200;
	static int count;
	static String[] line = new String[ogr];
	final static int max = 16;

	public static void main(String[] args) throws IOException {
		if (args.length < 1)
			System.out.println("Poprawne wywolanie pliku java Czytanie plik");
		else {
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
			String thisLine = null;
			count = 0;
			String[] octal = new String[ogr];
			StringBuffer[] stringBuffer = new StringBuffer[ogr];

			while ((thisLine = bufferedReader.readLine()) != null) {
				if (thisLine.length() > 0)
					line[count++] = thisLine;

			}

			int i, j;

			for (i = 0; i < count; i++) {
				stringBuffer[i] = new StringBuffer("");
				octal[i] = Integer.toOctalString(Integer.parseInt(line[i]));
				if (octal[i].length() < max)
					for (j = octal[i].length(); j < max; j++)
						stringBuffer[i].append(".");

			}
			for (i = 0; i < count; i++) {
				stringBuffer[i].append(octal[i]);
				System.out.println(stringBuffer[i]);
			}
		}

	}
}
=======
=======
import java.io.*;
>>>>>>> c2644577fbd97653a52c2fe7e621b8a80d6222e7

class Czytanie {
	final static int ogr = 200;
	static int count;
	static String[] line = new String[ogr];
	final static int max = 16;

	public static void main(String[] args) throws IOException {
		if (args.length < 1)
			System.out.println("Poprawne wywolanie pliku java Czytanie plik");
		else {
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
			String thisLine = null;
			count = 0;
			String[] octal = new String[ogr];
			StringBuffer[] stringBuffer = new StringBuffer[ogr];

			while ((thisLine = bufferedReader.readLine()) != null) {
				if (thisLine.length() > 0)
					line[count++] = thisLine;

			}

			int i, j;

			for (i = 0; i < count; i++) {
				stringBuffer[i] = new StringBuffer("");
				octal[i] = Integer.toOctalString(Integer.parseInt(line[i]));
				if (octal[i].length() < max)
					for (j = octal[i].length(); j < max; j++)
						stringBuffer[i].append(".");

			}
			for (i = 0; i < count; i++) {
				stringBuffer[i].append(octal[i]);
				System.out.println(stringBuffer[i]);
			}
		}

	}
}
>>>>>>> 65dbaebcba7fee5607553c0fe25ef12ef042731e
