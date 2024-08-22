package com.xworkz.animal;

public class Submarine {

	private String name;
	private int length;
	private int crewCapacity;
	private int maxDepth;
	private String propulsionType;
	private String countryOfOrigin;
	private int speed;
	private int displacement;
	private int endurance;
	private int armament;
	private String material;
	private int launchYear;
	private int weight;
	private boolean isNuclearPowered;
	private String commanderName;
	private String missionType;
	private int radarRange;
	private int sonarRange;
	private String communicationSystem;
	private int batteryCapacity;
	private boolean isStealthCapable;
	private int fuelCapacity;
	private int maxRange;
	private int operatingDepth;
	private int surfaceSpeed;
	private int submergedSpeed;
	private int cost;
	private boolean hasTorpedoes;
	private boolean hasMissiles;
	private boolean hasAntiSubmarineWarfare;
	private String stealthTechnology;
	private String camouflageType;
	private int crewTrainingLevel;
	private boolean hasEscapePods;

	public Submarine(String name, int length, int crewCapacity, int maxDepth, String propulsionType) {
		this.name = name;
		this.length = length;
		this.crewCapacity = crewCapacity;
		this.maxDepth = maxDepth;
		this.propulsionType = propulsionType;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public void setArmament(int armament) {
		this.armament = armament;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setNuclearPowered(boolean isNuclearPowered) {
		this.isNuclearPowered = isNuclearPowered;
	}

	public void setCommanderName(String commanderName) {
		this.commanderName = commanderName;
	}

	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}

	public void setRadarRange(int radarRange) {
		this.radarRange = radarRange;
	}

	public void setSonarRange(int sonarRange) {
		this.sonarRange = sonarRange;
	}

	public void setCommunicationSystem(String communicationSystem) {
		this.communicationSystem = communicationSystem;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void setStealthCapable(boolean isStealthCapable) {
		this.isStealthCapable = isStealthCapable;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public void setOperatingDepth(int operatingDepth) {
		this.operatingDepth = operatingDepth;
	}

	public void setSurfaceSpeed(int surfaceSpeed) {
		this.surfaceSpeed = surfaceSpeed;
	}

	public void setSubmergedSpeed(int submergedSpeed) {
		this.submergedSpeed = submergedSpeed;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setHasTorpedoes(boolean hasTorpedoes) {
		this.hasTorpedoes = hasTorpedoes;
	}

	public void setHasMissiles(boolean hasMissiles) {
		this.hasMissiles = hasMissiles;
	}

	public void setHasAntiSubmarineWarfare(boolean hasAntiSubmarineWarfare) {
		this.hasAntiSubmarineWarfare = hasAntiSubmarineWarfare;
	}

	public void setStealthTechnology(String stealthTechnology) {
		this.stealthTechnology = stealthTechnology;
	}

	public void setCamouflageType(String camouflageType) {
		this.camouflageType = camouflageType;
	}

	public void setCrewTrainingLevel(int crewTrainingLevel) {
		this.crewTrainingLevel = crewTrainingLevel;
	}

	public void setHasEscapePods(boolean hasEscapePods) {
		this.hasEscapePods = hasEscapePods;
	}

	public void displaySubmarineInfo() {
		System.out.println("Submarine-Name=" + name + ", Length=" + length + ", CrewCapacity=" + crewCapacity
				+ ", MaxDepth=" + maxDepth + ", PropulsionType=" + propulsionType + ", CountryOfOrigin="
				+ countryOfOrigin + ", Speed=" + speed + ", Displacement=" + displacement + ", Endurance=" + endurance
				+ ", Armament=" + armament);
	}

}
