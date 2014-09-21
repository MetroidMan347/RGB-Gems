package mm347.rgbgems2.utility;

import mm347.rgbgems2.reference.Reference;
import org.apache.logging.log4j.Level;
import cpw.mods.fml.common.FMLLog;

public class LogHelper {
	public static void log(Level logLevel, Object obj) {
		FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(obj));
	}

	public static void all(Object obj) {log(Level.ALL, obj);}
	public static void debug(Object obj) {log(Level.DEBUG, obj);}
	public static void error(Object obj) {log(Level.ERROR, obj);}
	public static void fatal(Object obj) {log(Level.FATAL, obj);}
	public static void info(Object obj) {log(Level.INFO, obj);}
	public static void off(Object obj) {log(Level.OFF, obj);}
	public static void trace(Object obj) {log(Level.TRACE, obj);}
	public static void warn(Object obj) {log(Level.WARN, obj);}
}