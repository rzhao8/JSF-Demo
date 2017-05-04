import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentTwo {
	String firstName;
	String lastName;
	String freePasses;
	String postalCode;
	String phoneNumber;
	String courseCode;
	String country;
	List<String> countryOptions;
	String favoriteLanguage;
	String[] favoriteLanguage_2;
	public StudentTwo(){
		//set default value
		firstName="Rui";
		
		// populate the list of countries
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");	
	}
	//getter and setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(String freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}
	

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	public String[] getFavoriteLanguage_2() {
		return favoriteLanguage_2;
	}
	public void setFavoriteLanguage_2(String[] favoriteLanguage_2) {
		this.favoriteLanguage_2 = favoriteLanguage_2;
	}
	//custom validation method
	public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		
		if(value == null){
			
			return;
		}
		String data = value.toString();
		
		//Course code must start with LUV
		if(!data.startsWith("LUV")){
			FacesMessage message = new FacesMessage("Course code must start with LUV");
			
			throw new ValidatorException(message);
		}
	}
														
	
}
