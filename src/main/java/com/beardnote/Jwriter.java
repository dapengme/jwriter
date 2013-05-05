package com.beardnote;

public class Jwriter {

    private WebServer server;

    public Jwriter() {
        server = new WebServer(8006);
    }

    public void start() throws Exception {
        server.start();
        server.join();
    }

    public static void main(String... anArgs) {
        try {
            Jwriter js = new Jwriter();
            js.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
