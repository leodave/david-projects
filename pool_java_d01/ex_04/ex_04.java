public class ex_04 {
    public static void main ( String [] args ) 
    {
        printMovieFromNbr(28);
       
    }
    public static void printMovieFromNbr (int nbr ){
        switch(nbr){
            case 3:
                System.out.println("The Three Brothers");
                break;
            
             case 6:
                System.out.println("The Sixth Sense”");
                break;
            case 23:
                System.out.println("The Number 23");
                break;
            case 28:
                System.out.println("28 Days Later");
                break;
            default:
             System.out.println("I don’t know.");
                break;

        }
    }
}