package es.palma.demodesktopapp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoDesktopApp implements CommandLineRunner{
	private static final Logger LOG = LoggerFactory.getLogger(DemoDesktopApp.class);
	public static void main(String[] args) {
		LOG.info("Hello A");
		new SpringApplicationBuilder(DemoDesktopApp.class).headless(false).run(args);
		LOG.info("Hello B");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Hello C");
		FormularioLogin frmLogin=new FormularioLogin();
		frmLogin.setVisible(true);
	}

}
