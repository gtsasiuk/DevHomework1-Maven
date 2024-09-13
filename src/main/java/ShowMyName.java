import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ShowMyName {
    public static void main(String[] args) {
        FullName fullName = new FullName("Yevhenii", "Tsasiuk","Maven");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(fullName);
        System.out.println(json);
    }
}
