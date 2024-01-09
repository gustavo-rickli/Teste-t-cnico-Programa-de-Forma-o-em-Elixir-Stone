package me.gustavorickli.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.gustavorickli.main.entities.Item;
import me.gustavorickli.main.entities.TesteTecnico;

public class Desafio {
	
	public static void main(String[] args) {
		
		List<Item> itens = new ArrayList<Item>();
		List<String> emails = new ArrayList<String>();
		
		itens.add(new Item("Coke", 10, 3.5));
		itens.add(new Item("Ice Coffe", 2, 12.5));
		itens.add(new Item("Green Apple Ice Cream", 4, 7.8));
		
		emails.add("gustavorickli.me@gmail.com");
		emails.add("badbabyhalominecraftpvp@gmail.com");
		emails.add("gugacanhao@gmail.com");
	    
		HashMap<String, Double> resultado = new TesteTecnico().calcula(itens, emails);
		
		System.out.println(resultado.toString()); // printa o resultado
		
		
	}
	
}
