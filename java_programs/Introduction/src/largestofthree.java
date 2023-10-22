public class largestofthree {
    public static void main(String[] args){
    
    int x=2;
    int y=3;
    int z=4;
    if ( x > y && x > z)
    {
        System.out.println("Largest number: " + x);
    }
    else if ( y > x && y > z )
    {
        System.out.println("Largest number: " + y);
    }
    else if ( z > x && z > y ) 
    {
        System.out.println("Largest number: " + z);
    }
    else
    {
        System.out.println("All the numbers are not distinct.");
    }
}
}
