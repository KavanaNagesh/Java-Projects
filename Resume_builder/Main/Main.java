package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import Bo.ResumeBuilderImpl;
import Bo.UserInput;

public class Main {
	public static String fileName;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the you wish to save document in :");
		fileName = br.readLine();
		System.out.println();
		ResumeBuilderImpl res = new ResumeBuilderImpl();
		res.writeIntoFile(UserInput.UserDetails());
		System.out.println("pdf succesfully created");
		}
}
