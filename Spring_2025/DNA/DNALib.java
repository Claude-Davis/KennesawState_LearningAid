class DNALib{

    //method 1
    static boolean validator (String valid){
        boolean validator = false;
        
        int length = valid.length();
        if (v.isEmpty())     {validator = false;}
        for (int i=0; i<=valid.length(); i++){
            if (valid .get(i).equals("A") || valid.get(i).equals("C") || valid.get(i).equals("G") || valid.get(i).equals("T")){
                validator = false;
            }
        }

        return validator;
    }
    
    //method 2
    static String reverser(String reverse)    {return reverse;}

    //method 3
    static String inverser(String inverse)    {
        for (int l=0; l<inverse.length(); l++){
            //
        }
    }
}