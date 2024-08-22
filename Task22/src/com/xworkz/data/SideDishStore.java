package com.xworkz.data;

public class SideDishStore {
	private SideDishData[] dish = new SideDishData[5];
	private int index = 0;

	public void save(SideDishData data) {
		this.dish[this.index] = data;
		this.index++;
	}

	public void showSideDishes() {
		System.out.println("---Display side dishes data---");
		for (SideDishData dishInfo : this.dish) {
			if (dishInfo != null) {
				dishInfo.showInfo();
			} else {
				System.out.println("data is null");
			}
		}
	}

}
