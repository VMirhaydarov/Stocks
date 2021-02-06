package com.example.stocks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post3 {
    @SerializedName("history")
    @Expose
    private History history;
    @SerializedName("history.cursor")
    @Expose
    private HistoryCursor historyCursor;

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public HistoryCursor getHistoryCursor() {
        return historyCursor;
    }

    public void setHistoryCursor(HistoryCursor historyCursor) {
        this.historyCursor = historyCursor;
    }
}

//-----------------------------------com.example.ADMITTEDQUOTE.java-----------------------------------

class ADMITTEDQUOTE {

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
//-----------------------------------com.example.ADMITTEDVALUE.java-----------------------------------

class ADMITTEDVALUE {

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
//-----------------------------------com.example.BOARDID.java-----------------------------------


class BOARDID {

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
//-----------------------------------com.example.CLOSE.java-----------------------------------

class CLOSE {

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
//-----------------------------------com.example.HIGH.java-----------------------------------

class HIGH_Post3 {

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
//-----------------------------------com.example.History.java-----------------------------------

class History {

    @SerializedName("metadata")
    @Expose
    private Metadata__Post3 metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<List<String>> data = null;

    public Metadata__Post3 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata__Post3 metadata) {
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
//----------------------------------com.example.HistoryCursor.java-----------------------------------

class HistoryCursor {

    @SerializedName("metadata")
    @Expose
    private Metadata___Post3 metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<List<Integer>> data = null;

    public Metadata___Post3 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata___Post3 metadata) {
        this.metadata = metadata;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<List<Integer>> getData() {
        return data;
    }

    public void setData(List<List<Integer>> data) {
        this.data = data;
    }

}
//-----------------------------------com.example.INDEX.java-----------------------------------

class INDEX {

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
//-----------------------------------com.example.LEGALCLOSEPRICE.java-----------------------------------

class LEGALCLOSEPRICE {

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
//-----------------------------------com.example.LOW.java-----------------------------------

class LOW_Post3 {

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
//-----------------------------------com.example.MARKETPRICE2.java-----------------------------------

class MARKETPRICE2 {

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
//-----------------------------------com.example.MARKETPRICE3.java-----------------------------------

class MARKETPRICE3 {

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
//-----------------------------------com.example.MARKETPRICE3TRADESVALUE.java-----------------------------------

class MARKETPRICE3TRADESVALUE {

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
//-----------------------------------com.example.MP2VALTRD.java-----------------------------------

class MP2VALTRD {

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
//-----------------------------------com.example.Metadata.java-----------------------------------

class Metadata__Post3 {

    @SerializedName("BOARDID")
    @Expose
    private BOARDID bOARDID;
    @SerializedName("TRADEDATE")
    @Expose
    private TRADEDATE tRADEDATE;
    @SerializedName("SHORTNAME")
    @Expose
    private SHORTNAME sHORTNAME;
    @SerializedName("SECID")
    @Expose
    private SECID_Post3 sECID;
    @SerializedName("NUMTRADES")
    @Expose
    private NUMTRADES nUMTRADES;
    @SerializedName("VALUE")
    @Expose
    private VALUE vALUE;
    @SerializedName("OPEN")
    @Expose
    private OPEN oPEN;
    @SerializedName("LOW")
    @Expose
    private LOW_Post3 lOW;
    @SerializedName("HIGH")
    @Expose
    private HIGH_Post3 hIGH;
    @SerializedName("LEGALCLOSEPRICE")
    @Expose
    private LEGALCLOSEPRICE lEGALCLOSEPRICE;
    @SerializedName("WAPRICE")
    @Expose
    private WAPRICE wAPRICE;
    @SerializedName("CLOSE")
    @Expose
    private CLOSE cLOSE;
    @SerializedName("VOLUME")
    @Expose
    private VOLUME vOLUME;
    @SerializedName("MARKETPRICE2")
    @Expose
    private MARKETPRICE2 mARKETPRICE2;
    @SerializedName("MARKETPRICE3")
    @Expose
    private MARKETPRICE3 mARKETPRICE3;
    @SerializedName("ADMITTEDQUOTE")
    @Expose
    private ADMITTEDQUOTE aDMITTEDQUOTE;
    @SerializedName("MP2VALTRD")
    @Expose
    private MP2VALTRD mP2VALTRD;
    @SerializedName("MARKETPRICE3TRADESVALUE")
    @Expose
    private MARKETPRICE3TRADESVALUE mARKETPRICE3TRADESVALUE;
    @SerializedName("ADMITTEDVALUE")
    @Expose
    private ADMITTEDVALUE aDMITTEDVALUE;
    @SerializedName("WAVAL")
    @Expose
    private WAVAL wAVAL;

    public BOARDID getBOARDID() {
        return bOARDID;
    }

    public void setBOARDID(BOARDID bOARDID) {
        this.bOARDID = bOARDID;
    }

    public TRADEDATE getTRADEDATE() {
        return tRADEDATE;
    }

    public void setTRADEDATE(TRADEDATE tRADEDATE) {
        this.tRADEDATE = tRADEDATE;
    }

    public SHORTNAME getSHORTNAME() {
        return sHORTNAME;
    }

    public void setSHORTNAME(SHORTNAME sHORTNAME) {
        this.sHORTNAME = sHORTNAME;
    }

    public SECID_Post3 getSECID() {
        return sECID;
    }

    public void setSECID(SECID_Post3 sECID) {
        this.sECID = sECID;
    }

    public NUMTRADES getNUMTRADES() {
        return nUMTRADES;
    }

    public void setNUMTRADES(NUMTRADES nUMTRADES) {
        this.nUMTRADES = nUMTRADES;
    }

    public VALUE getVALUE() {
        return vALUE;
    }

    public void setVALUE(VALUE vALUE) {
        this.vALUE = vALUE;
    }

    public OPEN getOPEN() {
        return oPEN;
    }

    public void setOPEN(OPEN oPEN) {
        this.oPEN = oPEN;
    }

    public LOW_Post3 getLOW() {
        return lOW;
    }

    public void setLOW(LOW_Post3 lOW) {
        this.lOW = lOW;
    }

    public HIGH_Post3 getHIGH() {
        return hIGH;
    }

    public void setHIGH(HIGH_Post3 hIGH) {
        this.hIGH = hIGH;
    }

    public LEGALCLOSEPRICE getLEGALCLOSEPRICE() {
        return lEGALCLOSEPRICE;
    }

    public void setLEGALCLOSEPRICE(LEGALCLOSEPRICE lEGALCLOSEPRICE) {
        this.lEGALCLOSEPRICE = lEGALCLOSEPRICE;
    }

    public WAPRICE getWAPRICE() {
        return wAPRICE;
    }

    public void setWAPRICE(WAPRICE wAPRICE) {
        this.wAPRICE = wAPRICE;
    }

    public CLOSE getCLOSE() {
        return cLOSE;
    }

    public void setCLOSE(CLOSE cLOSE) {
        this.cLOSE = cLOSE;
    }

    public VOLUME getVOLUME() {
        return vOLUME;
    }

    public void setVOLUME(VOLUME vOLUME) {
        this.vOLUME = vOLUME;
    }

    public MARKETPRICE2 getMARKETPRICE2() {
        return mARKETPRICE2;
    }

    public void setMARKETPRICE2(MARKETPRICE2 mARKETPRICE2) {
        this.mARKETPRICE2 = mARKETPRICE2;
    }

    public MARKETPRICE3 getMARKETPRICE3() {
        return mARKETPRICE3;
    }

    public void setMARKETPRICE3(MARKETPRICE3 mARKETPRICE3) {
        this.mARKETPRICE3 = mARKETPRICE3;
    }

    public ADMITTEDQUOTE getADMITTEDQUOTE() {
        return aDMITTEDQUOTE;
    }

    public void setADMITTEDQUOTE(ADMITTEDQUOTE aDMITTEDQUOTE) {
        this.aDMITTEDQUOTE = aDMITTEDQUOTE;
    }

    public MP2VALTRD getMP2VALTRD() {
        return mP2VALTRD;
    }

    public void setMP2VALTRD(MP2VALTRD mP2VALTRD) {
        this.mP2VALTRD = mP2VALTRD;
    }

    public MARKETPRICE3TRADESVALUE getMARKETPRICE3TRADESVALUE() {
        return mARKETPRICE3TRADESVALUE;
    }

    public void setMARKETPRICE3TRADESVALUE(MARKETPRICE3TRADESVALUE mARKETPRICE3TRADESVALUE) {
        this.mARKETPRICE3TRADESVALUE = mARKETPRICE3TRADESVALUE;
    }

    public ADMITTEDVALUE getADMITTEDVALUE() {
        return aDMITTEDVALUE;
    }

    public void setADMITTEDVALUE(ADMITTEDVALUE aDMITTEDVALUE) {
        this.aDMITTEDVALUE = aDMITTEDVALUE;
    }

    public WAVAL getWAVAL() {
        return wAVAL;
    }

    public void setWAVAL(WAVAL wAVAL) {
        this.wAVAL = wAVAL;
    }

}
//-----------------------------------com.example.Metadata_.java-----------------------------------

class Metadata___Post3 {

    @SerializedName("INDEX")
    @Expose
    private INDEX iNDEX;
    @SerializedName("TOTAL")
    @Expose
    private TOTAL tOTAL;
    @SerializedName("PAGESIZE")
    @Expose
    private PAGESIZE pAGESIZE;

    public INDEX getINDEX() {
        return iNDEX;
    }

    public void setINDEX(INDEX iNDEX) {
        this.iNDEX = iNDEX;
    }

    public TOTAL getTOTAL() {
        return tOTAL;
    }

    public void setTOTAL(TOTAL tOTAL) {
        this.tOTAL = tOTAL;
    }

    public PAGESIZE getPAGESIZE() {
        return pAGESIZE;
    }

    public void setPAGESIZE(PAGESIZE pAGESIZE) {
        this.pAGESIZE = pAGESIZE;
    }

}
//-----------------------------------com.example.NUMTRADES.java-----------------------------------

class NUMTRADES {

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
//-----------------------------------com.example.OPEN.java-----------------------------------

class OPEN {

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
//-----------------------------------com.example.PAGESIZE.java-----------------------------------

class PAGESIZE {

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
//-----------------------------------com.example.SECID.java-----------------------------------

class SECID_Post3 {

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
//-----------------------------------com.example.SHORTNAME.java-----------------------------------

class SHORTNAME_Post3 {

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
//-----------------------------------com.example.TOTAL.java-----------------------------------

class TOTAL {

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
//-----------------------------------com.example.TRADEDATE.java-----------------------------------

class TRADEDATE_Post3 {

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
//-----------------------------------com.example.VALUE.java-----------------------------------

class VALUE {

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
//-----------------------------------com.example.VOLUME.java-----------------------------------

class VOLUME {

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
//-----------------------------------com.example.WAPRICE.java-----------------------------------

class WAPRICE {

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
//-----------------------------------com.example.WAVAL.java-----------------------------------

class WAVAL {

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