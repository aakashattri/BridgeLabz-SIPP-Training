import java.util.*;
public class CoffieApp{
    static Scanner sc = new Scanner(System.in); 
    static HashMap<String,Float> map= new HashMap<>();
    static {
        map.put("Cold Cof" ,  0.0f);
        map.put("Hot Cof" ,  0.0f) ; 
        map.put("Simple Cof" , 0.0f) ; 
    }

    public static void addBill(String s ,  int n ){
        map.put(s , map.get(s) + n  + (18*n / 100.0f)  );
    }
    public static void printBill(){
        for(String str : map.keySet()){
            System.out.println(str + " : " + map.get(str)) ; 
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("WELCOME TO THE COFFIE ORDER APPLICATION") ; 
        while(true){
            System.out.println("SELECT THE COFFIE TYPE");
            System.out.println("1 . Cold Cof : 10  ") ; 
            System.out.println("2 . Hot Cof : 20 "); 
            System.out.println("3 . Simple Cof : 30 ") ;
            System.out.println( "4. Check total") ;  
            System.out.println("OR TYPE EXIT TO EXIT THE APPLICATION") ; 
            String str =  sc.nextLine( ) ; 
            boolean counter = false;
            switch(str){
                case "Cold Cof"  : addBill(str , 10); break ; 
                case "Hot Cof" : addBill(str ,  20) ; break ;
                case "Simple Cof" : addBill(str, 30  ); break ;
                case "Check Total" : printBill(); break ; 
                case "EXIT" : counter  = true; break ; 
                default  : System.out.println(" DONT TYPE NUMBERS" ) ; 
            }
            if(counter ){
                break ;
            }
            
        }
        System.out.println("THANK YOU FOR USING OUR SERVICES" ) ; 
    }
}