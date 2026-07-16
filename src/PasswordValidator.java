// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // TODO: implement ตาม spec ใน README.md (R1-R6)
        if(pw == null) throw new IllegalArgumentException();
        if(pw.length() == MIN_LEN) return true ;
        if(pw.length() == MAX_LEN) return true ;

       if (pw.length() < 8) return false ;
        if(pw.length() > 20) return false ;

        

        boolean hasUpper = false ;
        boolean hasLower = false ;
        boolean hasdigit = false ;
        boolean hasSpace = true ;
        for(int i=0 ; i<pw.length() ; i++ ){
            if (Character.isUpperCase(pw.charAt(i))) hasUpper = true ;
            if (Character.isLowerCase(pw.charAt(i))) hasLower = true ;
            if (Character.isDigit(pw.charAt(i))) hasdigit = true ;
            if (Character.isSpaceChar(pw.charAt(i))) hasSpace = false ;
            

        }
       
        return hasUpper && hasLower && hasSpace && hasdigit ;
    }
}
