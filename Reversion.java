import com.sun.tools.corba.se.idl.StringGen;

public class Reversion {

    public String reverse(String input, String output){
        if(input.length() == 0){
            return output;
        }else {
//            System.out.println(output.charAt(output.length()-1));
////            reverse(output.substring(0, output.length()-1));
            String x = input.substring(0,input.length()-1);
            String y = output + input.charAt(input.length()-1);
            return reverse(x, y);
        }

    }
}
