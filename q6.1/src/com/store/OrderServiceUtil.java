package com.store;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class OrderServiceUtil {
	
	TreeMap<Integer, Order> tm= new TreeMap<Integer, Order>();
	
	public void addOrder(Order o1) {
			
			tm.put(o1.getOrderId(),o1);
		
		
	}
	
	public Order searchOrder(int orderId) {
		Set<Entry<Integer, Order>> s=tm.entrySet();
		for (Entry<Integer, Order> entry : s) {
			if (entry.getKey().equals(orderId)) {
				System.out.println(entry);
			}
		}
		return null;
	}
	
	public float findTotal() {
		float total=0;
		Set<Entry<Integer, Order>> s=tm.entrySet();
		for (Entry<Integer, Order> entry : s) {
			total+=entry.getValue().getOrderAmount();
		
		}
		System.out.println(total);
		return total;
		
		
	}

}
