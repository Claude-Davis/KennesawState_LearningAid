import java.util.Scanner;

class DNALib{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("[DNA Reverser and Translator]");

        System.out.print("Enter a sequence: ");
            String sequence = scan.nextLine();
        
        if (validator(sequence) == false){ System.out.println("Your DNA sequence is not valid.");}
        if (validator(sequence) == true){ System.out.println("okay");
            //continue with other methods
        }
    }


    //method 1
    public static boolean validator (String valid){
        if (valid.length()<1){ return false;}
        if (valid.length()%3 != 0){ return false;}
        if (!valid.substring(0,1).equals("A")){ return false;}
            else if (!valid.substring(0,1).equals("G")){ return false;}
            else if (!valid.substring(0,1).equals("C")){ return false;}
            else if (!valid.substring(0,1).equals("T")){ return false;}
        return validator(valid.substring(1));
    }
    /*
    //method 2
    public static String reverser(String reverse)    {return reverse;}

    //method 3
    public static String inverser(String inverse)    {
        for (int l=0; l<inverse.length(); l++){
            if (inverse.get(l).equalsIgnoreCase("A")){
                //
            }
        }
    }

    //method 4
    public static String translator(String translation){
        
    } */
}