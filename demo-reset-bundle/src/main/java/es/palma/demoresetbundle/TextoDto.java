package es.palma.demoresetbundle;

public class TextoDto {
	private String coa;
	private String lang;
	private String traduccio;
	
	public TextoDto() {
		
	}
	
	public TextoDto(String coa, String lang, String traduccio) {
		super();
		this.coa = coa;
		this.lang = lang;
		this.traduccio = traduccio;
	}



	public String getCoa() {
		return coa;
	}
	public void setCoa(String coa) {
		this.coa = coa;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getTraduccio() {
		return traduccio;
	}
	public void setTraduccio(String traduccio) {
		this.traduccio = traduccio;
	}

	
}
