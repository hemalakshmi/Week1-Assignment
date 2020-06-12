
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a ="madam";
       String rev= "";
       int n = a.length();
       for(int i=n-1;i>=0;i--) {
    	   rev = rev + a.charAt(i);
       }
           if(a.equals(rev)) {
           
               System.out.println("Given string is palindrome");
           
           }
           else {
           
               System.out.println("Given string is not palindrome");
           }
       
	}

	}

