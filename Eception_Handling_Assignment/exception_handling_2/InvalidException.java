package exception_handling_2;

public class InvalidException extends Exception{
    int count = 0;
    public InvalidException(int caseNo){
        super("Invalid Password : ");
        count = caseNo;
    }
    public String message(){
        switch(count){
            case 1: return "Length should be 5 to 10";
            case 2: return "Password should contain number";
            case 3: return "Password should contain at least one of @ #  &  % * ! ";
            case 4: return "Password should contain at least one UpperCase";
            case 5: return "Password should contain at least one LowerCase";
        }
        return "";
    }
}
