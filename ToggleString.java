import java.util.Scanner;
public class ToggleString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String toggled="";
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(Character.isUpperCase(ch)){
                toggled+=Character.toLowerCase(ch);
            } else {
                toggled+=Character.toUpperCase(ch);
            }
        }
        System.out.println(toggled);
    }
}