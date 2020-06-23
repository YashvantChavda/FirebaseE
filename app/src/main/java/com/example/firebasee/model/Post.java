package com.example.firebasee.model;

public class Post {
    private String description;
    private String postId;
    private String publisher;

    public Post() {
    }

    public Post(String description, String postId, String publisher) {
        this.description = description;
        this.postId = postId;
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
