package dto;

public class worms {

	private int idworms;
	private String name;
	private String lastname;
	private String mail;
	private String password;
	private String sex;
	private String addres;
	private String phone;
	
	
	public worms() {
		
	}


	public worms(int idworms, String name, String lastname, String mail, String password, String sex, String addres,
			String phone) {
		super();
		this.idworms = idworms;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
		this.password = password;
		this.sex = sex;
		this.addres = addres;
		this.phone = phone;
	}


	public int getIdworms() {
		return idworms;
	}


	public void setIdworms(int idworms) {
		this.idworms = idworms;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAddres() {
		return addres;
	}


	public void setAddres(String addres) {
		this.addres = addres;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
