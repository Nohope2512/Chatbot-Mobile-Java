package com.example.chatbot_mobile_java.bin.api.gemini.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestModel {
    @SerializedName("contents")
    private List<Content> contents;

    public RequestModel(List<Content> contents) {
        this.contents = contents;
    }

    public List<Content> getContents() {
        return contents;
    }

    public static class Content {
        @SerializedName("parts")
        private List<Part> parts;

        public Content(List<Part> parts) {
            this.parts = parts;
        }

        public List<Part> getParts() {
            return parts;
        }
    }

    public static class Part {
        @SerializedName("text")
        private String text;

        public Part(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
