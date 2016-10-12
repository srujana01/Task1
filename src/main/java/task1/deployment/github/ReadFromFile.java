package task1.deployment.github;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		// Read data from a file in local system

		File file = new File("C:\\Users\\uc209259\\localFile.txt");
		//System.out.println("File Path: "+file);
		if(file.exists()){
			
			//System.out.println("File exists");
			FileReader reader = new FileReader(file);
			StringBuilder fileContent = new StringBuilder();
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			while(line!=null){
				fileContent = fileContent.append(line);
				fileContent.append(System.lineSeparator());
				line = br.readLine();
			}
			br.close();
			System.out.println(fileContent);
		}
	}

}
