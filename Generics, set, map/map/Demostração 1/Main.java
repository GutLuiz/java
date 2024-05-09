


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> cookies = new TreeMap<>(); // como é treemap o print sera ordenado (como por exemplo esse String, vai ser em ordem alfabetica)

        cookies.put("username", "Maria"); //O put é a operação para inserir uma informação no map, como no exemplo, colocamos a chave username e o valor de Maria
        cookies.put("Email", "Maria@gmail.com");
        cookies.put("Phone", "99931831831");

        cookies.remove("Email"); //removendo o put da chave "email"
        cookies.put("Phone", "988899"); // como tem duas chaves indenticas, o programa sobreescreve o anterior

        System.out.println("Contains 'Phone' key: " + cookies.containsKey("Phone")); // perguntando para o programa se contem a chave 'Phone'
        System.out.println("Phone number: " + cookies.get("Phone")); // pegando o valor da chave 'Phone'
        System.out.println("Email: " + cookies.get("email")); // vendo como o terminal se comporta colocando o nome da chave errado
        System.out.println("Size: " + cookies.size()); // vendo o tamanho do nosso Map



        System.out.println("ALL COOKIES: ");

        for (String key : cookies.keySet()){ // retornando com o keySet com as chaves do map
            System.out.println(key + ": " + cookies.get(key)); // imprimindo os valores com o get
        }

        sc.close();



    }
}
