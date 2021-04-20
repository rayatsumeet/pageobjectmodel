package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;



import Base.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class screenshotAShot extends Page {

	public static void screenshot() throws IOException {
		
		Date date= new Date();
    	String string=	date.toString().replace(":", "_").replace(" ", "_")+".jpg";
		Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driverr);
		ImageIO.write(screenshot.getImage(), "jpg", new File(System.getProperty("user.dir")+"/screenshot/"+string));
		
		
	}

}
