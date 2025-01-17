package scripts;


public class Tweet {
	
	 private String tweet_id;
 	 private String tweet_creationdate = "";
	 private String tweet_content = "";
	 private long tweet_replytostatus;
	 private double latitude = 0;
	 private double longitude = 0;
	 private String tweet_source = "";
	 private boolean hasurl;
	 private long user_id;
	 private String user_screenname;
	 private int positive;
	 private int negative;
	 private String sentiment;
	 private String category = "";
	 
	 private String relationship = "";
	 private String language = "en";
	 private String gender = "";
	 
	 private String urls = "";
	 private String domains = "";
	 
	 private double u_lat;
	 private double u_lon;
	 // ...
	private double credibility;
	 
	 public Tweet(String id){
		 tweet_id = id;
	 }
	 
	 public String getSentiment() {
		return sentiment;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public void setUserScreenName(String name) {
		 user_screenname = name;
	 }
	 
	 public String getUserScreenName()	{
		 return user_screenname;
	 }
	 
	 public String getTweet_creationdate() {
		return tweet_creationdate;
	}
	public void setTweet_creationdate(String tweet_creationdate) {
		this.tweet_creationdate = tweet_creationdate;
	}
	public String getTweet_content() {
		return tweet_content;
	}
	public void setTweet_content(String tweet_content) {
		this.tweet_content = tweet_content;
	}
	public long getTweet_replytostatus() {
		return tweet_replytostatus;
	}
	public void setTweet_replytostatus(long tweet_replytostatus) {
		this.tweet_replytostatus = tweet_replytostatus;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getTweet_source() {
		return tweet_source;
	}
	public void setTweet_source(String tweet_source) {
		this.tweet_source = tweet_source;
	}
	public boolean isHasurl() {
		return hasurl;
	}
	public void setHasurl(boolean hasurl) {
		this.hasurl = hasurl;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public int getPositive() {
		return positive;
	}
	public void setPositive(int positive) {
		this.positive = positive;
	}
	public int getNegative() {
		return negative;
	}
	public void setNegative(int negative) {
		this.negative = negative;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTweet_id() {
		return tweet_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public String getDomains() {
		return domains;
	}

	public void setDomains(String domains) {
		this.domains = domains;
	}

	public double getU_lat() {
		return u_lat;
	}

	public void setU_lat(double u_lat) {
		this.u_lat = u_lat;
	}

	public double getU_lon() {
		return u_lon;
	}

	public void setU_lon(double u_lon) {
		this.u_lon = u_lon;
	}

	public void setCredibility(double credibility) {
		this.credibility = credibility;
		
	}
	
	public double getCredibility() {
		return credibility;
	}

}
