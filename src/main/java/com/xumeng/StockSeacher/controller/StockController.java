package com.xumeng.StockSeacher.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xumeng.StockSeacher.service.PriceService;

import pojo.StockInfoPojo;

@RestController
public class StockController {
	
	@Autowired
	private PriceService priceService;

	@RequestMapping("/stock")
	@ResponseBody
	public List<String> getStockPrices(@RequestBody StockInfoPojo stockInfo){
		List<String> result = new ArrayList<>();
		
//		result.add("1");
//		result.add("2");
		//result.add(stockInfo.getStockname());
		result.add(priceService.getStockInfo(stockInfo.getStockname()));
		return result;
	}
}
