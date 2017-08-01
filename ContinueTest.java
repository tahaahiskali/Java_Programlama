package nesneyeyonelikprogramlama;

public class ContinueTest 
{
    public static void main(String[] args) 
    {
        String cumle = "selcuk universitesi nesneye yonelik programlama";
        
        int bulundu = 0;
        int i;

        for ( i=0; i<cumle.length(); i++ ) 
        {
            if (cumle.charAt(i) != 'e') // EĞER GELEN KARAKTER 'E' DEĞİLSE 
            {
                continue; // ALT SATIRLARA GEÇMEDEN FOR DÖNGÜSÜNE DÖN VE i'yi ARTIRIP YENİDEN DÖNGÜYE GİR.
            }
            
            bulundu++; // EĞER KARAKTER 'E' İSE BULUNMA SAYISINI 1 ARTIR.
        }
        
        System.out.println(" 'e' karakterinin cumlede gecme sayisi = " + bulundu);
    }   
}
