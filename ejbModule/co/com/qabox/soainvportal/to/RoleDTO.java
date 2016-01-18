package co.com.qabox.soainvportal.to;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RoleDTO")
@XmlAccessorType( XmlAccessType.FIELD )
public class RoleDTO {

	@XmlAttribute
	private String name;
	@XmlAttribute
	private PermissionDTO[] permissions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PermissionDTO[] getPermissions() {
		return permissions;
	}
	public void setPermissions(PermissionDTO[] permissions) {
		this.permissions = permissions;
	}
	
	
	
}
