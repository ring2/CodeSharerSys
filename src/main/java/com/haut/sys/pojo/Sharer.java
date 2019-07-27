package com.haut.sys.pojo;

public class Sharer {
    private Integer id;

    private String name;

    private String password;

    private String gender;

    private Integer age;

    private String phone;

    private Integer permission;

    private Integer codeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getCodeid() {
        return codeid;
    }

    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }

	@Override
	public String toString() {
		return "Sharer [id=" + id + ", name=" + name + ", password=" + password + ", gender=" + gender + ", age=" + age
				+ ", phone=" + phone + ", permission=" + permission + ", codeid=" + codeid + "]";
	}
    
}