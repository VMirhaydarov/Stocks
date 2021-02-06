package com.example.stocks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post2 {
    @SerializedName("securities")
    @Expose
    private Securities securities;
    @SerializedName("marketdata")
    @Expose
    private Marketdata marketdata;
    @SerializedName("dataversion")
    @Expose
    private Dataversion dataversion;
    @SerializedName("marketdata_yields")
    @Expose
    private MarketdataYields marketdataYields;

    public Securities getSecurities() {
        return securities;
    }

    public void setSecurities(Securities securities) {
        this.securities = securities;
    }

    public Marketdata getMarketdata() {
        return marketdata;
    }

    public void setMarketdata(Marketdata marketdata) {
        this.marketdata = marketdata;
    }

    public Dataversion getDataversion() {
        return dataversion;
    }

    public void setDataversion(Dataversion dataversion) {
        this.dataversion = dataversion;
    }

    public MarketdataYields getMarketdataYields() {
        return marketdataYields;
    }

    public void setMarketdataYields(MarketdataYields marketdataYields) {
        this.marketdataYields = marketdataYields;
    }
}
//-----------------------------------com.example.ANNUALHIGH.java-----------------------------------

class ANNUALHIGH {

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
//-----------------------------------com.example.ANNUALLOW.java-----------------------------------

class ANNUALLOW {

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

class BOARDID__ {

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
//-----------------------------------com.example.BOARDID_.java-----------------------------------

class BOARDID_ {

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
//-----------------------------------com.example.Boardid.java-----------------------------------

class Boardid_Post2 {

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
//-----------------------------------com.example.CALCMODE.java-----------------------------------

class CALCMODE {

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
//-----------------------------------com.example.CAPITALIZATION.java-----------------------------------

class CAPITALIZATION {

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
//-----------------------------------com.example.CAPITALIZATIONUSD.java-----------------------------------

class CAPITALIZATIONUSD {

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
//-----------------------------------com.example.CURRENCYID.java-----------------------------------

class CURRENCYID {

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
//-----------------------------------com.example.CURRENTVALUE.java-----------------------------------

class CURRENTVALUE {

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
//-----------------------------------com.example.DECIMALS.java-----------------------------------

class DECIMALS {

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
//-----------------------------------com.example.DataVersion.java-----------------------------------

class Data_Version {

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
//-----------------------------------com.example.Dataversion.java-----------------------------------

class Dataversion {

    @SerializedName("metadata")
    @Expose
    private Metadata__ metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<List<Long>> data = null;

    public Metadata__ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata__ metadata) {
        this.metadata = metadata;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<List<Long>> getData() {
        return data;
    }

    public void setData(List<List<Long>> data) {
        this.data = data;
    }

}

//-----------------------------------com.example.HIGH.java-----------------------------------

class HIGH {

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
//-----------------------------------com.example.LASTCHANGE.java-----------------------------------

class LASTCHANGE {

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
//-----------------------------------com.example.LASTCHANGEBP.java-----------------------------------

class LASTCHANGEBP {

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
//-----------------------------------com.example.LASTCHANGEPRC.java-----------------------------------

class LASTCHANGEPRC {

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
//-----------------------------------com.example.LASTCHANGETOOPEN.java-----------------------------------

class LASTCHANGETOOPEN {

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
//-----------------------------------com.example.LASTCHANGETOOPENPRC.java-----------------------------------

class LASTCHANGETOOPENPRC {

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
//-----------------------------------com.example.LASTVALUE.java-----------------------------------

class LASTVALUE {

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

class LOW {

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
//-----------------------------------com.example.MONTHCHANGEBP.java-----------------------------------

class MONTHCHANGEBP {

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
//-----------------------------------com.example.MONTHCHANGEPRC.java-----------------------------------

class MONTHCHANGEPRC {

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
//-----------------------------------com.example.Marketdata.java-----------------------------------

class Marketdata {

    @SerializedName("metadata")
    @Expose
    private Metadata_ metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<List<String>> data = null;

