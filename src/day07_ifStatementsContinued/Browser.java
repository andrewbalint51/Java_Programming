package day07_ifStatementsContinued;

public class Browser {
    public static void main(String[] args) {

        String browserName = "saaaafari";

        if(browserName != "chrome" && browserName != "firefox" && browserName != "opera"
                && browserName != "safari" && browserName != "edge"){

            System.out.println("Invalid Browser Name");

        }
        else {
            if(browserName=="chrome"){
                System.out.println("Chrome Browser is selected");
            }
            else if(browserName=="firefox"){
                System.out.println("Firefox Browser is selected");
            }
            else if(browserName=="opera"){
                System.out.println("Opera Browser is selected");
            }
            else if(browserName=="safari"){
                System.out.println("Safari Browser is selected");
            }
            else if(browserName=="edge"){
                System.out.println("Edge Browser is selected");
            }

        }

    }
}
/*
2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */