
package barclay.codetask.com.codetask.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Result implements Parcelable {

    public Result(String artistName, String trackName, double trackPrice, String artworkUrl30, String artworkUrl100 )
    {
        this.artistName = artistName;
        this.trackName = trackName;
        this.trackPrice = trackPrice;
        this.artworkUrl30 = artworkUrl30;
        this.artworkUrl100 = artworkUrl100;

    }

    @SerializedName("wrapperType")
    @Expose
    private String wrapperType;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("artistId")
    @Expose
    private int artistId;
    @SerializedName("collectionId")
    @Expose
    private int collectionId;
    @SerializedName("trackId")
    @Expose
    private int trackId;
    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("collectionName")
    @Expose
    private String collectionName;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("collectionCensoredName")
    @Expose
    private String collectionCensoredName;
    @SerializedName("trackCensoredName")
    @Expose
    private String trackCensoredName;
    @SerializedName("artistViewUrl")
    @Expose
    private String artistViewUrl;
    @SerializedName("collectionViewUrl")
    @Expose
    private String collectionViewUrl;
    @SerializedName("trackViewUrl")
    @Expose
    private String trackViewUrl;
    @SerializedName("previewUrl")
    @Expose
    private String previewUrl;
    @SerializedName("artworkUrl30")
    @Expose
    private String artworkUrl30;
    @SerializedName("artworkUrl60")
    @Expose
    private String artworkUrl60;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;
    @SerializedName("collectionPrice")
    @Expose
    private double collectionPrice;
    @SerializedName("trackPrice")
    @Expose
    private double trackPrice;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("collectionExplicitness")
    @Expose
    private String collectionExplicitness;
    @SerializedName("trackExplicitness")
    @Expose
    private String trackExplicitness;
    @SerializedName("discCount")
    @Expose
    private int discCount;
    @SerializedName("discNumber")
    @Expose
    private int discNumber;
    @SerializedName("trackCount")
    @Expose
    private int trackCount;
    @SerializedName("trackNumber")
    @Expose
    private int trackNumber;
    @SerializedName("trackTimeMillis")
    @Expose
    private int trackTimeMillis;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("primaryGenreName")
    @Expose
    private String primaryGenreName;
    @SerializedName("isStreamable")
    @Expose
    private boolean isStreamable;

    /**
     * 
     * @return
     *     The wrapperType
     */
    public String getWrapperType() {
        return wrapperType;
    }

    /**
     * 
     * @param wrapperType
     *     The wrapperType
     */
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 
     * @return
     *     The artistId
     */
    public int getArtistId() {
        return artistId;
    }

    /**
     * 
     * @param artistId
     *     The artistId
     */
    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    /**
     * 
     * @return
     *     The collectionId
     */
    public int getCollectionId() {
        return collectionId;
    }

    /**
     * 
     * @param collectionId
     *     The collectionId
     */
    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 
     * @return
     *     The trackId
     */
    public int getTrackId() {
        return trackId;
    }

    /**
     * 
     * @param trackId
     *     The trackId
     */
    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    /**
     * 
     * @return
     *     The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * 
     * @param artistName
     *     The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * 
     * @return
     *     The collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * 
     * @param collectionName
     *     The collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * 
     * @return
     *     The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * 
     * @param trackName
     *     The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     * 
     * @return
     *     The collectionCensoredName
     */
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    /**
     * 
     * @param collectionCensoredName
     *     The collectionCensoredName
     */
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    /**
     * 
     * @return
     *     The trackCensoredName
     */
    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    /**
     * 
     * @param trackCensoredName
     *     The trackCensoredName
     */
    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    /**
     * 
     * @return
     *     The artistViewUrl
     */
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    /**
     * 
     * @param artistViewUrl
     *     The artistViewUrl
     */
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    /**
     * 
     * @return
     *     The collectionViewUrl
     */
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    /**
     * 
     * @param collectionViewUrl
     *     The collectionViewUrl
     */
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    /**
     * 
     * @return
     *     The trackViewUrl
     */
    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    /**
     * 
     * @param trackViewUrl
     *     The trackViewUrl
     */
    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    /**
     * 
     * @return
     *     The previewUrl
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * 
     * @param previewUrl
     *     The previewUrl
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * 
     * @return
     *     The artworkUrl30
     */
    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    /**
     * 
     * @param artworkUrl30
     *     The artworkUrl30
     */
    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    /**
     * 
     * @return
     *     The artworkUrl60
     */
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    /**
     * 
     * @param artworkUrl60
     *     The artworkUrl60
     */
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    /**
     * 
     * @return
     *     The artworkUrl100
     */
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    /**
     * 
     * @param artworkUrl100
     *     The artworkUrl100
     */
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    /**
     * 
     * @return
     *     The collectionPrice
     */
    public double getCollectionPrice() {
        return collectionPrice;
    }

    /**
     * 
     * @param collectionPrice
     *     The collectionPrice
     */
    public void setCollectionPrice(double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    /**
     * 
     * @return
     *     The trackPrice
     */
    public double getTrackPrice() {
        return trackPrice;
    }

    /**
     * 
     * @param trackPrice
     *     The trackPrice
     */
    public void setTrackPrice(double trackPrice) {
        this.trackPrice = trackPrice;
    }

    /**
     * 
     * @return
     *     The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * 
     * @param releaseDate
     *     The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 
     * @return
     *     The collectionExplicitness
     */
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    /**
     * 
     * @param collectionExplicitness
     *     The collectionExplicitness
     */
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    /**
     * 
     * @return
     *     The trackExplicitness
     */
    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    /**
     * 
     * @param trackExplicitness
     *     The trackExplicitness
     */
    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    /**
     * 
     * @return
     *     The discCount
     */
    public int getDiscCount() {
        return discCount;
    }

    /**
     * 
     * @param discCount
     *     The discCount
     */
    public void setDiscCount(int discCount) {
        this.discCount = discCount;
    }

    /**
     * 
     * @return
     *     The discNumber
     */
    public int getDiscNumber() {
        return discNumber;
    }

    /**
     * 
     * @param discNumber
     *     The discNumber
     */
    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    /**
     * 
     * @return
     *     The trackCount
     */
    public int getTrackCount() {
        return trackCount;
    }

    /**
     * 
     * @param trackCount
     *     The trackCount
     */
    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    /**
     * 
     * @return
     *     The trackNumber
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * 
     * @param trackNumber
     *     The trackNumber
     */
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * 
     * @return
     *     The trackTimeMillis
     */
    public int getTrackTimeMillis() {
        return trackTimeMillis;
    }

    /**
     * 
     * @param trackTimeMillis
     *     The trackTimeMillis
     */
    public void setTrackTimeMillis(int trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * @return
     *     The primaryGenreName
     */
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    /**
     * 
     * @param primaryGenreName
     *     The primaryGenreName
     */
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    /**
     * 
     * @return
     *     The isStreamable
     */
    public boolean isIsStreamable() {
        return isStreamable;
    }

    /**
     * 
     * @param isStreamable
     *     The isStreamable
     */
    public void setIsStreamable(boolean isStreamable) {
        this.isStreamable = isStreamable;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.wrapperType);
        dest.writeString(this.kind);
        dest.writeInt(this.artistId);
        dest.writeInt(this.collectionId);
        dest.writeInt(this.trackId);
        dest.writeString(this.artistName);
        dest.writeString(this.collectionName);
        dest.writeString(this.trackName);
        dest.writeString(this.collectionCensoredName);
        dest.writeString(this.trackCensoredName);
        dest.writeString(this.artistViewUrl);
        dest.writeString(this.collectionViewUrl);
        dest.writeString(this.trackViewUrl);
        dest.writeString(this.previewUrl);
        dest.writeString(this.artworkUrl30);
        dest.writeString(this.artworkUrl60);
        dest.writeString(this.artworkUrl100);
        dest.writeDouble(this.collectionPrice);
        dest.writeDouble(this.trackPrice);
        dest.writeString(this.releaseDate);
        dest.writeString(this.collectionExplicitness);
        dest.writeString(this.trackExplicitness);
        dest.writeInt(this.discCount);
        dest.writeInt(this.discNumber);
        dest.writeInt(this.trackCount);
        dest.writeInt(this.trackNumber);
        dest.writeInt(this.trackTimeMillis);
        dest.writeString(this.country);
        dest.writeString(this.currency);
        dest.writeString(this.primaryGenreName);
        dest.writeByte(this.isStreamable ? (byte) 1 : (byte) 0);
    }

    public Result() {
    }

    protected Result(Parcel in) {
        this.wrapperType = in.readString();
        this.kind = in.readString();
        this.artistId = in.readInt();
        this.collectionId = in.readInt();
        this.trackId = in.readInt();
        this.artistName = in.readString();
        this.collectionName = in.readString();
        this.trackName = in.readString();
        this.collectionCensoredName = in.readString();
        this.trackCensoredName = in.readString();
        this.artistViewUrl = in.readString();
        this.collectionViewUrl = in.readString();
        this.trackViewUrl = in.readString();
        this.previewUrl = in.readString();
        this.artworkUrl30 = in.readString();
        this.artworkUrl60 = in.readString();
        this.artworkUrl100 = in.readString();
        this.collectionPrice = in.readDouble();
        this.trackPrice = in.readDouble();
        this.releaseDate = in.readString();
        this.collectionExplicitness = in.readString();
        this.trackExplicitness = in.readString();
        this.discCount = in.readInt();
        this.discNumber = in.readInt();
        this.trackCount = in.readInt();
        this.trackNumber = in.readInt();
        this.trackTimeMillis = in.readInt();
        this.country = in.readString();
        this.currency = in.readString();
        this.primaryGenreName = in.readString();
        this.isStreamable = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() {
        @Override
        public Result createFromParcel(Parcel source) {
            return new Result(source);
        }

        @Override
        public Result[] newArray(int size) {
            return new Result[size];
        }
    };
}
