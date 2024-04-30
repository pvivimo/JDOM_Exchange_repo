package pv.sb_jdomeexchange_mvc.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.stereotype.Repository;

import pv.sb_jdomeexchange_mvc.model.ExchangeRate;



@Repository
public class XMLParser {
	
	public List<ExchangeRate> getAllExchangeRates() throws JDOMException, IOException{
		
		List<ExchangeRate> exchangeRates = new ArrayList<>();
	
		//1. Dokumentum előállítása fájlból:
		SAXBuilder sb = new SAXBuilder();
	    Document document = sb.build(new File("C:\\Users\\pvivi\\OneDrive\\Asztali gép\\Programozz te is\\Halado_Tanfolyam\\4_XML\\1\\MNB_ExchangeRates_uj.xml"));
	
	    // 2. Gyökérelem megszerzése
	    Element rootElement = document.getRootElement();
	
	    // 3. Az elemeken való iteráció és adott attribútumának / elemének kiolvasása:
	    Element dayElement = rootElement.getChild("Day");
	    List<Element> rateElements = dayElement.getChildren("Rate");
	
		    for (int index = 0; index < rateElements.size(); index++) {
		    	
		    	Element currentRateElement = rateElements.get(index);
		    	
		
		        String unit = currentRateElement.getAttributeValue("unit");
		        String curr = currentRateElement.getAttributeValue("curr");
		        String value = currentRateElement.getValue();
		        
		        if(unit.equals("100")) {
		        	 ExchangeRate exchangeRate = new ExchangeRate(unit, curr, value);
				     exchangeRates.add(exchangeRate);
				        
				     System.out.println("Pénznem: " + curr + ", Érték: " + value + ", Unit: " + unit);
		        }
		       
		    }

		    return exchangeRates;
	}

}