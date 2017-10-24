import java.io.*;

class Kopiuj {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println("Poprawne wykonanie:  java Kopiuj plikWe plikWy");
		} else {
			String inputName = args[0];
			String outputName = args[1];
			FileReader fileReader = new FileReader(inputName);
			FileWriter fileWriter = new FileWriter(outputName);

			int c;

			while ((c = fileReader.read()) != -1) {
				if (Character.isUpperCase(c)) {
					c = Character.toLowerCase(c);
					fileWriter.write(c);
				} else {
					c = Character.toUpperCase(c);
					fileWriter.write(c);
				}
			}

			fileReader.close();
			fileWriter.close();
		}
	}
}