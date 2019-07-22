package demo.po;

import java.awt.print.Book;

public class Orderitem {
    private String oiid;

    private Double subtotal;

    private Integer count;

    private String oid;

    private String gid;
    
    private Goods goods;
    
    
   

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getOiid() {
        return oiid;
    }

    public void setOiid(String oiid) {
        this.oiid = oiid == null ? null : oiid.trim();
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }

	@Override
	public String toString() {
		return "Orderitem [oiid=" + oiid + ", subtotal=" + subtotal
				+ ", count=" + count + ", oid=" + oid + ", gid=" + gid + "]";
	}
    
}