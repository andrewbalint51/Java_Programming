package day28_encapsulation.credentialsTask;

public class Credentials {

    private String username, password;

    public Credentials(String un, String pw){
        setUsername(un);

        setPassword(pw);


    }

    public void setUsername(String un){

        if(un.length()<5){
            System.err.println("Please set a valid Username");
        }
        else{
            username=un;
        }


    }

    public String getUsername(){

        if(username==null){
            return "No valid username set";
        }

        return username;
    }

    public void setPassword(String pw){
        if(isStrongPassword(pw)){
            password=pw;
        }
        else{
            System.err.println("Password not strong. Please choose a different password.");
        }
    }

    public String getPassword(){

        if(password==null){
            return "Please set a valid password";
        }

        return password;
    }

    public boolean isStrongPassword(String pw){
        boolean isStrong = true;

        if(pw.length()>=8 && !pw.contains(" ")){

            boolean hasLetter = false,
                    hasDigit = false,
                    hasSC = false;

            for(char each : pw.toCharArray()){
                if(Character.isLetter(each)){
                    hasLetter=true;
                    break;
                }
            }

            for(char each : pw.toCharArray()){
                if(Character.isDigit(each)){
                    hasDigit=true;
                    break;
                }
            }

            for(char each : pw.toCharArray()){
                if(!Character.isLetterOrDigit(each)){
                    hasSC=true;
                    break;
                }
            }

            if(!hasSC || !hasLetter || !hasDigit){
                isStrong= false;
            }


        }
        else{
            isStrong = false;
        }


        return isStrong;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
Create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */