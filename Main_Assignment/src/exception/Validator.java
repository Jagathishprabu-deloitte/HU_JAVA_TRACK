package exception;


public class Validator {
    public static void agecheck(int age) throws InvalidException{
        if(age<18 || age>90){
            throw new InvalidException(1);
        }
    }
    public static void salarycheck(int salary) throws InvalidException{
        if(salary<=0){
            throw new InvalidException(2);
        }
    }
    public static void phonenocheck(long phoneNumber) throws InvalidException{
        String str = String.valueOf(phoneNumber);
        if(str.length()!=10){
            throw new InvalidException(3);
        }
    }
    public static void passcheck(String password) throws InvalidException{
        if(!((password.length() >= 5) && (password.length()<=10))){
            throw new InvalidException(4);
        }
        if(true){
            int count = 0;
            for(int i = 0;i<=9;i++){
                String str=Integer.toString(i);
                if(password.contains(str)){
                    count=1;
                }
            }
            if(count==0){
                throw new InvalidException(4);
            }
            if(!(password.contains("@"))||(password.contains("#"))||(password.contains("&"))||(password.contains("%"))||(password.contains("*"))||(password.contains("!"))){
                throw new InvalidException(4);
            }
            if(true){
                int count1=0;
                for(int i = 65;i<=90;i++){
                    char c=(char)i;
                    String str=Character.toString((c));
                    if(password.contains(str)){
                        count1=1;
                    }
                }
                if(count1==0){
                    throw new InvalidException(4);
                }
            }
            if(true){
                int count2=0;
                for(int i = 90;i<=122;i++){
                    char c=(char)i;
                    String str=Character.toString((c));
                    if(password.contains(str)){
                        count2=1;
                    }
                }
                if(count2==0){
                    throw new InvalidException(4);
                }
            }
        }
    }
}
