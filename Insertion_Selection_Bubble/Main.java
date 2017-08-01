package nesneyeyonelikprogramlama;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        int counter;
        int secim;
        int diziBoyutu = 0;
        int [] dizi = null;
        
        Scanner keyboard = new Scanner(System.in);
        
        while ( true )
        {
            System.out.println("1)Veri Girisi");
            System.out.println("2)Selection");
            System.out.println("3)Insertion");
            System.out.println("4)Bubble");
            System.out.println("5)Diziyi Goster");
            System.out.println();
            System.out.print("Seciminiz : ");
           
            secim = keyboard.nextInt();
            System.out.println();
            
            switch(secim)
            {
                case 1:     System.out.print("Kac eleman girilecek : "); 
                            diziBoyutu = keyboard.nextInt();
                        
                            dizi = new int [diziBoyutu];
                            counter = 0;
                        
                            while ( counter < diziBoyutu )
                            {
                                System.out.print( (counter+1) + ". eleman : " ); dizi[counter] = keyboard.nextInt();
                                counter++;
                            }
                        
                            break;
                        
                case 2:     SortingClass nesne = new SortingClass(diziBoyutu); 
                            nesne.setArray(dizi); 
                            nesne.selection(); 
                        
                            break;
                        
                case 3:     SortingClass nesne2 = new SortingClass(diziBoyutu); 
                            nesne2.setArray(dizi); 
                            nesne2.insertion(); 
                        
                            break;
                        
                case 4:     SortingClass nesne3 = new SortingClass(diziBoyutu); 
                            nesne3.setArray(dizi); 
                            nesne3.bubble(); 
                        
                            break;
                            
                case 5:     System.out.print ("Dizi : ");
                    
                            for (int data : dizi )
                            {
                                System.out.print(data + " ");
                            }
                            
                            System.out.println();
                            
                            break;
                        
                default:    System.out.println("Hatali sayi girisi");
                            
                            break;
            }
            
            System.out.println();
        }
    }
}
