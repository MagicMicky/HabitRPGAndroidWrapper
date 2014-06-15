package com.magicmicky.habitrpgwrapper.lib.api;

/**
 * Created by MagicMicky on 15/06/2014.
 */
public class Server {
    public final static Server NORMAL = new Server("https://habitrpg.com/");
    public final static Server BETA = new Server("https://beta.habitrpg.com/");

    private String addr;

    public Server(String addr) {
        this.addr=addr;
    }
    public Server(Server s) {
        this.addr = s.toString();
    }

    @Override
    public String toString() {
        return this.addr;
    }
}
