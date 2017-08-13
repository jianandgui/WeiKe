package cn.edu.swpu.cins.weike.service;

import cn.edu.swpu.cins.weike.entity.persistence.ProjectInfo;
import cn.edu.swpu.cins.weike.entity.persistence.StudentDetail;
import cn.edu.swpu.cins.weike.entity.persistence.TeacherDetail;
import cn.edu.swpu.cins.weike.entity.view.ProjectRecommend;
import cn.edu.swpu.cins.weike.entity.view.TeacherPersonData;
import cn.edu.swpu.cins.weike.exception.TeacherException;

import java.util.List;

/**
 * Created by muyi on 17-4-6.
 */
public interface TeacherService {


    int teacherAddPersonal(TeacherDetail teacherDetail) throws TeacherException;

    int issueProject(ProjectInfo projectInfo) throws TeacherException;

    List<ProjectRecommend> queryStudentForReCommod(List<String> skills,String username) throws TeacherException;

    int updateInfo(TeacherDetail teacherDetail, String username) throws TeacherException;

    List<String> queryAllProject(String projectConnector) throws TeacherException;

    TeacherPersonData queryForData(String username) throws TeacherException;


}
