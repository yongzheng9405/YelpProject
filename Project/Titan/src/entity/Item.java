package entity;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class Item {
	private String itemId;
	private String name;
	private double rating;
	private String address;
	private double distance;
	private Set<String> categories;
	private String imageUrl;
	private String url;
	
	public String getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public String getAddress() {
		return address;
	}
	public double getDistance() {
		return distance;
	}
	public Set<String> getCategories() {
		return categories;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getUrl() {
		return url;
	}
	
	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("item_id", itemId);
			obj.put("name", name);
			obj.put("rating", rating);
			obj.put("address", address);
			obj.put("distance", distance);
			obj.put("categories", new JSONArray(categories));
			obj.put("image_url", imageUrl);
			obj.put("url", url);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	

}