
package nesneyeyonelikprogramlama;

public class SortingClass {
    
    private int array [];
    private int lenght;

    public SortingClass(int lenght) {
        this.lenght = lenght;
    }
    
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    void selection()
    {
        int temp;
        int min;
        
        int i;
        int j;
        
        for(i=0; i<lenght-1; i++)
        {
            min = i;
            
            for(j=i; j<lenght; j++)
            {
                if (array[j] < array[min]) 
                {
                    min = j;
                }
            }
            
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
    void insertion()
    {
        
        int i;
        int temp;
        int j;
        
        for (i=1; i < lenght; i++)
        {
            temp = array[i];
            
            for ( j=i-1; j>=0 && temp < array[j]; j--)
            {
                array[j+1] = array[j];
            }
            
            array[j+1] = temp;
        }
    }
    
    void bubble()
    {
        int temp;  
        int i;
        int j;
        
        for (i=1; i<lenght; i++)
        {
            for(j=0; j<lenght-i; j++)
            {
                if ( array[j] > array [j+1])
                {
                    temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                }
            }
        }
    }
   
}
