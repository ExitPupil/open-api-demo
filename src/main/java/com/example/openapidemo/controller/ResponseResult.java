package com.example.openapidemo.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "通用响应数据结构类")
public class ResponseResult {
  @Schema(title="请求是否处理成功", description = "true:请求处理成功，false:请求处理失败", example="true、false")
  private boolean isok;  //请求是否处理成功
  @Schema(title="请求响应状态码", example="200、400、500", description = "200:请求处理成功，400:请求参数错误，500:服务器内部错误")
  private int code; //请求响应状态码（200、400、500）
  @Schema(title="请求结果描述信息")
  private String message;  //请求结果描述信息
  @Schema(title="请求结果数据")
  private Object data; //请求结果数据（通常用于查询操作）

}
