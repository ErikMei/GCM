package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAW5fSds_SSJMCV9FiNi4qdF-X_qLNLLxo";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bGNmsWppZ_WG9fEIy83FlkE1gwdPnt2nt6gjPfNWj5vwnAXPiU8-LJaRBxxg2pP4BXuhxem8Sih-AMv603mBLzNRJZi7pgyTQGN45SfdgriXb7dTpZLzZKkBikGYFn_4ZHlTWJS");

        c.createData("Working!!", "Test message");

        return c;
    }
}

