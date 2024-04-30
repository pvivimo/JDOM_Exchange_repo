package pv.sb_jdomeexchange_mvc.service;

import java.io.IOException;
import java.util.List;

import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pv.sb_jdomeexchange_mvc.dto.ExchangeRatesDto;
import pv.sb_jdomeexchange_mvc.model.ExchangeRate;
import pv.sb_jdomeexchange_mvc.parser.XMLParser;

@Service
public class AppService {
	
	private XMLParser parser;
	
	@Autowired
	public AppService(XMLParser parser) {
		super();
		this.parser = parser;
	}

	public ExchangeRatesDto getAllExchangeRates() throws JDOMException, IOException {
		
		ExchangeRatesDto dto = new ExchangeRatesDto();
		
		List<ExchangeRate> exchangeRates = parser.getAllExchangeRates();
		
		dto.setExchangeRates(exchangeRates);
		
		return dto;
	}
	
	

}
