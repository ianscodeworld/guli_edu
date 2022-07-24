package com.example.service.EduService.controller;


import com.example.service.EduService.entity.EduTeacher;
import com.example.service.EduService.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-07-24
 */
@RestController
@RequestMapping("/EduService/teacher")
@Api(value = "讲师管理")
public class EduTeacherController {
    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping("/findAll")
    @ApiOperation(value = "所有讲师列表")
    public List<EduTeacher> findAllTeacher(){
        List<EduTeacher> teachList = eduTeacherService.list(null);
        return teachList;
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除讲师")

    public boolean removeTeacher(@ApiParam( name = "id", value ="讲师ID", required = true)
                                     @PathVariable String id){
        boolean result = eduTeacherService.removeById(id);
        return result;
    }
}

