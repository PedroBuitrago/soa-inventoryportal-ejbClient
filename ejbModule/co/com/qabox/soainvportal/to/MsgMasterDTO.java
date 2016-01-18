package co.com.qabox.soainvportal.to;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="masterDTO")
@XmlAccessorType( XmlAccessType.NONE )
public class MsgMasterDTO {

	@XmlElement(name="X")
	private MsgHeaderDTO header;
	@XmlElement(name="Y")
	private MsgBodyDTO body;
	@XmlElement(name="Z")
	private MsgResultDTO result;
	
	public MsgHeaderDTO getHeader() {
		return header;
	}
	public void setHeader(MsgHeaderDTO header) {
		this.header = header;
	}
	
	public MsgBodyDTO getBody() {
		return body;
	}
	public void setBody(MsgBodyDTO body) {
		this.body = body;
	}
	public MsgResultDTO getResult() {
		return result;
	}
	public void setResult(MsgResultDTO result) {
		this.result = result;
	}
	
	
	
}
