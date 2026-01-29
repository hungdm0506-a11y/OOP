import java.util.*;
import java.io.*;
public class Main{
    public static boolean isPerfectNumber(long n){
        if(n <= 1) return false;
        long sum = 1;
        for(long i = 2; i*i <= n; i++){
            if(n%i == 0){
                sum += i;
                if(i != n/i){
                    sum += n/i;
                }
            }
        }
        return sum == n;
    }
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("input.txt"));
            FileWriter writer = new FileWriter("output.txt");
            while(sc.hasNextLine()){
                String line = sc.nextLine().trim();
                if(line.isEmpty()) continue;
                String[] parts = line.split("//s+");
                long number = Long.parseLong(parts[1]);
                if(isPerfectNumber(number)){
                    writer.write(number + "la so hoan hao");
                }else{
                    writer.write(number + "khong phai la so hoan hao");
                }
            }
            sc.close();
            writer.close();
            System.out.println("Xem trong file output");
        }catch(Exception e){
            System.out.println("Co loi");
    }
}
}
