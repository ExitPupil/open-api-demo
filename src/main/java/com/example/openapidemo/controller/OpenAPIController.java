package com.example.openapidemo.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "OpenAPI Demo", version = "v1", description = "OpenAPI Demo description"))
@Description("OpenAPI Demo - Description")
public class OpenAPIController {

  @Operation(summary = "获取笔记列表", description = "获取笔记列表", method = "GET", operationId = "getNoteList")
  @Parameters({
          @Parameter(name = "page", description = "页码", required = false, example = "1"),
          @Parameter(name = "size", description = "每页记录数", required = false, example = "10"),
          @Parameter(name = "sort", description = "排序字段", required = false, example = "id"),
          @Parameter(name = "order", description = "排序方式", required = false, example = "asc")
  })
  @GetMapping("/note/list")
  public @ResponseBody ResponseResult getNoteList(
          @RequestParam(value = "page", required = false, defaultValue = "1") int page,
          @RequestParam(value = "size", required = false, defaultValue = "10") int size,
          @RequestParam(value = "sort", required = false, defaultValue = "id") String sort,
          @RequestParam(value = "order", required = false, defaultValue = "asc") String order
  ) {
    ResponseResult result = new ResponseResult();
    result.setIsok(true);
    result.setCode(200);
    result.setMessage("请求成功");
    result.setData("请求结果数据: " + order);
    return result;
  }
}
