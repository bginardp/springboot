package es.palma.demoresetbundle;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractMessageSource;

public class ImiMessageSource extends AbstractMessageSource implements MessageSource{
	private static final Logger LOG = LoggerFactory.getLogger(ImiMessageSource.class);
	private Map<String,Map<String,String>> textes = new HashMap<>();
	
	public ImiMessageSource() {
		
	}

	@Override
	protected MessageFormat resolveCode(String code, Locale locale) {
		Map<String,String> map=textes.get(locale.getLanguage());
		if (map==null) {
			loadTextes();
		}
		String value=null;
		if (map!=null) {
			value=map.get(code);
		}
		if(value==null) {
			return null;
		}
		return new MessageFormat(value,locale);
	}
	
	private void loadTextes() {
		TextoDto[] res= new TextoDto[] {new TextoDto("k1","es"," v1 es"),new TextoDto("k1","ca","v1 ca")};
		for (TextoDto t:res) {
			String lang=t.getLang();
			Map<String,String> submap=textes.get(lang);
			if (submap==null) {
				submap=new HashMap<>();
				textes.put(lang, submap);
			}
			submap.put(t.getCoa(), t.getTraduccio());
		}
		
	}

}
