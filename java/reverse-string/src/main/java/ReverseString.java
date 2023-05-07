class ReverseString {

    String reverse(String inputString) {
        if(inputString == null){
            return null;
        }
        String reversedString = "";
        for(int i = inputString.length()-1; i>=0 ; i--){
            reversedString = reversedString + inputString.charAt(i);
        }
            return reversedString;
    }
  
}
