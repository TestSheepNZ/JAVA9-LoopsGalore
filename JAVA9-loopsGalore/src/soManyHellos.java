/*
 * This program is part of my learning Java series
 * This one looks at different forms of loops
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-9-repeating-ourselves-with-loops.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class soManyHellos {
	
    public static void multiLingualHelloWorld (int langID)
    {
    	switch (langID)
    	{
    		case 1:
    			System.out.println("Hola Mundo!");
    			break;
    		case 2:
    			System.out.println("Hallo Welt!");
    			break;
    		case 3:
    			System.out.println("Bonjour le monde!");
    			break;
    		default:
    			System.out.println("Hello world!");    
    	}
    }
      
 
 
     @Test
     public void copyAndPasteOption ()
     {
    	 System.out.println("Copy and paste command x10");
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 multiLingualHelloWorld(0);
		 
		 System.out.println();
     }
 
     @Test
     public void forLoopIt ()
     {
    	 System.out.println("For looped");
             
         for (int counter=0 ; counter<10 ; counter++)
         {
        	 multiLingualHelloWorld(0);
         }
             
         System.out.println();
     }
      
	 @Test
	 public void doLoopIt ()
	 {
		 System.out.println("While loop");
		         
		 int counter = 0;
		         
		 while ( counter<10 )
		 {
			 multiLingualHelloWorld(0);
			 counter++;
		 }
		         
		 System.out.println();
	 }
 
	 @Test
     public void doWhileLoopIt ()
     {
         System.out.println("Do-while loop");
             
         int counter = 0;
             
         do {
             multiLingualHelloWorld(0);
             counter++;
         } while ( counter<10 );
             
         System.out.println();
     }
      
     @Test
     public void doLoopMin ()
     {
    	 System.out.println("While loop - min");
             
		int counter = 10;
		 
		while ( counter<10 )
		{
		       multiLingualHelloWorld(0);
		       counter++;
		}
		 
		System.out.println();
     }
 
     @Test
     public void doWhileLoopMin ()
     {
        System.out.println("Do-while loop - min");
             
        int counter = 10;
             
        do {
            multiLingualHelloWorld(0);
            counter++;
        } while ( counter<10 );
             
        System.out.println();
     }
      
     @Test
     public void forWithABreak ()
     {
        System.out.println("For with break");
             
        for (int counter=0 ; counter<10 ; counter++)
        {
            multiLingualHelloWorld(0);
            if ( counter == 3 )
            {
            	break;
            }
        }
             
        System.out.println();
     }
      
     @Test
     public void multipleForLoops ()
     {
    	 System.out.println("Multiple loops");
             
    	 for (int language=0 ; language<4 ; language++)
    	 {
    		 for (int counter=0 ; counter<10 ; counter++)
    		 {
    			 multiLingualHelloWorld(language);
    			 if ( counter == 3 )
    			 {
    				 break;
                 }
    		 }
    	 }
             
     	System.out.println();
     }
}
