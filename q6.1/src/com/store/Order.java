package com.store;

public class Order {

		private int orderId;
		private String customerName;
		private float orderAmount;
		private String paymentOption;
		
		
		public Order(int orderId, String customerName, float orderAmount,
				String paymentOption) {
			if ((orderAmount>=100) && (paymentOption.equals("COD") || paymentOption.equals("Gift Card") || paymentOption.equals("Internet Banking"))) {
				this.orderId = orderId;
				this.customerName = customerName;
				this.orderAmount = orderAmount;
				this.paymentOption = paymentOption;
			}
			
		}
		
		


		public Order() {
			super();
		}




		public int getOrderId() {
			return orderId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public float getOrderAmount() {
			return orderAmount;
		}


		public String getPaymentOption() {
			return paymentOption;
		}




		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customerName="
					+ customerName + ", orderAmount=" + orderAmount
					+ ", paymentOption=" + paymentOption + "]";
		}
		
		
		
		
		
		
}
