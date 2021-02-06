package com.example.stocks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {
    @SerializedName("markets")
    @Expose
    private Markets markets;

    public Markets getMarkets() {
        return markets;
    }

    public void setMarkets(Markets markets) {
        this.markets = markets;
    }
}
//-----------------------------------com.example.Id.java-----------------------------------

class Id {

    @SerializedName("type")
    @Expose
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
//-----------------------------------com.example.Markets.java-----------------------------------

class Markets {

    @SerializedName("metadata")
    @Expose
    private Metadata_Post metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<List<String>> data = null;

    public Metadata_Post getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata_Post metadata) {
        this.metadata = metadata;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

}
//-----------------------------------com.example.Metadata.java-----------------------------------

class Metadata_Post {

    @SerializedName("id")
    @Expose
    private Id id;
    @SerializedName("NAME")
    @Expose
    private NAME_Post nAME;
    @SerializedName("title")
    @Expose
    private Title title;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public NAME_Post getNAME() {
        return nAME;
    }

    public void setNAME(NAME_Post nAME) {
        this.nAME = nAME;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

}
//-----------------------------------com.example.NAME.java-----------------------------------

class NAME_Post {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("bytes")
    @Expose
    private Integer bytes;
    @SerializedName("max_size")
    @Expose
    private Integer maxSize;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

}
//-----------------------------------com.example.Title.java-----------------------------------

class Title {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("bytes")
    @Expose
    private Integer bytes;
    @SerializedName("max_size")
    @Expose
    private Integer maxSize;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

}

