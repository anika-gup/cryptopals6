import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Base64;
import java.util.Collections;
import java.util.Scanner;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
public class Cybersecurity {
	static int specialNum = 0;


	public static void main(String[] args)
	throws IOException {
		// TODO Auto-generated method stub
		
		
		
		/*
		// challenge 1:----------------------------------------------
		byte[] a= hexToBytes("49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d");
		System.out.println(bytesToBase64(a));
		//String base64String = null;
		//base64ToBytes(base64String);
		//bytesToHex(a) ;
		
		//challenge two:-------------------------------------------------
		String hexStringOne = "1c0111001f010100061a024b53535009181c" ;
		byte[] first = hexToBytes(hexStringOne) ;
		String hexStringTwo = "686974207468652062756c6c277320657965" ;
		byte[] second = hexToBytes(hexStringTwo) ;
		byte[] answer = new byte[second.length] ;
		for (int i = 0; i < second.length ; i++) {
			answer[i] = (byte) ((first[i]) ^ (second[i])) ;
		}
		// now convert back to hex
		char[] ans = bytesToHex(answer) ;
		System.out.println(ans);
		
		String hexValues = "0123456789ABCDEF";
		// challenge three:-----------------------------------------------------
		// answer: Cooking MC's like a pound of bacon
		
		byte[] byHex = hexToBytes("1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736");
		byte[] hexValuesBytes = hexToBytes(hexValues);
		System.out.println("hexValuesBytes: ");
		for (int a1=0; a1<hexValuesBytes.length ; a1++) {
			System.out.print(hexValuesBytes[a1] + " ");
		}
		System.out.println("\n");
		
		for (int x=-128; x<127 ; x++) {
		
			byte[] toPrint = new byte[byHex.length] ;
			for (int y=0; y<byHex.length; y++) {
				byte newx = (byte) x ;
				toPrint[y] = (byte) (byHex[y] ^ newx) ;
			}
			System.out.println(bytesToASCII(toPrint)); ;	
		}
		
		
		*/
		
		
		//challenge four
		// answer: Now that the party is jumping
		/*
		String fileName="cryptopals.txt" ;
		Scanner fileReader;
		try {
			fileReader = new Scanner(new File(fileName)) ;
			while (fileReader.hasNextLine()) {
				  String line = fileReader.nextLine();
				//  System.out.println(line);
				  //what to do
				  // for each line in the file...
				  // hexToBytes 
				  // for loop from -128 to 127
				  	//create new byte array with length of hextobytes result = toPrint
				  	// for loop from 0 to hextobytes result
				  		//convert first for loop counter to byte
				  		// toPrint[] = (byte) (byHex[] ^ newx) ;
				  
				  byte[] byHex = hexToBytes(line);
				  System.out.println("\n");
				  for (int x=-128; x<127 ; x++) {
					  byte[] toPrint = new byte[byHex.length] ;
					  for (int y=0; y<byHex.length; y++) {
						  byte newx = (byte) x ;
						  toPrint[y] = (byte) (byHex[y] ^ newx) ;
					  }
					  String newToPrint = bytesToASCII(toPrint); ;	
					  isEnglish(newToPrint) ;
				  }
				}
				
				
			
			
		}
		catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		*/
		
		/*

		// challenge 5
		// convert the ascii to bytes
			//for loop going through each value of the byte array, iterator x
				// if statement:
				// if x%3 ==0, then compare to byte i (69)
				// else if x%3==1, then compare to byte c (63)
				// else if x%3==2, then compare to byte e (65)
		String input = "Burning 'em, if you ain't quick and nimble\n"
				+ "I go crazy when I hear a cymbal";
				//+ "I go crazy when I hear a cymbal" ;
		byte[] byteInput = ASCIIToByte(input) ;
		System.out.println();
		//System.out.println(ASCIIToByte("B")[0]);
	//	System.out.println(ASCIIToByte("i")[0]);
		//System.out.println(ASCIIToByte("c")[0]);
	//	System.out.println(ASCIIToByte("e")[0]);
		byte[] byteFinal = new byte[byteInput.length] ;
		for (int x=0; x<byteInput.length ; x++) {
			if (x%3 ==0) {
				//compare to i
				byte i = 73;
				System.out.print(byteInput[x] + " ^ " + i + " = ");
				byteFinal[x] = (byte) (byteInput[x] ^ i) ;
				System.out.println(byteFinal[x]);
				//byteFinal[x] = (byte) (i ^ byteInput[x]) ;
				
			}
			else if (x%3 == 1) {
				// compare to c
				byte c = 67 ;
				byteFinal[x] = (byte) (byteInput[x] ^ c) ;
			}
			else {
				// compare to e
				byte e = 69;
				byteFinal[x] = (byte) (byteInput[x] ^ e) ;	
			}
		}
		String strFinal = bytesToASCII(byteFinal);
		//System.out.println(byteFinal);
	//	System.out.println("printing byte final:");
		for (int a=0; a<byteFinal.length ; a++) {
			System.out.print(byteFinal[a]);
		}
		System.out.println();
	//	System.out.println(strFinal);
		char[] hexFinal = bytesToHex(byteFinal) ;
	//	System.out.println(hexFinal);
		String hexstr = "0b3637272a2b2e63622c2e69692a23693a2a3c6324202d623d63343c2a26226324272765272"
				+ "a282b2f20430a652e2c652a3124333a653e2b2027630c692b20283165286326302e27282f" ;
		byte[] hexbyte = hexToBytes(hexstr) ;
		System.out.println("printing what they said:");
		for (int z=0; z<hexbyte.length ; z++) {
			System.out.print(hexbyte[z]);
		}
		
		byte[] byteArr = {65, 66, 67, 68} ;
		System.out.println("------------");
		System.out.println(hexstr);
		System.out.println(bytesToHex(byteFinal));
		char[] hexbytestr = bytesToHex(byteFinal) ;
		int blah = 0;
		for(int count=0; count<hexstr.length(); count++) {
			if (hexbytestr[count]==hexstr.charAt(count)) {
				blah ++;
			}
		}
		System.out.println();
		if (blah==hexstr.length()) {
			System.out.println("they equal");
		}
		
		
		*/
		
		
		// CHALLENGE SIX
		Path fileName = Path.of("C:\\Users\\anika\\Downloads\\eclipse-java-2023-12-R-win32-x86_64\\eclipse\\cryptosix.txt");
		String str = Files.readString(fileName);
	
		
		byte[] bytes = base64ToBytes(str);
		for (int a=0; a <bytes.length; a++) {
			System.out.print(bytes[a]);
		}
		System.out.println();
		levelsix(bytes) ;
		
	
	}
	public static byte[] hexToBytes(String s) {
       int len = s.length();
       byte[] ans = new byte[len / 2]; // has to have half the 
       for (int i = 0; i < len; i += 2) {
            // left shift on every charcter
           ans[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                   + Character.digit(s.charAt(i+1), 16));
       }
         return ans ;	
	}
	public static byte[] base64ToBytes(String base64String) {
		 try {

	            byte[] bytes = Base64.getDecoder().decode(new String(base64String).getBytes("UTF-8"));
	            return bytes;
	        } catch (UnsupportedEncodingException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		//byte[] bytes = Base64.getDecoder().decode(base64String) ;
		return null;
	}
	public static String bytesToBase64(byte[] bytes) {
		String str = null;
		try {
			str = new String(bytes, "US-ASCII");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // converts to ASCII
		String base64String = Base64.getEncoder().encodeToString(str.getBytes());
		return base64String;
	}
	public static char[] bytesToHex(byte[] bytes) {
		//credit :  https://www.geeksforgeeks.org/java-program-to-convert-byte-array-to-hex-string/
		//byte[] bytes = {31, 61, 68 } ;
		//hex answer :  1f3d44
		int len = bytes.length;
        char[] hexValues = "0123456789ABCDEF".toCharArray(); // possible hexadecimal values, in order fr indexing
        char[] hexArr = new char[len * 2]; 
        System.out.println();
        for (int i = 0; i < len; i++) {
            int v = bytes[i] & 0xFF; // use & compare to all true so that it turns it into an int
            hexArr[i * 2] = hexValues[v >> 4]; // the v>>4 finds the first value in pair (even index), index with hexvalues in case it's 10 or more
            hexArr[i * 2 + 1] = hexValues[v & 0x0F]; // last half of v goes into it
        }
        return hexArr;	
	}
	public static String bytesToASCII(byte[] bytes) {
		String string = new String(bytes);
		return string;
	}
	public static byte[] ASCIIToByte(String str) {
		byte[] bytes = str.getBytes();
		return bytes;
	}
	
	
	
	public static boolean isEnglish(String str) {
		int count = 0;
		int ecount = 0;
		int aposcount = 0;
		int len = str.length();
		for (int x=0; x<str.length(); x++) {
			if (Character.isLetter(str.charAt(x)) || str.charAt(x)==' ' || str.charAt(x)=='\'') {
				count ++ ;
			}
			if (str.charAt(x)=='\'') {
				aposcount++;
			}
			if (str.charAt(x)=='E' || str.charAt(x)=='e') {
				ecount++;
			}
		}
		int nonenglish = len-count;

		if (count >9  && nonenglish<1 && aposcount<4) {
			System.out.println(str);
			return true;
		}
		return false;
	}	
	
	public static String byteToBinary(byte bite) {
		//converts byte to binary (doesn't include leading zeroes!!)
		int result = Byte.toUnsignedInt(bite);
		String toReturn = Integer.toBinaryString(result);
		return toReturn;
	}
	
	public static int findHammingDistance(String strone, String strtwo) {
		// :( this class was never used RIP
		
		// turns the strings into byte arrays
		byte[] testone = ASCIIToByte(strone) ;
		byte[] testtwo  =ASCIIToByte(strtwo) ;
		int count = 0; //counts how many 1s are in the binary things after XORing
		byte[] finalbyte = new byte[testone.length];
		for (int x=0; x<testone.length ; x++) {
			finalbyte[x] = finalbyte[x] = (byte) (testone[x] ^ testtwo[x]) ;	//xoring
			String binaryStr = byteToBinary(finalbyte[x])  ; //converts the byte to binary
			for(int y=0; y<binaryStr.length(); y++) {
				if (binaryStr.charAt(y)=='1') { 
					//counts every 1 that is there after XORing.
					count ++;
				}
			}
		}
		//returns hamming dist
		return count;
	}
	
	public static float normalizedEditDistance(int keysize, byte[] line) {

		byte[] testone = new byte[keysize];
		byte[] testtwo = new byte[keysize];
		for (int a=0; a<keysize; a++) {
			//fills the first one
			testone[a] = line[a];
		}
		for (int b=keysize; b<(keysize*2); b++) {
			// fills the second one
			testtwo[b-keysize] = line[b];
		}

		for(int c=0; c<keysize*2; c++) {
			//System.out.print(line[c]);
			// for testing purposes
		}
	
		
		float count = (float) 0.0; //counts how many 1s are in the binary things after XORing
		byte[] finalbyte = new byte[testtwo.length];
		
		for (int x=0; x<testtwo.length ; x++) {
			finalbyte[x] = finalbyte[x] = (byte) (testone[x] ^ testtwo[x]) ;	//xoring
			String binaryStr = byteToBinary(finalbyte[x])  ; //converts the byte to binary
			for(int y=0; y<binaryStr.length(); y++) {
				if (binaryStr.charAt(y)=='1') { 
					//counts every 1 that is there after XORing.
					count ++;
				}
			}
		}
		float toReturn = (float) count / keysize;
		// returns normalised hamming dist
		return toReturn;
	}
	
	public static int[] findKeyLength(byte[] line) {
		
		int min = 19;
		int max = 40;
		float[] array = new float[max-min];
		for(int a=min; a<max; a++) {
			float key = normalizedEditDistance(a, line) ;
		//	System.out.println("key "+ key);
			array[a-min] = key;
		}
 		for (int i = 0; i < array.length-1; i++)
		{
			int smallindex = i;
			for (int j = i+1; j < array.length; j++)
				if (array[j] < array[smallindex])
					smallindex = j;
			float copy = array[smallindex];
			array[smallindex] = array[i];
			array[i] = copy;
		}
 		for (int z=0; z<array.length; z++) {
 			//System.out.println(array[z]);
 		}
 		int[] toReturnArray = new int[8];
 	//	toReturnArray[0] = 29;
 		int index = 0;
 		for(int b=min; b<max; b++) {
 			for (int y=0; y<8; y++) {
 				if (array[y]==normalizedEditDistance(b, line)) {
 					// Keeping top 8 keysize values because not 100% sure which one it is :)
 		 				//specialNum = b;
 		 				toReturnArray[index] = b;
 		 				index++;
 		 		}
 			}
		}
		return toReturnArray;
	}

	public static void levelsix(byte[] line) {
	
 		int[] intarray = findKeyLength(line);
		//for (int keyindex=0; keyindex<intarray.length; keyindex++) {

			// tests out for the top few key lengths
			// after testing and running it is apparent that 29 is the corrent keysize
			
			/*
			int keysize = intarray[keyindex];
			System.out.println("\n\n Working on keysize: " + keysize + "\n\n");
			*/
			
			int keysize = 29; //(after testing, determined keysize=29)
			
		
			//String text = bytesToASCII(line);
			//System.out.println(text);
			
			
			findKey(line, keysize); 
			/* note:
			 * the findkey prints out the byte value for each value in the key
			 * most of them had only one possible key value
			 * the ones that had two, i looked at the str and chose whichever seemed most likely
			 * for the ones with none, i chose byte 101 since that's 'e' in english.
			 * i stored the byte values for the key in a byte array
			 */
		
			
			/*
			 *  after printing out the key,
			 *  it looks similar to another statement so 
			 *  i modified the words I know
			 */
			
			
		    String keyString = "Terminator ee bring the noise";
		    byte[] keyBytes = ASCIIToByte(keyString);
			//byte[] keyByte = {84, 101, 114, 109, 105, 67, 97, 116, 111, 101, 32, 101, 101, 32, 101, 114, 105, 110, 103, 32, 116, 104, 101, 32, 101, 101, 105, 101, 101};
		//	String keyString = bytesToASCII(keyByte);
			decryptVigenere(line, keyBytes);
			
			
		//}
		
	}
	public static void findKey(byte[] line, int keysize) {
		// this funct organises the stuff to find the key
		/*
		 * For each index in the key, it takes 10 values 
		 * (For instance if index is 0, for length of keysize it takes the 0th value, 10 times)
		 * Single XORs the 10 values with all possibilities
		 * prints out possibilities that are "english" based on program
		 * user decides which byte value to ultimately use for the key if multiple are printed
		 * 
		 */
		
		
		int c=0;
		for (int rem = 0; rem<keysize; rem++) {
			c = rem+1;
			System.out.println("Key Index: " +c );
			byte[] values = new byte[11];
			int index=0;
			for (int a=0; a<keysize*10; a++) {
				if (a%keysize==rem) {
					values[index] = line[a];
					index++;
				}
			}
			singleXOR(values);
		}
	}
	public static String singleXOR(byte[] line) {
		String newToPrint = "";
		for (int x=-128; x<127 ; x++) {
			  byte[] toPrint = new byte[line.length] ;
			  for (int y=0; y<line.length; y++) {
				  byte newx = (byte) x ;
				  toPrint[y] = (byte) (line[y] ^ newx) ;
			  }
			  newToPrint = bytesToASCII(toPrint); 
			  /* if it seems like it's english, then program prints it out 
			  and prints out what byte value that was
			  user decides whether to use that byte value
			  */
			  if (isEnglish(newToPrint)==true) {
				  System.out.println("was x=" + x);
			  }
			 
		}
		return newToPrint;
	}
	
	public static void decryptVigenere(byte[] byteInput, byte[] key) {
		// using the key and the text (in bytes) it decrypts and prints in ASCII
			byte[] byteFinal = new byte[byteInput.length] ;
			for (int x=0; x<byteInput.length ; x++) {
				for (int rem=0; rem<byteInput.length-1; rem++) {
					if (x%29==rem) {
						byteFinal[x] = (byte) (byteInput[x]^key[rem]);
					}
				}
				
			}
			String strFinal = bytesToASCII(byteFinal);
			
			System.out.println("\nFINAL----------\n");
			System.out.println(strFinal);
	}
	
	
	
		
}
