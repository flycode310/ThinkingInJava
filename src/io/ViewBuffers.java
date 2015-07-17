package io;

import java.nio.*;
public class ViewBuffers {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.wrap(
				new byte[]{0,0,0,0,0,0,0,0,'a'});
		bb.rewind();
		System.out.println("Byte buffer ");
		while (bb.hasRemaining())
			System.out.println(bb.position() + " -> " + bb.get() + ", ");
		CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
		System.out.println("Char Buffer ");
		while (cb.hasRemaining())
			System.out.println(cb.position() + " -> " + cb.get() + ", ");
		FloatBuffer fb =
				((ByteBuffer)bb.rewind()).asFloatBuffer();
		System.out.println("Float Buffer ");
		while (fb.hasRemaining())
			System.out.println(fb.position() + " -> " + fb.get() + ", ");
		IntBuffer ib = 
				((ByteBuffer)bb.rewind()).asIntBuffer();
		System.out.println("Integer Buffer");
		while (ib.hasRemaining())
			System.out.println(ib.position() + " -> " + ib.get() + ", ");
		LongBuffer lb = 
				((ByteBuffer)bb.rewind()).asLongBuffer();
		System.out.println("Long Buffer");
		while (lb.hasRemaining())
			System.out.println(lb.position() + " -> " + lb.get() + ", ");
		ShortBuffer sb = 
				((ByteBuffer)bb.rewind()).asShortBuffer();
		System.out.println("Short Buffer");
		while (sb.hasRemaining())
			System.out.println(sb.position() + " -> " + sb.get() + ", ");
		DoubleBuffer db = 
				((ByteBuffer)bb.rewind()).asDoubleBuffer();
		System.out.println("Double Buffer");
		while (db.hasRemaining())
			System.out.println(db.position() + " -> " + db.get() + ", ");
	}
}
