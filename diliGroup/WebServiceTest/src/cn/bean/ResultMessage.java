package cn.bean;

public class ResultMessage implements java.io.Serializable{
	private static final long serialVersionUID = 1715558527848833435L;
	private String code;
	private String mes;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
 
}
