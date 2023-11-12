import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import dto.User;

public class Main {

    public static void main(String[] args) {
        User person = new User("Dmytro", "Oliinyk");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String result = gson.toJson(person);

        System.out.println(result);
    }
}

