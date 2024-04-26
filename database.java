import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoConnectionExample {

    public static void main(String[] args) {
        // Connexion à MongoDB (sans authentification)
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://danguirnour2:WoJtGHHZVfqQQeOM@nourdb.3anzgxl.mongodb.net/movies")) {
            // Sélection de la base de données
            MongoDatabase database = mongoClient.getDatabase("mydatabase");

            // Sélection de la collection
            MongoCollection<Document> collection = database.getCollection("mycollection");

            // Création d'un nouveau document
            Document doc = new Document("imdb", "tt5580036")
                                    .append("title", "I, Tonya")
                                    .append("year", 2017)
                                    .append("genre", "Biography")
                                    .append("country", "USA");
            
            
            System.out.println("Document inserted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
