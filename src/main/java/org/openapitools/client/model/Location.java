/*
 * PharmaTrace Supply Chain Information Network API
 * The PharmaTrace SCIN API provides network members a resource and process oriented access to the blockchain backed market and inventory information. It represents a layer of abstraction above the Hyperledger network to facilitate a business focused development of clients and integration systems without the need to directly connect to Hyperledger nodes.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: api@pharmatrace.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Location
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-15T19:16:48.714+02:00[Europe/Berlin]")
public class Location {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private String locationType;

  public Location timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * GMT, C time format.
   * @return timestamp
  **/
  @ApiModelProperty(value = "GMT, C time format.")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Location uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique identifier for the location.
   * @return uuid
  **/
  @ApiModelProperty(value = "Unique identifier for the location.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Location longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * longitude.
   * @return longitude
  **/
  @ApiModelProperty(value = "longitude.")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public Location latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * latitude.
   * @return latitude
  **/
  @ApiModelProperty(value = "latitude.")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public Location locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * type of container location, e.g. VESSEL, AIR, STREET, WAREHOUSE, PROCESSING, STORE, WITH_PATIENT, ...
   * @return locationType
  **/
  @ApiModelProperty(value = "type of container location, e.g. VESSEL, AIR, STREET, WAREHOUSE, PROCESSING, STORE, WITH_PATIENT, ...")
  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.timestamp, location.timestamp) &&
        Objects.equals(this.uuid, location.uuid) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.locationType, location.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, uuid, longitude, latitude, locationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

