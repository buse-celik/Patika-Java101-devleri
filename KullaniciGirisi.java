import java.util.Scanner;

class KullaniciGirisi{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String username = "patika", password = "java", reset, newPassword;

        System.out.print("username: ");
        username = input.nextLine();

        System.out.print("password: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java")){
            System.out.println("access granted");
        }else {
            System.out.println("username or password incorrect");

            System.out.println("do you want to reset password? type \"yes\" or \"no\" ");
                reset = input.nextLine();
                if(reset.equals("yes")){
                    System.out.print("new password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("java")){
                        System.out.println("new password should be different from the previous one");
                    }
                    else {
                        System.out.println("new password is set");
                    }
                }else {
                    System.out.println("access denied");
                }

                
        }
        
         

    }
}