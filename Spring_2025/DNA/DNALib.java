import java.util.Scanner;

class DNALib {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        System.out.println("[DNA Reverser and Translator]");

        System.out.print("Enter a sequence: ");
            String sequence = scan.nextLine();
        
        if (validator(sequence) == false)  { System.out.println("Your DNA sequence is not valid.");}
        if (validator(sequence) == false)  {
            sequence = reverser(sequence);
            System.out.println(translator(sequence));
        }
    }


    //method 1
    public static boolean validator (String valid)    {
        valid = valid.toUpperCase();
        if (valid.isEmpty()){ return false;}
        if (valid.length()%3 != 0){ return false;}
            char first = valid.charAt(0);
        if (first != 'A' && first != 'C' && first != 'G' && first != 'T'){ return false;}
        if (valid.length() == 1){ return true;}  //once/when the length of the [sub]string reaches 1, then if the final char is an accepted letter, the method returns true
        return validator(valid.substring(1)); //the method is called--with the String being reduced by 1 char each time--until the length of the Strinhg is 1
    }
    
    //method 2
    public static String reverser(String reverse)    {
        return reverser(reverse.substring(reverse.length()-1));
    }

    //method 3
    public static String inverser(String inverse)    {
        return inverse;
    }

    //method 4
    public static String translator(String translation){
        for (int i=0; i<translation.length()/3; i++){
            String t = translation.substring(0,3);
            switch(t){
                case "CGA":
                    String aminoacid = "R";
                    break;
                case "GCC":
                    aminoacid = "A";
                    break;
                case "TGC":
                case "TGT":
                    aminoacid = "C";
                    break;
                case "GAC":
                    aminoacid = "D";
                    break;
                case "GAT":
                    aminoacid = "D";
                    break;
                case "GAA":
                    aminoacid = "E";
                    break;
                case "GAG":
                    aminoacid = "E";
                    break;
                case "TTC":
                    aminoacid = "F";
                    break;
                case "TTT":
                    aminoacid = "F";
                    break;
                case "GGA":
                    aminoacid = "G";
                    break;
                case "GGC":
                    aminoacid = "G";
                    break;
                case "GGG":
                    aminoacid = "G";
                    break;
                case "GGT":
                    aminoacid = "G";
                    break;
                case "CAC":
                    aminoacid = "H";
                    break;
                case "CAT":
                    aminoacid = "H";
                    break;
                case "ATA":
                    aminoacid = "I";
                    break;
                case "ATC":
                    aminoacid = "I";
                    break;
                case "ATT":
                    aminoacid = "T";
                    break;
                case "AAA":
                    aminoacid = "K";
                    break;
                case "AAG":
                    aminoacid = "K";
                    break;
                case "CTA":
                    aminoacid = "L";
                    break;
                case "CTC":
                    aminoacid = "L";
                    break;
                case "CTG":
                    aminoacid = "L";
                    break;
                case "CTT":
                    aminoacid = "L";
                    break;
                case "TTA":
                    aminoacid = "-";
                    break;
                case "TTG":
                    aminoacid = "L";
                    break;
                case "ATG":
                    aminoacid = "M";
                    break;
                case "AAT":
                    aminoacid = "N";
                    break;
                case "AAC":
                    aminoacid = "N";
                    break;
                case "CCA":
                    aminoacid = "P";
                    break;
                case "CCC":
                    aminoacid = "P";
                    break;
                case "CCG":
                    aminoacid = "P";
                    break;
                case "CCT":
                    aminoacid = "P";
                    break;
                case "CAA":
                    aminoacid = "Q";
                    break;
                case "CAG":
                    aminoacid = "Q";
                    break;
                case "AGA":
                    aminoacid = "R";
                    break;
                case "AGG":
                    aminoacid = "R";
                    break;
                case "CGC":
                    aminoacid = "R";
                    break;
                case "CGG":
                    aminoacid = "R";
                    break;
                case "CGT":
                    aminoacid = "R";
                    break;
                case "AGC":
                    aminoacid = "S";
                    break;
                case "AGT":
                    aminoacid = "S";
                    break;
                case "TCA":
                    aminoacid = "S";
                    break;
                case "TCC":
                    aminoacid = "S";
                    break;
                case "TCG":
                    aminoacid = "S";
                    break;
                case "TCT":
                    aminoacid = "S";
                    break;
                case "ACA":
                    aminoacid = "T";
                    break;
                case "ACC": 
                    aminoacid = "T";
                    break;
                case "ACG": 
                    aminoacid = "T";
                    break;
                case "ACT": 
                    aminoacid = "T"; 
                    break; 
                case "GTA": 
                    aminoacid = "V";
                    break;
                case "GTC": 
                    aminoacid = "V";
                    break;
                case "GTG": 
                case "GTT": 
                    aminoacid = "V"; 
                    break; 
                case "TGG": 
                    aminoacid = "W"; 
                    break; 
                case "TAC":
                    aminoacid = "Y";
                    break;
                case "TAT": 
                    aminoacid = "Y"; 
                    break; 
                case "TAA":
                    aminoacid = "-";
                    break;
                case "TAG":
                    aminoacid = "-";
                    break;
                case "TGA": 
                    aminoacid = "-"; 
                    break;
            }
        }
    }
}