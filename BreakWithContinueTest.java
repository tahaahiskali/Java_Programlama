
package nesneyeyonelikprogramlama;

public class BreakWithContinueTest {
    
    public static void main(String[] args) {
        
        String mesaj = "Hello World";
        int count = 0;
        
        do 
        {
            
            count++;
            
            if ( count == 3)
            {
                System.out.println("'continue komutu islendi'");
                continue;
            }
            
            else if ( count == 6 )
            {
                System.out.println("'break komutu islendi'");
                break;
            }
            
            System.out.println(count+". kez ekrana " + mesaj + " yazıldı");
            
             
        } while (true);
        
    }
    
}
