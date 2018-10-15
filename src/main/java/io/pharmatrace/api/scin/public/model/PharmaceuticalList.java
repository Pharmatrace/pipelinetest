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
import io.pharmatrace.api.scin.public.model.Pharmaceutical;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PharmaceuticalList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-15T20:13:43.155+02:00[Europe/Berlin]")
public class PharmaceuticalList {
  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Pharmaceutical> products = null;

  public PharmaceuticalList products(List<Pharmaceutical> products) {
    this.products = products;
    return this;
  }

  public PharmaceuticalList addProductsItem(Pharmaceutical productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Pharmaceutical>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Contains the list of products
   * @return products
  **/
  @ApiModelProperty(value = "Contains the list of products")
  public List<Pharmaceutical> getProducts() {
    return products;
  }

  public void setProducts(List<Pharmaceutical> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PharmaceuticalList pharmaceuticalList = (PharmaceuticalList) o;
    return Objects.equals(this.products, pharmaceuticalList.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PharmaceuticalList {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

