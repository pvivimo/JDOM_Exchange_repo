package pv.sb_jdomeexchange_mvc.dto;

import java.util.ArrayList;
import java.util.List;

import pv.sb_jdomeexchange_mvc.model.ExchangeRate;

public class ExchangeRatesDto {
	
	private List<ExchangeRate> exchangeRates;

	public ExchangeRatesDto() {
		super();
		this.exchangeRates = new ArrayList<>();
	}

	public List<ExchangeRate> getExchangeRates() {
		return exchangeRates;
	}

	public void setExchangeRates(List<ExchangeRate> exchangeRates) {
		this.exchangeRates = exchangeRates;
	}
	
	public void addExchangeRate(ExchangeRate exchangeRate) {
		this.exchangeRates.add(exchangeRate);
	}

	@Override
	public String toString() {
		return "ExchangeRatesDto [exchangeRates=" + exchangeRates + "]";
	}

	
}
	
	
	