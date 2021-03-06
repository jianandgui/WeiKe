package cn.edu.swpu.cins.weike.entity.view;

import lombok.Data;

import java.util.List;

/**
 * Created by muyi on 17-7-16.
 */
@Data
public class PersonData {

    private int id;
    private String username;
    private String image;
    private String sex;
    //学生学历
    private String eduBackgroud;
    //学生所在大学
    private String university;
    //学生专业年级
    private String majorAndGrade;
    //入学时间
    private long entryUniversity;
    //毕业时间
    private long leaveUniversity;
    private long qq;
    //拥有技能
    private List<String> skills;
    //项目经验
    private String experience;
    //自我评价
    private String selfFeel;
    //学生等级
    private String level;
    private String email;
    private String role;

    public PersonData(int id, String username, String image, String sex, String eduBackgroud, String university, String majorAndGrade, long entryUniversity, long leaveUniversity, long qq, List<String> skills, String experience, String selfFeel, String level, String email, String role) {
        this.id = id;
        this.username = username;
        this.image = image;
        this.sex = sex;
        this.eduBackgroud = eduBackgroud;
        this.university = university;
        this.majorAndGrade = majorAndGrade;
        this.entryUniversity = entryUniversity;
        this.leaveUniversity = leaveUniversity;
        this.qq = qq;
        this.skills = skills;
        this.experience = experience;
        this.selfFeel = selfFeel;
        this.level = level;
        this.email = email;
        this.role = role;
    }

    public PersonData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEduBackgroud() {
        return eduBackgroud;
    }

    public void setEduBackgroud(String eduBackgroud) {
        this.eduBackgroud = eduBackgroud;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajorAndGrade() {
        return majorAndGrade;
    }

    public void setMajorAndGrade(String majorAndGrade) {
        this.majorAndGrade = majorAndGrade;
    }

    public long getEntryUniversity() {
        return entryUniversity;
    }

    public void setEntryUniversity(long entryUniversity) {
        this.entryUniversity = entryUniversity;
    }

    public long getLeaveUniversity() {
        return leaveUniversity;
    }

    public void setLeaveUniversity(long leaveUniversity) {
        this.leaveUniversity = leaveUniversity;
    }

    public long getQq() {
        return qq;
    }

    public void setQq(long qq) {
        this.qq = qq;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSelfFeel() {
        return selfFeel;
    }

    public void setSelfFeel(String selfFeel) {
        this.selfFeel = selfFeel;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
