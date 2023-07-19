package com.example.practice;

public class Member {
    int membreId;
    String memberaName;
    String address;

    public int getMembreId() {
        return membreId;
    }

    public void setMembreId(int membreId) {
        this.membreId = membreId;
    }

    public String getMemberaName() {
        return memberaName;
    }

    public void setMemberaName(String memberaName) {
        this.memberaName = memberaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Member() {
    }

    public Member(int membreId, String memberaName, String address) {
        this.membreId = membreId;
        this.memberaName = memberaName;
        this.address = address;
    }

}
