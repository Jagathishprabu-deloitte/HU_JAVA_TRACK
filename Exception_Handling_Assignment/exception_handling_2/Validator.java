package exception_handling_2;

public class Validator {
    public static void valid(String password) throws InvalidException{
        if(!((password.length() >= 5) && (password.length()<=10))){
            throw new InvalidException(1);
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
                throw new InvalidException(2);
            }
            if(!(password.contains("@"))||(password.contains("#"))||(password.contains("&"))||(password.contains("%"))||(password.contains("*"))||(password.contains("!"))){
                throw new InvalidException(3);
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
                    throw new InvalidException(5);
                }
            }
        }
    }
}
