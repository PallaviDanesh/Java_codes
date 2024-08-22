package com.xworkz.animal;

public class Ball {
	private String brand;
	private String material;
	private int size;
	private String color;
	private boolean isInflatable;
	private int weight;
	private boolean isUsedInSports;
	private int bounceHeight;

	private String sportType;
	private String originCountry;
	private boolean isOutdoor;
	private int durability;
	private String texture;
	private boolean isEcoFriendly;
	private String manufacturingDate;
	private String certification;

	public Ball(String brand, String material, int size, String color, boolean isInflatable, int weight,boolean isUsedInSports, int bounceHeight)
	{
		this.brand = brand;
		this.material = material;
		this.size = size;
		this.color = color;
		this.isInflatable = isInflatable;
		this.weight = weight;
		this.isUsedInSports = isUsedInSports;
		this.bounceHeight = bounceHeight;
	}

	
	public void setSportType(String sportType) 
	{
		this.sportType = sportType;
	}

	public void setOriginCountry(String originCountry)
	{
		this.originCountry = originCountry;
	}

	public void setOutdoor(boolean isOutdoor) 
	{
		this.isOutdoor = isOutdoor;
	}

	public void setDurability(int durability)
	{
		this.durability = durability;
	}

	public void setTexture(String texture) 
	{
		this.texture = texture;
	}

	public void setEcoFriendly(boolean isEcoFriendly)
	{
		this.isEcoFriendly = isEcoFriendly;
	}

	public void setManufacturingDate(String manufacturingDate) 
	{
		this.manufacturingDate = manufacturingDate;
	}

	public void setCertification(String certification)
	{
		this.certification = certification;
	}

	public void printBallInfo() {
		System.out.println("Ball-Brand=" + brand + ", Material=" + material + ", Size=" + size + ", Color=" + color+ ", IsInflatable=" + isInflatable + ", Weight=" + weight + ", IsUsedInSports=" + isUsedInSports+ ", BounceHeight=" + bounceHeight + ", SportType=" + sportType + ", OriginCountry=" + originCountry
				+ ", IsOutdoor=" + isOutdoor + ", Durability=" + durability + ", Texture=" + texture+ ", IsEcoFriendly=" + isEcoFriendly + ", ManufacturingDate=" + manufacturingDate + ", Certification="+ certification);
	}
}
