package com.xworkz.data;

//class variable <--- static variable

public class SandalStore {
	private SandalData[] datas = new SandalData[5];
	private int index = 0;

	public void save(SandalData data) {
		// System.out.println("Save sandal data");
		this.datas[this.index] = data;
		this.index++;
	}

	public void showDetails() {
		System.out.println("---Display sandal data---");
		for (SandalData data : this.datas) {
			if (data != null) {
				data.showData();
			} else {
				System.out.println("data is null");
			}
		}
	}
}
