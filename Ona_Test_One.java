import java.io.*;
/*
 
 * @author: Kennedy Alex Omondi Owiro

  * @Email: jambotechsolutions@gmail.com

*/ 

public class myCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
    
   String[] lineArray;
    try{
        // an empty line indicates end of std input
        while((line = br.readLine()) != null){
            lineArray = line.split("\\s+"); // is "\\s+" the optimized regex
            int arrlength = lineArray.length;
            int[] lineInt = new int[arrlength];
            
           for(int i = 0; i < arrlength; i++){
                lineInt[i] = Integer.parseInt(lineArray[i]); 
             
           }
            // Preform some operations on lineInt, then regenerate a new   
            // lineInt with inputs from next line of stdin
            for(int i =0;i<lineInt.length;i++)
            {
                if(lineInt[i] % 3 == 0)
                {
                    System.out.println("ona"+"->"+lineInt[i]);
                }
                if(lineInt[i] % 5 == 0)
                {
                    System.out.println("Data"+"->"+lineInt[i]);
                
                }
                if((lineInt[i] % 5 == 0) && (lineInt[i] % 3 == 0))
                {
                    System.out.println("OnaData"+"->"+lineInt[i]);
                }
                if(((lineInt[i] % 5 != 0) && (lineInt[i] % 3 
                != 0)))
                {
                    System.out.println("N/A"+"->"+lineInt[i]);
                }
                
            }
        }
    }catch(IOException e){

    }
  }
  
}
