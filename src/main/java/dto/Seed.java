package dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int SeedId;
	private String SeedNmae;
	private String difficultyLevel;
	private String typeOfSeed;
	private int SeedStock;
	private int SeedCost;
	private int SeedQuentity;
	public Seed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seed(String seedNmae, String difficultyLevel, String typeOfSeed, int seedStock, int seedCost,
			int seedQuentity) {
		super();
		SeedNmae = seedNmae;
		this.difficultyLevel = difficultyLevel;
		this.typeOfSeed = typeOfSeed;
		SeedStock = seedStock;
		SeedCost = seedCost;
		SeedQuentity = seedQuentity;
	}
	public int getSeedId() {
		return SeedId;
	}
	public void setSeedId(int seedId) {
		SeedId = seedId;
	}
	public String getSeedNmae() {
		return SeedNmae;
	}
	public void setSeedNmae(String seedNmae) {
		SeedNmae = seedNmae;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getTypeOfSeed() {
		return typeOfSeed;
	}
	public void setTypeOfSeed(String typeOfSeed) {
		this.typeOfSeed = typeOfSeed;
	}
	public int getSeedStock() {
		return SeedStock;
	}
	public void setSeedStock(int seedStock) {
		SeedStock = seedStock;
	}
	public int getSeedCost() {
		return SeedCost;
	}
	public void setSeedCost(int seedCost) {
		SeedCost = seedCost;
	}
	public int getSeedQuentity() {
		return SeedQuentity;
	}
	public void setSeedQuentity(int seedQuentity) {
		SeedQuentity = seedQuentity;
	}
	@Override
	public String toString() {
		return "Seed [SeedId=" + SeedId + ", SeedNmae=" + SeedNmae + ", difficultyLevel=" + difficultyLevel
				+ ", typeOfSeed=" + typeOfSeed + ", SeedStock=" + SeedStock + ", SeedCost=" + SeedCost
				+ ", SeedQuentity=" + SeedQuentity + "]";
	}
	
}
