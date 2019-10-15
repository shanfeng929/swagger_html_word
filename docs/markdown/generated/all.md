# 电子口岸监控平台接口文档


<a name="overview"></a>
## 概览

### 版本信息
*版本* : 1.0


### 联系方式
*名字* : 平安集团


### 许可信息
*服务条款* : http://www.pingan.com/


### URI scheme
*域名* : localhost:8022  
*基础路径* : /


### 标签

* 企业信息操作接口 : Crop Info Controller
* 企业配置管理接口，包含服务端的接口和客户端的接口 : Crop Conf Controller
* 客户端操作接口 : Crop Client Controller
* 客户端更新相关接口 : Client Cpp Controller
* 客户端采数任务配置接口 : KTASK Controller
* 文件传输操作接口 : Crop Data File Transfer Controller
* 管理网文件传输操作接口 : Forward File Transfer Controller
* 系统用户接口 : K Sys User Controller
* 系统菜单操作接口 : K Sys Resource Controller
* 系统角色操作接口 : K Sys Role Controller
* 系统角色用户关联接口 : K Sys Role User Controller
* 系统角色菜单关联接口 : K Sys Role Resource Controller




<a name="paths"></a>
## 资源

<a name="499201e535e1c8e7e31ad83c6ca2ebba"></a>
### 企业信息操作接口
Crop Info Controller


<a name="allcropusingget"></a>
#### 所有企业列表
```
GET /crop/allCrop
```


