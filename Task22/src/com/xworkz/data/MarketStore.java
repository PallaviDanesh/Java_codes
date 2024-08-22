package com.xworkz.data;

public class MarketStore {

	private MarketData[] info = new MarketData[5];
	private int position = 0;

	public void save(MarketData data) {
		this.info[this.position] = data;
		this.position++;
	}

	public void showDetails() {
		System.out.println("---Display market data---");
		for (MarketData dataOfMarket : this.info) {
			if (dataOfMarket != null) {
				dataOfMarket.showMarketInfo();
			} else {
				System.out.println("data is null");
			}
		}
	}
}
