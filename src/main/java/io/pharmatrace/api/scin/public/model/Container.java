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


package io.pharmatrace.api.scin.public.model;

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
 * Container
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-25T11:19:09.193+02:00[Europe/Berlin]")
public class Container {
  public static final String SERIALIZED_NAME_CONTAINER_ID = "container_id";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ID)
  private String containerId;

  public static final String SERIALIZED_NAME_EPC_CODE = "epc_code";
  @SerializedName(SERIALIZED_NAME_EPC_CODE)
  private String epcCode;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_BARCODE = "barcode";
  @SerializedName(SERIALIZED_NAME_BARCODE)
  private String barcode;

  public static final String SERIALIZED_NAME_RF_ID = "rf_id";
  @SerializedName(SERIALIZED_NAME_RF_ID)
  private String rfId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_CURRENT_LOCATION_ID = "current_location_id";
  @SerializedName(SERIALIZED_NAME_CURRENT_LOCATION_ID)
  private String currentLocationId;

  public static final String SERIALIZED_NAME_OWNER_STAKEHOLDER_ID = "owner_stakeholder_id";
  @SerializedName(SERIALIZED_NAME_OWNER_STAKEHOLDER_ID)
  private String ownerStakeholderId;

  public static final String SERIALIZED_NAME_PARENT_CONTAINER_ID = "parent_container_id";
  @SerializedName(SERIALIZED_NAME_PARENT_CONTAINER_ID)
  private String parentContainerId;

  public Container containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

   /**
   * Unique identifier representing a specific container.
   * @return containerId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific container.")
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public Container epcCode(String epcCode) {
    this.epcCode = epcCode;
    return this;
  }

   /**
   * EPC code
   * @return epcCode
  **/
  @ApiModelProperty(value = "EPC code")
  public String getEpcCode() {
    return epcCode;
  }

  public void setEpcCode(String epcCode) {
    this.epcCode = epcCode;
  }

  public Container label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Serialization label.
   * @return label
  **/
  @ApiModelProperty(value = "Serialization label.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Container barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * barcode on container. Normally equal to container id.
   * @return barcode
  **/
  @ApiModelProperty(value = "barcode on container. Normally equal to container id.")
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public Container rfId(String rfId) {
    this.rfId = rfId;
    return this;
  }

   /**
   * RFID of RF tracking label on conatiner.
   * @return rfId
  **/
  @ApiModelProperty(value = "RFID of RF tracking label on conatiner.")
  public String getRfId() {
    return rfId;
  }

  public void setRfId(String rfId) {
    this.rfId = rfId;
  }

  public Container quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity of product in container.
   * @return quantity
  **/
  @ApiModelProperty(value = "quantity of product in container.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public Container unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Unit for quantity measurement.
   * @return unit
  **/
  @ApiModelProperty(value = "Unit for quantity measurement.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public Container currentLocationId(String currentLocationId) {
    this.currentLocationId = currentLocationId;
    return this;
  }

   /**
   * Location id of last tracked locaction.
   * @return currentLocationId
  **/
  @ApiModelProperty(value = "Location id of last tracked locaction.")
  public String getCurrentLocationId() {
    return currentLocationId;
  }

  public void setCurrentLocationId(String currentLocationId) {
    this.currentLocationId = currentLocationId;
  }

  public Container ownerStakeholderId(String ownerStakeholderId) {
    this.ownerStakeholderId = ownerStakeholderId;
    return this;
  }

   /**
   * stakeholder id of the last tracked owner of the container.
   * @return ownerStakeholderId
  **/
  @ApiModelProperty(value = "stakeholder id of the last tracked owner of the container.")
  public String getOwnerStakeholderId() {
    return ownerStakeholderId;
  }

  public void setOwnerStakeholderId(String ownerStakeholderId) {
    this.ownerStakeholderId = ownerStakeholderId;
  }

  public Container parentContainerId(String parentContainerId) {
    this.parentContainerId = parentContainerId;
    return this;
  }

   /**
   * id of the parent container or null.
   * @return parentContainerId
  **/
  @ApiModelProperty(value = "id of the parent container or null.")
  public String getParentContainerId() {
    return parentContainerId;
  }

  public void setParentContainerId(String parentContainerId) {
    this.parentContainerId = parentContainerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(this.containerId, container.containerId) &&
        Objects.equals(this.epcCode, container.epcCode) &&
        Objects.equals(this.label, container.label) &&
        Objects.equals(this.barcode, container.barcode) &&
        Objects.equals(this.rfId, container.rfId) &&
        Objects.equals(this.quantity, container.quantity) &&
        Objects.equals(this.unit, container.unit) &&
        Objects.equals(this.currentLocationId, container.currentLocationId) &&
        Objects.equals(this.ownerStakeholderId, container.ownerStakeholderId) &&
        Objects.equals(this.parentContainerId, container.parentContainerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, epcCode, label, barcode, rfId, quantity, unit, currentLocationId, ownerStakeholderId, parentContainerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    epcCode: ").append(toIndentedString(epcCode)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    rfId: ").append(toIndentedString(rfId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    currentLocationId: ").append(toIndentedString(currentLocationId)).append("\n");
    sb.append("    ownerStakeholderId: ").append(toIndentedString(ownerStakeholderId)).append("\n");
    sb.append("    parentContainerId: ").append(toIndentedString(parentContainerId)).append("\n");
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

