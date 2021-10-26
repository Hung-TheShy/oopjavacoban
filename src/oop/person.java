
package oop;


public abstract  class person {
    String birthday;
	char blood_type;
	int gender;
	
	void Person(String birthday, char blood_type, int gender) {
		this.birthday = birthday;
		this.blood_type = blood_type;
		this.gender = gender;
	}
	
	abstract String getBirthday();
	abstract void setBirthday(String birthday);
	abstract char getBlood_type();
	abstract void setBlood_type(char blood_type);
	abstract int getGender();
	abstract void setGender(int gender);
        
    

}
