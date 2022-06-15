package isbn;

public class ISBN {

    public static void main(String[] args) {
        System.out.println(isbn13("3930348659"));
    }
    //Creating a typed method called isbn13 
    static String isbn13(String inS) {
     
        int sum = 0;
        try {
            //Using a switch statement to determine if the ISBN length is 10 or 13
            switch (inS.length()) {
                /*If the length is 10, use a multiplication factor (mF)
                that decrements for every iteration of the loop, to multiply with
                the numerical value of the current character.
                */
                case 10 -> {
                    int mF = 10;
                    for (int i = 0; i < 10; i++) {
                        //Check if the current char is x
                        if (inS.charAt(i) != 'x') {
                            sum += Character.getNumericValue(inS.charAt(i)) * mF;
                        } else {
                            sum += 10 * mF;
                        }
                        mF--;
                    }
                    /*Checking if my sum is divisable by 11, if true, running the
                    helper method change10 to change the 10 digit ISBN number to a 
                    valid 13 digit ISBN number.
                    */ 
                    if (sum % 11 == 0) {
                        return change10(inS);
                    } else {
                        return "invalid";
                    }
                }
                //If the number is a 13 digit ISBN number:
                case 13 -> {
                    //Loop through my ISBN number
                    for (int i = 0; i < 13; i++) {
                        /*Changing the multiplication factor for every even 
                        or odd number of the ISBN number. Index number 0,2,4,5,6,8,10,12
                        will be multiplied by 1 and 1,3,5,7,9,11 by 3. 
                        */
                        if (i % 2 == 0) {
                            sum += Character.getNumericValue(inS.charAt(i));
                        } else {
                            sum += Character.getNumericValue(inS.charAt(i)) * 3;
                        }
                    }
                    //If sum is divisable by 10:
                    if (sum % 10 == 0) {
                        return "valid";
                    } else {
                        return "invalid";
                    }
                }
                //Default value for when string is not 10 or 13 characters:
                default -> {
                        return "Please enter a valid ISBN number";
                }
            }
        } catch (Exception e) {
            return "Please enter a valid ISBN number";
        }
    }
    /*Helper method to shorten method isbn13()
    take string a parameter and returns the next 
    valid 13 digit ISBN number.
    */
    private static String change10(String s) {
        //Tavking 978 to the start of my number.
        String temp = "978" + s;
        int i = 0;
        //Looping until the next valid 13 digit ISBN number is found:
        while (isbn13(temp).equals("invalid")) {
            temp = temp.substring(0, 12) + i;
            i++;
        }
        return temp;
    }

}
