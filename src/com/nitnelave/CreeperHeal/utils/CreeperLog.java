package com.nitnelave.CreeperHeal.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreeperLog
{
	private static File file;
	protected final static Logger log = Logger.getLogger("Minecraft");            //to output messages to the console/log

	
	public CreeperLog(File f)
	{
		file = f;
	}

	public static void record(String s)
	{
		try{
			// Create file 
			FileWriter fstream = new FileWriter(file,true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write("\n" + s);
			//Close the output stream
			out.close();
		}catch (Exception e){//Catch exception if any
			log.log(Level.SEVERE, "Error: " + e.getMessage());
		}
	}


}
