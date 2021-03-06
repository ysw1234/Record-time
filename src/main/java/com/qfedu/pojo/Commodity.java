package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/27.
 */
public class Commodity {

    private Integer cid;
    private String commodity;
    private Integer price;
    private String goodreputation;
    private Integer vipprice;
    private String cpic;
    private String cdescription;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGoodreputation() {
        return goodreputation;
    }

    public void setGoodreputation(String goodreputation) {
        this.goodreputation = goodreputation;
    }

    public Integer getVipprice() {
        return vipprice;
    }

    public void setVipprice(Integer vipprice) {
        this.vipprice = vipprice;
    }

    public String getCpic() {
        return cpic;
    }

    public void setCpic(String cpic) {
        this.cpic = cpic;
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "cid=" + cid +
                ", commodity='" + commodity + '\'' +
                ", price=" + price +
                ", goodreputation='" + goodreputation + '\'' +
                ", vipprice=" + vipprice +
                ", cpic='" + cpic + '\'' +
                ", cdescription='" + cdescription + '\'' +
                ", count=" + count +
                '}';
    }
}
