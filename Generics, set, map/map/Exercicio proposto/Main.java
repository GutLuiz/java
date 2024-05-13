import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> cookies = new LinkedHashMap<>();
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String username = fields[0];
                int count = Integer.parseInt(fields[1]);

                if(cookies.containsKey(username)){
                    int votesSoFar = cookies.get(username);
                    cookies.put(username,count + votesSoFar);
                }
                else {
                    cookies.put(username,count);
                }

                line = br.readLine();
            }
            for(String key : cookies.keySet()){
                System.out.println( key + ": " + cookies.get(key));
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
