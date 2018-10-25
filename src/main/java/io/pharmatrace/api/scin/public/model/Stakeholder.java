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

/**
 * Stakeholder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-25T11:19:09.193+02:00[Europe/Berlin]")
public class Stakeholder {
  public static final String SERIALIZED_NAME_TRADE_ID = "trade_id";
  @SerializedName(SERIALIZED_NAME_TRADE_ID)
  private String tradeId;

  public static final String SERIALIZED_NAME_TRADE_ID_TYPE = "trade_id_type";
  @SerializedName(SERIALIZED_NAME_TRADE_ID_TYPE)
  private String tradeIdType;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_STAKEHOLDER_ROLE = "stakeholder_role";
  @SerializedName(SERIALIZED_NAME_STAKEHOLDER_ROLE)
  private String stakeholderRole;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public Stakeholder tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }

   /**
   * unique official register entry, e.g. Handelsregistereintrag, court number, ...
   * @return tradeId
  **/
  @ApiModelProperty(value = "unique official register entry, e.g. Handelsregistereintrag, court number, ...")
  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public Stakeholder tradeIdType(String tradeIdType) {
    this.tradeIdType = tradeIdType;
    return this;
  }

   /**
   * type of the official register that has issued the trade id
   * @return tradeIdType
  **/
  @ApiModelProperty(value = "type of the official register that has issued the trade id")
  public String getTradeIdType() {
    return tradeIdType;
  }

  public void setTradeIdType(String tradeIdType) {
    this.tradeIdType = tradeIdType;
  }

  public Stakeholder displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * display name visible to other network members
   * @return displayName
  **/
  @ApiModelProperty(value = "display name visible to other network members")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Stakeholder stakeholderRole(String stakeholderRole) {
    this.stakeholderRole = stakeholderRole;
    return this;
  }

   /**
   * one of Manufacturer, Distributor, Pharmacy, Regulator, Hospital, MedicalPractice, CareProvider, DisposalFirm, Insurance, Patient, LawEnforcement
   * @return stakeholderRole
  **/
  @ApiModelProperty(value = "one of Manufacturer, Distributor, Pharmacy, Regulator, Hospital, MedicalPractice, CareProvider, DisposalFirm, Insurance, Patient, LawEnforcement")
  public String getStakeholderRole() {
    return stakeholderRole;
  }

  public void setStakeholderRole(String stakeholderRole) {
    this.stakeholderRole = stakeholderRole;
  }

  public Stakeholder walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * id of the main wallet, which the stakeholder uses for PT token transactions with other stakeholders
   * @return walletId
  **/
  @ApiModelProperty(value = "id of the main wallet, which the stakeholder uses for PT token transactions with other stakeholders")
  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stakeholder stakeholder = (Stakeholder) o;
    return Objects.equals(this.tradeId, stakeholder.tradeId) &&
        Objects.equals(this.tradeIdType, stakeholder.tradeIdType) &&
        Objects.equals(this.displayName, stakeholder.displayName) &&
        Objects.equals(this.stakeholderRole, stakeholder.stakeholderRole) &&
        Objects.equals(this.walletId, stakeholder.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, tradeIdType, displayName, stakeholderRole, walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stakeholder {\n");
    
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    tradeIdType: ").append(toIndentedString(tradeIdType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    stakeholderRole: ").append(toIndentedString(stakeholderRole)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

