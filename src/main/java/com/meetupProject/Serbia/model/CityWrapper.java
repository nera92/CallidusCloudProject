/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meetupProject.Serbia.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Nera
 */
public class CityWrapper implements Serializable{

    private List<City> results;
    private Meta meta;

    public CityWrapper() {
    }

    public List<City> getResults() {
        return results;
    }

    public void setResults(List<City> results) {
        this.results = results;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "CityWrapper{" + "results=" + results.toString() + ", meta=" + meta + '}';
    }

  

    
}
