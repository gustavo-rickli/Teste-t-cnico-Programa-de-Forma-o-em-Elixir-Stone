package me.gustavorickli.main.entities;

import java.util.HashMap;
import java.util.List;

public class TesteTecnico {
	
	public TesteTecnico() {
	}
	
	public HashMap<String, Double> calcula(List<Item> itens, List<String> emails) {
		
		HashMap<String, Double> hashAmountToPay = new HashMap<>();
		
		Double sumTotalPriceListItens = 0.0;
		
		for (Item item : itens) {
			sumTotalPriceListItens += item.getTotalPrice();
		}
		
		
		Double amountToBePayByEmail = 0.0;
		
		amountToBePayByEmail = sumTotalPriceListItens / emails.size();
		
		for (String email : emails) {
			hashAmountToPay.put(email, amountToBePayByEmail);
		}
		
		return hashAmountToPay;
	}
}
