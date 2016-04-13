package co.com.qabox.soainvportal.ejb;

import java.util.Collection;

import javax.ejb.Local;

import co.com.qabox.soainv.exception.IntegrationException;
import co.com.qabox.soainvportal.to.IdentityDTO;
import co.com.qabox.soainvportal.to.MenuDTO;



@Local
public interface AuthServiceLocal {

	public IdentityDTO checkUser(IdentityDTO identity) throws IntegrationException;
	public Collection<MenuDTO> getMenu(String user) throws IntegrationException;
	public boolean logout(IdentityDTO identity) throws IntegrationException;
	
}
