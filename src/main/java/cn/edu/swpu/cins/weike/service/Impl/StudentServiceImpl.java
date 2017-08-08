package cn.edu.swpu.cins.weike.service.Impl;

import cn.edu.swpu.cins.weike.entity.persistence.StudentDetail;
import cn.edu.swpu.cins.weike.entity.view.PersonData;
import cn.edu.swpu.cins.weike.entity.view.ProjectRecommend;
import cn.edu.swpu.cins.weike.exception.StudentException;
import cn.edu.swpu.cins.weike.util.SensitiveWordsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import cn.edu.swpu.cins.weike.dao.ProjectDao;
import cn.edu.swpu.cins.weike.dao.StudentDao;
import cn.edu.swpu.cins.weike.entity.persistence.ProjectInfo;
import cn.edu.swpu.cins.weike.service.StudentService;
import cn.edu.swpu.cins.weike.util.ReduceRepeate;

import java.util.List;

/**
 * Created by muyi on 17-4-7.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;
    private ProjectDao projectDao;
    @Value("${event.service.pageCount}")
    private int pageCount;
    private ReduceRepeate reduceRepeate;

    @Autowired
    private SensitiveWordsFilter sensitiveWordsFilter;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao, ProjectDao projectDao, ReduceRepeate reduceRepeate) {
        this.studentDao = studentDao;
        this.projectDao = projectDao;
        this.reduceRepeate = reduceRepeate;
    }

    //学生发布项目
    @Override
    public int issueProject(ProjectInfo projectInfo) throws StudentException {
        try {
            projectInfo.setProjectName(sensitiveWordsFilter.Filter(projectInfo.getProjectName()));
            return projectDao.addProject(projectInfo);
        } catch (Exception e) {
            throw new StudentException("数据库学生添加异常");
        }
    }

    @Override
    public int addPersonal(StudentDetail studentDetail) throws StudentException {
        try {
            int rate = studentDetail.getSkills().toArray().length;
            if (rate == 2 || rate == 0) {
                studentDetail.setLevel("D");
            }
            if (rate == 3) {
                studentDetail.setLevel("C");
            }
            if (rate == 4) {
                studentDetail.setLevel("B");
            }
            if (rate > 5) {
                studentDetail.setLevel("A");
            }
            return studentDao.studentAddPersonal(studentDetail);
        } catch (Exception e) {
            throw new StudentException("数据库学生添加个人信息异常");
        }
    }

    //重新抽离出一个方法
    @Override
    public List<ProjectRecommend> queryForReCommod(List<String> skills,String username) throws StudentException {
        try {
            return reduceRepeate.reduceStudentRepeat(skills,username);
        } catch (Exception e) {
            throw new StudentException("数据库学生发布项目推荐人选异常");
        }
    }

    @Override
    public int updateInfo(StudentDetail studentDetail, String username) throws StudentException {
        try {
            studentDetail.setUsername(username);
            return studentDao.updateInfo(studentDetail) > 0 ? 1 : 0;
        } catch (Exception e) {
            throw new StudentException("服务器异常！");
        }


    }

    @Override
    public List<String> queryAllProject(String projectConnector) throws StudentException {
        try {
            return studentDao.queryAllProject(projectConnector);
        } catch (Exception e) {
            throw new StudentException("服务器异常");
        }

    }

    @Override
    public PersonData queryForData(String username) throws StudentException{
    try{
        PersonData personData=studentDao.queryPerson(username);
        personData.setEmail(studentDao.selectStudent(username).getEmail());
        return personData;
    }catch (Exception e){
        throw new StudentException("服务器异常");
}

    }
}
