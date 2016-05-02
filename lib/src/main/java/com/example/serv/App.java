package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCk--zRU7ZI9jl8seufekVRgShmGrWkpnA";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bHE2S-gHTyKFrLwdlWpIKZeFXyl2tjJJsmaOQWls8QO4D2X-vwoKIDORTTiAoi1JUEVMEXyFxTEme45lgs0KiaNO27bC-W-EiDxtNw_njlS2VQta4x1maXjD2_MZ6w0c_dHIfS2");

        c.createData("Working!!", "Test message");

        return c;
    }
}

