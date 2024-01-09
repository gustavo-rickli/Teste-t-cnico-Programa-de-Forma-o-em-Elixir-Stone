package me.gustavorickli.main.entities;

public class Item {
	
	// private UUID id;
	private String name;
	private Integer amount;
	private Double unitPrice;
	
	public Item() {
		name = "none";
		amount = 0;
		unitPrice = 0.0d;
	}
	
	public Item(String name, Integer amount, Double unitPrice) {
		this.name = name;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	/** Método para retorno do preço total (unidade * qtd. de items)
	 * @return Double - preço final*/
	public Double getTotalPrice() {
		return unitPrice * amount;
	}
	
	
}
