package com.chinaunicom.gz.web;

import com.chinaunicom.gz.domain.User;
import com.chinaunicom.gz.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

/**
 * @author : xuwenyuan
 * @date : 2019-07-28
 */
@Controller
@Api(value ="用户操作类",description = "UserController", tags="用户参数接口")
@ApiResponses(value = {@ApiResponse(code = 200, message = "请求已完成"),
        @ApiResponse(code = 201, message = "资源成功被创建"),
        @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
        @ApiResponse(code = 401, message = "未授权客户机访问数据"),
        @ApiResponse(code = 403, message = "服务器接受请求，但是拒绝处理"),
        @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
        @ApiResponse(code = 500, message = "服务器出现异常")})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "根据id查用户信息",notes = "返回单个用户详细信息",tags="用户参数接口")
    @ResponseBody
    public User getUserById(@ApiParam(value = "用户编号",defaultValue ="0")@PathVariable("id") Integer id)
    {
        return userService.getUserById(id);
    }

}
