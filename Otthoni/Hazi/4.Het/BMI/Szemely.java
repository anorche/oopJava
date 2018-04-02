package BMI;

public class Szemely {
	private String name;

	private int weight;

	private double height;



	public double getBMI() {

		return weight / Math.pow(height, 2);

	}



	public String getCategory() {

		if (getBMI() < 18.5)

			return "Sov�ny";

		else if (getBMI() > 25)

			return "k�v�r";

		else

			return "norm�l";

	}



	@Override

	public String toString() {

		return name + ", " + weight + ", " + height + ", " + getBMI() + ": " + getCategory();

	}



	public String getName() {

		return name;

	}



	public void setName(String name) {

		this.name = name;

	}



	public int getWeight() {

		return weight;

	}



	public void setWeight(int weight) {

		this.weight = weight;

	}



	public double getHeight() {

		return height;

	}



	public void setHeight(double height) {

		this.height = height;

	}



}