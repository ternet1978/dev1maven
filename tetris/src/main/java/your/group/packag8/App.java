package your.group.packag8;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class App 
{
    public static void main( String[] args )
    {
		String jsonString = "{\"name\": \"Oleksandr\", \"lastName\": \"Dubok\"}";
		
		    // Парсинг JSON-рядка у JsonObject
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();

        // Отримання значень полів
        String name = jsonObject.get("name").getAsString();
        String lastName = jsonObject.get("lastName").getAsString();

        // Виведення значень
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
		
    }
}
