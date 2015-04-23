package Log4jSamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class SampleAppender {

		public static void main(String[] args) {
			
			BasicConfigurator.configure();
			Logger OurLogger = LogManager.getLogger("OurLogger");
			
			//create a FileAppender object and associate the file name to which you
			//want the logs to be directed to.
			//you will also have to set a layout also, here we have chosen a SimpleLayout
			FileAppender fileAppender = new FileAppender();
			fileAppender.setFile("logfile.txt");
			fileAppender.setLayout(new SimpleLayout());
			
			//Add the appender to our Logger Object.
			//from now onwards all the logs will be directed to file mentioned by FileAppender
			OurLogger.addAppender(fileAppender);
			fileAppender.activateOptions();
			
			//lets print some log 10 times
			int i = 0;
			while(i<11){
				OurLogger.debug("This is just a log that I want to print " + i);
				i++;
			}
		}
}
