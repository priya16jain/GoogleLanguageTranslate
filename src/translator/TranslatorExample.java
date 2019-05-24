package translator;

import java.io.IOException;

import com.darkprograms.speech.translator.GoogleTranslate;

public class TranslatorExample {
	
	public static void main(String[] args) {
		
		//Read this ma bro :)
		//When you go on google translate website and you translate from English to Igbo for example
		//you can see the url is :
		// https://translate.google.com/#en/ig/How%20are%20you
		//so the code for IGBO is "ig"
		//see my examples below , i will make tutorial on youtube don't worry
		
		try {
			//English to IGBO
			System.out.println(GoogleTranslate.translate("ig", "Time flies always"));
			
			//English to HAUSA
			System.out.println(GoogleTranslate.translate("ha", "Time flies always"));
			
			//English to Yoruba
			System.out.println(GoogleTranslate.translate("yo", "Time flies always"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
