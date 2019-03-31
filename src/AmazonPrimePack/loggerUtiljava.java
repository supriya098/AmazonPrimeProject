package AmazonPrimePack;
	
	
	import java.io.File;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import org.apache.log4j.FileAppender;
	import org.apache.log4j.Logger;
	import org.apache.log4j.SimpleLayout;

	public class loggerUtiljava {

		private static final String LOG_LOCATION = "C:\\Users\\suman_priya\\Work Space\\Jar files\\AmazonPrimeTestCaseLogFile";
		private static FileAppender fappender;
		private static Logger logger = Logger.getLogger( loggerUtiljava.class);

		public static Logger getLoggerUtil() {
			try {
				fappender = new FileAppender(new SimpleLayout(), LOG_LOCATION
						+ new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()).toString().replaceFirst(".text", "")
						+ ".log");
				logger.addAppender(fappender);
				fappender.setLayout(new SimpleLayout());
			} catch (Exception e) {
				logger.info(e);
				e.printStackTrace();
			}
			return logger;
		}

	}



