package PersonalPactice;
import org.apache.commons.codec.binary.Base64;


public class EncodingDecoding_Password {
	
	public static String decode(String encodedPassword){   //Return type is String  //this is the one of the method is created 
		
		byte[] valueDecoded= Base64.decodeBase64(encodedPassword );
		return new String(valueDecoded);
		
	}

	public static void main(String[] args) {
	
		       
		       // encode data on your side using BASE64
				byte[]   bytesEncoded = Base64.encodeBase64("01716593313" .getBytes());
				System.out.println("ecncoded value is " + new String(bytesEncoded ));

				// Decode data on other side, by processing encoded data
				byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
				System.out.println("Decoded value is " + new String(valueDecoded));
				
		
		
		  System.out.println(decode("MDE3MTY1OTMzMTM="));
				
				
				
				
				
				
				

	}

}
