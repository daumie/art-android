package com.andela.art.api;

import java.util.List;

import com.andela.art.models.Asset;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * UserAssetResponse pojo.
 */
public class UserAssetResponse {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private Integer next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<Asset> assets;

    /**
     *
     * @return count - Integer
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @return next - Integer
     */
    public Integer getNext() {
        return next;
    }

    /**
     *
     * @return  previous - Object
     */
    public Object getPrevious() {
        return previous;
    }

    /**
     *
     * @return assets - List
     */
    public List<Asset> getAssets() {
        return assets;
    }

}
