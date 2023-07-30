package com.shiunchiu.dynamodbdemo.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import java.util.Date;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "user")
public class User {

  @DynamoDBHashKey
  @DynamoDBAutoGeneratedKey
  private String userId;

  @DynamoDBAttribute(attributeName = "name")
  private String name;

  @DynamoDBAttribute(attributeName = "createAt")
  private Date createAt;

}
