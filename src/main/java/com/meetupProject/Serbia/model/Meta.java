/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia.model;

import java.io.Serializable;

/**
 *
 * @author Nera
 */
public class Meta implements Serializable{

    private String next;
    private String method;
    private String total_count;
    private String link;
    private String count;
    private String description;
    private String lon;
    private String title;
    private String url;
    private String signed_url;
    private String id;
    private String updated;
    private String lat;

    public Meta() {
    }

    
    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSigned_url() {
        return signed_url;
    }

    public void setSigned_url(String signed_url) {
        this.signed_url = signed_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Meta{" + "next=" + next + ", method=" + method + ", total_count=" + total_count + ", link=" + link + ", count=" + count + ", description=" + description + ", lon=" + lon + ", title=" + title + ", url=" + url + ", signed_url=" + signed_url + ", id=" + id + ", updated=" + updated + ", lat=" + lat + '}';
    }
    

}
