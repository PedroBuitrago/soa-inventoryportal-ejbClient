package co.com.qabox.soainvportal.to;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author pbuitrag
 *
 */
@XmlRootElement(name="result")
@XmlAccessorType( XmlAccessType.NONE )
public class MsgResultDTO {

	@XmlElement(name="codigo")
	private String code;
	@XmlElement
	private ResultType resultType;
	@XmlElement
	private String desc;
	/**
	 * 20151124 - pbuitrag: Permite entregar información detallada, i.e. listar diferentes 
	 * tipos de errores que tuvieron lugar
	 */
	@XmlAttribute
	private Collection<LabelValueDTO> details;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ResultType getResultType() {
		return resultType;
	}
	public void setResultType(ResultType resultType) {
		this.resultType = resultType;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Collection<LabelValueDTO> getDetails() {
		return details;
	}
	public void setDetails(Collection<LabelValueDTO> details) {
		this.details = details;
	}
	
	
	
	
	
	
}
