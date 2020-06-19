package com.kmarnik.marnik.post;

class Post {

  private final int id;
  private final String title;
  private final String url;
  private final String content;

  Post(int id, String title, String url, String content) {
    this.id = id;
    this.title = title;
    this.url = url;
    this.content = content;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getUrl() {
    return url;
  }

  public String getContent() {
    return content;
  }
}
