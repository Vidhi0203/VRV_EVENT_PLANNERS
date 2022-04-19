package com.example.vrveventplanners;

public class Model {

    String Wedding;
    String Indoor;
    String Theme;
    String ckParty;
    String function;
    String mhd;
    String hld;
    String sing;
    String recp;
    String name;
    String Event;
    String Address;
    String editText2Str;
    String pincodeStr;
    String caterer;
    String Photographer;
    String dj;
    String evtttlStr,fhsnoStr,cityStr,statetr,member_numberStr;

    public String getWedding() {
        return Wedding;
    }

    public void setWedding(String wedding) {
        Wedding = wedding;
    }

    public String getIndoor() {
        return Indoor;
    }

    public void setIndoor(String indoor) {
        Indoor = indoor;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public String getCkParty() {
        return ckParty;
    }

    public void setCkParty(String ckParty) {
        this.ckParty = ckParty;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getMhd() {
        return mhd;
    }

    public void setMhd(String mhd) {
        this.mhd = mhd;
    }

    public String getHld() {
        return hld;
    }

    public void setHld(String hld) {
        this.hld = hld;
    }

    public String getSing() {
        return sing;
    }

    public void setSing(String sing) {
        this.sing = sing;
    }

    public String getRecp() {
        return recp;
    }

    public void setRecp(String recp) {
        this.recp = recp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEditText2Str() {
        return editText2Str;
    }

    public void setEditText2Str(String editText2Str) {
        this.editText2Str = editText2Str;
    }

    public String getPincodeStr() {
        return pincodeStr;
    }

    public void setPincodeStr(String pincodeStr) {
        this.pincodeStr = pincodeStr;
    }

    public String getCaterer() {
        return caterer;
    }

    public void setCaterer(String caterer) {
        this.caterer = caterer;
    }

    public String getPhotographer() {
        return Photographer;
    }

    public void setPhotographer(String photographer) {
        Photographer = photographer;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public String getEvtttlStr() {
        return evtttlStr;
    }

    public void setEvtttlStr(String evtttlStr) {
        this.evtttlStr = evtttlStr;
    }

    public String getFhsnoStr() {
        return fhsnoStr;
    }

    public void setFhsnoStr(String fhsnoStr) {
        this.fhsnoStr = fhsnoStr;
    }

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getStatetr() {
        return statetr;
    }

    public void setStatetr(String statetr) {
        this.statetr = statetr;
    }

    public String getMember_numberStr() {
        return member_numberStr;
    }

    public void setMember_numberStr(String member_numberStr) {
        this.member_numberStr = member_numberStr;
    }

    public Model(String wedding, String indoor, String theme, String ckParty, String function, String mhd, String hld, String sing, String recp, String name, String event, String address, String editText2Str, String pincodeStr, String caterer, String photographer, String dj, String evtttlStr, String fhsnoStr, String cityStr, String statetr, String member_numberStr) {
        Wedding = wedding;
        Indoor = indoor;
        Theme = theme;
        this.ckParty = ckParty;
        this.function = function;
        this.mhd = mhd;
        this.hld = hld;
        this.sing = sing;
        this.recp = recp;
        this.name = name;
        Event = event;
        Address = address;
        this.editText2Str = editText2Str;
        this.pincodeStr = pincodeStr;
        this.caterer = caterer;
        Photographer = photographer;
        this.dj = dj;
        this.evtttlStr = evtttlStr;
        this.fhsnoStr = fhsnoStr;
        this.cityStr = cityStr;
        this.statetr = statetr;
        this.member_numberStr = member_numberStr;
    }
}
