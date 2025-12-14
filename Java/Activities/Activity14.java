package Activities;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

public class Activity14 {
	public static void main(String[] args) throws IOException {
		try {
			File inputFile = new File("src/main/resources/newfile.txt");
			boolean fstatus = inputFile.createNewFile();
			if(fstatus) {
				System.out.println("File created Successfully!:");
				FileUtils.writeStringToFile(inputFile, "Some text into the file", Charset.defaultCharset());
			}else {
				System.out.println("File already exists at path");
			}
			System.out.println("Data in File: " + FileUtils.readFileToString(inputFile, "UTF8"));
			File destDir = new File("scr/main/resourses/destDir");
			FileUtils.copyFileToDirectory(inputFile, destDir);
			File newFile = FileUtils.getFile(destDir, "newfile.txt");
			String newFileData = FileUtils.readFileToString(newFile, "UTF8");
			System.out.println("Data in new file: " + newFileData);
		}catch(IOException errMessage) {
			System.out.println(errMessage);
		}
	}
	

}
