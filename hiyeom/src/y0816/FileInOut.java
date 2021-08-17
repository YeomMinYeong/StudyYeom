package y0816;

import java.io.*;
import java.util.Scanner; 

public class FileInOut {

		 static Scanner s = new Scanner(System.in);
		   public static void main(String[] args) {
		      input();
		   } 
		   public static void input() {
			      FileInputStream fis = null;
			      InputStream ois = null;
			      try {
			         fis = new FileInputStream("d:\\app\\OX.txt");
			         int i = 0;
			         while(true) {
			            i = ois.read();
			            if(i != -1) {
			               System.out.print((char)i);
			            }else {
			               break;
			            }
			         }
			      }catch(Exception e) {
			         e.printStackTrace();
			      }finally {
			         if(ois != null)try{ois.close();}catch(Exception s) {}
			         if(fis != null)try{fis.close();}catch(Exception s) {}
			      }
			   }
		   
		   public static void output() { 
		      System.out.print("아웃:");
		      FileOutputStream fos=null;
		      byte [] b=null;
		      String str=null;
		      try {
		         fos = new FileOutputStream("d:\\app\\test1.txt");
		         str = s.nextLine();
		         b = str.getBytes();
		         fos.write(b);
		         System.out.println("");
		      } catch (Exception e) {
		         e.printStackTrace();
		      }finally {
		         if(fos != null)try{fos.close();}catch(Exception s) {}
		      }
		   }
		}