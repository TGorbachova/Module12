/**
 * �author Tetiana Horbachova
 * @version 1. 0
 */
package Module13.Module13;

import java.util.*;

public class Toy  {
	
	protected String name;
	protected String size;
	protected int price;
	protected String color;
	protected int age;
	protected String material;
	
	//Constructors of the class
	public Toy () {
	}
			
	public Toy(String name, String size, int price, String color, int age, String material) {
		this.name = name;
		this.size = size;
		this.price = price;
		this.color = color;
		this.age = age;
		this.material = material;
	}
	
	//Get and set methods for the class
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}