##### 说明
所有企业列表


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«企业信息出参对象»»](#4e2666cdf79d1e7c3b07a289aeec5f7a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/allCrop
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "cropId" : 0,
    "cropName" : "string",
    "customsCode" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="batchsynccorpinfousingpost"></a>
#### 同步辅助对接平台企业信息
```
POST /crop/batchsyncedcipcrop
```


##### 说明
同步辅助对接平台企业信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**corpInfos**  <br>*必填*|corpInfos|< [SyncEdcipCropInfoInVo](#syncedcipcropinfoinvo) > array|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«int»»](#b134922c9e448b36d76995901dfd9af1)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/batchsyncedcipcrop
```


###### 请求 body
```json
[ {
  "cropId" : 0,
  "cropIdNumber" : "string",
  "cropName" : "string",
  "customsCode" : "string"
} ]
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ 0 ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="logincropinfousingpost"></a>
#### 【客户端】企业登录
```
POST /crop/loginCropInfo
```


##### 说明
校验客户端登录信息正确性


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**loginInfoInvo**  <br>*必填*|loginInfoInvo|[客户端入参对象](#c803e62d0581287d29bb182c035588f2)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«企业信息出参对象»](#55534ffdb80ec54fcf653732bc47e2fd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/loginCropInfo
```


###### 请求 body
```json
{
  "clientPhysicsSign" : "string",
  "cropIdNumber" : "string",
  "cropName" : "string",
  "customsCode" : "string",
  "lastConnTime" : "string",
  "lastIpAddress" : "string",
  "licenseCode" : "string",
  "macAddress" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "cropId" : 0,
    "cropName" : "string",
    "customsCode" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querybydeailsusingpost"></a>
#### 联网监管企业详情
```
POST /crop/queryByDeails
```


##### 说明
联网监管企业详情


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«联网监管企业详情入参InVo»](#a235d68009c8a227f14063b552b0330b)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«企业客户端信息出参对象»»](#6b2f21894561ecbdabe91b928955ef84)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/queryByDeails
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropId" : 0
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "bindTime" : "string",
      "cropClientId" : 0,
      "isOnline" : 0,
      "lastConnTime" : "string",
      "licenseCode" : "string",
      "macAddress" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querykcropinfopageusingpost"></a>
#### 联网监管企业分页列表
```
POST /crop/queryCropList
```


##### 说明
联网监管企业分页列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«联网监管企业查询对象»](#29e3115cfdc64cb798b93bffd7669703)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«联网监管企业列表对象»»](#b82ba874769cf1a5208900a126d5a0c9)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/queryCropList
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropIdNumber" : "string",
    "cropName" : "string",
    "customsCode" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "createTime" : "string",
      "cropId" : 0,
      "cropIdNumber" : "string",
      "cropName" : "string",
      "customsCode" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="registercropinfousingpost"></a>
#### 新增企业信息
```
POST /crop/registerCropInfo
```


##### 说明
新增企业信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**cropInfoInvo**  <br>*必填*|cropInfoInvo|[企业注册入参对象](#32bd78ce628889e71e37677cb1c4add2)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«企业信息出参对象»](#55534ffdb80ec54fcf653732bc47e2fd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/registerCropInfo
```


###### 请求 body
```json
{
  "cropDimension" : "string",
  "cropIdNumber" : "string",
  "cropLongitude" : "string",
  "cropName" : "string",
  "customsCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "cropId" : 0,
    "cropName" : "string",
    "customsCode" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="syncedcipcropinfousingpost"></a>
#### 同步辅助对接平台企业信息
```
POST /crop/syncedcipcrop
```


##### 说明
同步辅助对接平台企业信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**cropInfoInvo**  <br>*必填*|cropInfoInvo|[SyncEdcipCropInfoInVo](#syncedcipcropinfoinvo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/crop/syncedcipcrop
```


###### 请求 body
```json
{
  "cropId" : 0,
  "cropIdNumber" : "string",
  "cropName" : "string",
  "customsCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="fdaab039b484ecb3c4d395df9e83eff7"></a>
### 企业配置管理接口，包含服务端的接口和客户端的接口
Crop Conf Controller


<a name="clientconfdwnloadusingget"></a>
#### 【客户端-嵌入页面】企业配置文件下载
```
GET /client/conf/download/{cropId}/{fileType}
```


##### 说明
企业配置文件下载


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**cropId**  <br>*必填*|cropId|integer (int64)|
|**Path**|**fileType**  <br>*必填*|fileType|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/client/conf/download/0/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="clientdetailusingpost"></a>
#### 【客户端】企业数据库及脚本配置查询接口
```
POST /clientConfig/detail
```


##### 说明
企业数据库及脚本配置查询接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[企业数据库及脚本配置查询对象](#f222c2a1f50dfc5cb2683c27241dff58)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«企业数据库及脚本配置查询返回对象»](#0731c0170129204753791e2ba95319b8)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/clientConfig/detail
```


###### 请求 body
```json
{
  "cropClientId" : 0,
  "cropId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "dbInfo" : "string",
    "sqlInfo" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="filereportusingpost_1"></a>
#### 【客户端-嵌入页面】配置文件上传
```
POST /conf/create
```


##### 说明
配置文件上传


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**cropId**  <br>*必填*|企业ID|integer (int32)|
|**Header**|**fileType**  <br>*必填*|文件类型|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«企业配置信息上传返回对象»](#b31f795b0bd068dbd4d850166a37d124)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/create
```


###### 请求 header
```json
0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "confId" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="croptablesusingpost"></a>
#### 【服务端】企业配置涉及的标准表
```
POST /conf/cropTables
```


##### 说明
企业配置涉及的标准表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[企业数据库配置解析请求VO](#4ae148b74f73b3f11769dbb3008ee33c)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«企业数据库配置解析返回对象»»](#ff9a402d1eae4d121b5ac0e2cd2ece52)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/cropTables
```


###### 请求 body
```json
{
  "cropId" : 0,
  "customsCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "level" : "string",
    "order" : 0,
    "tableNameCn" : "string",
    "tableNameEn" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="deleteusingpost"></a>
#### 【客户端-嵌入页面】企业配置文件删除
```
POST /conf/delete
```


##### 说明
企业配置文件删除


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[企业配置信息删除请求VO](#dd700ac2874326655d19ad887a91cab1)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/delete
```


###### 请求 body
```json
{
  "cropId" : 0,
  "fileType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="detailusingget"></a>
#### 【客户端-嵌入页面】企业配置详情
```
GET /conf/detail/{cropId}
```


##### 说明
企业配置详情


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**cropId**  <br>*必填*|cropId|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«企业配置信息列表返回对象»](#0b3d998481ec0987b87ee7638a8bc76e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/detail/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "confId" : 0,
    "cropId" : 0,
    "cropIdNumber" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "functionStatus" : "string",
    "sqlFile" : "string",
    "updateTime" : "string",
    "xmlFile" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="downloadusingpost_1"></a>
#### 【服务端】企业配置文件下载
```
POST /conf/download
```


##### 说明
企业配置文件下载


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[企业配置信息下载请求VO](#4776645dcb5c13359da9a95a7c76020f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/download
```


###### 请求 body
```json
{
  "cropId" : 0,
  "fileType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="reportdatasourceusingpost"></a>
#### 【服务端】企业配置查询
```
POST /conf/list
```


##### 说明
分页企业配置查询


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageInfo**  <br>*必填*|pageInfo|[分页请求对象«企业配置信息查询列表请求VO»](#3e205fc60810dbbb67dc0a3b12f26600)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«企业配置信息列表返回对象»»](#9f67cddd3965e02c84f972f6706ec009)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/list
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropName" : "string",
    "customsCode" : "string",
    "functionStatus" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "confId" : 0,
      "cropId" : 0,
      "cropIdNumber" : "string",
      "cropName" : "string",
      "customsCode" : "string",
      "functionStatus" : "string",
      "sqlFile" : "string",
      "updateTime" : "string",
      "xmlFile" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="downloadtemplateusingget"></a>
#### 【客户端-嵌入页面】企业配置文件模版及脚本模版下载
```
GET /conf/template/download/{type}
```


##### 说明
企业配置文件模版及脚本模版下载


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**type**  <br>*必填*|type|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/template/download/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updatefunctionstatususingpost"></a>
#### 【服务端】企业配置功能状态修改
```
POST /conf/updatestatus
```


##### 说明
企业配置功能状态修改


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[企业配置功能状态修改入参请求VO](#5f7dc4d4685c31d97b6725d64af1ae88)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/updatestatus
```


###### 请求 body
```json
{
  "confId" : 0,
  "functionStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="uploadclientlogusingpost"></a>
#### 【客户端-日志上报】客户端日志上报
```
POST /conf/uploadClientLog
```


##### 说明
客户端日志上报


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[客户端日志上报Invo](#c7180c05f0b99aedf94028db3384cd7e)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/uploadClientLog
```


###### 请求 body
```json
{
  "clientVersion" : "string",
  "cropClientId" : 0,
  "cropIdNumber" : "string",
  "cropName" : "string",
  "customsCode" : "string",
  "errorMessage" : "string",
  "excepMessage" : "string",
  "macAddress" : "string",
  "operateCode" : "string",
  "operateDesc" : "string",
  "operateScene" : "string",
  "status" : 0,
  "statusDesc" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="uploadinfolistusingpost"></a>
#### 【客户端-嵌入页面】数据采集上报查询列表
```
POST /conf/uploadInfoList
```


##### 说明
数据上报查询列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«查询上传日志入参对象»](#fb0d029cd39883cdb3d7b59ffafb4e5f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«数据采集上报查询OutVO»»](#fc87752f8020e01e5fba9754d30b5c28)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/conf/uploadInfoList
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "bizEndBegin" : "string",
    "bizEndEnd" : "string",
    "bizStartBegin" : "string",
    "bizStartEnd" : "string",
    "cropId" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "dataEndTime" : "string",
    "dataStartTime" : "string",
    "forwardStatus" : "string",
    "tableName" : "string",
    "uploadId" : "string",
    "uploadStatus" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "cropId" : "string",
      "cropName" : "string",
      "customsCode" : "string",
      "dataEndTime" : "string",
      "dataSource" : "string",
      "dataStartTime" : "string",
      "fileName" : "string",
      "fileSize" : "string",
      "forwardStatus" : "string",
      "forwardStatusTrans" : "string",
      "uploadEnd" : "string",
      "uploadId" : "string",
      "uploadStart" : "string",
      "uploadStatus" : "string",
      "uploadStatusTrans" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="936d07ac2e4c90413b6e0fe6fcdc9b55"></a>
### 客户端操作接口
Crop Client Controller


<a name="clientactivateusingpost"></a>
#### 【客户端】客户端注册激活
```
POST /cropClient/activate
```


##### 说明
客户端用于注册激活


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**activateInvo**  <br>*必填*|activateInvo|[客户端注册激活入参对象](#e370c43efd79be0eed358868ebb55faf)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«客户端注册激活出参对象»](#5e19e58591bb2a525aa168e329d53fb4)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/activate
```


###### 请求 body
```json
{
  "clientCpu" : "string",
  "clientMem" : "string",
  "clientOs" : "string",
  "cropIdNumber" : "string",
  "cropName" : "string",
  "customsCode" : "string",
  "licenseCode" : "string",
  "macAddress" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "cropClientId" : 0,
    "cropId" : 0,
    "cropName" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="cropclientlicensepageusingpost"></a>
#### 客户端licenseCode列表
```
POST /cropClient/clientLicenseCodePage
```


##### 说明
客户端licenseCode列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«客户端License查询Invo»](#8ffc4731b25d4549e5dd0d54f8bff6ad)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«客户端License列表Vo»»](#9565492d94523e91f6fa370b7fa7ba32)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/clientLicenseCodePage
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropId" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "bindTime" : "string",
      "createBy" : "string",
      "createTime" : "string",
      "licenseCode" : "string",
      "licenseFlag" : "string",
      "licenseFlagTrans" : "string",
      "macAddress" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="clientlogpageusingpost"></a>
#### 客户端日志分页列表
```
POST /cropClient/clientLogPage
```


##### 说明
客户端日志分页列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«客户端日志查询Invo»](#7e60a40a483db759d2302fbb9652b7f9)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«客户端日志输出Vo»»](#aac081eae45bd10bf834fe91c7b69d71)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/clientLogPage
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropClientId" : 0,
    "cropName" : "string",
    "customsCode" : "string",
    "endDate" : "string",
    "operateCode" : "string",
    "startDate" : "string",
    "status" : 0
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "clientCpu" : "string",
      "clientMem" : "string",
      "clientVersion" : "string",
      "createTime" : "string",
      "cropName" : "string",
      "customsCode" : "string",
      "errorMessage" : "string",
      "excepMessage" : "string",
      "logId" : 0,
      "macAddress" : "string",
      "operateCode" : "string",
      "operateDesc" : "string",
      "operateScene" : "string",
      "status" : 0,
      "statusTrans" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="generatelicensecodeusingpost"></a>
#### 客户端licenseCode生成
```
POST /cropClient/generateLicenseCode
```


##### 说明
企业id下新增一个客户端licenseCode


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**cropClientInfoInvo**  <br>*必填*|cropClientInfoInvo|[客户端licenseCode生成入参对象](#13eb5030715aa48fd5e1a04225c86b6f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«客户端licenseCode生成出参对象»](#8c1cbf6e08dc4a1220bdeee963e71a9a)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/generateLicenseCode
```


###### 请求 body
```json
{
  "clientCropId" : 0,
  "cropId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "cropId" : 0,
    "licenseCode" : "string",
    "licenseSecret" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="acquireclientinfousingpost"></a>
#### 查询客户端注册码是否激活
```
POST /cropClient/info
```


##### 说明
查询客户端注册码是否激活


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**infoInvo**  <br>*必填*|infoInvo|[客户端licenseCode生成入参对象](#13eb5030715aa48fd5e1a04225c86b6f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[企业客户端是否安装出参对象](#38e47404eee2a4382797f2b3ff4dcaa6)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/info
```


###### 请求 body
```json
{
  "clientCropId" : 0,
  "cropId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "isUse" : "string"
}
```


<a name="downloadusingget"></a>
#### 客户端日志文件下载
```
GET /cropClient/log/download/{logFileId}
```


##### 说明
客户端日志文件下载


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**logFileId**  <br>*必填*|logFileId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/log/download/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="clientlogfilepageusingpost"></a>
#### 客户端日志文件分页列表
```
POST /cropClient/log/page
```


##### 说明
客户端日志文件分页列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«客户端日志文件查询Invo»](#c4c1175f9dd303e84c8999733d3c4847)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«客户端日志文件Vo»»](#bdceb276fdb24aeb5b1f547b8b867016)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/log/page
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropIdNumber" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "endDate" : "string",
    "startDate" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "createTime" : "string",
      "cropClientId" : 0,
      "cropId" : 0,
      "cropIdNumber" : "string",
      "cropName" : "string",
      "customsCode" : "string",
      "logDate" : "string",
      "logFileId" : 0,
      "logFileName" : "string",
      "macAddress" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="filereportusingpost"></a>
#### 【客户端】日志文件上传
```
POST /cropClient/log/upload
```


##### 说明
日志文件上传


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**cropClientId**  <br>*必填*|企业客户端ID|integer (int32)|
|**FormData**|**cropId**  <br>*必填*|企业ID|integer (int32)|
|**FormData**|**file**  <br>*必填*|日志文件|ref|
|**FormData**|**logDate**  <br>*必填*|日志文件日期|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/log/upload
```


###### 请求 formData
```json
"string"
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querybydeailsusingget"></a>
#### 客户端日志详情
```
GET /cropClient/queryDeailsLog/{logId}
```


##### 说明
客户端日志详情


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**logId**  <br>*必填*|logId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«客户端日志输出Vo»](#c2ae91d93f723d737606962de0780b8f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropClient/queryDeailsLog/0
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "clientCpu" : "string",
    "clientMem" : "string",
    "clientVersion" : "string",
    "createTime" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "errorMessage" : "string",
    "excepMessage" : "string",
    "logId" : 0,
    "macAddress" : "string",
    "operateCode" : "string",
    "operateDesc" : "string",
    "operateScene" : "string",
    "status" : 0,
    "statusTrans" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="0aa77593a64dc801d9519f7adb841b7d"></a>
### 客户端更新相关接口
Client Cpp Controller


<a name="downloadbymd5usingpost"></a>
#### 根据md5的值下载指定的文件
```
POST /client/file/download
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**map**  <br>*必填*|map|object|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/client/file/download
```


###### 请求 body
```json
{ }
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="uploadzipusingpost"></a>
#### 客户端上传Zip接口
```
POST /client/upload
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**file**  <br>*必填*|file|file|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/client/upload
```


###### 请求 formData
```json
"file"
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="downloadusingpost"></a>
#### 【客户端】更新文件下载
```
POST /cpp/download
```


##### 说明
更新文件下载


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cpp/download
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="0ceea2491ce5f92a2b7d4f7988a4336c"></a>
### 客户端采数任务配置接口
KTASK Controller


<a name="addautotaskusingpost"></a>
#### 新增自动采集任务接口
```
POST /add/auto
```


##### 说明
新增自动采集任务接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务采集表(自动任务)入参InVo](#a85f9f4ffb58f87d1cd6dc6879e6e527)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/add/auto
```


###### 请求 body
```json
{
  "collectEndDate" : "string",
  "collectStartDate" : "string",
  "customsCode" : "string",
  "cycleTime" : "string",
  "cycleType" : "string",
  "cycleValue" : "string",
  "detail" : [ {
    "level" : "string",
    "order" : "string",
    "tableNameCn" : "string",
    "tableNameEn" : "string"
  } ],
  "enterpName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="addmanualtaskusingpost"></a>
#### 新增手工采集任务接口
```
POST /add/manual
```


##### 说明
新增手工采集任务接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务采集表(手动任务)入参InVo](#c5c3d988d2d1dd6fd595de937f4a16e5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/add/manual
```


###### 请求 body
```json
{
  "collectEndDate" : "string",
  "collectStartDate" : "string",
  "customsCode" : "string",
  "detail" : [ {
    "level" : "string",
    "order" : "string",
    "tableNameCn" : "string",
    "tableNameEn" : "string"
  } ],
  "enterpName" : "string",
  "isAll" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="canclepresenttaskusingpost"></a>
#### 取消任务接口
```
POST /cancle/task
```


##### 说明
取消任务接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务取消入参InVo](#e9135bfe3c2685d2ba1370c6bf725f44)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cancle/task
```


###### 请求 body
```json
{
  "taskId" : 0,
  "taskType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="clientnotifyusingpost"></a>
#### 客户端通知接口
```
POST /client/notify
```


##### 说明
客户端通知接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[客户端心跳完成通知接口入参InVo](#6ed7806996b9b6dc773253967c78decc)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/client/notify
```


###### 请求 body
```json
{
  "processDetailId" : 0,
  "processId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="edcipaddtaskusingpost"></a>
#### 模拟采数新增立即采数任务接口
```
POST /edcip/addedciptask
```


##### 说明
模拟采数新增立即采数任务接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[辅助对接平台模拟采数入参InVo](#872d3254bf59e1ac7d689b879e01e163)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«辅助对接平台模拟采数出参OutVo»](#252faf9e98243b657da90da237eb289b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/edcip/addedciptask
```


###### 请求 body
```json
{
  "collectEndDate" : "string",
  "collectStartDate" : "string",
  "cropId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "taskId" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="edcipcollectreportusingpost"></a>
#### 模拟采数生成采数报告接口
```
POST /edcip/collectreport
```


##### 说明
模拟采数生成采数报告接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[模拟采数测试报告入参InVo](#d80641300c43a4737687c0a7a56aa7cb)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«模拟采数测试报告出参OutVo»](#3a61abe8730c9e63bab74f8b5da15f48)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/edcip/collectreport
```


###### 请求 body
```json
{
  "customsCode" : "string",
  "taskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "detail" : [ {
      "countNum" : 0,
      "joinFlag" : "string",
      "tableChineseName" : "string",
      "tableKind" : "string",
      "tableLevel" : "string",
      "tableName" : "string"
    } ],
    "result" : {
      "advancedTableCount" : 0,
      "advancedTableScale" : 0.0,
      "baseTableCount" : 0,
      "baseTableScale" : 0.0,
      "totalCount" : 0,
      "totalScale" : 0.0
    }
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="executeautotaskusingpost"></a>
#### 自动任务运行接口
```
POST /execute/auto
```


##### 说明
自动任务运行接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务执行入参InVo](#364f25973fbcae9efcc055a998cee147)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/execute/auto
```


###### 请求 body
```json
{
  "customsCode" : "string",
  "taskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="executemanualtaskusingpost"></a>
#### 手动任务执行接口
```
POST /execute/manual
```


##### 说明
手动任务执行接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务执行入参InVo](#364f25973fbcae9efcc055a998cee147)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/execute/manual
```


###### 请求 body
```json
{
  "customsCode" : "string",
  "taskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="taskheartbeatusingpost"></a>
#### 【客户端】采集任务心跳接口
```
POST /filetransfer/heartbeat
```


##### 说明
【客户端】采集任务心跳接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务采集心跳入参InVo](#1a8c76ec85ac18f3f7507623fa16ad27)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«客户端采集心跳出参OutVo»](#aa03742f7106cc322c34fcb079a4a38f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/heartbeat
```


###### 请求 body
```json
{
  "cropClientId" : "string",
  "cropId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "collectEndTime" : "string",
    "collectFlag" : "string",
    "collectRemarks" : "string",
    "collectStartTime" : "string",
    "cropFlag" : "string",
    "isAll" : "string",
    "isCancle" : "string",
    "processDetailId" : 0,
    "processId" : 0,
    "reportFlag" : "string",
    "reportRemarks" : "string",
    "tableName" : "string",
    "uploadFlag" : "string",
    "uploadLogFlag" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryautotaskpageusingpost"></a>
#### 分页查询自动采集任务列表
```
POST /query/auto
```


##### 说明
分页查询自动采集任务列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[分页请求对象«自动任务查询列表入参InVo»](#e8294a2a1b7a2e99d9069c9e4d4f2c8d)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«自动采集任务出参OutVo»»](#8d26d3e4d77d1aa8154fdcbc5c9808dd)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/query/auto
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "collectEndDate" : "string",
    "collectStartDate" : "string",
    "enterpName" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "collectEndDate" : "string",
      "collectStartDate" : "string",
      "createBy" : "string",
      "createTime" : "string",
      "customsCode" : "string",
      "cycleTime" : "string",
      "cycleType" : "string",
      "cycleValue" : "string",
      "enterpName" : "string",
      "executionTime" : "string",
      "isAll" : "string",
      "status" : "string",
      "taskId" : 0,
      "updateBy" : "string",
      "updateTime" : "string",
      "uuid" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryautotaskdetailpageusingpost"></a>
#### 分页查询采集任务明细列表
```
POST /query/detail
```


##### 说明
分页查询采集任务明细列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务明细入参InVo](#38f974d8d20354ccc87e9c87533294fc)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«任务明细出参outVo»»](#8482a70cbbf0f8beff5253e30b584db7)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/query/detail
```


###### 请求 body
```json
{
  "taskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "collectEndDate" : "string",
    "collectStartDate" : "string",
    "customsCode" : "string",
    "enterpName" : "string",
    "executeOrder" : 0,
    "isAll" : "string",
    "tableChineseName" : "string",
    "tableLevel" : "string",
    "tableName" : "string",
    "taskDetailId" : 0,
    "taskId" : 0,
    "taskType" : "string",
    "uuid" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querymanualtaskpageusingpost"></a>
#### 分页查询手动采集任务列表
```
POST /query/manual
```


##### 说明
分页查询手动采集任务列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[分页请求对象«手动任务查询列表入参InVo»](#d467a371d016be61502947579243c729)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«手动采集任务出参outVo»»](#06962e91bc5c956caac30e455d8b6c83)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/query/manual
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "collectEndDate" : "string",
    "collectStartDate" : "string",
    "enterpName" : "string",
    "isAll" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "collectEndDate" : "string",
      "collectStartDate" : "string",
      "createBy" : "string",
      "createTime" : "string",
      "customsCode" : "string",
      "enterpName" : "string",
      "executionTime" : "string",
      "isAll" : "string",
      "status" : "string",
      "taskId" : 0,
      "updateBy" : "string",
      "updateTime" : "string",
      "uuid" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryprocesspageusingpost"></a>
#### 分页查询任务执行列表
```
POST /query/process
```


##### 说明
分页查询任务执行列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[分页请求对象«任务执行入参InVo»](#a9e019acff2774b77d863adabb9c7556)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«任务执行情况出参outVo»»](#40ff7b01b413090ead6ddf7caa75a560)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/query/process
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "customsCode" : "string",
    "taskId" : 0
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "collectEndDate" : "string",
      "collectStartDate" : "string",
      "customsCode" : "string",
      "enterpName" : "string",
      "executionEndTime" : "string",
      "executionStartTime" : "string",
      "processId" : 0,
      "status" : "string",
      "taskId" : 0
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryprocessdetailpageusingpost"></a>
#### 分页查询任务执行明细
```
POST /query/processdetail
```


##### 说明
分页查询任务执行明细


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[任务执行明细入参InVo](#f3f6dfb463c4753141486c27a2c1eb1e)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«任务执行明细出参outVo»»](#77a2081ed97c69d435b8e123e1193c8d)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/query/processdetail
```


###### 请求 body
```json
{
  "processId" : 0,
  "taskId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "collectEndDate" : "string",
    "collectStartDate" : "string",
    "customsCode" : "string",
    "enterpName" : "string",
    "executeOrder" : 0,
    "executionEndTime" : "string",
    "executionStartTime" : "string",
    "isAll" : "string",
    "processDetailId" : 0,
    "processId" : 0,
    "remark" : "string",
    "status" : "string",
    "tableChineseName" : "string",
    "tableName" : "string",
    "taskDetailId" : 0,
    "taskId" : 0,
    "taskType" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="1393403403bf4715e54046d6d71f07d4"></a>
### 文件传输操作接口
Crop Data File Transfer Controller


<a name="edcipfilereportusingpost"></a>
#### 【客户端】模拟采数文件信息上报
```
POST /cropDataFiletransfer/edcipFileReport
```


##### 说明
【客户端】模拟采数文件信息上报


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**fileInfoReport**  <br>*必填*|fileInfoReport|[文件信息上报入参对象](#d2e944e758a61423d8fda7eb2ff5ee10)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件信息上传输出对象»](#4cb31be5f26c4ad3f5ecd9bb491c6d9c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropDataFiletransfer/edcipFileReport
```


###### 请求 body
```json
{
  "clientCostTime" : "string",
  "clientCostTimeUnit" : "string",
  "countNum" : 0,
  "cropId" : 0,
  "dataEndTime" : "string",
  "dataStartTime" : "string",
  "fileBizDate" : "string",
  "fileFormat" : "string",
  "fileName" : "string",
  "fileSign" : "string",
  "fileSize" : "string",
  "fileUploadLists" : [ {
    "bizEnd" : "string",
    "bizStart" : "string",
    "countNum" : 0,
    "fileBizDate" : "string",
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSign" : "string",
    "fileSize" : "string",
    "tableId" : 0,
    "tableName" : "string"
  } ],
  "fileUploadZipLists" : [ {
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSize" : "string"
  } ],
  "processId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "zipIds" : [ { } ]
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="edcipfilereportusingpost_1"></a>
#### 【客户端】模拟采数文件上传
```
POST /cropDataFiletransfer/edcipFileUpload
```


##### 说明
【客户端】模拟采数文件传输


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**processDetailId**  <br>*必填*|任务执行明细ID|string|
|**Body**|**processId**  <br>*必填*|任务执行ID|string|
|**Body**|**uploadId**  <br>*必填*|批次号|string|
|**Body**|**zipId**  <br>*必填*|压缩号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件传输出参对象»](#f5975201b7af99306f0b37eddf668177)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropDataFiletransfer/edcipFileUpload
```


###### 请求 body
```json
{ }
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "uploadResult" : "string",
    "zipId" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="fileinforeportusingpost"></a>
#### 【客户端】文件信息上报
```
POST /cropDataFiletransfer/fileInfoReport
```


##### 说明
文件整体信息上报，并返回批次号


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**fileInfoReport**  <br>*必填*|fileInfoReport|[文件信息上报入参对象](#d2e944e758a61423d8fda7eb2ff5ee10)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件信息上传输出对象»](#4cb31be5f26c4ad3f5ecd9bb491c6d9c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropDataFiletransfer/fileInfoReport
```


###### 请求 body
```json
{
  "clientCostTime" : "string",
  "clientCostTimeUnit" : "string",
  "countNum" : 0,
  "cropId" : 0,
  "dataEndTime" : "string",
  "dataStartTime" : "string",
  "fileBizDate" : "string",
  "fileFormat" : "string",
  "fileName" : "string",
  "fileSign" : "string",
  "fileSize" : "string",
  "fileUploadLists" : [ {
    "bizEnd" : "string",
    "bizStart" : "string",
    "countNum" : 0,
    "fileBizDate" : "string",
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSign" : "string",
    "fileSize" : "string",
    "tableId" : 0,
    "tableName" : "string"
  } ],
  "fileUploadZipLists" : [ {
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSize" : "string"
  } ],
  "processId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "zipIds" : [ { } ]
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="filereportusingpost_2"></a>
#### 【客户端】压缩文件上传
```
POST /cropDataFiletransfer/fileUpload
```


##### 说明
压缩文件传输


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**processDetailId**  <br>*必填*|任务执行明细ID|string|
|**Body**|**processId**  <br>*必填*|任务执行ID|string|
|**Body**|**uploadId**  <br>*必填*|批次号|string|
|**Body**|**zipId**  <br>*必填*|压缩号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件传输出参对象»](#f5975201b7af99306f0b37eddf668177)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/cropDataFiletransfer/fileUpload
```


###### 请求 body
```json
{ }
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "uploadResult" : "string",
    "zipId" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querycollectlistusingpost"></a>
#### 数据采集情况
```
POST /filetransfer/collectlist
```


##### 说明
数据采集情况


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«数据采集明细数据入参对象»](#ea5172554ae759f132debe5dbf781cd1)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«数据采集明细数据»»](#fa78436fd0b4e081fd1fc1a7303c770e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/collectlist
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "cropName" : "string",
    "customsCode" : "string",
    "dataEndTime" : "string",
    "dataStartTime" : "string",
    "forwardStatus" : "string",
    "tableName" : "string",
    "uploadStatus" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "bizEnd" : "string",
      "bizStart" : "string",
      "chineseName" : "string",
      "countNum" : 0,
      "cropId" : "string",
      "cropName" : "string",
      "customsCode" : "string",
      "fileSize" : "string",
      "forwardStatus" : "string",
      "forwardStatusTrans" : "string",
      "tableName" : "string",
      "uploadStatus" : "string",
      "uploadStatusTrans" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="exportcollectlistusingpost"></a>
#### 数据采集情况导出
```
POST /filetransfer/collectlist/export
```


##### 说明
数据采集情况导出


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[数据采集明细数据入参对象](#81657f48b429c6c51d40a12f8e20b7a5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/collectlist/export
```


###### 请求 body
```json
{
  "cropName" : "string",
  "customsCode" : "string",
  "dataEndTime" : "string",
  "dataStartTime" : "string",
  "forwardStatus" : "string",
  "tableName" : "string",
  "uploadStatus" : "string"
}
```


<a name="filedownloadusingget"></a>
#### 上报文件下载
```
GET /filetransfer/fileDownload
```


##### 说明
上报文件下载


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**uploadId**  <br>*必填*|批次号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/fileDownload
```


###### 请求 header
```json
"string"
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="fileinforeportusingpost_1"></a>
#### 【客户端】文件信息上报
```
POST /filetransfer/fileInfoReport
```


##### 说明
文件整体信息上报，并返回批次号


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**fileInfoReport**  <br>*必填*|fileInfoReport|[文件信息上报入参对象](#d2e944e758a61423d8fda7eb2ff5ee10)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件信息上传输出对象»](#4cb31be5f26c4ad3f5ecd9bb491c6d9c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/fileInfoReport
```


###### 请求 body
```json
{
  "clientCostTime" : "string",
  "clientCostTimeUnit" : "string",
  "countNum" : 0,
  "cropId" : 0,
  "dataEndTime" : "string",
  "dataStartTime" : "string",
  "fileBizDate" : "string",
  "fileFormat" : "string",
  "fileName" : "string",
  "fileSign" : "string",
  "fileSize" : "string",
  "fileUploadLists" : [ {
    "bizEnd" : "string",
    "bizStart" : "string",
    "countNum" : 0,
    "fileBizDate" : "string",
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSign" : "string",
    "fileSize" : "string",
    "tableId" : 0,
    "tableName" : "string"
  } ],
  "fileUploadZipLists" : [ {
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSize" : "string"
  } ],
  "processId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "zipIds" : [ { } ]
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="filereportusingpost_3"></a>
#### 【客户端】压缩文件上传
```
POST /filetransfer/fileReport
```


##### 说明
压缩文件传输


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**uploadId**  <br>*必填*|批次号|string|
|**Header**|**zipId**  <br>*必填*|压缩号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件传输出参对象»](#f5975201b7af99306f0b37eddf668177)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/fileReport
```


###### 请求 header
```json
"string"
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "uploadResult" : "string",
    "zipId" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="forwarduploadinforesponseusingpost"></a>
#### 接收上报信息返回
```
POST /filetransfer/forwardUploadInfoResponse
```


##### 说明
接收上报信息返回


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**forwardUploadInfoResponse**  <br>*必填*|forwardUploadInfoResponse|[文件信息对象](#a8f681a361223bcebd2d22e168895c4b)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/forwardUploadInfoResponse
```


###### 请求 body
```json
{
  "fileSign" : "string",
  "forwardUploadId" : "string",
  "forwardZipIds" : [ { } ]
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="forwarduploadresponseusingpost"></a>
#### 查询上传日志
```
POST /filetransfer/forwardUploadResponse
```


##### 说明
查询上传日志


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**forwardUploadResponse**  <br>*必填*|forwardUploadResponse|[文件传输出参对象](#40a81f7a562f501c95b3deb2ab0c51c2)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/forwardUploadResponse
```


###### 请求 body
```json
{
  "uploadId" : "string",
  "uploadResult" : "string",
  "zipId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="getuploadinfousingpost"></a>
#### 查询上传日志
```
POST /filetransfer/getUploadInfo
```


##### 说明
查询上传日志


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**getUploadInfo**  <br>*必填*|getUploadInfo|[分页请求对象«查询上传日志入参对象»](#fb0d029cd39883cdb3d7b59ffafb4e5f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«查询上传日志出参参对象»»](#83ec80320d70ab10b1cca5d561916c0b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/getUploadInfo
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "bizEndBegin" : "string",
    "bizEndEnd" : "string",
    "bizStartBegin" : "string",
    "bizStartEnd" : "string",
    "cropId" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "dataEndTime" : "string",
    "dataStartTime" : "string",
    "forwardStatus" : "string",
    "tableName" : "string",
    "uploadId" : "string",
    "uploadStatus" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "bizEnd" : "string",
      "bizStart" : "string",
      "createTime" : "string",
      "cropId" : 0,
      "cropName" : "string",
      "fileName" : "string",
      "fileSize" : "string",
      "fileStorePath" : "string",
      "lastUpload" : "string",
      "listId" : "string",
      "tableName" : "string",
      "tranUploadStatus" : "string",
      "uploadId" : "string",
      "uploadStatus" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="getzipsuploadstatususingpost"></a>
#### 【客户端】压缩包上传状态查询
```
POST /filetransfer/getZipsUploadStatus
```


##### 说明
压缩包上传查询


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**getZipsUploadStatus**  <br>*必填*|getZipsUploadStatus|[获取上传状态入参对象](#fafd8c0ed5907ba84c2c0e14873d21b1)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«获取上传状态出参对象»»](#13e8ff9c3b33e88d09253011fda6e30f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/getZipsUploadStatus
```


###### 请求 body
```json
{
  "cropId" : 0,
  "uploadStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "fileName" : "string",
    "uploadId" : "string",
    "uploadStatus" : "string",
    "zipId" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="reportcontrolusingpost"></a>
#### 【客户端】上报控制（心跳）
```
POST /filetransfer/reportControl
```


##### 说明
用来控制客户端是否进行上报/文件上传/日志上传/采集/全量或者增量


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**reportControl**  <br>*必填*|reportControl|[上报（心跳）控制入参对象](#cc5bd181406d41092ddaaca1aa3a5605)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«上报控制出参对象»](#c36bcefa2a9c80e70f08be92488f0245)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/reportControl
```


###### 请求 body
```json
{
  "cropClientId" : "string",
  "cropId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "collectEndTime" : "string",
    "collectFlag" : "string",
    "collectRemarks" : "string",
    "collectStartTime" : "string",
    "isAll" : "string",
    "reportFlag" : "string",
    "reportRemarks" : "string",
    "uploadFlag" : "string",
    "uploadLogFlag" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="standardtableusingget"></a>
#### 标准表列表
```
GET /filetransfer/standardTable
```


##### 说明
标准表列表


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«标准表列表数据»»](#c279b0b9c149a01f413fe53df6953646)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/standardTable
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "chineseName" : "string",
    "tableName" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="toforwardusingget"></a>
#### 上传到管理网
```
GET /filetransfer/toForward/{uploadId}
```


##### 说明
上传到管理网


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**uploadId**  <br>*必填*|uploadId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/toForward/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="uploadinfodeailsusingget"></a>
#### 数据采集上报详情
```
GET /filetransfer/uploadInfoDeails/{uploadId}
```


##### 说明
数据采集上报详情


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**uploadId**  <br>*必填*|uploadId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«数据采集上报查询OutVO»](#010734397be02de5f56822880c7a5a51)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/uploadInfoDeails/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "cropId" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "dataEndTime" : "string",
    "dataSource" : "string",
    "dataStartTime" : "string",
    "fileName" : "string",
    "fileSize" : "string",
    "forwardStatus" : "string",
    "forwardStatusTrans" : "string",
    "uploadEnd" : "string",
    "uploadId" : "string",
    "uploadStart" : "string",
    "uploadStatus" : "string",
    "uploadStatusTrans" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="uploadinfopageusingpost"></a>
#### 数据采集上报查询
```
POST /filetransfer/uploadInfoPage
```


##### 说明
数据采集上报查询


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«查询上传日志入参对象»](#fb0d029cd39883cdb3d7b59ffafb4e5f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«数据采集上报查询OutVO»»](#fc87752f8020e01e5fba9754d30b5c28)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/uploadInfoPage
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "bizEndBegin" : "string",
    "bizEndEnd" : "string",
    "bizStartBegin" : "string",
    "bizStartEnd" : "string",
    "cropId" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "dataEndTime" : "string",
    "dataStartTime" : "string",
    "forwardStatus" : "string",
    "tableName" : "string",
    "uploadId" : "string",
    "uploadStatus" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "cropId" : "string",
      "cropName" : "string",
      "customsCode" : "string",
      "dataEndTime" : "string",
      "dataSource" : "string",
      "dataStartTime" : "string",
      "fileName" : "string",
      "fileSize" : "string",
      "forwardStatus" : "string",
      "forwardStatusTrans" : "string",
      "uploadEnd" : "string",
      "uploadId" : "string",
      "uploadStart" : "string",
      "uploadStatus" : "string",
      "uploadStatusTrans" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="uploadlistusingget"></a>
#### 数据采集详情表类型列表
```
GET /filetransfer/uploadList/{uploadId}
```


##### 说明
数据采集详情表类型列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**uploadId**  <br>*必填*|uploadId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«数据采集上报表明细数据»»](#1476982c7368460e2b9c78cf2440bbf4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/filetransfer/uploadList/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "bizEnd" : "string",
    "bizStart" : "string",
    "chineseName" : "string",
    "countNum" : 0,
    "tableName" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="beaa352a758d5eb8427de0be1c8ef524"></a>
### 管理网文件传输操作接口
Forward File Transfer Controller


<a name="fileinforeportusingpost_2"></a>
#### 【电子口岸】文件信息上报
```
POST /forwardFiletransfer/fileInfoReport
```


##### 说明
文件整体信息上报，并返回批次号


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**fileInfoReport**  <br>*必填*|fileInfoReport|[文件信息上报入参对象](#d2e944e758a61423d8fda7eb2ff5ee10)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件信息上传输出对象»](#4cb31be5f26c4ad3f5ecd9bb491c6d9c)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/forwardFiletransfer/fileInfoReport
```


###### 请求 body
```json
{
  "clientCostTime" : "string",
  "clientCostTimeUnit" : "string",
  "countNum" : 0,
  "cropId" : 0,
  "dataEndTime" : "string",
  "dataStartTime" : "string",
  "fileBizDate" : "string",
  "fileFormat" : "string",
  "fileName" : "string",
  "fileSign" : "string",
  "fileSize" : "string",
  "fileUploadLists" : [ {
    "bizEnd" : "string",
    "bizStart" : "string",
    "countNum" : 0,
    "fileBizDate" : "string",
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSign" : "string",
    "fileSize" : "string",
    "tableId" : 0,
    "tableName" : "string"
  } ],
  "fileUploadZipLists" : [ {
    "fileFormat" : "string",
    "fileName" : "string",
    "fileSize" : "string"
  } ],
  "processId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "zipIds" : [ { } ]
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="filereportusingpost_4"></a>
#### 【客户端】压缩文件上报
```
POST /forwardFiletransfer/fileReport
```


##### 说明
压缩文件传输


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Header**|**uploadId**  <br>*必填*|批次号|string|
|**Header**|**zipId**  <br>*必填*|压缩号|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«文件传输出参对象»](#f5975201b7af99306f0b37eddf668177)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/forwardFiletransfer/fileReport
```


###### 请求 header
```json
"string"
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "uploadId" : "string",
    "uploadResult" : "string",
    "zipId" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="getuploadinfousingpost_1"></a>
#### 查询上传日志
```
POST /forwardFiletransfer/getUploadInfo
```


##### 说明
查询上传日子


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**getUploadInfo**  <br>*必填*|getUploadInfo|[分页请求对象«查询上传日志入参对象»](#fb0d029cd39883cdb3d7b59ffafb4e5f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«查询上传日志出参参对象»»](#83ec80320d70ab10b1cca5d561916c0b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/forwardFiletransfer/getUploadInfo
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "bizEndBegin" : "string",
    "bizEndEnd" : "string",
    "bizStartBegin" : "string",
    "bizStartEnd" : "string",
    "cropId" : "string",
    "cropName" : "string",
    "customsCode" : "string",
    "dataEndTime" : "string",
    "dataStartTime" : "string",
    "forwardStatus" : "string",
    "tableName" : "string",
    "uploadId" : "string",
    "uploadStatus" : "string"
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "bizEnd" : "string",
      "bizStart" : "string",
      "createTime" : "string",
      "cropId" : 0,
      "cropName" : "string",
      "fileName" : "string",
      "fileSize" : "string",
      "fileStorePath" : "string",
      "lastUpload" : "string",
      "listId" : "string",
      "tableName" : "string",
      "tranUploadStatus" : "string",
      "uploadId" : "string",
      "uploadStatus" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="getzipsuploadstatususingpost_1"></a>
#### 【客户端】压缩包上传状态查询
```
POST /forwardFiletransfer/getZipsUploadStatus
```


##### 说明
压缩包上传查询


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**getZipsUploadStatus**  <br>*必填*|getZipsUploadStatus|[获取上传状态入参对象](#fafd8c0ed5907ba84c2c0e14873d21b1)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«获取上传状态出参对象»»](#13e8ff9c3b33e88d09253011fda6e30f)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/forwardFiletransfer/getZipsUploadStatus
```


###### 请求 body
```json
{
  "cropId" : 0,
  "uploadStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "fileName" : "string",
    "uploadId" : "string",
    "uploadStatus" : "string",
    "zipId" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="7668dca28b540d9288712628a58804fc"></a>
### 系统用户接口
K Sys User Controller


<a name="getlogincodeusingpost"></a>
#### 获取登录codeid
```
POST /logincode
```


##### 说明
获取登录codeid


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/logincode
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="registsmsimgverifycodeusingget"></a>
#### 获取图形验证码
```
GET /loginimg
```


##### 说明
获取图形验证码


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**codeid**  <br>*必填*|codeid|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/loginimg?codeid=string
```


<a name="postimgverifycodeusingpost"></a>
#### 获取post图形验证码
```
POST /postimg
```


##### 说明
获取post图形验证码


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[验证码请求VO](#82a07fee2a2a536f5e71d1764c43851d)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/postimg
```


###### 请求 body
```json
{
  "codeid" : "string"
}
```


<a name="addksysuserusingpost"></a>
#### 系统用户新增
```
POST /user/addUser
```


##### 说明
系统用户新增


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysUserInvo**  <br>*必填*|sysUserInvo|[系统用户添加对象](#d6869edea1c6ffb68217f37edcd502c5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/addUser
```


###### 请求 body
```json
{
  "createBy" : "string",
  "customsUserCode" : "string",
  "department" : "string",
  "imgFile" : "string",
  "name" : "string",
  "phone" : "string",
  "sessionId" : "string",
  "userName" : "string",
  "userPassword" : "string",
  "userType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="checkusernameusingget"></a>
#### 检查用户名是否存在接口
```
GET /user/checkUserName
```


##### 说明
检查用户名是否存在接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userName**  <br>*必填*|userName|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/checkUserName?userName=string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="curuserusingpost"></a>
#### 当前登录用户信息
```
POST /user/curUser
```


##### 说明
当前登录用户信息


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«系统用户查询返回对象»](#89c6b7ce63e07e442dcb87ea951b51c2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/curUser
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "createBy" : "string",
    "createTime" : "string",
    "customsUserCode" : "string",
    "headThumbFile" : "string",
    "lastLoginIp" : "string",
    "lastLoginMac" : "string",
    "lastLoginTime" : "string",
    "lastLoginType" : 0,
    "lastLoginTypeTrans" : "string",
    "name" : "string",
    "phone" : "string",
    "updateBy" : "string",
    "updateTime" : "string",
    "userId" : "string",
    "userName" : "string",
    "userStatus" : 0,
    "userStatusTrans" : "string",
    "userType" : 0,
    "userTypeTrans" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="deletebypkusingget_2"></a>
#### 根据用户ID删除用户
```
GET /user/deleteSysUser/{userId}
```


##### 说明
根据用户ID删除用户


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**userId**  <br>*必填*|用户ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/deleteSysUser/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="getallsysuserbyuseridlistusingpost"></a>
#### 根据批量用户Id获得批量用户信息
```
POST /user/getAllSysUserByUserIdList
```


##### 说明
根据批量用户Id获得批量用户信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**userIdList**  <br>*必填*|userIdList|< [GetSysUserByUserIdInVo](#getsysuserbyuseridinvo) > array|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«系统用户查询返回对象»»](#90cafb11298ec1bab18bb5039aba7aee)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/getAllSysUserByUserIdList
```


###### 请求 body
```json
[ {
  "userId" : "string"
} ]
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "createBy" : "string",
    "createTime" : "string",
    "customsUserCode" : "string",
    "headThumbFile" : "string",
    "lastLoginIp" : "string",
    "lastLoginMac" : "string",
    "lastLoginTime" : "string",
    "lastLoginType" : 0,
    "lastLoginTypeTrans" : "string",
    "name" : "string",
    "phone" : "string",
    "updateBy" : "string",
    "updateTime" : "string",
    "userId" : "string",
    "userName" : "string",
    "userStatus" : 0,
    "userStatusTrans" : "string",
    "userType" : 0,
    "userTypeTrans" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="loginuserusingpost"></a>
#### 系统用户登录接口
```
POST /user/loginUser
```


##### 说明
系统用户登录接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysUserLoginInvo**  <br>*必填*|sysUserLoginInvo|[用户登录对象](#75405ae17c7f4f8c22e6cb47979b4d00)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«系统用户查询返回对象»](#89c6b7ce63e07e442dcb87ea951b51c2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/loginUser
```


###### 请求 body
```json
{
  "codeId" : "string",
  "lastLoginIp" : "string",
  "lastLoginMac" : "string",
  "lastLoginType" : 0,
  "userName" : "string",
  "userPassword" : "string",
  "verifyCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "createBy" : "string",
    "createTime" : "string",
    "customsUserCode" : "string",
    "headThumbFile" : "string",
    "lastLoginIp" : "string",
    "lastLoginMac" : "string",
    "lastLoginTime" : "string",
    "lastLoginType" : 0,
    "lastLoginTypeTrans" : "string",
    "name" : "string",
    "phone" : "string",
    "updateBy" : "string",
    "updateTime" : "string",
    "userId" : "string",
    "userName" : "string",
    "userStatus" : 0,
    "userStatusTrans" : "string",
    "userType" : 0,
    "userTypeTrans" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="logoutuserpostusingpost"></a>
#### 系统用户退出接口/post
```
POST /user/logoutUser
```


##### 说明
系统用户退出接口/post


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/logoutUser
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="logoutuserusingget"></a>
#### 系统用户退出接口/get
```
GET /user/logoutUser
```


##### 说明
系统用户退出接口/get


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/logoutUser
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querybypkusingget_2"></a>
#### 根据用户ID查询用户信息
```
GET /user/queryIdSysUser/{userId}
```


##### 说明
根据用户ID查询用户信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**userId**  <br>*必填*|用户ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«系统用户查询返回对象»](#89c6b7ce63e07e442dcb87ea951b51c2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/queryIdSysUser/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "createBy" : "string",
    "createTime" : "string",
    "customsUserCode" : "string",
    "headThumbFile" : "string",
    "lastLoginIp" : "string",
    "lastLoginMac" : "string",
    "lastLoginTime" : "string",
    "lastLoginType" : 0,
    "lastLoginTypeTrans" : "string",
    "name" : "string",
    "phone" : "string",
    "updateBy" : "string",
    "updateTime" : "string",
    "userId" : "string",
    "userName" : "string",
    "userStatus" : 0,
    "userStatusTrans" : "string",
    "userType" : 0,
    "userTypeTrans" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="resetuserpasswordusingget"></a>
#### 重置用户密码
```
GET /user/resetUserPassword
```


##### 说明
重置用户密码接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*必填*|userId|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/resetUserPassword?userId=string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryksysuserpageusingpost"></a>
#### 分页查询用户列表
```
POST /user/sysUsersList
```


##### 说明
分页查询用户列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«查询用户列表请求VO»](#e460846c17b4df55c49dadf456c286e8)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«系统用户查询返回对象»»](#a85316122e726a3ad1226e30faa7a6d8)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/sysUsersList
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "customsUserCode" : "string",
    "userName" : "string",
    "userType" : 0
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "createBy" : "string",
      "createTime" : "string",
      "customsUserCode" : "string",
      "headThumbFile" : "string",
      "lastLoginIp" : "string",
      "lastLoginMac" : "string",
      "lastLoginTime" : "string",
      "lastLoginType" : 0,
      "lastLoginTypeTrans" : "string",
      "name" : "string",
      "phone" : "string",
      "updateBy" : "string",
      "updateTime" : "string",
      "userId" : "string",
      "userName" : "string",
      "userStatus" : 0,
      "userStatusTrans" : "string",
      "userType" : 0,
      "userTypeTrans" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updatestatususingpost_1"></a>
#### 系统用户状态变更
```
POST /user/updateStatus
```


##### 说明
系统用户状态变更


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysUserUpdatevo**  <br>*必填*|sysUserUpdatevo|[用户状态更新实例](#02337d8641eb8e62ec1aaa5b9a5d447c)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/updateStatus
```


###### 请求 body
```json
{
  "userId" : "string",
  "userStatus" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updateksysuserusingpost"></a>
#### 系统用户修改
```
POST /user/updateSysUser
```


##### 说明
系统用户修改


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysUserUpdatevo**  <br>*必填*|sysUserUpdatevo|[用户更新对象](#eb112aa3f6d6667069476b13a45f908b)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/updateSysUser
```


###### 请求 body
```json
{
  "customsUserCode" : "string",
  "imgFile" : "string",
  "name" : "string",
  "phone" : "string",
  "sessionId" : "string",
  "updateBy" : "string",
  "userId" : "string",
  "userName" : "string",
  "userPassword" : "string",
  "userType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updatesysusercontainpwdusingpost"></a>
#### 系统用户修改包含修改密码
```
POST /user/updateSysUserContainPwd
```


##### 说明
系统用户修改包含修改密码


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysUserUpdatevo**  <br>*必填*|sysUserUpdatevo|[用户更新对象](#eb112aa3f6d6667069476b13a45f908b)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/updateSysUserContainPwd
```


###### 请求 body
```json
{
  "customsUserCode" : "string",
  "imgFile" : "string",
  "name" : "string",
  "phone" : "string",
  "sessionId" : "string",
  "updateBy" : "string",
  "userId" : "string",
  "userName" : "string",
  "userPassword" : "string",
  "userType" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="resetuserpasswordusingget_1"></a>
#### 修改用户密码
```
GET /user/updateUserPassword
```


##### 说明
修改用户密码


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**newPassword**  <br>*必填*|新密码|string|
|**Query**|**oldPassword**  <br>*必填*|旧密码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/user/updateUserPassword?newPassword=string&oldPassword=string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="f8cec26b8d1f30a4205ef5281b60314f"></a>
### 系统菜单操作接口
K Sys Resource Controller


<a name="addksysresourceusingpost"></a>
#### 菜单添加接口
```
POST /resource/addSysResource
```


##### 说明
菜单添加接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysResourceInVo**  <br>*必填*|sysResourceInVo|[菜单添加实例](#1842b356528f24513766bb02ca222df0)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/addSysResource
```


###### 请求 body
```json
{
  "createBy" : "string",
  "parentCode" : "string",
  "resourceImgFile" : "string",
  "resourceName" : "string",
  "resourceType" : 0,
  "resourceValue" : "string",
  "sort" : 0,
  "updateBy" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="deletebypkusingget"></a>
#### 根据ID删除菜单
```
GET /resource/deleteSysResource/{resourceCode}
```


##### 说明
根据ID删除菜单


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**resourceCode**  <br>*必填*|菜单Code|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/deleteSysResource/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryksysresourcepageusingpost"></a>
#### 分页查询菜单信息列表
```
POST /resource/queryKSysResourcePage
```


##### 说明
分页查询菜单信息列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«查询菜单列表请求VO»](#495e67434a4adcf3ee14f853c30e8f59)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«菜单查询返回对象»»](#146b6b6bc70c9c5d4a7632e75ab4c490)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/queryKSysResourcePage
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "resourceName" : "string",
    "resourceType" : 0
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "createBy" : "string",
      "createTime" : "string",
      "isRole" : "string",
      "parentCode" : "string",
      "resourceCode" : "string",
      "resourceImgFile" : "string",
      "resourceName" : "string",
      "resourceStatus" : 0,
      "resourceStatusTrans" : "string",
      "resourceType" : 0,
      "resourceTypeTrans" : "string",
      "resourceValue" : "string",
      "sort" : 0,
      "updateBy" : "string",
      "updateTime" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querymenulistusingget"></a>
#### 菜单树形结构查询接口
```
GET /resource/queryMenuList
```


##### 说明
菜单树形结构查询接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**querytype**  <br>*必填*|查询菜单类型：0--查询所有菜单 1--根据用户Id查询菜单|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«菜单树形对象»»](#52cc9261915309f1013302462dbfaf2b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/queryMenuList?querytype=string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "childMenusList" : [ {
      "childMenusList" : [ "..." ],
      "parentCode" : "string",
      "resourceCode" : "string",
      "resourceImgFile" : "string",
      "resourceName" : "string",
      "resourceType" : 0,
      "resourceTypeTrans" : "string",
      "resourceValue" : "string",
      "sort" : 0
    } ],
    "parentCode" : "string",
    "resourceCode" : "string",
    "resourceImgFile" : "string",
    "resourceName" : "string",
    "resourceType" : 0,
    "resourceTypeTrans" : "string",
    "resourceValue" : "string",
    "sort" : 0
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querymenuusingpost"></a>
#### 菜单树形结构查询接口
```
POST /resource/queryResourceList
```


##### 说明
菜单树形结构查询接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[菜单列表请求VO](#a2d3fca7bb746f8efbdea89e8bf69346)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«菜单树形对象»»](#52cc9261915309f1013302462dbfaf2b)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/queryResourceList
```


###### 请求 body
```json
{
  "queryType" : "string",
  "resourceModule" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "childMenusList" : [ {
      "childMenusList" : [ "..." ],
      "parentCode" : "string",
      "resourceCode" : "string",
      "resourceImgFile" : "string",
      "resourceName" : "string",
      "resourceType" : 0,
      "resourceTypeTrans" : "string",
      "resourceValue" : "string",
      "sort" : 0
    } ],
    "parentCode" : "string",
    "resourceCode" : "string",
    "resourceImgFile" : "string",
    "resourceName" : "string",
    "resourceType" : 0,
    "resourceTypeTrans" : "string",
    "resourceValue" : "string",
    "sort" : 0
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querybypkusingget"></a>
#### 根据菜单ID查询菜单信息
```
GET /resource/querySysResource/{resourceCode}
```


##### 说明
根据菜单ID查询菜单信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**resourceCode**  <br>*必填*|菜单Code|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«菜单查询返回对象»](#875f6c16aa2be824630d3b3fc8bcf2d1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/querySysResource/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "createBy" : "string",
    "createTime" : "string",
    "isRole" : "string",
    "parentCode" : "string",
    "resourceCode" : "string",
    "resourceImgFile" : "string",
    "resourceName" : "string",
    "resourceStatus" : 0,
    "resourceStatusTrans" : "string",
    "resourceType" : 0,
    "resourceTypeTrans" : "string",
    "resourceValue" : "string",
    "sort" : 0,
    "updateBy" : "string",
    "updateTime" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updateksysresourceusingpost"></a>
#### 菜单编辑接口
```
POST /resource/updateSysResource/{resourceCode}
```


##### 说明
菜单编辑接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**resourceCode**  <br>*必填*|resourceCode|string|
|**Body**|**sysResourceInVo**  <br>*必填*|sysResourceInVo|[菜单添加实例](#1842b356528f24513766bb02ca222df0)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/resource/updateSysResource/string
```


###### 请求 body
```json
{
  "createBy" : "string",
  "parentCode" : "string",
  "resourceImgFile" : "string",
  "resourceName" : "string",
  "resourceType" : 0,
  "resourceValue" : "string",
  "sort" : 0,
  "updateBy" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="cd71b8e112c3d030375077aa66baa3a2"></a>
### 系统角色操作接口
K Sys Role Controller


<a name="addksysroleusingpost"></a>
#### 角色添加
```
POST /role/addRole
```


##### 说明
角色添加


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysRoleInvo**  <br>*必填*|sysRoleInvo|[角色添加实例](#5ffa6475ab16c959218a84df0ebf5dc5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/addRole
```


###### 请求 body
```json
{
  "roleName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="deletebypkusingget_1"></a>
#### 根据ID删除角色
```
GET /role/deleteRole/{roleCode}
```


##### 说明
根据ID删除角色


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**roleCode**  <br>*必填*|角色Code|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/deleteRole/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querybylistusingget"></a>
#### 查询角色列表
```
GET /role/queryByList
```


##### 说明
查询角色列表


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«角色查询返回对象»»](#d2d66598edb6420cc9bdcaadc384579c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/queryByList
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "createBy" : "string",
    "createTime" : "string",
    "isUser" : "string",
    "roleCode" : "string",
    "roleName" : "string",
    "roleStatus" : 0,
    "roleStatusTrans" : "string",
    "updateBy" : "string",
    "updateTime" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="querybypkusingget_1"></a>
#### 根据角色ID查询角色信息
```
GET /role/queryByPk/{roleCode}
```


##### 说明
根据角色ID查询角色信息


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**roleCode**  <br>*必填*|角色Code|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«角色查询返回对象»](#13a3fc966b30941235d5b5e2a647f949)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/queryByPk/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "createBy" : "string",
    "createTime" : "string",
    "isUser" : "string",
    "roleCode" : "string",
    "roleName" : "string",
    "roleStatus" : 0,
    "roleStatusTrans" : "string",
    "updateBy" : "string",
    "updateTime" : "string"
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryksysrolepageusingpost"></a>
#### 分页查询角色列表
```
POST /role/queryKSysRolePage
```


##### 说明
分页查询角色列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**pageReq**  <br>*必填*|pageReq|[分页请求对象«查询角色列表请求VO»](#98dbc77063334f4b16933782dd2d9500)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«分页返回对象«角色查询返回对象»»](#2c7aaf0574d2b4b077702ea6280e8098)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/queryKSysRolePage
```


###### 请求 body
```json
{
  "pageNum" : 0,
  "pageSize" : 0,
  "sortBy" : "string",
  "sortDirect" : "string",
  "template" : {
    "roleName" : "string",
    "roleStatus" : 0
  }
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : {
    "count" : 0,
    "data" : [ {
      "createBy" : "string",
      "createTime" : "string",
      "isUser" : "string",
      "roleCode" : "string",
      "roleName" : "string",
      "roleStatus" : 0,
      "roleStatusTrans" : "string",
      "updateBy" : "string",
      "updateTime" : "string"
    } ],
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0
  },
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updateksysroleusingpost"></a>
#### 角色编辑
```
POST /role/updateRole/{roleCode}
```


##### 说明
角色编辑


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**roleCode**  <br>*必填*|roleCode|string|
|**Body**|**sysRoleInvo**  <br>*必填*|sysRoleInvo|[角色添加实例](#5ffa6475ab16c959218a84df0ebf5dc5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/updateRole/string
```


###### 请求 body
```json
{
  "roleName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="updatestatususingpost"></a>
#### 角色状态修改
```
POST /role/updateStatus
```


##### 说明
角色状态修改


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**invo**  <br>*必填*|invo|[角色状态更新实例](#08902ef32661347df9cb2d17162ad314)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«boolean»](#05c093867d8781d4f40d5c999fdbd397)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/role/updateStatus
```


###### 请求 body
```json
{
  "roleCode" : "string",
  "roleStatus" : 0
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : true,
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="6ca428b4fdcbb0f36438b5f60bb6def5"></a>
### 系统角色用户关联接口
K Sys Role User Controller


<a name="addksysroleuserusingpost"></a>
#### 角色用户关联添加接口
```
POST /roleUser/addSysRoleUser
```


##### 说明
角色用户关联添加接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysRoleUserInvo**  <br>*必填*|sysRoleUserInvo|[用户角色关联对象](#31772e73cb1108271fb22ba90d0cacd5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/roleUser/addSysRoleUser
```


###### 请求 body
```json
{
  "roleCodes" : [ "string" ],
  "userId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryroleuserlistusingget"></a>
#### 根据用户ID查询关联角色
```
GET /roleUser/queryRoleUserList/{userId}
```


##### 说明
根据用户ID查询关联角色


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**userId**  <br>*必填*|用户ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«string»»](#7aa2e1db203d9f79bb4fc5373a193023)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/roleUser/queryRoleUserList/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ "string" ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="ff9ca6b4eeeb2a9643ca6712379c367c"></a>
### 系统角色菜单关联接口
K Sys Role Resource Controller


<a name="addksysroleresourceusingpost"></a>
#### 角色菜单关联添加接口
```
POST /roleResource/addSysRoleResource
```


##### 说明
角色菜单关联添加接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sysRoleResourceInvo**  <br>*必填*|sysRoleResourceInvo|[权限菜单添加实例](#31a5655f409af79cf908a0e3f8092e73)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«string»](#6b30e01cdc96c9cfda78c0865aca6f98)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/roleResource/addSysRoleResource
```


###### 请求 body
```json
{
  "resourceCode" : [ "string" ],
  "roleCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : "string",
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryroleresourcelistusingget"></a>
#### 角色菜单关联查询接口
```
GET /roleResource/queryRoleResourceList/{roleCode}
```


##### 说明
角色菜单关联查询接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**roleCode**  <br>*必填*|权限Code|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«string»»](#7aa2e1db203d9f79bb4fc5373a193023)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/roleResource/queryRoleResourceList/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ "string" ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```


<a name="queryusermenulistusingget"></a>
#### 根据用户ID查询拥有菜单列表
```
GET /roleResource/queryUserMenuList/{userId}
```


##### 说明
根据用户ID查询拥有菜单列表


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**userId**  <br>*必填*|用户ID|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[接口返回对象«List«权限菜单关联查询返回对象»»](#68e02ff6ff854025407d8ad2bfc5bd46)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `\*/*`


##### HTTP请求示例

###### 请求 path
```
/roleResource/queryUserMenuList/string
```


##### HTTP响应示例

###### 响应 200
```json
{
  "errorCode" : "string",
  "errorMessage" : "string",
  "responseBody" : [ {
    "resourceCode" : "string",
    "roleCode" : "string"
  } ],
  "responseCode" : "string",
  "responseData" : "string",
  "status" : "string"
}
```




<a name="definitions"></a>
## 定义

<a name="detail"></a>
### Detail

|名称|说明|类型|
|---|---|---|
|**level**  <br>*可选*|**样例** : `"string"`|string|
|**order**  <br>*可选*|**样例** : `"string"`|string|
|**tableNameCn**  <br>*可选*|**样例** : `"string"`|string|
|**tableNameEn**  <br>*可选*|**样例** : `"string"`|string|


<a name="edcipcollectdetail"></a>
### EdcipCollectDetail

|名称|说明|类型|
|---|---|---|
|**countNum**  <br>*可选*|**样例** : `0`|integer (int32)|
|**joinFlag**  <br>*可选*|**样例** : `"string"`|string|
|**tableChineseName**  <br>*可选*|**样例** : `"string"`|string|
|**tableKind**  <br>*可选*|**样例** : `"string"`|string|
|**tableLevel**  <br>*可选*|**样例** : `"string"`|string|
|**tableName**  <br>*可选*|**样例** : `"string"`|string|


<a name="edcipcollectresult"></a>
### EdcipCollectResult

|名称|说明|类型|
|---|---|---|
|**advancedTableCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**advancedTableScale**  <br>*可选*|**样例** : `0.0`|number|
|**baseTableCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**baseTableScale**  <br>*可选*|**样例** : `0.0`|number|
|**totalCount**  <br>*可选*|**样例** : `0`|integer (int32)|
|**totalScale**  <br>*可选*|**样例** : `0.0`|number|


<a name="getsysuserbyuseridinvo"></a>
### GetSysUserByUserIdInVo

|名称|说明|类型|
|---|---|---|
|**userId**  <br>*可选*|用户Id：主键  <br>**样例** : `"string"`|string|


<a name="ec171edd847026ed605d65393fdab658"></a>
### Map«string,string»
*类型* : < string, string > map


<a name="syncedcipcropinfoinvo"></a>
### SyncEdcipCropInfoInVo

|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*必填*|企业ID  <br>**样例** : `0`|integer (int64)|
|**cropIdNumber**  <br>*必填*|企业证件编号  <br>**样例** : `"string"`|string|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|


<a name="2b2b5b0d5d400f331a218623690d4dd8"></a>
### 上报压缩信息入参对象
上报压缩信息入参对象


|名称|说明|类型|
|---|---|---|
|**fileFormat**  <br>*可选*|文件格式  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|文件名  <br>**样例** : `"string"`|string|
|**fileSize**  <br>*可选*|文件大小  <br>**样例** : `"string"`|string|


<a name="63d003f9629b9ea4343d7bbc4e20a27c"></a>
### 上报控制出参对象
上报控制出参


|名称|说明|类型|
|---|---|---|
|**collectEndTime**  <br>*可选*|采集结束时间  <br>**样例** : `"string"`|string|
|**collectFlag**  <br>*可选*|是否可以采集，0：不能，1：可以  <br>**样例** : `"string"`|string|
|**collectRemarks**  <br>*可选*|采集备注  <br>**样例** : `"string"`|string|
|**collectStartTime**  <br>*可选*|采集开始时间  <br>**样例** : `"string"`|string|
|**isAll**  <br>*可选*|是否全量，0：否，1：是  <br>**样例** : `"string"`|string|
|**reportFlag**  <br>*可选*|是否可以上报，0：不能，1：可以  <br>**样例** : `"string"`|string|
|**reportRemarks**  <br>*可选*|上报的备注  <br>**样例** : `"string"`|string|
|**uploadFlag**  <br>*可选*|是否可以上传文件，0：不能，1：可以  <br>**样例** : `"string"`|string|
|**uploadLogFlag**  <br>*可选*|是否可以上传日志，0：不能，1：可以  <br>**样例** : `"string"`|string|


<a name="eebb96282673c7b04838943d5ddaa36c"></a>
### 上报文件明细入参对象
上报文件明细入参对象


|名称|说明|类型|
|---|---|---|
|**bizEnd**  <br>*可选*|数据终止日  <br>**样例** : `"string"`|string|
|**bizStart**  <br>*可选*|数据起始日  <br>**样例** : `"string"`|string|
|**countNum**  <br>*可选*|数据条数  <br>**样例** : `0`|integer (int32)|
|**fileBizDate**  <br>*可选*|数据日期，取最后时间，方便服务器了解数据的时间  <br>**样例** : `"string"`|string|
|**fileFormat**  <br>*可选*|文件格式  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|文件名  <br>**样例** : `"string"`|string|
|**fileSign**  <br>*可选*|文件签名  <br>**样例** : `"string"`|string|
|**fileSize**  <br>*可选*|文件大小  <br>**样例** : `"string"`|string|
|**tableId**  <br>*可选*|客户端上传tableId,这样服务端可以关联查找到明细文件的数据源信息  <br>**样例** : `0`|integer (int32)|
|**tableName**  <br>*可选*|客户端上传tableName,这样服务端可以关联查找到明细文件的数据源信息  <br>**样例** : `"string"`|string|


<a name="cc5bd181406d41092ddaaca1aa3a5605"></a>
### 上报（心跳）控制入参对象
文件上传控制入参，客户端询问服务器是否可以上报文件


|名称|说明|类型|
|---|---|---|
|**cropClientId**  <br>*可选*|上报企业客户端id  <br>**样例** : `"string"`|string|
|**cropId**  <br>*可选*|上报企业id  <br>**样例** : `0`|integer (int64)|


<a name="e9135bfe3c2685d2ba1370c6bf725f44"></a>
### 任务取消入参InVo
任务取消入参InVo


|名称|说明|类型|
|---|---|---|
|**taskId**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|
|**taskType**  <br>*可选*|任务类型 1自动 2手动  <br>**样例** : `"string"`|string|


<a name="364f25973fbcae9efcc055a998cee147"></a>
### 任务执行入参InVo
任务执行入参InVo


|名称|说明|类型|
|---|---|---|
|**customsCode**  <br>*可选*|企业编码  <br>**样例** : `"string"`|string|
|**taskId**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|


<a name="b885bcc17ca34594dd68f6f5ab40fdbb"></a>
### 任务执行情况出参outVo
任务执行情况出参outVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|数据结束时间  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|数据开始时间  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|企业编码  <br>**样例** : `"string"`|string|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**executionEndTime**  <br>*可选*|执行结束时间  <br>**样例** : `"string"`|string (date-time)|
|**executionStartTime**  <br>*可选*|执行开始时间  <br>**样例** : `"string"`|string (date-time)|
|**processId**  <br>*可选*|任务执行编号  <br>**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|状态  <br>**样例** : `"string"`|string|
|**taskId**  <br>*可选*|任务编号  <br>**样例** : `0`|integer (int32)|


<a name="f3f6dfb463c4753141486c27a2c1eb1e"></a>
### 任务执行明细入参InVo
任务执行明细入参InVo


|名称|说明|类型|
|---|---|---|
|**processId**  <br>*可选*|进程编号  <br>**样例** : `0`|integer (int32)|
|**taskId**  <br>*可选*|任务编号  <br>**样例** : `0`|integer (int32)|


<a name="801b8a48d4eec273535363a88c4104a2"></a>
### 任务执行明细出参outVo
任务执行明细出参outVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|企业海关编码  <br>**样例** : `"string"`|string|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**executeOrder**  <br>*可选*|执行顺序  <br>**样例** : `0`|integer (int32)|
|**executionEndTime**  <br>*可选*|执行结束时间  <br>**样例** : `"string"`|string (date-time)|
|**executionStartTime**  <br>*可选*|执行开始时间  <br>**样例** : `"string"`|string (date-time)|
|**isAll**  <br>*可选*|是否全量 0否1是  <br>**样例** : `"string"`|string|
|**processDetailId**  <br>*可选*|执行明细编号  <br>**样例** : `0`|integer (int32)|
|**processId**  <br>*可选*|执行编号  <br>**样例** : `0`|integer (int32)|
|**remark**  <br>*可选*|备注  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|执行状态 0：待执行，1：执行中，2：执行成功，4：取消  <br>**样例** : `"string"`|string|
|**tableChineseName**  <br>*可选*|采集标准表中文名  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|采集标准表  <br>**样例** : `"string"`|string|
|**taskDetailId**  <br>*可选*|任务明细编号  <br>**样例** : `0`|integer (int32)|
|**taskId**  <br>*可选*|任务编号  <br>**样例** : `0`|integer (int32)|
|**taskType**  <br>*可选*|任务类型 1自动 2手动  <br>**样例** : `"string"`|string|


<a name="38f974d8d20354ccc87e9c87533294fc"></a>
### 任务明细入参InVo
任务明细入参InVo


|名称|说明|类型|
|---|---|---|
|**taskId**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|


<a name="025636c4f922573e79dd75c18fc29c8e"></a>
### 任务明细出参outVo
任务明细出参outVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|企业海关编码  <br>**样例** : `"string"`|string|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**executeOrder**  <br>*可选*|执行顺序  <br>**样例** : `0`|integer (int32)|
|**isAll**  <br>*可选*|是否全量 0否，1是  <br>**样例** : `"string"`|string|
|**tableChineseName**  <br>*可选*|采集标准表中文名  <br>**样例** : `"string"`|string|
|**tableLevel**  <br>*可选*|采集标准表级别  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|采集标准表  <br>**样例** : `"string"`|string|
|**taskDetailId**  <br>*可选*|任务明细编号  <br>**样例** : `0`|integer (int32)|
|**taskId**  <br>*可选*|任务编号  <br>**样例** : `0`|integer (int32)|
|**taskType**  <br>*可选*|任务类型  1自动 2手动  <br>**样例** : `"string"`|string|
|**uuid**  <br>*可选*|uuid  <br>**样例** : `"string"`|string|


<a name="1a8c76ec85ac18f3f7507623fa16ad27"></a>
### 任务采集心跳入参InVo
任务采集心跳入参InVo


|名称|说明|类型|
|---|---|---|
|**cropClientId**  <br>*可选*|上报企业客户端id  <br>**样例** : `"string"`|string|
|**cropId**  <br>*可选*|上报企业id  <br>**样例** : `0`|integer (int64)|


<a name="c5c3d988d2d1dd6fd595de937f4a16e5"></a>
### 任务采集表(手动任务)入参InVo
任务采集表(手动任务)入参InVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|海关编码(企业编号)  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|**样例** : `[ "[detail](#detail)" ]`|< [Detail](#detail) > array|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**isAll**  <br>*可选*|是否全量 1是0否  <br>**样例** : `"string"`|string|


<a name="a85f9f4ffb58f87d1cd6dc6879e6e527"></a>
### 任务采集表(自动任务)入参InVo
任务采集表(自动任务)入参InVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|海关编码(企业编号)  <br>**样例** : `"string"`|string|
|**cycleTime**  <br>*可选*|周期时间  <br>**样例** : `"string"`|string|
|**cycleType**  <br>*可选*|执行周期 1.天 2.周 3.月 4.年  <br>**样例** : `"string"`|string|
|**cycleValue**  <br>*可选*|周期值  <br>**样例** : `"string"`|string|
|**detail**  <br>*可选*|详情,包括采集标准表表名和标准表的执行顺序  <br>**样例** : `[ "[detail](#detail)" ]`|< [Detail](#detail) > array|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|


<a name="b1afab0edef42bac2704cea304ce1653"></a>
### 企业信息出参对象
企业信息返回VO


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业Id  <br>**样例** : `0`|integer (int64)|
|**cropName**  <br>*可选*|企业名  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编码  <br>**样例** : `"string"`|string|


<a name="3f0e7ad1e6c4d77fcc1bbd411ae56b7a"></a>
### 企业客户端信息出参对象
企业客户端信息返回VO


|名称|说明|类型|
|---|---|---|
|**bindTime**  <br>*可选*|激活时间  <br>**样例** : `"string"`|string|
|**cropClientId**  <br>*可选*|企业客户端id  <br>**样例** : `0`|integer (int32)|
|**isOnline**  <br>*可选*|在线状态 0离线 1在线  <br>**样例** : `0`|integer (int32)|
|**lastConnTime**  <br>*可选*|最近在线时间  <br>**样例** : `"string"`|string|
|**licenseCode**  <br>*可选*|激活码  <br>**样例** : `"string"`|string|
|**macAddress**  <br>*可选*|MAC地址  <br>**样例** : `"string"`|string|


<a name="38e47404eee2a4382797f2b3ff4dcaa6"></a>
### 企业客户端是否安装出参对象

|名称|说明|类型|
|---|---|---|
|**isUse**  <br>*可选*|客户端状态，0未使用，1已使用  <br>**样例** : `"string"`|string|


<a name="f222c2a1f50dfc5cb2683c27241dff58"></a>
### 企业数据库及脚本配置查询对象
企业数据库及脚本配置查询Invo


|名称|说明|类型|
|---|---|---|
|**cropClientId**  <br>*可选*|客户端ID  <br>**样例** : `0`|integer (int32)|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `0`|integer (int64)|


<a name="d13451f411d574de843d70bb874cadc4"></a>
### 企业数据库及脚本配置查询返回对象
企业数据库及脚本配置查询返回Outvo


|名称|说明|类型|
|---|---|---|
|**dbInfo**  <br>*可选*|数据库信息  <br>**样例** : `"string"`|string|
|**sqlInfo**  <br>*可选*|sql脚本信息  <br>**样例** : `"string"`|string|


<a name="4ae148b74f73b3f11769dbb3008ee33c"></a>
### 企业数据库配置解析请求VO
企业数据库配置解析请求入参


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `0`|integer (int64)|
|**customsCode**  <br>*可选*|企业海关编码  <br>**样例** : `"string"`|string|


<a name="e9deef5aa3b700e940934032f1b76993"></a>
### 企业数据库配置解析返回对象
企业数据库配置解析返回Outvo


|名称|说明|类型|
|---|---|---|
|**level**  <br>*可选*|级别  <br>**样例** : `"string"`|string|
|**order**  <br>*可选*|顺序  <br>**样例** : `0`|integer (int32)|
|**tableNameCn**  <br>*可选*|表名-中文  <br>**样例** : `"string"`|string|
|**tableNameEn**  <br>*可选*|表名-英文  <br>**样例** : `"string"`|string|


<a name="32bd78ce628889e71e37677cb1c4add2"></a>
### 企业注册入参对象
企业注册Invo


|名称|说明|类型|
|---|---|---|
|**cropDimension**  <br>*可选*|企业维度  <br>**样例** : `"string"`|string|
|**cropIdNumber**  <br>*必填*|企业证件编号  <br>**样例** : `"string"`|string|
|**cropLongitude**  <br>*可选*|企业经度  <br>**样例** : `"string"`|string|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|


<a name="0848bd1f80575427d0ae33d0fc437a8f"></a>
### 企业配置信息上传返回对象
企业配置信息上传返回Outvo


|名称|说明|类型|
|---|---|---|
|**confId**  <br>*可选*|配置ID  <br>**样例** : `0`|integer (int32)|


<a name="4776645dcb5c13359da9a95a7c76020f"></a>
### 企业配置信息下载请求VO
企业配置信息下载请求入参


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `0`|integer (int64)|
|**fileType**  <br>*可选*|文件类型 1:数据库配置，2:脚本配置  <br>**样例** : `0`|integer (int32)|


<a name="9e779546fdb92c591be25507d04bb847"></a>
### 企业配置信息列表返回对象
企业配置信息列表返回Outvo


|名称|说明|类型|
|---|---|---|
|**confId**  <br>*可选*|配置ID  <br>**样例** : `0`|integer (int32)|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `0`|integer (int64)|
|**cropIdNumber**  <br>*可选*|信用代码  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编码  <br>**样例** : `"string"`|string|
|**functionStatus**  <br>*可选*|企业配置功能状态 0开启，1关闭  <br>**样例** : `"string"`|string|
|**sqlFile**  <br>*可选*|脚本配置文件  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string|
|**xmlFile**  <br>*可选*|数据库配置文件  <br>**样例** : `"string"`|string|


<a name="dd700ac2874326655d19ad887a91cab1"></a>
### 企业配置信息删除请求VO
企业配置信息删除请求入参


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `0`|integer (int64)|
|**fileType**  <br>*可选*|文件类型 1:数据库配置，2:脚本配置  <br>**样例** : `0`|integer (int32)|


<a name="6319a351d66b33588d2595de94f47bd0"></a>
### 企业配置信息查询列表请求VO
企业配置信息查询列表请求入参


|名称|说明|类型|
|---|---|---|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编码  <br>**样例** : `"string"`|string|
|**functionStatus**  <br>*可选*|企业配置功能状态  <br>**样例** : `"string"`|string|


<a name="5f7dc4d4685c31d97b6725d64af1ae88"></a>
### 企业配置功能状态修改入参请求VO
企业配置功能状态修改入参


|名称|说明|类型|
|---|---|---|
|**confId**  <br>*可选*|配置ID  <br>**样例** : `0`|integer (int32)|
|**functionStatus**  <br>*可选*|企业配置功能状态 0开启，1关闭  <br>**样例** : `"string"`|string|


<a name="a9e019acff2774b77d863adabb9c7556"></a>
### 分页请求对象«任务执行入参InVo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[364f25973fbcae9efcc055a998cee147](#364f25973fbcae9efcc055a998cee147)"`|[任务执行入参InVo](#364f25973fbcae9efcc055a998cee147)|


<a name="3e205fc60810dbbb67dc0a3b12f26600"></a>
### 分页请求对象«企业配置信息查询列表请求VO»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[6319a351d66b33588d2595de94f47bd0](#6319a351d66b33588d2595de94f47bd0)"`|[企业配置信息查询列表请求VO](#6319a351d66b33588d2595de94f47bd0)|


<a name="8ffc4731b25d4549e5dd0d54f8bff6ad"></a>
### 分页请求对象«客户端License查询Invo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[500a92a005c5d2ee434aaf12374e4229](#500a92a005c5d2ee434aaf12374e4229)"`|[客户端License查询Invo](#500a92a005c5d2ee434aaf12374e4229)|


<a name="c4c1175f9dd303e84c8999733d3c4847"></a>
### 分页请求对象«客户端日志文件查询Invo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[cac4628f14f70ec67bca3838f98f64c3](#cac4628f14f70ec67bca3838f98f64c3)"`|[客户端日志文件查询Invo](#cac4628f14f70ec67bca3838f98f64c3)|


<a name="7e60a40a483db759d2302fbb9652b7f9"></a>
### 分页请求对象«客户端日志查询Invo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[a39056a6c44db625722bb09cbb89d339](#a39056a6c44db625722bb09cbb89d339)"`|[客户端日志查询Invo](#a39056a6c44db625722bb09cbb89d339)|


<a name="d467a371d016be61502947579243c729"></a>
### 分页请求对象«手动任务查询列表入参InVo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[cb2b19e6e9d3bbd22996b3027ef4cde7](#cb2b19e6e9d3bbd22996b3027ef4cde7)"`|[手动任务查询列表入参InVo](#cb2b19e6e9d3bbd22996b3027ef4cde7)|


<a name="ea5172554ae759f132debe5dbf781cd1"></a>
### 分页请求对象«数据采集明细数据入参对象»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[81657f48b429c6c51d40a12f8e20b7a5](#81657f48b429c6c51d40a12f8e20b7a5)"`|[数据采集明细数据入参对象](#81657f48b429c6c51d40a12f8e20b7a5)|


<a name="fb0d029cd39883cdb3d7b59ffafb4e5f"></a>
### 分页请求对象«查询上传日志入参对象»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[0ac72ba8e0db24fbf3bb665d666bb7ea](#0ac72ba8e0db24fbf3bb665d666bb7ea)"`|[查询上传日志入参对象](#0ac72ba8e0db24fbf3bb665d666bb7ea)|


<a name="e460846c17b4df55c49dadf456c286e8"></a>
### 分页请求对象«查询用户列表请求VO»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[6af52430cc22965153274aff43be7601](#6af52430cc22965153274aff43be7601)"`|[查询用户列表请求VO](#6af52430cc22965153274aff43be7601)|


<a name="495e67434a4adcf3ee14f853c30e8f59"></a>
### 分页请求对象«查询菜单列表请求VO»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[fe4c6961b18e49e9e9ca77ba8864d6f2](#fe4c6961b18e49e9e9ca77ba8864d6f2)"`|[查询菜单列表请求VO](#fe4c6961b18e49e9e9ca77ba8864d6f2)|


<a name="98dbc77063334f4b16933782dd2d9500"></a>
### 分页请求对象«查询角色列表请求VO»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[fae404baba7358e40f420477f9dba1a6](#fae404baba7358e40f420477f9dba1a6)"`|[查询角色列表请求VO](#fae404baba7358e40f420477f9dba1a6)|


<a name="29e3115cfdc64cb798b93bffd7669703"></a>
### 分页请求对象«联网监管企业查询对象»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[10824987b5693d39931efc35f275bd42](#10824987b5693d39931efc35f275bd42)"`|[联网监管企业查询对象](#10824987b5693d39931efc35f275bd42)|


<a name="a235d68009c8a227f14063b552b0330b"></a>
### 分页请求对象«联网监管企业详情入参InVo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[fd95d7d177ebd75b8424d55754e65062](#fd95d7d177ebd75b8424d55754e65062)"`|[联网监管企业详情入参InVo](#fd95d7d177ebd75b8424d55754e65062)|


<a name="e8294a2a1b7a2e99d9069c9e4d4f2c8d"></a>
### 分页请求对象«自动任务查询列表入参InVo»
分页请求Invo


|名称|说明|类型|
|---|---|---|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**sortBy**  <br>*可选*|排序字段  <br>**样例** : `"string"`|string|
|**sortDirect**  <br>*可选*|排序规则  <br>**样例** : `"string"`|string|
|**template**  <br>*可选*|查询模板  <br>**样例** : `"[7374de146f3be2908df6e5ca92ca03b6](#7374de146f3be2908df6e5ca92ca03b6)"`|[自动任务查询列表入参InVo](#7374de146f3be2908df6e5ca92ca03b6)|


<a name="726102f0d3050b6ae6107e05c02e3b48"></a>
### 分页返回对象«任务执行情况出参outVo»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[b885bcc17ca34594dd68f6f5ab40fdbb](#b885bcc17ca34594dd68f6f5ab40fdbb)" ]`|< [任务执行情况出参outVo](#b885bcc17ca34594dd68f6f5ab40fdbb) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="0b82705c943c4a610987024440016776"></a>
### 分页返回对象«企业客户端信息出参对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[3f0e7ad1e6c4d77fcc1bbd411ae56b7a](#3f0e7ad1e6c4d77fcc1bbd411ae56b7a)" ]`|< [企业客户端信息出参对象](#3f0e7ad1e6c4d77fcc1bbd411ae56b7a) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="d840521adc1cfa895f1f940b8d3e7d28"></a>
### 分页返回对象«企业配置信息列表返回对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[9e779546fdb92c591be25507d04bb847](#9e779546fdb92c591be25507d04bb847)" ]`|< [企业配置信息列表返回对象](#9e779546fdb92c591be25507d04bb847) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="b7301ae486d70f594e869702037f24fb"></a>
### 分页返回对象«客户端License列表Vo»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[3da7f90d8f4c11e44283b434aeebe0d4](#3da7f90d8f4c11e44283b434aeebe0d4)" ]`|< [客户端License列表Vo](#3da7f90d8f4c11e44283b434aeebe0d4) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="93d9c8a4dca52c8293934446a191fbf4"></a>
### 分页返回对象«客户端日志文件Vo»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[17d4f384903b2eec0f784f0d292dbefe](#17d4f384903b2eec0f784f0d292dbefe)" ]`|< [客户端日志文件Vo](#17d4f384903b2eec0f784f0d292dbefe) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="878b014ec06052db2755eace2c3da9af"></a>
### 分页返回对象«客户端日志输出Vo»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[acd1e52e30e5db91b0b76c184f73ef99](#acd1e52e30e5db91b0b76c184f73ef99)" ]`|< [客户端日志输出Vo](#acd1e52e30e5db91b0b76c184f73ef99) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="099bb0051608e83ac01ef525fe99f5bd"></a>
### 分页返回对象«手动采集任务出参outVo»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[56cc4c01a39fa92e6aabdb02c03131f7](#56cc4c01a39fa92e6aabdb02c03131f7)" ]`|< [手动采集任务出参outVo](#56cc4c01a39fa92e6aabdb02c03131f7) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="05d3ae021df88f06b5e2dd9dc09f4361"></a>
### 分页返回对象«数据采集上报查询OutVO»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[f132ee7f781e5ab0321343aaee9fddad](#f132ee7f781e5ab0321343aaee9fddad)" ]`|< [数据采集上报查询OutVO](#f132ee7f781e5ab0321343aaee9fddad) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="e46e5a77e0f5af0531b753df09895f6b"></a>
### 分页返回对象«数据采集明细数据»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[d7e8bcda0af6d1a666b4aa44688ca2a7](#d7e8bcda0af6d1a666b4aa44688ca2a7)" ]`|< [数据采集明细数据](#d7e8bcda0af6d1a666b4aa44688ca2a7) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="744e4c0cdc130c8d0eaad0afcf077ea4"></a>
### 分页返回对象«查询上传日志出参参对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[10cdd176311b90bc17b14d4fbf156ed8](#10cdd176311b90bc17b14d4fbf156ed8)" ]`|< [查询上传日志出参参对象](#10cdd176311b90bc17b14d4fbf156ed8) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="ce12b6b5d952498187daeaa73b8eea3a"></a>
### 分页返回对象«系统用户查询返回对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[3470b7a8590efcd8fdba42f53571dfe6](#3470b7a8590efcd8fdba42f53571dfe6)" ]`|< [系统用户查询返回对象](#3470b7a8590efcd8fdba42f53571dfe6) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="a955f6bc8307615e9839401183967821"></a>
### 分页返回对象«联网监管企业列表对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[515d8ded6a733bc60d4728cea0aed21c](#515d8ded6a733bc60d4728cea0aed21c)" ]`|< [联网监管企业列表对象](#515d8ded6a733bc60d4728cea0aed21c) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="00a53182e64e6ab3abfdd714a8af12c0"></a>
### 分页返回对象«自动采集任务出参OutVo»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[ee5c9cd64477c5f2556b57cdceff851f](#ee5c9cd64477c5f2556b57cdceff851f)" ]`|< [自动采集任务出参OutVo](#ee5c9cd64477c5f2556b57cdceff851f) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="1c3f9ffc2f4aac4f7fcdfd4a674b1de1"></a>
### 分页返回对象«菜单查询返回对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[6cd94d2729bc010c3164bb902b1d9480](#6cd94d2729bc010c3164bb902b1d9480)" ]`|< [菜单查询返回对象](#6cd94d2729bc010c3164bb902b1d9480) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="56b558319e2552821154f3ac7989e24e"></a>
### 分页返回对象«角色查询返回对象»
分页返回outvo


|名称|说明|类型|
|---|---|---|
|**count**  <br>*可选*|总数  <br>**样例** : `0`|integer (int64)|
|**data**  <br>*可选*|数据列表  <br>**样例** : `[ "[1cc981a0fd51fb2f618e6056685afe10](#1cc981a0fd51fb2f618e6056685afe10)" ]`|< [角色查询返回对象](#1cc981a0fd51fb2f618e6056685afe10) > array|
|**pageNum**  <br>*可选*|页码  <br>**样例** : `0`|integer (int32)|
|**pageSize**  <br>*可选*|每页大小  <br>**样例** : `0`|integer (int32)|
|**pages**  <br>*可选*|总页数  <br>**样例** : `0`|integer (int32)|


<a name="3da7f90d8f4c11e44283b434aeebe0d4"></a>
### 客户端License列表Vo
客户端License列表Vo


|名称|说明|类型|
|---|---|---|
|**bindTime**  <br>*可选*|绑定时间  <br>**样例** : `"string"`|string|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**licenseCode**  <br>*可选*|注册码Code  <br>**样例** : `"string"`|string|
|**licenseFlag**  <br>*可选*|注册码状态  <br>**样例** : `"string"`|string|
|**licenseFlagTrans**  <br>*可选*|注册码状态转义  <br>**样例** : `"string"`|string|
|**macAddress**  <br>*可选*|MAC地址  <br>**样例** : `"string"`|string|


<a name="500a92a005c5d2ee434aaf12374e4229"></a>
### 客户端License查询Invo
客户端License查询Invo


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*必填*|企业Id  <br>**样例** : `"string"`|string|


<a name="13eb5030715aa48fd5e1a04225c86b6f"></a>
### 客户端licenseCode生成入参对象
客户端注册码生成Invo


|名称|说明|类型|
|---|---|---|
|**clientCropId**  <br>*可选*|客户端id  <br>**样例** : `0`|integer (int64)|
|**cropId**  <br>*必填*|企业id  <br>**样例** : `0`|integer (int64)|


<a name="0354bb79a82aca68990f35d833715fc3"></a>
### 客户端licenseCode生成出参对象
客户端licenseCode生成返回VO


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业Id  <br>**样例** : `0`|integer (int64)|
|**licenseCode**  <br>*可选*|生成的客户端注册码  <br>**样例** : `"string"`|string|
|**licenseSecret**  <br>*可选*|客户端加签密钥  <br>**样例** : `"string"`|string|


<a name="c803e62d0581287d29bb182c035588f2"></a>
### 客户端入参对象
企业登录Invo


|名称|说明|类型|
|---|---|---|
|**clientPhysicsSign**  <br>*可选*|客户端唯一物理标识  <br>**样例** : `"string"`|string|
|**cropIdNumber**  <br>*必填*|企业证件编号  <br>**样例** : `"string"`|string|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|
|**lastConnTime**  <br>*可选*|最后通讯时间  <br>**样例** : `"string"`|string|
|**lastIpAddress**  <br>*可选*|最后通讯IP地址  <br>**样例** : `"string"`|string|
|**licenseCode**  <br>*可选*|服务端注册码  <br>**样例** : `"string"`|string|
|**macAddress**  <br>*必填*|MAC地址  <br>**样例** : `"string"`|string|


<a name="6ed7806996b9b6dc773253967c78decc"></a>
### 客户端心跳完成通知接口入参InVo
客户端心跳完成通知接口入参InVo


|名称|说明|类型|
|---|---|---|
|**processDetailId**  <br>*可选*|任务执行明细ID  <br>**样例** : `0`|integer (int32)|
|**processId**  <br>*可选*|任务执行ID  <br>**样例** : `0`|integer (int32)|


<a name="c7180c05f0b99aedf94028db3384cd7e"></a>
### 客户端日志上报Invo
客户端日志上报Invo


|名称|说明|类型|
|---|---|---|
|**clientVersion**  <br>*可选*|企业客户端版本号  <br>**样例** : `"string"`|string|
|**cropClientId**  <br>*可选*|企业客户端Id  <br>**样例** : `0`|integer (int32)|
|**cropIdNumber**  <br>*可选*|企业证件编号  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|企业海关编码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**excepMessage**  <br>*可选*|异常信息  <br>**样例** : `"string"`|string|
|**macAddress**  <br>*可选*|MAC地址  <br>**样例** : `"string"`|string|
|**operateCode**  <br>*可选*|操作类型  <br>**样例** : `"string"`|string|
|**operateDesc**  <br>*可选*|操作说明  <br>**样例** : `"string"`|string|
|**operateScene**  <br>*可选*|场景说明  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|操作状态：0成功，1失败，2异常  <br>**样例** : `0`|integer (int32)|
|**statusDesc**  <br>*可选*|操作状态说明  <br>**样例** : `"string"`|string|


<a name="17d4f384903b2eec0f784f0d292dbefe"></a>
### 客户端日志文件Vo
客户端日志文件OutVo


|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**cropClientId**  <br>*可选*|客户端ID  <br>**样例** : `0`|integer (int32)|
|**cropId**  <br>*可选*|企业Id  <br>**样例** : `0`|integer (int64)|
|**cropIdNumber**  <br>*可选*|统一社会信用代码  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编码  <br>**样例** : `"string"`|string|
|**logDate**  <br>*可选*|日志文件日期  <br>**样例** : `"string"`|string|
|**logFileId**  <br>*可选*|客户端日志文件ID  <br>**样例** : `0`|integer (int32)|
|**logFileName**  <br>*可选*|日志文件名称  <br>**样例** : `"string"`|string|
|**macAddress**  <br>*可选*|MAC地址  <br>**样例** : `"string"`|string|


<a name="cac4628f14f70ec67bca3838f98f64c3"></a>
### 客户端日志文件查询Invo
客户端日志文件查询Invo


|名称|说明|类型|
|---|---|---|
|**cropIdNumber**  <br>*可选*|统一社会信用代码  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|企业海关编码  <br>**样例** : `"string"`|string|
|**endDate**  <br>*可选*|日志文件结束时间  <br>**样例** : `"string"`|string|
|**startDate**  <br>*可选*|日志文件开始时间  <br>**样例** : `"string"`|string|


<a name="a39056a6c44db625722bb09cbb89d339"></a>
### 客户端日志查询Invo
客户端日志查询Invo


|名称|说明|类型|
|---|---|---|
|**cropClientId**  <br>*必填*|客户端Id  <br>**样例** : `0`|integer (int32)|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|
|**endDate**  <br>*必填*|结束日期  <br>**样例** : `"string"`|string|
|**operateCode**  <br>*必填*|操作类型  <br>**样例** : `"string"`|string|
|**startDate**  <br>*必填*|开始日期  <br>**样例** : `"string"`|string|
|**status**  <br>*必填*|操作状态  <br>**样例** : `0`|integer (int32)|


<a name="acd1e52e30e5db91b0b76c184f73ef99"></a>
### 客户端日志输出Vo
客户端日志OutVo


|名称|说明|类型|
|---|---|---|
|**clientCpu**  <br>*必填*|CPU  <br>**样例** : `"string"`|string|
|**clientMem**  <br>*必填*|内存  <br>**样例** : `"string"`|string|
|**clientVersion**  <br>*必填*|客户端版本  <br>**样例** : `"string"`|string|
|**createTime**  <br>*必填*|操作时间  <br>**样例** : `"string"`|string|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*必填*|错误信息  <br>**样例** : `"string"`|string|
|**excepMessage**  <br>*必填*|异常信息  <br>**样例** : `"string"`|string|
|**logId**  <br>*必填*|日志ID  <br>**样例** : `0`|integer (int32)|
|**macAddress**  <br>*必填*|MAC地址  <br>**样例** : `"string"`|string|
|**operateCode**  <br>*必填*|操作类型  <br>**样例** : `"string"`|string|
|**operateDesc**  <br>*必填*|操作说明  <br>**样例** : `"string"`|string|
|**operateScene**  <br>*必填*|场景说明  <br>**样例** : `"string"`|string|
|**status**  <br>*必填*|操作状态  <br>**样例** : `0`|integer (int32)|
|**statusTrans**  <br>*必填*|操作状态转义  <br>**样例** : `"string"`|string|


<a name="e370c43efd79be0eed358868ebb55faf"></a>
### 客户端注册激活入参对象
客户端注册激活Invo


|名称|说明|类型|
|---|---|---|
|**clientCpu**  <br>*必填*|CPU  <br>**样例** : `"string"`|string|
|**clientMem**  <br>*必填*|内存  <br>**样例** : `"string"`|string|
|**clientOs**  <br>*必填*|操作系统  <br>**样例** : `"string"`|string|
|**cropIdNumber**  <br>*必填*|企业证件编号  <br>**样例** : `"string"`|string|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|
|**licenseCode**  <br>*必填*|注册码  <br>**样例** : `"string"`|string|
|**macAddress**  <br>*可选*|**样例** : `"string"`|string|


<a name="199d9a6a2ba0a13e711849037ea66c67"></a>
### 客户端注册激活出参对象
客户端注册激活出参Outvo


|名称|说明|类型|
|---|---|---|
|**cropClientId**  <br>*可选*|企业客户端ID  <br>**样例** : `0`|integer (int32)|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `0`|integer (int64)|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|


<a name="5582fa2d796eaedc8f19eac10159957c"></a>
### 客户端采集心跳出参OutVo
客户端采集心跳出参OutVo


|名称|说明|类型|
|---|---|---|
|**collectEndTime**  <br>*可选*|采集结束时间  <br>**样例** : `"string"`|string|
|**collectFlag**  <br>*可选*|是否可以采集，0：不能，1：可以  <br>**样例** : `"string"`|string|
|**collectRemarks**  <br>*可选*|采集备注  <br>**样例** : `"string"`|string|
|**collectStartTime**  <br>*可选*|采集开始时间  <br>**样例** : `"string"`|string|
|**cropFlag**  <br>*可选*|企业标识1为模拟采数0为正式采数  <br>**样例** : `"string"`|string|
|**isAll**  <br>*可选*|是否全量，0：否，1：是  <br>**样例** : `"string"`|string|
|**isCancle**  <br>*可选*|是否取消 0不取消  1取消  <br>**样例** : `"string"`|string|
|**processDetailId**  <br>*可选*|任务执行明细ID  <br>**样例** : `0`|integer (int32)|
|**processId**  <br>*可选*|任务执行ID  <br>**样例** : `0`|integer (int32)|
|**reportFlag**  <br>*可选*|是否可以上报，0：不能，1：可以  <br>**样例** : `"string"`|string|
|**reportRemarks**  <br>*可选*|上报的备注  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|采集标准表表名  <br>**样例** : `"string"`|string|
|**uploadFlag**  <br>*可选*|是否可以上传文件，0：不能，1：可以  <br>**样例** : `"string"`|string|
|**uploadLogFlag**  <br>*可选*|是否可以上传日志，0：不能，1：可以  <br>**样例** : `"string"`|string|


<a name="cb2b19e6e9d3bbd22996b3027ef4cde7"></a>
### 手动任务查询列表入参InVo
手动任务查询列表入参InVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束时间  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始时间  <br>**样例** : `"string"`|string (date-time)|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**isAll**  <br>*可选*|是否首次采集  1是 0否  <br>**样例** : `"string"`|string|


<a name="56cc4c01a39fa92e6aabdb02c03131f7"></a>
### 手动采集任务出参outVo
手动采集任务出参outVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期  <br>**样例** : `"string"`|string (date-time)|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|企业编号  <br>**样例** : `"string"`|string|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**executionTime**  <br>*可选*|执行时间  <br>**样例** : `"string"`|string (date-time)|
|**isAll**  <br>*可选*|是否全量 1是0否  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|执行状态 0：待执行，1：执行中，2：执行成功， 4：取消  <br>**样例** : `"string"`|string|
|**taskId**  <br>*可选*|任务编号  <br>**样例** : `0`|integer (int32)|
|**updateBy**  <br>*可选*|修改人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|修改日期  <br>**样例** : `"string"`|string (date-time)|
|**uuid**  <br>*可选*|uuid  <br>**样例** : `"string"`|string|


<a name="b134922c9e448b36d76995901dfd9af1"></a>
### 接口返回对象«List«int»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ 0 ]`|< integer (int32) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="7aa2e1db203d9f79bb4fc5373a193023"></a>
### 接口返回对象«List«string»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "string" ]`|< string > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="77a2081ed97c69d435b8e123e1193c8d"></a>
### 接口返回对象«List«任务执行明细出参outVo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[801b8a48d4eec273535363a88c4104a2](#801b8a48d4eec273535363a88c4104a2)" ]`|< [任务执行明细出参outVo](#801b8a48d4eec273535363a88c4104a2) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="8482a70cbbf0f8beff5253e30b584db7"></a>
### 接口返回对象«List«任务明细出参outVo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[025636c4f922573e79dd75c18fc29c8e](#025636c4f922573e79dd75c18fc29c8e)" ]`|< [任务明细出参outVo](#025636c4f922573e79dd75c18fc29c8e) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="4e2666cdf79d1e7c3b07a289aeec5f7a"></a>
### 接口返回对象«List«企业信息出参对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[b1afab0edef42bac2704cea304ce1653](#b1afab0edef42bac2704cea304ce1653)" ]`|< [企业信息出参对象](#b1afab0edef42bac2704cea304ce1653) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="ff9a402d1eae4d121b5ac0e2cd2ece52"></a>
### 接口返回对象«List«企业数据库配置解析返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[e9deef5aa3b700e940934032f1b76993](#e9deef5aa3b700e940934032f1b76993)" ]`|< [企业数据库配置解析返回对象](#e9deef5aa3b700e940934032f1b76993) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="1476982c7368460e2b9c78cf2440bbf4"></a>
### 接口返回对象«List«数据采集上报表明细数据»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[1ac4422e8bdb55ca5c13035ad6675ee3](#1ac4422e8bdb55ca5c13035ad6675ee3)" ]`|< [数据采集上报表明细数据](#1ac4422e8bdb55ca5c13035ad6675ee3) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="68e02ff6ff854025407d8ad2bfc5bd46"></a>
### 接口返回对象«List«权限菜单关联查询返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[840c8884b9a7d6ffb1a98a9db937c2d9](#840c8884b9a7d6ffb1a98a9db937c2d9)" ]`|< [权限菜单关联查询返回对象](#840c8884b9a7d6ffb1a98a9db937c2d9) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="c279b0b9c149a01f413fe53df6953646"></a>
### 接口返回对象«List«标准表列表数据»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[776db0c1f9bdc7598ce125003c46e81a](#776db0c1f9bdc7598ce125003c46e81a)" ]`|< [标准表列表数据](#776db0c1f9bdc7598ce125003c46e81a) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="90cafb11298ec1bab18bb5039aba7aee"></a>
### 接口返回对象«List«系统用户查询返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[3470b7a8590efcd8fdba42f53571dfe6](#3470b7a8590efcd8fdba42f53571dfe6)" ]`|< [系统用户查询返回对象](#3470b7a8590efcd8fdba42f53571dfe6) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="13e8ff9c3b33e88d09253011fda6e30f"></a>
### 接口返回对象«List«获取上传状态出参对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[f7e07b7d0c9f230fa22378b8863f397e](#f7e07b7d0c9f230fa22378b8863f397e)" ]`|< [获取上传状态出参对象](#f7e07b7d0c9f230fa22378b8863f397e) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="52cc9261915309f1013302462dbfaf2b"></a>
### 接口返回对象«List«菜单树形对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[e227932917a63f85408c8ae7af0cf5f9](#e227932917a63f85408c8ae7af0cf5f9)" ]`|< [菜单树形对象](#e227932917a63f85408c8ae7af0cf5f9) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="d2d66598edb6420cc9bdcaadc384579c"></a>
### 接口返回对象«List«角色查询返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `[ "[1cc981a0fd51fb2f618e6056685afe10](#1cc981a0fd51fb2f618e6056685afe10)" ]`|< [角色查询返回对象](#1cc981a0fd51fb2f618e6056685afe10) > array|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="05c093867d8781d4f40d5c999fdbd397"></a>
### 接口返回对象«boolean»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `true`|boolean|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="6b30e01cdc96c9cfda78c0865aca6f98"></a>
### 接口返回对象«string»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"string"`|string|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="c36bcefa2a9c80e70f08be92488f0245"></a>
### 接口返回对象«上报控制出参对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[63d003f9629b9ea4343d7bbc4e20a27c](#63d003f9629b9ea4343d7bbc4e20a27c)"`|[上报控制出参对象](#63d003f9629b9ea4343d7bbc4e20a27c)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="55534ffdb80ec54fcf653732bc47e2fd"></a>
### 接口返回对象«企业信息出参对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[b1afab0edef42bac2704cea304ce1653](#b1afab0edef42bac2704cea304ce1653)"`|[企业信息出参对象](#b1afab0edef42bac2704cea304ce1653)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="0731c0170129204753791e2ba95319b8"></a>
### 接口返回对象«企业数据库及脚本配置查询返回对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[d13451f411d574de843d70bb874cadc4](#d13451f411d574de843d70bb874cadc4)"`|[企业数据库及脚本配置查询返回对象](#d13451f411d574de843d70bb874cadc4)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="b31f795b0bd068dbd4d850166a37d124"></a>
### 接口返回对象«企业配置信息上传返回对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[0848bd1f80575427d0ae33d0fc437a8f](#0848bd1f80575427d0ae33d0fc437a8f)"`|[企业配置信息上传返回对象](#0848bd1f80575427d0ae33d0fc437a8f)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="0b3d998481ec0987b87ee7638a8bc76e"></a>
### 接口返回对象«企业配置信息列表返回对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[9e779546fdb92c591be25507d04bb847](#9e779546fdb92c591be25507d04bb847)"`|[企业配置信息列表返回对象](#9e779546fdb92c591be25507d04bb847)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="40ff7b01b413090ead6ddf7caa75a560"></a>
### 接口返回对象«分页返回对象«任务执行情况出参outVo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[726102f0d3050b6ae6107e05c02e3b48](#726102f0d3050b6ae6107e05c02e3b48)"`|[分页返回对象«任务执行情况出参outVo»](#726102f0d3050b6ae6107e05c02e3b48)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="6b2f21894561ecbdabe91b928955ef84"></a>
### 接口返回对象«分页返回对象«企业客户端信息出参对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[0b82705c943c4a610987024440016776](#0b82705c943c4a610987024440016776)"`|[分页返回对象«企业客户端信息出参对象»](#0b82705c943c4a610987024440016776)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="9f67cddd3965e02c84f972f6706ec009"></a>
### 接口返回对象«分页返回对象«企业配置信息列表返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[d840521adc1cfa895f1f940b8d3e7d28](#d840521adc1cfa895f1f940b8d3e7d28)"`|[分页返回对象«企业配置信息列表返回对象»](#d840521adc1cfa895f1f940b8d3e7d28)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="9565492d94523e91f6fa370b7fa7ba32"></a>
### 接口返回对象«分页返回对象«客户端License列表Vo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[b7301ae486d70f594e869702037f24fb](#b7301ae486d70f594e869702037f24fb)"`|[分页返回对象«客户端License列表Vo»](#b7301ae486d70f594e869702037f24fb)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="bdceb276fdb24aeb5b1f547b8b867016"></a>
### 接口返回对象«分页返回对象«客户端日志文件Vo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[93d9c8a4dca52c8293934446a191fbf4](#93d9c8a4dca52c8293934446a191fbf4)"`|[分页返回对象«客户端日志文件Vo»](#93d9c8a4dca52c8293934446a191fbf4)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="aac081eae45bd10bf834fe91c7b69d71"></a>
### 接口返回对象«分页返回对象«客户端日志输出Vo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[878b014ec06052db2755eace2c3da9af](#878b014ec06052db2755eace2c3da9af)"`|[分页返回对象«客户端日志输出Vo»](#878b014ec06052db2755eace2c3da9af)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="06962e91bc5c956caac30e455d8b6c83"></a>
### 接口返回对象«分页返回对象«手动采集任务出参outVo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[099bb0051608e83ac01ef525fe99f5bd](#099bb0051608e83ac01ef525fe99f5bd)"`|[分页返回对象«手动采集任务出参outVo»](#099bb0051608e83ac01ef525fe99f5bd)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="fc87752f8020e01e5fba9754d30b5c28"></a>
### 接口返回对象«分页返回对象«数据采集上报查询OutVO»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[05d3ae021df88f06b5e2dd9dc09f4361](#05d3ae021df88f06b5e2dd9dc09f4361)"`|[分页返回对象«数据采集上报查询OutVO»](#05d3ae021df88f06b5e2dd9dc09f4361)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="fa78436fd0b4e081fd1fc1a7303c770e"></a>
### 接口返回对象«分页返回对象«数据采集明细数据»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[e46e5a77e0f5af0531b753df09895f6b](#e46e5a77e0f5af0531b753df09895f6b)"`|[分页返回对象«数据采集明细数据»](#e46e5a77e0f5af0531b753df09895f6b)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="83ec80320d70ab10b1cca5d561916c0b"></a>
### 接口返回对象«分页返回对象«查询上传日志出参参对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[744e4c0cdc130c8d0eaad0afcf077ea4](#744e4c0cdc130c8d0eaad0afcf077ea4)"`|[分页返回对象«查询上传日志出参参对象»](#744e4c0cdc130c8d0eaad0afcf077ea4)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="a85316122e726a3ad1226e30faa7a6d8"></a>
### 接口返回对象«分页返回对象«系统用户查询返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[ce12b6b5d952498187daeaa73b8eea3a](#ce12b6b5d952498187daeaa73b8eea3a)"`|[分页返回对象«系统用户查询返回对象»](#ce12b6b5d952498187daeaa73b8eea3a)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="b82ba874769cf1a5208900a126d5a0c9"></a>
### 接口返回对象«分页返回对象«联网监管企业列表对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[a955f6bc8307615e9839401183967821](#a955f6bc8307615e9839401183967821)"`|[分页返回对象«联网监管企业列表对象»](#a955f6bc8307615e9839401183967821)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="8d26d3e4d77d1aa8154fdcbc5c9808dd"></a>
### 接口返回对象«分页返回对象«自动采集任务出参OutVo»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[00a53182e64e6ab3abfdd714a8af12c0](#00a53182e64e6ab3abfdd714a8af12c0)"`|[分页返回对象«自动采集任务出参OutVo»](#00a53182e64e6ab3abfdd714a8af12c0)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="146b6b6bc70c9c5d4a7632e75ab4c490"></a>
### 接口返回对象«分页返回对象«菜单查询返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[1c3f9ffc2f4aac4f7fcdfd4a674b1de1](#1c3f9ffc2f4aac4f7fcdfd4a674b1de1)"`|[分页返回对象«菜单查询返回对象»](#1c3f9ffc2f4aac4f7fcdfd4a674b1de1)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="2c7aaf0574d2b4b077702ea6280e8098"></a>
### 接口返回对象«分页返回对象«角色查询返回对象»»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[56b558319e2552821154f3ac7989e24e](#56b558319e2552821154f3ac7989e24e)"`|[分页返回对象«角色查询返回对象»](#56b558319e2552821154f3ac7989e24e)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="8c1cbf6e08dc4a1220bdeee963e71a9a"></a>
### 接口返回对象«客户端licenseCode生成出参对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[0354bb79a82aca68990f35d833715fc3](#0354bb79a82aca68990f35d833715fc3)"`|[客户端licenseCode生成出参对象](#0354bb79a82aca68990f35d833715fc3)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="c2ae91d93f723d737606962de0780b8f"></a>
### 接口返回对象«客户端日志输出Vo»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[acd1e52e30e5db91b0b76c184f73ef99](#acd1e52e30e5db91b0b76c184f73ef99)"`|[客户端日志输出Vo](#acd1e52e30e5db91b0b76c184f73ef99)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="5e19e58591bb2a525aa168e329d53fb4"></a>
### 接口返回对象«客户端注册激活出参对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[199d9a6a2ba0a13e711849037ea66c67](#199d9a6a2ba0a13e711849037ea66c67)"`|[客户端注册激活出参对象](#199d9a6a2ba0a13e711849037ea66c67)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="aa03742f7106cc322c34fcb079a4a38f"></a>
### 接口返回对象«客户端采集心跳出参OutVo»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[5582fa2d796eaedc8f19eac10159957c](#5582fa2d796eaedc8f19eac10159957c)"`|[客户端采集心跳出参OutVo](#5582fa2d796eaedc8f19eac10159957c)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="010734397be02de5f56822880c7a5a51"></a>
### 接口返回对象«数据采集上报查询OutVO»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[f132ee7f781e5ab0321343aaee9fddad](#f132ee7f781e5ab0321343aaee9fddad)"`|[数据采集上报查询OutVO](#f132ee7f781e5ab0321343aaee9fddad)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="f5975201b7af99306f0b37eddf668177"></a>
### 接口返回对象«文件传输出参对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[40a81f7a562f501c95b3deb2ab0c51c2](#40a81f7a562f501c95b3deb2ab0c51c2)"`|[文件传输出参对象](#40a81f7a562f501c95b3deb2ab0c51c2)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="4cb31be5f26c4ad3f5ecd9bb491c6d9c"></a>
### 接口返回对象«文件信息上传输出对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[a078b499cd26ded46bf2655bf8fa704b](#a078b499cd26ded46bf2655bf8fa704b)"`|[文件信息上传输出对象](#a078b499cd26ded46bf2655bf8fa704b)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="3a61abe8730c9e63bab74f8b5da15f48"></a>
### 接口返回对象«模拟采数测试报告出参OutVo»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[71735a20c1230b3204e43dd85dc4c744](#71735a20c1230b3204e43dd85dc4c744)"`|[模拟采数测试报告出参OutVo](#71735a20c1230b3204e43dd85dc4c744)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="89c6b7ce63e07e442dcb87ea951b51c2"></a>
### 接口返回对象«系统用户查询返回对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[3470b7a8590efcd8fdba42f53571dfe6](#3470b7a8590efcd8fdba42f53571dfe6)"`|[系统用户查询返回对象](#3470b7a8590efcd8fdba42f53571dfe6)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="875f6c16aa2be824630d3b3fc8bcf2d1"></a>
### 接口返回对象«菜单查询返回对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[6cd94d2729bc010c3164bb902b1d9480](#6cd94d2729bc010c3164bb902b1d9480)"`|[菜单查询返回对象](#6cd94d2729bc010c3164bb902b1d9480)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="13a3fc966b30941235d5b5e2a647f949"></a>
### 接口返回对象«角色查询返回对象»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[1cc981a0fd51fb2f618e6056685afe10](#1cc981a0fd51fb2f618e6056685afe10)"`|[角色查询返回对象](#1cc981a0fd51fb2f618e6056685afe10)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="252faf9e98243b657da90da237eb289b"></a>
### 接口返回对象«辅助对接平台模拟采数出参OutVo»
接口返回对象


|名称|说明|类型|
|---|---|---|
|**errorCode**  <br>*可选*|错误码  <br>**样例** : `"string"`|string|
|**errorMessage**  <br>*可选*|错误信息  <br>**样例** : `"string"`|string|
|**responseBody**  <br>*可选*|接口返回对象  <br>**样例** : `"[1c6c2e25e47ea228285d502816597a96](#1c6c2e25e47ea228285d502816597a96)"`|[辅助对接平台模拟采数出参OutVo](#1c6c2e25e47ea228285d502816597a96)|
|**responseCode**  <br>*可选*|返回码  <br>**样例** : `"string"`|string|
|**responseData**  <br>*可选*|返回时间  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|返回状态  <br>**样例** : `"string"`|string|


<a name="f132ee7f781e5ab0321343aaee9fddad"></a>
### 数据采集上报查询OutVO
数据采集上报查询OutVO


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编号  <br>**样例** : `"string"`|string|
|**dataEndTime**  <br>*可选*|业务数据结束日期  <br>**样例** : `"string"`|string|
|**dataSource**  <br>*可选*|数据来源  <br>**样例** : `"string"`|string|
|**dataStartTime**  <br>*可选*|业务数据开始日期  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|文件名称  <br>**样例** : `"string"`|string|
|**fileSize**  <br>*可选*|文件大小  <br>**样例** : `"string"`|string|
|**forwardStatus**  <br>*可选*|上传管理网状态  <br>**样例** : `"string"`|string|
|**forwardStatusTrans**  <br>*可选*|上传管理网状态中文转义  <br>**样例** : `"string"`|string|
|**uploadEnd**  <br>*可选*|最后上传时间  <br>**样例** : `"string"`|string|
|**uploadId**  <br>*可选*|批次号  <br>**样例** : `"string"`|string|
|**uploadStart**  <br>*可选*|上传时间  <br>**样例** : `"string"`|string|
|**uploadStatus**  <br>*可选*|上传电子口岸状态  <br>**样例** : `"string"`|string|
|**uploadStatusTrans**  <br>*可选*|上传电子口岸状态中文转义  <br>**样例** : `"string"`|string|


<a name="1ac4422e8bdb55ca5c13035ad6675ee3"></a>
### 数据采集上报表明细数据
数据采集上报表明细数据


|名称|说明|类型|
|---|---|---|
|**bizEnd**  <br>*可选*|数据结束日  <br>**样例** : `"string"`|string|
|**bizStart**  <br>*可选*|数据起始日  <br>**样例** : `"string"`|string|
|**chineseName**  <br>*可选*|数据表中文名  <br>**样例** : `"string"`|string|
|**countNum**  <br>*可选*|数据总条数  <br>**样例** : `0`|integer (int64)|
|**tableName**  <br>*可选*|数据表名  <br>**样例** : `"string"`|string|


<a name="d7e8bcda0af6d1a666b4aa44688ca2a7"></a>
### 数据采集明细数据
数据采集明细数据


|名称|说明|类型|
|---|---|---|
|**bizEnd**  <br>*可选*|数据结束日  <br>**样例** : `"string"`|string|
|**bizStart**  <br>*可选*|数据起始日  <br>**样例** : `"string"`|string|
|**chineseName**  <br>*可选*|数据表名（中文）  <br>**样例** : `"string"`|string|
|**countNum**  <br>*可选*|数据总条数  <br>**样例** : `0`|integer (int64)|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编号  <br>**样例** : `"string"`|string|
|**fileSize**  <br>*可选*|文件大小  <br>**样例** : `"string"`|string|
|**forwardStatus**  <br>*可选*|上传管理网状态  <br>**样例** : `"string"`|string|
|**forwardStatusTrans**  <br>*可选*|上传管理网状态中文转义  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|数据表名（英文）  <br>**样例** : `"string"`|string|
|**uploadStatus**  <br>*可选*|上传电子口岸状态  <br>**样例** : `"string"`|string|
|**uploadStatusTrans**  <br>*可选*|上传电子口岸状态中文转义  <br>**样例** : `"string"`|string|


<a name="81657f48b429c6c51d40a12f8e20b7a5"></a>
### 数据采集明细数据入参对象
数据采集明细数据入参Invo


|名称|说明|类型|
|---|---|---|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编号  <br>**样例** : `"string"`|string|
|**dataEndTime**  <br>*可选*|业务数据结束日期  <br>**样例** : `"string"`|string|
|**dataStartTime**  <br>*可选*|业务数据开始日期  <br>**样例** : `"string"`|string|
|**forwardStatus**  <br>*可选*|上传管理网状态  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|数据表名 (英文)  <br>**样例** : `"string"`|string|
|**uploadStatus**  <br>*可选*|上传电子口岸状态  <br>**样例** : `"string"`|string|


<a name="40a81f7a562f501c95b3deb2ab0c51c2"></a>
### 文件传输出参对象
文件传输出参对象


|名称|说明|类型|
|---|---|---|
|**uploadId**  <br>*可选*|上传批次号  <br>**样例** : `"string"`|string|
|**uploadResult**  <br>*可选*|上传结果,成功-1，失败-0  <br>**样例** : `"string"`|string|
|**zipId**  <br>*可选*|压缩文件编号  <br>**样例** : `"string"`|string|


<a name="a078b499cd26ded46bf2655bf8fa704b"></a>
### 文件信息上传输出对象
文件信息上传输出对象


|名称|说明|类型|
|---|---|---|
|**uploadId**  <br>*可选*|生成的批次号  <br>**样例** : `"string"`|string|
|**zipIds**  <br>*可选*|压缩编号  <br>**样例** : `[ "[ec171edd847026ed605d65393fdab658](#ec171edd847026ed605d65393fdab658)" ]`|< [Map«string,string»](#ec171edd847026ed605d65393fdab658) > array|


<a name="d2e944e758a61423d8fda7eb2ff5ee10"></a>
### 文件信息上报入参对象
文件信息上报对象


|名称|说明|类型|
|---|---|---|
|**clientCostTime**  <br>*可选*|客户端采集数据耗时  <br>**样例** : `"string"`|string|
|**clientCostTimeUnit**  <br>*可选*|客户端采集数据单位(1:分钟、2：小时)  <br>**样例** : `"string"`|string|
|**countNum**  <br>*可选*|数据总条数  <br>**样例** : `0`|integer (int32)|
|**cropId**  <br>*可选*|企业id  <br>**样例** : `0`|integer (int64)|
|**dataEndTime**  <br>*可选*|业务数据结束时间  <br>**样例** : `"string"`|string|
|**dataStartTime**  <br>*可选*|业务数据开始时间  <br>**样例** : `"string"`|string|
|**fileBizDate**  <br>*可选*|数据日期，取最后时间，方便服务器了解数据的时间  <br>**样例** : `"string"`|string|
|**fileFormat**  <br>*可选*|文件格式  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|文件名  <br>**样例** : `"string"`|string|
|**fileSign**  <br>*可选*|文件签名  <br>**样例** : `"string"`|string|
|**fileSize**  <br>*可选*|文件大小  <br>**样例** : `"string"`|string|
|**fileUploadLists**  <br>*可选*|文件明细信息  <br>**样例** : `[ "[eebb96282673c7b04838943d5ddaa36c](#eebb96282673c7b04838943d5ddaa36c)" ]`|< [上报文件明细入参对象](#eebb96282673c7b04838943d5ddaa36c) > array|
|**fileUploadZipLists**  <br>*可选*|压缩包明细  <br>**样例** : `[ "[2b2b5b0d5d400f331a218623690d4dd8](#2b2b5b0d5d400f331a218623690d4dd8)" ]`|< [上报压缩信息入参对象](#2b2b5b0d5d400f331a218623690d4dd8) > array|
|**processId**  <br>*可选*|任务执行ID  <br>**样例** : `0`|integer (int32)|


<a name="a8f681a361223bcebd2d22e168895c4b"></a>
### 文件信息对象
文件信息Invo


|名称|说明|类型|
|---|---|---|
|**fileSign**  <br>*可选*|映射到外网的文件签名  <br>**样例** : `"string"`|string|
|**forwardUploadId**  <br>*可选*|内网生成的批次号  <br>**样例** : `"string"`|string|
|**forwardZipIds**  <br>*可选*|内网压缩编号  <br>**样例** : `[ "[ec171edd847026ed605d65393fdab658](#ec171edd847026ed605d65393fdab658)" ]`|< [Map«string,string»](#ec171edd847026ed605d65393fdab658) > array|


<a name="840c8884b9a7d6ffb1a98a9db937c2d9"></a>
### 权限菜单关联查询返回对象
权限菜单关联查询返回Outvo


|名称|说明|类型|
|---|---|---|
|**resourceCode**  <br>*可选*|菜单编号  <br>**样例** : `"string"`|string|
|**roleCode**  <br>*可选*|角色编号  <br>**样例** : `"string"`|string|


<a name="31a5655f409af79cf908a0e3f8092e73"></a>
### 权限菜单添加实例
权限菜单添加Invo


|名称|说明|类型|
|---|---|---|
|**resourceCode**  <br>*可选*|菜单编号(一个角色可关联多个菜单)  <br>**样例** : `[ "string" ]`|< string > array|
|**roleCode**  <br>*可选*|权限编号  <br>**样例** : `"string"`|string|


<a name="0ac72ba8e0db24fbf3bb665d666bb7ea"></a>
### 查询上传日志入参对象
查询上传日志入参Invo


|名称|说明|类型|
|---|---|---|
|**bizEndBegin**  <br>*可选*|采集数据结束时间段起点  <br>**样例** : `"string"`|string|
|**bizEndEnd**  <br>*可选*|采集数据结束时间段终点  <br>**样例** : `"string"`|string|
|**bizStartBegin**  <br>*可选*|采集数据开始时间段起点  <br>**样例** : `"string"`|string|
|**bizStartEnd**  <br>*可选*|采集数据开始时间段终点  <br>**样例** : `"string"`|string|
|**cropId**  <br>*可选*|企业ID  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称，模糊查询  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编号  <br>**样例** : `"string"`|string|
|**dataEndTime**  <br>*可选*|业务数据结束日期  <br>**样例** : `"string"`|string|
|**dataStartTime**  <br>*可选*|业务数据开始日期  <br>**样例** : `"string"`|string|
|**forwardStatus**  <br>*可选*|上传管理网状态  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|大数据分析表名，模糊查询  <br>**样例** : `"string"`|string|
|**uploadId**  <br>*可选*|批次号  <br>**样例** : `"string"`|string|
|**uploadStatus**  <br>*可选*|上传电子口岸状态  <br>**样例** : `"string"`|string|


<a name="10cdd176311b90bc17b14d4fbf156ed8"></a>
### 查询上传日志出参参对象
查询上传日志出参Outvo


|名称|说明|类型|
|---|---|---|
|**bizEnd**  <br>*可选*|采集内容结束时间  <br>**样例** : `"string"`|string|
|**bizStart**  <br>*可选*|采集内容开始时间  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|信息上报时间  <br>**样例** : `"string"`|string|
|**cropId**  <br>*可选*|企业id  <br>**样例** : `0`|integer (int64)|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**fileName**  <br>*可选*|文件名  <br>**样例** : `"string"`|string|
|**fileSize**  <br>*可选*|文件大小  <br>**样例** : `"string"`|string|
|**fileStorePath**  <br>*可选*|文件路径  <br>**样例** : `"string"`|string|
|**lastUpload**  <br>*可选*|批次最近一次压缩文件上传时间  <br>**样例** : `"string"`|string|
|**listId**  <br>*可选*|文件唯一id  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|大数据分析表名  <br>**样例** : `"string"`|string|
|**tranUploadStatus**  <br>*可选*|上传状态字典翻译结果  <br>**样例** : `"string"`|string|
|**uploadId**  <br>*可选*|批次号  <br>**样例** : `"string"`|string|
|**uploadStatus**  <br>*可选*|上传状态  <br>**样例** : `"string"`|string|


<a name="6af52430cc22965153274aff43be7601"></a>
### 查询用户列表请求VO
查询用户列表请求入参


|名称|说明|类型|
|---|---|---|
|**customsUserCode**  <br>*可选*|海关内部编码，模糊查询  <br>**样例** : `"string"`|string|
|**userName**  <br>*可选*|用户名，模糊查询  <br>**样例** : `"string"`|string|
|**userType**  <br>*可选*|用户类型：1-电子口岸用户 2-管理网用户  <br>**样例** : `0`|integer (int32)|


<a name="fe4c6961b18e49e9e9ca77ba8864d6f2"></a>
### 查询菜单列表请求VO
查询菜单列表请求入参


|名称|说明|类型|
|---|---|---|
|**resourceName**  <br>*可选*|资源名称,模糊查询  <br>**样例** : `"string"`|string|
|**resourceType**  <br>*可选*|资源类型 1-目录 2-菜单 3-按钮  <br>**样例** : `0`|integer (int32)|


<a name="fae404baba7358e40f420477f9dba1a6"></a>
### 查询角色列表请求VO
查询角色列表请求入参


|名称|说明|类型|
|---|---|---|
|**roleName**  <br>*可选*|角色名称，模糊查询  <br>**样例** : `"string"`|string|
|**roleStatus**  <br>*可选*|角色状态：1-有效 2-停用  <br>**样例** : `0`|integer (int32)|


<a name="776db0c1f9bdc7598ce125003c46e81a"></a>
### 标准表列表数据
标准表列表数据


|名称|说明|类型|
|---|---|---|
|**chineseName**  <br>*可选*|数据表名（中文）  <br>**样例** : `"string"`|string|
|**tableName**  <br>*可选*|数据表名（英文）  <br>**样例** : `"string"`|string|


<a name="d80641300c43a4737687c0a7a56aa7cb"></a>
### 模拟采数测试报告入参InVo
模拟采数测试报告入参InVo


|名称|说明|类型|
|---|---|---|
|**customsCode**  <br>*可选*|企业编码  <br>**样例** : `"string"`|string|
|**taskId**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|


<a name="71735a20c1230b3204e43dd85dc4c744"></a>
### 模拟采数测试报告出参OutVo
模拟采数测试报告出参OutVo


|名称|说明|类型|
|---|---|---|
|**detail**  <br>*可选*|detail  <br>**样例** : `[ "[edcipcollectdetail](#edcipcollectdetail)" ]`|< [EdcipCollectDetail](#edcipcollectdetail) > array|
|**result**  <br>*可选*|result  <br>**样例** : `"[edcipcollectresult](#edcipcollectresult)"`|[EdcipCollectResult](#edcipcollectresult)|


<a name="eb112aa3f6d6667069476b13a45f908b"></a>
### 用户更新对象
用户更新invo


|名称|说明|类型|
|---|---|---|
|**customsUserCode**  <br>*可选*|海关内部用户编码  <br>**样例** : `"string"`|string|
|**imgFile**  <br>*可选*|用户头像图片  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|用户姓名  <br>**样例** : `"string"`|string|
|**phone**  <br>*可选*|用户联系电话  <br>**样例** : `"string"`|string|
|**sessionId**  <br>*可选*|会话ID(后端服务获取，前端无须传值)  <br>**样例** : `"string"`|string|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|
|**userId**  <br>*可选*|用户ID  <br>**样例** : `"string"`|string|
|**userName**  <br>*可选*|系统用户名  <br>**样例** : `"string"`|string|
|**userPassword**  <br>*可选*|系统用户密码  <br>**样例** : `"string"`|string|
|**userType**  <br>*可选*|用户类型：1-电子口岸用户 2-管理网用户  <br>**样例** : `0`|integer (int32)|


<a name="02337d8641eb8e62ec1aaa5b9a5d447c"></a>
### 用户状态更新实例
用户状态更新添加Invo


|名称|说明|类型|
|---|---|---|
|**userId**  <br>*可选*|用户ID  <br>**样例** : `"string"`|string|
|**userStatus**  <br>*可选*|用户状态：1 启用，2 停用  <br>**样例** : `0`|integer (int32)|


<a name="75405ae17c7f4f8c22e6cb47979b4d00"></a>
### 用户登录对象
用户登录invo


|名称|说明|类型|
|---|---|---|
|**codeId**  <br>*可选*|登录验证码codeId  <br>**样例** : `"string"`|string|
|**lastLoginIp**  <br>*可选*|最后登陆IP地址  <br>**样例** : `"string"`|string|
|**lastLoginMac**  <br>*可选*|最后登陆MAC地址  <br>**样例** : `"string"`|string|
|**lastLoginType**  <br>*可选*|最后登陆类型 1-账密 2-单点登陆  <br>**样例** : `0`|integer (int32)|
|**userName**  <br>*可选*|系统用户名  <br>**样例** : `"string"`|string|
|**userPassword**  <br>*可选*|系统用户密码  <br>**样例** : `"string"`|string|
|**verifyCode**  <br>*可选*|登录验证码  <br>**样例** : `"string"`|string|


<a name="31772e73cb1108271fb22ba90d0cacd5"></a>
### 用户角色关联对象
用户角色关联Invo


|名称|说明|类型|
|---|---|---|
|**roleCodes**  <br>*可选*|角色数组(一个用户可以关联多个角色)  <br>**样例** : `[ "string" ]`|< string > array|
|**userId**  <br>*可选*|用户ID  <br>**样例** : `"string"`|string|


<a name="3470b7a8590efcd8fdba42f53571dfe6"></a>
### 系统用户查询返回对象
系统用户查询返回Outvo


|名称|说明|类型|
|---|---|---|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**customsUserCode**  <br>*可选*|海关内部用户编码  <br>**样例** : `"string"`|string|
|**headThumbFile**  <br>*可选*|头像缩略图文件  <br>**样例** : `"string"`|string|
|**lastLoginIp**  <br>*可选*|最后登陆IP地址  <br>**样例** : `"string"`|string|
|**lastLoginMac**  <br>*可选*|最后登陆MAC地址  <br>**样例** : `"string"`|string|
|**lastLoginTime**  <br>*可选*|最后登陆时间  <br>**样例** : `"string"`|string|
|**lastLoginType**  <br>*可选*|最后登陆类型 1-账密 2-单点登陆  <br>**样例** : `0`|integer (int32)|
|**lastLoginTypeTrans**  <br>*可选*|最后登陆类型中文转义  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**phone**  <br>*可选*|**样例** : `"string"`|string|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string|
|**userId**  <br>*可选*|用户ID(ID无须展示在列表编辑删除用到)  <br>**样例** : `"string"`|string|
|**userName**  <br>*可选*|系统用户名  <br>**样例** : `"string"`|string|
|**userStatus**  <br>*可选*|用户状态：1-有效 2-停用  0-删除  <br>**样例** : `0`|integer (int32)|
|**userStatusTrans**  <br>*可选*|用户状态中文转义  <br>**样例** : `"string"`|string|
|**userType**  <br>*可选*|用户类型：1-监控平台用户 2-对接平台企业用户 3-对接平台实施方用户 4-对接平台电子口岸用户（对接平台电子口岸管理员用户edcipadmin）  <br>**样例** : `0`|integer (int32)|
|**userTypeTrans**  <br>*可选*|用户类型中文转义  <br>**样例** : `"string"`|string|


<a name="d6869edea1c6ffb68217f37edcd502c5"></a>
### 系统用户添加对象
系统用户添加Invo


|名称|说明|类型|
|---|---|---|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**customsUserCode**  <br>*可选*|海关内部用户编码  <br>**样例** : `"string"`|string|
|**department**  <br>*可选*|所属部门  <br>**样例** : `"string"`|string|
|**imgFile**  <br>*可选*|用户头像图片  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|用户姓名  <br>**样例** : `"string"`|string|
|**phone**  <br>*可选*|联系电话  <br>**样例** : `"string"`|string|
|**sessionId**  <br>*可选*|会话ID(后端服务获取，前端无须传值)  <br>**样例** : `"string"`|string|
|**userName**  <br>*可选*|系统用户名  <br>**样例** : `"string"`|string|
|**userPassword**  <br>*可选*|系统用户密码  <br>**样例** : `"string"`|string|
|**userType**  <br>*可选*|用户类型：1-电子口岸用户 2-管理网用户  <br>**样例** : `0`|integer (int32)|


<a name="515d8ded6a733bc60d4728cea0aed21c"></a>
### 联网监管企业列表对象
联网监管企业列表VO


|名称|说明|类型|
|---|---|---|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**cropId**  <br>*可选*|企业Id  <br>**样例** : `0`|integer (int64)|
|**cropIdNumber**  <br>*可选*|统一社会信用代码  <br>**样例** : `"string"`|string|
|**cropName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*可选*|海关编码  <br>**样例** : `"string"`|string|


<a name="10824987b5693d39931efc35f275bd42"></a>
### 联网监管企业查询对象
联网监管企业查询Invo


|名称|说明|类型|
|---|---|---|
|**cropIdNumber**  <br>*必填*|统一社会信用代码  <br>**样例** : `"string"`|string|
|**cropName**  <br>*必填*|企业名称  <br>**样例** : `"string"`|string|
|**customsCode**  <br>*必填*|企业海关编码  <br>**样例** : `"string"`|string|


<a name="fd95d7d177ebd75b8424d55754e65062"></a>
### 联网监管企业详情入参InVo
联网监管企业详情入参InVo


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*必填*|企业id  <br>**样例** : `0`|integer (int64)|


<a name="7374de146f3be2908df6e5ca92ca03b6"></a>
### 自动任务查询列表入参InVo
自动任务查询列表入参InVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束时间  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始时间  <br>**样例** : `"string"`|string (date-time)|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|


<a name="ee5c9cd64477c5f2556b57cdceff851f"></a>
### 自动采集任务出参OutVo
自动采集任务出参OutVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期  <br>**样例** : `"string"`|string (date-time)|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建日期  <br>**样例** : `"string"`|string (date-time)|
|**customsCode**  <br>*可选*|企业编号  <br>**样例** : `"string"`|string|
|**cycleTime**  <br>*可选*|周期时间    时:分  HH:mm  <br>**样例** : `"string"`|string|
|**cycleType**  <br>*可选*|执行周期 '1':按天执行；'3'：按月执行。  <br>**样例** : `"string"`|string|
|**cycleValue**  <br>*可选*|周期值  <br>**样例** : `"string"`|string|
|**enterpName**  <br>*可选*|企业名称  <br>**样例** : `"string"`|string|
|**executionTime**  <br>*可选*|执行时间  <br>**样例** : `"string"`|string (date-time)|
|**isAll**  <br>*可选*|是否全量 1是0否  <br>**样例** : `"string"`|string|
|**status**  <br>*可选*|执行状态 0：待执行，1：执行中，2：已完成，4：已取消  <br>**样例** : `"string"`|string|
|**taskId**  <br>*可选*|任务编号  <br>**样例** : `0`|integer (int32)|
|**updateBy**  <br>*可选*|修改人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|修改日期  <br>**样例** : `"string"`|string (date-time)|
|**uuid**  <br>*可选*|uuid  <br>**样例** : `"string"`|string|


<a name="fafd8c0ed5907ba84c2c0e14873d21b1"></a>
### 获取上传状态入参对象
获取上传状态入参对象


|名称|说明|类型|
|---|---|---|
|**cropId**  <br>*可选*|企业id  <br>**样例** : `0`|integer (int64)|
|**uploadStatus**  <br>*可选*|上传状态(0未上传，1上传中，2上传失败，3上传成功)  <br>**样例** : `"string"`|string|


<a name="f7e07b7d0c9f230fa22378b8863f397e"></a>
### 获取上传状态出参对象
获取上传状态出参对象


|名称|说明|类型|
|---|---|---|
|**fileName**  <br>*可选*|文件名  <br>**样例** : `"string"`|string|
|**uploadId**  <br>*可选*|上传id  <br>**样例** : `"string"`|string|
|**uploadStatus**  <br>*可选*|上传状态,0:未上传，1:上传中，2:上传失败，3:上传成功  <br>**样例** : `"string"`|string|
|**zipId**  <br>*可选*|压缩id  <br>**样例** : `"string"`|string|


<a name="a2d3fca7bb746f8efbdea89e8bf69346"></a>
### 菜单列表请求VO
菜单列表请求入参


|名称|说明|类型|
|---|---|---|
|**queryType**  <br>*可选*|**样例** : `"string"`|string|
|**resourceModule**  <br>*可选*|**样例** : `"string"`|string|


<a name="6cd94d2729bc010c3164bb902b1d9480"></a>
### 菜单查询返回对象
菜单查询返回Outvo


|名称|说明|类型|
|---|---|---|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**isRole**  <br>*可选*|是否关联角色  <br>**样例** : `"string"`|string|
|**parentCode**  <br>*可选*|父节点编号  <br>**样例** : `"string"`|string|
|**resourceCode**  <br>*可选*|菜单编号(主键)  <br>**样例** : `"string"`|string|
|**resourceImgFile**  <br>*可选*|菜单缩略图(外键)  <br>**样例** : `"string"`|string|
|**resourceName**  <br>*可选*|菜单名称  <br>**样例** : `"string"`|string|
|**resourceStatus**  <br>*可选*|菜单状态:1-有效 2-停用 0-删除  <br>**样例** : `0`|integer (int32)|
|**resourceStatusTrans**  <br>*可选*|菜单状态中文转义 （有效 、用、删除）  <br>**样例** : `"string"`|string|
|**resourceType**  <br>*可选*|菜单类型 1-目录 2-菜单 3-按钮  <br>**样例** : `0`|integer (int32)|
|**resourceTypeTrans**  <br>*可选*|菜单类型中文转义 （目录、菜单、按钮）  <br>**样例** : `"string"`|string|
|**resourceValue**  <br>*可选*|菜单URL  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string|


<a name="e227932917a63f85408c8ae7af0cf5f9"></a>
### 菜单树形对象
菜单树形对象Outvo


|名称|说明|类型|
|---|---|---|
|**childMenusList**  <br>*可选*|子菜单List  <br>**样例** : `[ "[e227932917a63f85408c8ae7af0cf5f9](#e227932917a63f85408c8ae7af0cf5f9)" ]`|< [菜单树形对象](#e227932917a63f85408c8ae7af0cf5f9) > array|
|**parentCode**  <br>*可选*|菜单父节点编号  <br>**样例** : `"string"`|string|
|**resourceCode**  <br>*可选*|菜单主键  <br>**样例** : `"string"`|string|
|**resourceImgFile**  <br>*可选*|菜单缩略图  <br>**样例** : `"string"`|string|
|**resourceName**  <br>*可选*|菜单名称  <br>**样例** : `"string"`|string|
|**resourceType**  <br>*可选*|菜单类型 1-目录 2-菜单 3-按钮  <br>**样例** : `0`|integer (int32)|
|**resourceTypeTrans**  <br>*可选*|菜单类型中文转义 （目录、菜单、按钮）  <br>**样例** : `"string"`|string|
|**resourceValue**  <br>*可选*|菜单url  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|


<a name="1842b356528f24513766bb02ca222df0"></a>
### 菜单添加实例
菜单添加Invo


|名称|说明|类型|
|---|---|---|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**parentCode**  <br>*可选*|父节点编号  <br>**样例** : `"string"`|string|
|**resourceImgFile**  <br>*可选*|菜单缩略图片  <br>**样例** : `"string"`|string|
|**resourceName**  <br>*可选*|菜单名称  <br>**样例** : `"string"`|string|
|**resourceType**  <br>*可选*|菜单类型 1-目录 2-菜单 3-按钮  <br>**样例** : `0`|integer (int32)|
|**resourceValue**  <br>*可选*|菜单URL  <br>**样例** : `"string"`|string|
|**sort**  <br>*可选*|排序  <br>**样例** : `0`|integer (int32)|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|


<a name="1cc981a0fd51fb2f618e6056685afe10"></a>
### 角色查询返回对象
角色查询返回Outvo


|名称|说明|类型|
|---|---|---|
|**createBy**  <br>*可选*|创建人  <br>**样例** : `"string"`|string|
|**createTime**  <br>*可选*|创建时间  <br>**样例** : `"string"`|string|
|**isUser**  <br>*可选*|是否关联用户  <br>**样例** : `"string"`|string|
|**roleCode**  <br>*可选*|角色ID  <br>**样例** : `"string"`|string|
|**roleName**  <br>*可选*|角色名称  <br>**样例** : `"string"`|string|
|**roleStatus**  <br>*可选*|角色状态：1-有效 2-停用 0-删除  <br>**样例** : `0`|integer (int32)|
|**roleStatusTrans**  <br>*可选*|角色状态中文转义  <br>**样例** : `"string"`|string|
|**updateBy**  <br>*可选*|更新人  <br>**样例** : `"string"`|string|
|**updateTime**  <br>*可选*|更新时间  <br>**样例** : `"string"`|string|


<a name="5ffa6475ab16c959218a84df0ebf5dc5"></a>
### 角色添加实例
角色添加Invo


|名称|说明|类型|
|---|---|---|
|**roleName**  <br>*可选*|角色名称  <br>**样例** : `"string"`|string|


<a name="08902ef32661347df9cb2d17162ad314"></a>
### 角色状态更新实例
角色状态更新Invo


|名称|说明|类型|
|---|---|---|
|**roleCode**  <br>*可选*|角色Id  <br>**样例** : `"string"`|string|
|**roleStatus**  <br>*可选*|角色状态：1 启用，2 停用  <br>**样例** : `0`|integer (int32)|


<a name="872d3254bf59e1ac7d689b879e01e163"></a>
### 辅助对接平台模拟采数入参InVo
辅助对接平台模拟采数入参InVo


|名称|说明|类型|
|---|---|---|
|**collectEndDate**  <br>*可选*|采集结束日期 yyyy/MM/dd  <br>**样例** : `"string"`|string (date-time)|
|**collectStartDate**  <br>*可选*|采集开始日期 yyyy/MM/dd  <br>**样例** : `"string"`|string (date-time)|
|**cropId**  <br>*可选*|企业Id  <br>**样例** : `0`|integer (int64)|


<a name="1c6c2e25e47ea228285d502816597a96"></a>
### 辅助对接平台模拟采数出参OutVo
辅助对接平台模拟采数出参OutVo


|名称|说明|类型|
|---|---|---|
|**taskId**  <br>*可选*|任务ID  <br>**样例** : `0`|integer (int32)|


<a name="82a07fee2a2a536f5e71d1764c43851d"></a>
### 验证码请求VO
验证码请求入参


|名称|说明|类型|
|---|---|---|
|**codeid**  <br>*可选*|codeid  <br>**样例** : `"string"`|string|





