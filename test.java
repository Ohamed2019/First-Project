import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            int[] i=new int[5];
            System.out.println(i[4]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        input.close();
    }
}