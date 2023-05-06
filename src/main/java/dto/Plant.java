package dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PlantId;
	private String PlantNmae;
	private int height;
	private String difficultyLevel;
	private String typeOfPlant;
	private int PlantCost;
	private int PlantQuentity;
	public Plant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plant(String plantNmae, int height, String difficultyLevel, String typeOfPlant, int plantCost,
			int plantQuentity) {
		super();
		PlantNmae = plantNmae;
		this.height = height;
		this.difficultyLevel = difficultyLevel;
		this.typeOfPlant = typeOfPlant;
		PlantCost = plantCost;
		PlantQuentity = plantQuentity;
	}
	public int getPlantId() {
		return PlantId;
	}
	public void setPlantId(int plantId) {
		PlantId = plantId;
	}
	public String getPlantNmae() {
		return PlantNmae;
	}
	public void setPlantNmae(String plantNmae) {
		PlantNmae = plantNmae;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	public int getPlantCost() {
		return PlantCost;
	}
	public void setPlantCost(int plantCost) {
		PlantCost = plantCost;
	}
	public int getPlantQuentity() {
		return PlantQuentity;
	}
	public void setPlantQuentity(int plantQuentity) {
		PlantQuentity = plantQuentity;
	}
	@Override
	public String toString() {
		return "Plant [PlantId=" + PlantId + ", PlantNmae=" + PlantNmae + ", height=" + height + ", difficultyLevel="
				+ difficultyLevel + ", typeOfPlant=" + typeOfPlant + ", PlantCost=" + PlantCost + ", PlantQuentity="
				+ PlantQuentity + "]";
	}
	
}
