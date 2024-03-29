package ej1LeerArchivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		
		try {
			br= new BufferedReader(new FileReader("src/ej1LeerArchivoCSV/vial.csv"));
			String line = br.readLine();
			while (null!=line) {
				String [] fields = line.split(",");
				System.out.println(Arrays.toString(fields));
				
				//fields = removeTrailingQuotes(fields);
				System.out.println(Arrays.toString(fields));
				
				line = br.readLine();	
			}
				
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if(null!=br) {
				br.close();
			}
		}

		
		
		
	}

}
