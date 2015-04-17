package com.android.nutritious.nutritious;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;

public class List {

    @Expose
    private String q;
    @Expose
    private String sr;
    @Expose
    private long start;
    @Expose
    private long end;
    @Expose
    private long total;
    @Expose
    private String group;
    @Expose
    private String sort;
    @Expose
    private java.util.List<Item> item = new ArrayList<Item>();

    /**
     *
     * @return
     * The q
     */
    public String getQ() {
        return q;
    }

    /**
     *
     * @param q
     * The q
     */
    public void setQ(String q) {
        this.q = q;
    }

    public List withQ(String q) {
        this.q = q;
        return this;
    }

    /**
     *
     * @return
     * The sr
     */
    public String getSr() {
        return sr;
    }

    /**
     *
     * @param sr
     * The sr
     */
    public void setSr(String sr) {
        this.sr = sr;
    }

    public List withSr(String sr) {
        this.sr = sr;
        return this;
    }

    /**
     *
     * @return
     * The start
     */
    public long getStart() {
        return start;
    }

    /**
     *
     * @param start
     * The start
     */
    public void setStart(long start) {
        this.start = start;
    }

    public List withStart(long start) {
        this.start = start;
        return this;
    }

    /**
     *
     * @return
     * The end
     */
    public long getEnd() {
        return end;
    }

    /**
     *
     * @param end
     * The end
     */
    public void setEnd(long end) {
        this.end = end;
    }

    public List withEnd(long end) {
        this.end = end;
        return this;
    }

    /**
     *
     * @return
     * The total
     */
    public long getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(long total) {
        this.total = total;
    }

    public List withTotal(long total) {
        this.total = total;
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

    public List withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     *
     * @return
     * The sort
     */
    public String getSort() {
        return sort;
    }

    /**
     *
     * @param sort
     * The sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    public List withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     *
     * @return
     * The item
     */
    public java.util.List<Item> getItem() {
        return item;
    }

    /**
     *
     * @param item
     * The item
     */
    public void setItem(java.util.List<Item> item) {
        this.item = item;
    }

    public List withItem(java.util.List<Item> item) {
        this.item = item;
        return this;
    }

}