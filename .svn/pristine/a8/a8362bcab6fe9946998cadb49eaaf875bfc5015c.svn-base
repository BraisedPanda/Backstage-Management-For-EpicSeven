package demo.po;

import java.util.Date;
import java.util.List;

public class Order {
    private String oid;

    private Date ordertime;

    private String state;

    private String address;

    private Double total;

    private String uid;

    private List<Orderitem> orderItemList;
    
    
    public List<Orderitem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<Orderitem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", ordertime=" + ordertime + ", state="
				+ state + ", address=" + address + ", total=" + total
				+ ", uid=" + uid + "]";
	}
    
}