    public Metadata_ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata_ metadata) {
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
//-----------------------------------com.example.MarketdataYields.java-----------------------------------

class MarketdataYields {

    @SerializedName("metadata")
    @Expose
    private Metadata___ metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<Object> data = null;

    public Metadata___ getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata___ metadata) {
        this.metadata = metadata;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

}
//-----------------------------------com.example.Metadata.java-----------------------------------

class Metadata {

    @SerializedName("SECID")
    @Expose
    private SECID__ sECID;
    @SerializedName("BOARDID")
    @Expose
    private BOARDID__ bOARDID;
    @SerializedName("NAME")
    @Expose
    private NAME nAME;
    @SerializedName("DECIMALS")
    @Expose
    private DECIMALS dECIMALS;
    @SerializedName("SHORTNAME")
    @Expose
    private SHORTNAME sHORTNAME;
    @SerializedName("ANNUALHIGH")
    @Expose
    private ANNUALHIGH aNNUALHIGH;
    @SerializedName("ANNUALLOW")
    @Expose
    private ANNUALLOW aNNUALLOW;
    @SerializedName("CURRENCYID")
    @Expose
    private CURRENCYID cURRENCYID;
    @SerializedName("CALCMODE")
    @Expose
    private CALCMODE cALCMODE;

    public SECID__ getSECID() {
        return sECID;
    }

    public void setSECID(SECID__ sECID) {
        this.sECID = sECID;
    }

    public BOARDID__ getBOARDID() {
        return bOARDID;
    }

    public void setBOARDID(BOARDID__ bOARDID) {
        this.bOARDID = bOARDID;
    }

    public NAME getNAME() {
        return nAME;
    }

    public void setNAME(NAME nAME) {
        this.nAME = nAME;
    }

    public DECIMALS getDECIMALS() {
        return dECIMALS;
    }

    public void setDECIMALS(DECIMALS dECIMALS) {
        this.dECIMALS = dECIMALS;
    }

    public SHORTNAME getSHORTNAME() {
        return sHORTNAME;
    }

    public void setSHORTNAME(SHORTNAME sHORTNAME) {
        this.sHORTNAME = sHORTNAME;
    }

    public ANNUALHIGH getANNUALHIGH() {
        return aNNUALHIGH;
    }

    public void setANNUALHIGH(ANNUALHIGH aNNUALHIGH) {
        this.aNNUALHIGH = aNNUALHIGH;
    }

    public ANNUALLOW getANNUALLOW() {
        return aNNUALLOW;
    }

    public void setANNUALLOW(ANNUALLOW aNNUALLOW) {
        this.aNNUALLOW = aNNUALLOW;
    }

    public CURRENCYID getCURRENCYID() {
        return cURRENCYID;
    }

    public void setCURRENCYID(CURRENCYID cURRENCYID) {
        this.cURRENCYID = cURRENCYID;
    }

    public CALCMODE getCALCMODE() {
        return cALCMODE;
    }

    public void setCALCMODE(CALCMODE cALCMODE) {
        this.cALCMODE = cALCMODE;
    }

}
//-----------------------------------com.example.Metadata_.java-----------------------------------

class Metadata_ {

    @SerializedName("SECID")
    @Expose
    private SECID_ sECID;
    @SerializedName("BOARDID")
    @Expose
    private BOARDID_ bOARDID;
    @SerializedName("LASTVALUE")
    @Expose
    private LASTVALUE lASTVALUE;
    @SerializedName("OPENVALUE")
    @Expose
    private OPENVALUE oPENVALUE;
    @SerializedName("CURRENTVALUE")
    @Expose
    private CURRENTVALUE cURRENTVALUE;
    @SerializedName("LASTCHANGE")
    @Expose
    private LASTCHANGE lASTCHANGE;
    @SerializedName("LASTCHANGETOOPENPRC")
    @Expose
    private LASTCHANGETOOPENPRC lASTCHANGETOOPENPRC;
    @SerializedName("LASTCHANGETOOPEN")
    @Expose
    private LASTCHANGETOOPEN lASTCHANGETOOPEN;
    @SerializedName("UPDATETIME")
    @Expose
    private UPDATETIME uPDATETIME;
    @SerializedName("LASTCHANGEPRC")
    @Expose
    private LASTCHANGEPRC lASTCHANGEPRC;
    @SerializedName("VALTODAY")
    @Expose
    private VALTODAY vALTODAY;
    @SerializedName("MONTHCHANGEPRC")
    @Expose
    private MONTHCHANGEPRC mONTHCHANGEPRC;
    @SerializedName("YEARCHANGEPRC")
    @Expose
    private YEARCHANGEPRC yEARCHANGEPRC;
    @SerializedName("SEQNUM")
    @Expose
    private SEQNUM_ sEQNUM;
    @SerializedName("SYSTIME")
    @Expose
    private SYSTIME sYSTIME;
    @SerializedName("TIME")
    @Expose
    private TIME tIME;
    @SerializedName("VALTODAY_USD")
    @Expose
    private VALTODAYUSD vALTODAYUSD;
    @SerializedName("LASTCHANGEBP")
    @Expose
    private LASTCHANGEBP lASTCHANGEBP;
    @SerializedName("MONTHCHANGEBP")
    @Expose
    private MONTHCHANGEBP mONTHCHANGEBP;
    @SerializedName("YEARCHANGEBP")
    @Expose
    private YEARCHANGEBP yEARCHANGEBP;
    @SerializedName("CAPITALIZATION")
    @Expose
    private CAPITALIZATION cAPITALIZATION;
    @SerializedName("CAPITALIZATION_USD")
    @Expose
    private CAPITALIZATIONUSD cAPITALIZATIONUSD;
    @SerializedName("HIGH")
    @Expose
    private HIGH hIGH;
    @SerializedName("LOW")
    @Expose
    private LOW lOW;
    @SerializedName("TRADEDATE")
    @Expose
    private TRADEDATE tRADEDATE;

    public SECID_ getSECID() {
        return sECID;
    }

    public void setSECID(SECID_ sECID) {
        this.sECID = sECID;
    }

    public BOARDID_ getBOARDID() {
        return bOARDID;
    }

    public void setBOARDID(BOARDID_ bOARDID) {
        this.bOARDID = bOARDID;
    }

    public LASTVALUE getLASTVALUE() {
        return lASTVALUE;
    }

    public void setLASTVALUE(LASTVALUE lASTVALUE) {
        this.lASTVALUE = lASTVALUE;
    }

    public OPENVALUE getOPENVALUE() {
        return oPENVALUE;
    }

    public void setOPENVALUE(OPENVALUE oPENVALUE) {
        this.oPENVALUE = oPENVALUE;
    }

    public CURRENTVALUE getCURRENTVALUE() {
        return cURRENTVALUE;
    }

    public void setCURRENTVALUE(CURRENTVALUE cURRENTVALUE) {
        this.cURRENTVALUE = cURRENTVALUE;
    }

    public LASTCHANGE getLASTCHANGE() {
        return lASTCHANGE;
    }

    public void setLASTCHANGE(LASTCHANGE lASTCHANGE) {
        this.lASTCHANGE = lASTCHANGE;
    }

    public LASTCHANGETOOPENPRC getLASTCHANGETOOPENPRC() {
        return lASTCHANGETOOPENPRC;
    }

    public void setLASTCHANGETOOPENPRC(LASTCHANGETOOPENPRC lASTCHANGETOOPENPRC) {
        this.lASTCHANGETOOPENPRC = lASTCHANGETOOPENPRC;
    }

    public LASTCHANGETOOPEN getLASTCHANGETOOPEN() {
        return lASTCHANGETOOPEN;
    }

    public void setLASTCHANGETOOPEN(LASTCHANGETOOPEN lASTCHANGETOOPEN) {
        this.lASTCHANGETOOPEN = lASTCHANGETOOPEN;
    }

    public UPDATETIME getUPDATETIME() {
        return uPDATETIME;
    }

    public void setUPDATETIME(UPDATETIME uPDATETIME) {
        this.uPDATETIME = uPDATETIME;
    }

    public LASTCHANGEPRC getLASTCHANGEPRC() {
        return lASTCHANGEPRC;
    }

    public void setLASTCHANGEPRC(LASTCHANGEPRC lASTCHANGEPRC) {
        this.lASTCHANGEPRC = lASTCHANGEPRC;
    }

    public VALTODAY getVALTODAY() {
        return vALTODAY;
    }

    public void setVALTODAY(VALTODAY vALTODAY) {
        this.vALTODAY = vALTODAY;
    }

    public MONTHCHANGEPRC getMONTHCHANGEPRC() {
        return mONTHCHANGEPRC;
    }

    public void setMONTHCHANGEPRC(MONTHCHANGEPRC mONTHCHANGEPRC) {
        this.mONTHCHANGEPRC = mONTHCHANGEPRC;
    }

    public YEARCHANGEPRC getYEARCHANGEPRC() {
        return yEARCHANGEPRC;
    }

    public void setYEARCHANGEPRC(YEARCHANGEPRC yEARCHANGEPRC) {
        this.yEARCHANGEPRC = yEARCHANGEPRC;
    }

    public SEQNUM_ getSEQNUM() {
        return sEQNUM;
    }

    public void setSEQNUM(SEQNUM_ sEQNUM) {
        this.sEQNUM = sEQNUM;
    }

    public SYSTIME getSYSTIME() {
        return sYSTIME;
    }

    public void setSYSTIME(SYSTIME sYSTIME) {
        this.sYSTIME = sYSTIME;
    }

    public TIME getTIME() {
        return tIME;
    }

    public void setTIME(TIME tIME) {
        this.tIME = tIME;
    }

    public VALTODAYUSD getVALTODAYUSD() {
        return vALTODAYUSD;
    }

    public void setVALTODAYUSD(VALTODAYUSD vALTODAYUSD) {
        this.vALTODAYUSD = vALTODAYUSD;
    }

    public LASTCHANGEBP getLASTCHANGEBP() {
        return lASTCHANGEBP;
    }

    public void setLASTCHANGEBP(LASTCHANGEBP lASTCHANGEBP) {
        this.lASTCHANGEBP = lASTCHANGEBP;
    }

    public MONTHCHANGEBP getMONTHCHANGEBP() {
        return mONTHCHANGEBP;
    }

    public void setMONTHCHANGEBP(MONTHCHANGEBP mONTHCHANGEBP) {
        this.mONTHCHANGEBP = mONTHCHANGEBP;
    }

    public YEARCHANGEBP getYEARCHANGEBP() {
        return yEARCHANGEBP;
    }

    public void setYEARCHANGEBP(YEARCHANGEBP yEARCHANGEBP) {
        this.yEARCHANGEBP = yEARCHANGEBP;
    }

    public CAPITALIZATION getCAPITALIZATION() {
        return cAPITALIZATION;
    }

    public void setCAPITALIZATION(CAPITALIZATION cAPITALIZATION) {
        this.cAPITALIZATION = cAPITALIZATION;
    }

    public CAPITALIZATIONUSD getCAPITALIZATIONUSD() {
        return cAPITALIZATIONUSD;
    }

    public void setCAPITALIZATIONUSD(CAPITALIZATIONUSD cAPITALIZATIONUSD) {
        this.cAPITALIZATIONUSD = cAPITALIZATIONUSD;
    }

    public HIGH getHIGH() {
        return hIGH;
    }

    public void setHIGH(HIGH hIGH) {
        this.hIGH = hIGH;
    }

    public LOW getLOW() {
        return lOW;
    }

    public void setLOW(LOW lOW) {
        this.lOW = lOW;
    }

    public TRADEDATE getTRADEDATE() {
        return tRADEDATE;
    }

    public void setTRADEDATE(TRADEDATE tRADEDATE) {
        this.tRADEDATE = tRADEDATE;
    }

}
//-----------------------------------com.example.Metadata__.java-----------------------------------

class Metadata__ {

    @SerializedName("data_version")
    @Expose
    private Data_Version dataVersion;
    @SerializedName("seqnum")
    @Expose
    private Seqnum seqnum;

    public Data_Version getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Data_Version dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Seqnum getSeqnum() {
        return seqnum;
    }

    public void setSeqnum(Seqnum seqnum) {
        this.seqnum = seqnum;
    }

}
//-----------------------------------com.example.Metadata___.java-----------------------------------

class Metadata___ {

    @SerializedName("boardid")
    @Expose
    private Boardid_Post2 boardid;
    @SerializedName("secid")
    @Expose
    private Secid secid;

    public Boardid_Post2 getBoardid() {
        return boardid;
    }

    public void setBoardid(Boardid_Post2 boardid) {
        this.boardid = boardid;
    }

    public Secid getSecid() {
        return secid;
    }

    public void setSecid(Secid secid) {
        this.secid = secid;
    }

}
//-----------------------------------com.example.NAME.java-----------------------------------

class NAME {

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
//-----------------------------------com.example.OPENVALUE.java-----------------------------------

class OPENVALUE {

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

class SECID__ {

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
//-----------------------------------com.example.SECID_.java-----------------------------------

class SECID_ {

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
//-----------------------------------com.example.SEQNUM.java-----------------------------------

class SEQNUM_ {

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
//-----------------------------------com.example.SHORTNAME.java-----------------------------------

class SHORTNAME {

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
//-----------------------------------com.example.SYSTIME.java-----------------------------------

class SYSTIME {

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
//-----------------------------------com.example.Secid.java-----------------------------------

class Secid {

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
//-----------------------------------com.example.Securities.java-----------------------------------

class Securities {

    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("columns")
    @Expose
    private List<String> columns = null;
    @SerializedName("data")
    @Expose
    private List<List<String>> data = null;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
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
//-----------------------------------com.example.Seqnum.java-----------------------------------

class Seqnum {

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
//-----------------------------------com.example.TIME.java-----------------------------------

class TIME {

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
//-----------------------------------com.example.TRADEDATE.java-----------------------------------

class TRADEDATE {

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
//-----------------------------------com.example.UPDATETIME.java-----------------------------------

class UPDATETIME {

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
//-----------------------------------com.example.VALTODAY.java-----------------------------------

class VALTODAY {

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
//-----------------------------------com.example.VALTODAYUSD.java-----------------------------------

class VALTODAYUSD {

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
//-----------------------------------com.example.YEARCHANGEBP.java-----------------------------------

class YEARCHANGEBP {

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
//-----------------------------------com.example.YEARCHANGEPRC.java-----------------------------------

class YEARCHANGEPRC {

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

