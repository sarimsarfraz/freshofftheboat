import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsHeadlinesApp {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        // Replace 'YOUR_API_KEY' with your News API key
        String apiKey = "d9dd81bf4c1d45cc9feb20941333c9fd";

        // Replace 'CATEGORY' with the desired news category (e.g., technology, sports, entertainment)
        String category = "Technology";

        // Construct the API request URL
        String apiUrl = "https://newsapi.org/v2/top-headlines?category=" + category + "&apiKey=" + apiKey;

        Request request = new Request.Builder()
                .url(apiUrl)
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                System.out.println("Top News Headlines in " + category + ":\n" + responseBody);
            } else {
                System.err.println("API Request Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


