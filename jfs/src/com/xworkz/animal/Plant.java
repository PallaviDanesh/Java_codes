package com.xworkz.animal;

public class Plant
{
	private String name;
	private int height;
	private String type;
	private boolean isFlowering;
	private int age;
	private String soilType;
	private String sunlightRequirement;
	private int waterPerWeek;
	private String season;
	private boolean isIndoor;

	
	public Plant(String name, int height, String type, boolean isFlowering, int age)
	{
		this.name = name;
		this.height = height;
		this.type = type;
		this.isFlowering = isFlowering;
		this.age = age;
	}

	
	public void setSoilType(String soilType)
	{
		this.soilType = soilType;
	}

	public void setSunlightRequirement(String sunlightRequirement)
	{
		this.sunlightRequirement = sunlightRequirement;
	}

	public void setWaterPerWeek(int waterPerWeek)
	{
		this.waterPerWeek = waterPerWeek;
	}

	public void setSeason(String season)
	{
		this.season = season;
	}

	public void setIndoor(boolean isIndoor)
	{
		this.isIndoor = isIndoor;
	}


	public void printDetails()
	{
		System.out.println("Plant Name=" + name + ", Height=" + height + ", Type=" + type + ", IsFlowering=" + isFlowering
						+ ", Age=" + age + ", SoilType=" + soilType + ", SunlightRequirement=" + sunlightRequirement
						+ ", WaterPerWeek=" + waterPerWeek + ", Season=" + season + ", IsIndoor=" + isIndoor );
	}
}
