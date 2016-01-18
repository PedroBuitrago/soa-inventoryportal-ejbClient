package co.com.qabox.soainvportal.to;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IdentityDTO")
@XmlAccessorType( XmlAccessType.FIELD )
public class IdentityDTO {

	@XmlAttribute
	private String user;
	@XmlAttribute
	private String pass;
	@XmlAttribute
	private String firtName;
	@XmlAttribute
	private String lastName;
	@XmlAttribute
	private RoleDTO role;
	@XmlAttribute
	private boolean authenticated;
	
	
		
	public RoleDTO getRole() {
		return role;
	}
	public void setRole(RoleDTO role) {
		this.role = role;
	}
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String id) {
		this.user = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
