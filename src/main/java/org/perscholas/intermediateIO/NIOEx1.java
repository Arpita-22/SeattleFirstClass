package org.perscholas.intermediateIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NIOEx1 {

	public static void main(String[] args) throws IOException{
	
		FileInputStream input = new FileInputStream("sample3.txt");
		ReadableByteChannel src = input.getChannel();
		FileOutputStream output = new FileOutputStream("sampleTo4.txt");
		WritableByteChannel dest =  output.getChannel();
		
		copyData(src,dest);
		src.close();
		dest.close();	
		
	}

	private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
		System.out.println(buffer);
		while(src.read(buffer) != -1) {
			buffer.flip();//buffer is used to drain
			//make sure that buffer was fully drained
			System.out.println(buffer);
			while(buffer.hasRemaining()) {
				dest.write(buffer);
			}
			buffer.clear();
		}//now the buffer is empty, ready for the filling
		
	}

}
