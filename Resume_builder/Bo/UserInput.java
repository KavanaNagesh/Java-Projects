package Bo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Dao.Education;
import Dao.User;

public class UserInput {
	public static User UserDetails() throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name,email,dob,qualification,institution,mother,father,achievement,address,objective,skill,language;
	long contact;
	double percentage;
	Education education;
	ArrayList<Education> educationList = new ArrayList<>();
	ArrayList<String> achievementList = new ArrayList<>();
	ArrayList<String> skillList = new ArrayList<>();
	ArrayList<String> languageList = new ArrayList<>();
	System.out.println("---------RESUME BUILDER---------");
	System.out.println("Enter your objective");
	objective = br.readLine();
	System.out.println("BASIC DETAILS");
	System.out.println("Enter your name");
	name = br.readLine();
	System.out.println("Enter your Email");
	email = br.readLine();
	System.out.println("Enter your contact");
	contact = Long.parseLong(br.readLine());
	while(true){
		System.out.println("Enter your technical skills");
		skill = br.readLine();
		skillList.add(skill);
		System.out.println("Anymore skill (y/n)");
		if(br.readLine().equalsIgnoreCase("n"))
			break;
		else
			continue;
	}
	System.out.println("EDUCATIONAL DETAILS");
	while(true){
		System.out.println("Enter your qualification");
		qualification = br.readLine();
		System.out.println("Enter your educational institution");
		institution = br.readLine();
		System.out.println("Enter your percentage");
		percentage = Double.parseDouble(br.readLine());
		education = new Education(qualification, institution, percentage);
		educationList.add(education);
		System.out.println("Anymore qualification (y/n)");
		if(br.readLine().equalsIgnoreCase("n"))
			break;
		else
			continue;
	}
	System.out.println("PERSONAL DETAILS");
	System.out.println("Enter your Date of Birth (dd/mm/yyyy)");
	dob = br.readLine();
	System.out.println("Enter your Father's name");
	father = br.readLine();
	System.out.println("Enter your Mother's name");
	mother = br.readLine();
	System.out.println("Enter address");
	address = br.readLine(); 
	while(true){
		System.out.println("Enter your achievement");
		achievement = br.readLine();
		achievementList.add(achievement);
		System.out.println("Anymore achievement (y/n)");
		if(br.readLine().equalsIgnoreCase("n"))
			break;
		else
			continue;
	}
	while(true){
		System.out.println("Enter known language");
		language = br.readLine();
		languageList.add(language);
		System.out.println("Anymore language (y/n)");
		if(br.readLine().equalsIgnoreCase("n"))
			break;
		else
			continue;
	}
	User user = new User(name, dob, address, achievementList,objective, educationList, 
			email, contact, mother, father, skillList, languageList); 
	return user;
   }
}

