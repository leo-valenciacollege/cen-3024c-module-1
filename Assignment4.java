package cop2805;

import java.io.*;
import java.util.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class Assignment4 {

	public static void main(String[] args) {
		
		//Path to read file to with data
		Path readFile = Paths.get("data.txt");
		//Path to write file to with data
		Path writeFile = Paths.get("data-sorted.txt");
		//create an Array list to store values
		List<Double> readList = new ArrayList<Double>();

		//assign list to return list variable from
		readList = ReadFile(readFile);
		//sort readList
		Collections.sort(readList);
		//WriteFile function to write sorted list to file
		WriteFile(readList, writeFile);
	}
	
	//function to read data from file
	public static List<Double> ReadFile(Path file) {
		
		//create an Array list to store values
		List<Double> list = new ArrayList<Double>();
		
		try(BufferedReader bufferedReader = Files.newBufferedReader(file, Charset.defaultCharset())){
			
			String line = bufferedReader.readLine();
			while (line != null) {
				//add line from file to Collection list
				list.add(Double.parseDouble(line));
				line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//function to write data to file
	public static void WriteFile(List<Double> data, Path file) {
		
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, Charset.defaultCharset(),
				StandardOpenOption.CREATE); PrintWriter printWriter = new PrintWriter(bufferedWriter)) {			
			
			//loop through list and write data to new file
			for(Object item : data) {
				printWriter.println(item);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
