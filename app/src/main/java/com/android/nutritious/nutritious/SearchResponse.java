package com.android.nutritious.nutritious;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class SearchResponse {

    @Expose
    private List list;

    /**
     *
     * @return
     * The list
     */
    public List getList() {
        return list;
    }

    /**
     *
     * @param list
     * The list
     */
    public void setList(List list) {
        this.list = list;
    }

    public SearchResponse withList(List list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(list).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchResponse) == false) {
            return false;
        }
        SearchResponse rhs = ((SearchResponse) other);
        return new EqualsBuilder().append(list, rhs.list).isEquals();
    }

}