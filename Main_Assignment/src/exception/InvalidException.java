package exception;

public class InvalidException extends Exception{
    int count = 0;
    public InvalidException(int caseNo){
        super("Invalid Input : ");
        count = caseNo;
    }
    public String message(){
        switch(count){
            case 1: return "Age should be greater than 18 and less than 90";
            case 2: return "Salary should be greater than zero";
            case 3: return "Phone Number should be 10 digits";
            case 4: return "Password should contain 5 to 10 characters with at least one UpperCase,"+
                    " one LowerCase,one Special Character,one Number.";
        }
        return "";
    }
}
