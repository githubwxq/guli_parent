package com.guli.teacher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.teacher.entity.EduSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface EduSubjectService extends IService<EduSubject> {


    /**
     * 根据传递的EXCL表格模板导入课程分类
     * @param file
     * @return 错误集合信息
     */
    List<String> importEXCL(MultipartFile file);

}
