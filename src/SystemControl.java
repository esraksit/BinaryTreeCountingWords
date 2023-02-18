import java.io.IOException;

public class SystemControl {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader();
		String inputText="input.txt";
		String outputText="output.txt";
		reader.read(inputText);
	}

}
