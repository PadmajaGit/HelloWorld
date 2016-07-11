package HelloWorld.HelloWorld;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("*******************1**************");
        int i=0;
        if(i==0)
        {
        	assertTrue( true );
        }
        else
        {
        	assertTrue( false );
        }
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	System.out.println("*************** 2 ******************");
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("***************** 3 ****************");
        assertTrue( true );
    }
    
    public void testAppFail()
    {
    	System.out.println("***************** 3 ****************");
      //  assertTrue( true );
        fail("Dividing with zero should cause an exception!");
    }
    
    
    
}
