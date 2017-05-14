package com.store.test;

import com.store.*;

public class TestClient {

	public static void main(String[] args) {
		
		OrderServiceUtil osu=new OrderServiceUtil();
		
		Order o1=new Order(1, "abc", 100, "COD");
		
		osu.addOrder(o1);
		
		Order o2=new Order(2, "pqr", 200, "Internet Banking");
		
		osu.addOrder(o2);
		osu.searchOrder(2);
		
		osu.findTotal();

	}

}
