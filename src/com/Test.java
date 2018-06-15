package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\Administrator\\Desktop\\export.xlsx");
		FileOutputStream fis=new FileOutputStream(file);
		OutputStreamWriter ops=new OutputStreamWriter(fis);
		ops.write("sdfasdffasdffds");
		byte[] b={'a','b'};
		fis.write(b);
		
	}
}
