package com.android.nutritious.nutritious;

import com.google.gson.annotations.Expose;

public class Item {

    @Expose
    private long offset;
    @Expose
    private String group;
    @Expose
    private String name;
    @Expose
    private String ndbno;

    /**
     *
     * @return
     * The offset
     */
    public long getOffset() {
        return offset;
    }

    /**
     *
     * @param offset
     * The offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }

    public Item withOffset(long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *
     * @return
     * The group
     */
    public String getGroup() {
        return group;
    }

    /**
     *
     * @param group
     * The group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    public Item withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The ndbno
     */
    public String getNdbno() {
        return ndbno;
    }

    /**
     *
     * @param ndbno
     * The ndbno
     */
    public void setNdbno(String ndbno) {
        this.ndbno = ndbno;
    }

    public Item withNdbno(String ndbno) {
        this.ndbno = ndbno;
        return this;
    }

}