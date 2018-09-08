package com.xumeng.StockSeacher.service;

import org.springframework.stereotype.Service;

import pl.zankowski.iextrading4j.api.stocks.Quote;
import pl.zankowski.iextrading4j.client.IEXTradingClient;
import pl.zankowski.iextrading4j.client.rest.request.stocks.QuoteRequestBuilder;

@Service
public class PriceService {
	
	public String getStockInfo(String stockName) {
		final IEXTradingClient iexTradingClient = IEXTradingClient.create();
		final Quote quote = iexTradingClient.executeRequest(new QuoteRequestBuilder()
		        .withSymbol(stockName)
		        .build());
		System.out.println(quote);

		return quote.toString();
	}

}
