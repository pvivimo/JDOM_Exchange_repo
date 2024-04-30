package pv.sb_jdomeexchange_mvc.controller;

import java.io.IOException;

import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pv.sb_jdomeexchange_mvc.dto.ExchangeRatesDto;
import pv.sb_jdomeexchange_mvc.service.AppService;

@Controller
public class AppController {
	
	private AppService service;
	
	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/ExchangeRates")
	public String showExchangeRates(Model model) throws JDOMException, IOException
	{
		ExchangeRatesDto dto = service.getAllExchangeRates();
		
		model.addAttribute("exchangeratesdto", dto);
		
		return "exchangerates.html";
	}
	
	

}
