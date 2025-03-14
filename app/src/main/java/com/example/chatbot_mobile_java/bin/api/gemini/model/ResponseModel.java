package com.example.chatbot_mobile_java.bin.api.gemini.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModel {
    @SerializedName("candidates")
    private List<Candidate> candidates;

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public static class Candidate {
        @SerializedName("content")
        private Content content;

        public Content getContent() {
            return content;
        }
    }

    public static class Content {
        @SerializedName("parts")
        private List<Part> parts;

        public List<Part> getParts() {
            return parts;
        }
    }

    public static class Part {
        @SerializedName("text")
        private String text;

        public String getText() {
            return text;
        }
    }
}
