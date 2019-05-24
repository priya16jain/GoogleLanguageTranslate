package translator;

import java.io.IOException;

import com.darkprograms.speech.translator.GoogleTranslate;

public class TranslatorExample {
	
	public static void main(String[] args) {
		try {
			//English to IGBO
			System.out.println(GoogleTranslate.translate("ig", "Time flies always,Happy"));
			
			//English to HAUSA
			System.out.println(GoogleTranslate.translate("ha", "Time flies always,Happy"));
			
			//English to Yoruba
			System.out.println(GoogleTranslate.translate("yo", "Time flies always,Happy"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
