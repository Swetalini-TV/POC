package steps;

import com.google.api.client.http.HttpResponseException;
import entities.response.SearchResponseObjectModel.SearchResponse;
import helpers.SearchHelper;

public class SearchYoutube {

    private static void run() throws Exception {

        SearchHelper sh = new SearchHelper();
        SearchResponse response = sh.searchYoutubeWithPartAndQueryReturnClass("snippet", "cute");
        if (response == null) {
            System.out.println("!!!!!!!!!!!!!!!!!!DINT GET RESPONSE!!!!!!!!!!!!!!");

        } else {
            System.out.println("*******************GOT RESPONSE*****************");
        }
//        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getContent()));
//
//        StringBuffer result = new StringBuffer();
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            result.append(line);
//        }
//        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        try {
            try {
                run();
                return;
            } catch (HttpResponseException e) {
                System.err.println(e.getMessage());
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.exit(1);
    }
}