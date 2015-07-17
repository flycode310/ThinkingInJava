package io;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.SortedMap;
import java.util.Iterator;

public class AvailableCharSets {
	public static void main(String[] args) {
		SortedMap<String, Charset> charSets =
				Charset.availableCharsets();
		Iterator<String> it = charSets.keySet().iterator();
		while (it.hasNext()) {
			String csName = it.next();
			System.out.println(csName);
			Iterator aliases =
					charSets.get(csName).aliases().iterator();
			if (aliases.hasNext())
				System.out.println(": ");
			while (aliases.hasNext()) {
				System.out.println(aliases.next());
				if (aliases.hasNext())
					System.out.println(", ");
			}
			System.out.println();
		}
	}
}
