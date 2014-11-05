package hk.ust.stop.model;

public class GoodsInformation {
	
	private long 	goodsId;
	private long 	pictureId;
	private double	longitude;
	private double	latitude;
	private double	price;
	private String	goodsName;
	private String  goodsDescription;
	
	public GoodsInformation(long goodsId, long pictureId, double longitude,
			double latitude, double price, String name, String desc) {
		this.goodsId = goodsId;
		this.pictureId = pictureId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.price = price;
		this.goodsName = name;
		this.goodsDescription = desc;
	}
	
	public GoodsInformation() {
		
	}
	
	public long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	public long getPictureId() {
		return pictureId;
	}
	public void setPictureId(long pictureId) {
		this.pictureId = pictureId;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsDescription() {
		return goodsDescription;
	}
	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}
	
}
