package myproject;

public class User {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String deaprtment;
	private int yoj;
	private int salary;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int age, String gender, String deaprtment, int yoj, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deaprtment = deaprtment;
		this.yoj = yoj;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeaprtment() {
		return deaprtment;
	}

	public void setDeaprtment(String deaprtment) {
		this.deaprtment = deaprtment;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deaprtment="
				+ deaprtment + ", yoj=" + yoj + ", salary=" + salary + "]";
	}

}
