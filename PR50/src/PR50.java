
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
	
class PR50
	   {
	   public static void main (String[] args) throws IOException
	      {
	      Scanner file = new Scanner (new File("pr50.txt"));
	      int numberOfRuns = file.nextInt();
	      for(int i = 0; i < numberOfRuns; i++)
	          {
	          String numbers = file.nextLine();
	          String[] numbersArray = numbers.split(" ");
	          ArrayList<Integer> occuranceCount = new ArrayList<Integer>();

	          int modeCounter = 0;
	          int highestModeCounter = 0;
	          int max = 0; 
	          int isHighestMode = 1;
	          
	          for(int t = 0; t < numbersArray.length; t++)
	              {
	              for(int j = t + 1; j < numbersArray.length; j++)
	                  {
	                  if(numbersArray[t].equals(numbersArray[j]))
	                      {
	                      isHighestMode += 1;
	                      numbersArray[j] = "101";
	                      System.out.println("numbersArray[t]: " + numbersArray[t]);
	                      }
	                  }
	              occuranceCount.add(isHighestMode);
	              isHighestMode = 1;
	              }
	          
	          System.out.println("AL size: " + occuranceCount.size());
	            
	          for(int c = 0; c < occuranceCount.size(); c++)
	              {
	              if(occuranceCount.get(c) > max)
	                  {
	                  max = occuranceCount.get(c);
	                  }
	              }
	            
	          for(int f = 0; f < occuranceCount.size(); f++)
	              {
	              if(max == occuranceCount.get(f))
	                  {
	                  modeCounter += 1;
	                  }
	              }
	          	          
	          System.out.println("ModeCounter: " + modeCounter);
	          
	          if(modeCounter == 1 )
	              {
	              System.out.println("1 MODE");
	              }
	          else
	              {
	              System.out.println(modeCounter + " MODES");
	              }
	          
	          System.out.println();
	          }   
	   	}
	}

	
