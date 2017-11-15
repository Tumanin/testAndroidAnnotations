package com.example.atumanin.testandroidannotations;

import android.text.format.DateFormat;

/**
 * Created by atumanin on 14.11.2017.
 */

public class Events {
    private Events(){}

    public static class Message {
        private String message;
        public Message(String message) {
            this.message = DateFormat.format("MM/dd/yy h:mm:ss aa", System.currentTimeMillis()) + ": " + message;
        }
        public String getMessage() {
            return message;
        }
    }
}
