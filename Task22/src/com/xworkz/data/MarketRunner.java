package com.xworkz.data;

public class MarketRunner {

	public static void main(String[] args) {
		MarketStore store = new MarketStore();
		MarketData data1 = new MarketData("Chikpet", "Bangalore");
		store.save(data1);
		MarketData data2 = new MarketData("KR Market", "Bangalore");
		store.save(data2);
		MarketData data3 = new MarketData("City market", "RajajiNagar");
		store.save(data3);
		MarketData data4 = new MarketData("Kempegowda Hapcoms", "Bangalore");
		store.save(data4);
		MarketData data5 = new MarketData("central", "Malleswaram");
		store.save(data5);
		store.showDetails();

	}

}
