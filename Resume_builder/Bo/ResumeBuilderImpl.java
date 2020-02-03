package Bo;

import java.io.*;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import Dao.Education;
import Dao.User;
import Main.Main;

public class ResumeBuilderImpl implements ResumeBuilder{

	@Override
	public void writeIntoFile(User user) {
		
		//FileCreation
		String file = "C:\\Users\\KAVANA N\\Desktop\\" + Main.fileName + ".pdf";
		Document doc = new Document();
		
		//Customizing font and styles
		Font bold = new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLDITALIC);
		Font subHeading = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
		Font paragraphFont = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL);
		LineSeparator line = new LineSeparator(0f, 100f, BaseColor.DARK_GRAY, Element.ALIGN_LEFT,0);
		
		//Table creation and its customize
		PdfPTable table = new PdfPTable(3);
		table.setWidthPercentage(100);
		table.getDefaultCell().setHorizontalAlignment(1);
		
		//List creation and its customize
		List technicalList = new List(List.UNORDERED);
		technicalList.setIndentationLeft(30);
		List achievementList = new List(List.UNORDERED);
		achievementList.setIndentationLeft(30);
		List languageList = new List(List.UNORDERED);
		languageList.setIndentationLeft(30);
		
		
		try{
			//Customized file instance
			PdfWriter.getInstance(doc, new FileOutputStream(new File(file)));
			
			//Retrieval of the file
			doc.open();
			Paragraph p = new Paragraph();
			p.setFont(paragraphFont);
			
			//basic info
			p.add(String.format("%1s %40s",user.getEmail() ,user.getName()) + String.format("%50s",user.getContact()) + "\n");
			p.add(new Chunk(line));
			
			//Objective
			p.add(new Chunk("\nOBJECTIVE",bold)); p.add("\n\n");
			p.add(String.format("%20s",user.getObjective()) + "\n");
			p.add(new Chunk(line));
			
			//EDUCATIONAL QUALIFICATION
			p.add(new Chunk("\nEDUCATIONAL QUALIFICATION",bold)); p.add("\n\n");
			
			//table info for education qualification
			table.setHeaderRows(1);
			table.getDefaultCell().setBackgroundColor(BaseColor.LIGHT_GRAY);
			
			table.addCell(new Phrase(String.format("%1s", "NAME OF THE COURSE"),paragraphFont));
			table.addCell(new Phrase(String.format("%1s", "INSTITUTION"),paragraphFont));
			table.addCell(new Phrase(String.format("%1s", "PERCENTAGE"),paragraphFont));
			
			table.getDefaultCell().setBackgroundColor(BaseColor.WHITE);
			
			for (Education ed : user.getEducation()) {
				table.addCell(new Phrase(String.format("%2s", ed.getQualification()),paragraphFont));
				table.addCell(new Phrase(String.format("%2s",ed.getEduInstitution()),paragraphFont));
				table.addCell(new Phrase(String.format("%2s",Double.toString(ed.getPercentage())),paragraphFont));
			}
			
			p.add(table); p.add("\n"); p.add(new Chunk(line));
			
			//TECHNICAL SKILLS
			p.add(new Chunk("\nTECHNICAL SKILLS",bold)); p.add("\n\n");
			for (String technicalSkill : user.getTechnicalSkills()) {
				technicalList.add(new ListItem(new Chunk(technicalSkill,paragraphFont)));
			}
			p.add(technicalList); p.add(new Chunk(line));
			
			//nACHIEVEMENTS
			p.add(new Chunk("\nACHIEVEMENTS",bold)); p.add("\n\n");
			for (String achievement : user.getAchievements()) {
				achievementList.add(new ListItem(new Chunk(achievement,paragraphFont)));
			}
			p.add(achievementList); p.add(new Chunk(line));
			
			//LANGUAGES KNOWN
			p.add(new Chunk("\nLANGUAGES KNOWN",bold)); p.add("\n\n");
			for (String language : user.getLanguages()) {
				languageList.add(new ListItem(new Chunk(language,paragraphFont)));
			}
			p.add(languageList);
			p.add(new Chunk(line));
			
			//PERSONAL DETAILS
			p.add(new Chunk("\nPERSONAL DETAILS",bold)); p.add("\n\n");
			p.add(new Chunk("Date of Birth:",subHeading));
			p.add(String.format("%22s", user.getDob())); p.add("\n");
			p.add(new Chunk("Address: ",subHeading));
			p.add(Chunk.SPACETABBING);	p.add(Chunk.SPACETABBING);
			p.add(user.getAddress()); p.add("\n");
			p.add(new Chunk("Father Name:",subHeading));
			p.add("\t" + String.format("%20s", user.getFatherName())); p.add("\n");
			p.add(new Chunk("Mother Name:",subHeading));
			p.add("\t" + String.format("%20s", user.getMotherName())); p.add("\n");
			p.add(new Chunk(line)); doc.add(p);
			doc.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
