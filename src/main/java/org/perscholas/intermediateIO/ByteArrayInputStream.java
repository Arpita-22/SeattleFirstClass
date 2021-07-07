package org.perscholas.intermediateIO;

import java.io.*;

class ByteArrayInputStreamExample

{

      public static void main(String args[]) throws IOException

      {

           byte b[]="this is my first program".getBytes();

           ByteArrayInputStream inp =new ByteArrayInputStream(b);

           int n=inp.available();

           System.out.println("Number of available bytes: "+n);

           long s=inp.skip(11); //skipping 11 bytes

           System.out.println("Number of skipped bytes: "+s);

           int i;

           System.out.print("String after skipping s bytes: ");

           while((i=inp.read()) != -1)

                  {

                         System.out.print((char)i);

                   }

           inp.reset(); /*reset the pointer to the beginning of the stream*/

           System.out.println(); //new line

           int j;

           System.out.print("String in uppercase: ");

           while((j=inp.read()) != -1)

                  {

                      System.out.print(Character.toUpperCase((char) j));

                  }

      }

}
