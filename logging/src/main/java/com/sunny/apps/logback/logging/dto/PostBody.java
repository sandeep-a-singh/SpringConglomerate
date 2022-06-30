package com.sunny.apps.logback.logging.dto;

import java.sql.Timestamp;

public class PostBody {

  private String postedBy;
  private Timestamp postedAt;
  private Timestamp ETA;

  public String getPostedBy() {
    return postedBy;
  }

  public void setPostedBy(String postedBy) {
    this.postedBy = postedBy;
  }

  public Timestamp getPostedAt() {
    return postedAt;
  }

  public void setPostedAt(Timestamp postedAt) {
    this.postedAt = postedAt;
  }

  public Timestamp getETA() {
    return ETA;
  }

  public void setETA(Timestamp ETA) {
    this.ETA = ETA;
  }
}
