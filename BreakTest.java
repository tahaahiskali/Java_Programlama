package nesneyeyonelikprogramlama;

public class BreakTest {
    
    public static void main(String[] args) {
        
        int count = 0;
        int [] a = {10,20,30,40,50};
        
        while ( count < a.length)
        {
            if ( a[count] == 30)
            {
                break;
            }
            
            System.out.println(count+". Eleman = " + a[count]);
            count++;
        }
    }
}



