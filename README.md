# DynamoDB-Demo

## Quick Start

### Step 1
Go to `C:\GitHub\DynamoDB-Demo\DynamoDB-Demo\src\main\java\com\shiunchiu\dynamodbdemo\docker`


### Step 2
```
docker-compose up
```

### Step 3
```
aws dynamodb create-table --table-name user --attribute-definitions AttributeName=userId,AttributeType=S --key-schema AttributeName=userId,KeyType=HASH --billing-mode PAY_PER_REQUEST --endpoint-url http://localhost:8000
```
