package cn.edu.swpu.cins.weike.util;

public class RedisKey {

    //消息队列
    private static String BIZ_EVENTQUEUE = "EVENT_QUEUE";
    //注册
    private static String BIZ_REGISTER = "REGISTER";

    private static String SPLIT = ":";
    //找回密码
    private static String BIZ_FIND_PASSWORD = "FIND_PWD";

    //正在申请的项目
    private static String BIZ_APPLYING_PRO = "JOINING_PRO";

    //申请失败的项目
    private static String BIZ_JOIN_FAIL = "JOIN_FAIL";

    //申请成功的项目
    private static String BIZ_JOIN_SUCCESS = "JOIN_SUCCESS";

    //项目成功申请人（项目团队）
    private static String BIZ_PRO_APPLICANT = "PRO_APPLICANT";

    //项目正在申请人（正在考察的人）
    private static String BIZ_PRO_APPLYING = "PRO_APPLYING";

    //项目申请失败
    private static String BIZ_PRO_APPLY_FAIL = "PRO_APPLY_FAIL";

    //项目点击数
    private static String BIZ_PRO_CLICK_NUM = "PRO_CLICK_NUM";

    //每个人关注的项目
    private static String BIZ_ATTENTION_PRO = "ATTENTION_PRO";

    //项目有哪些人关注
    private static String BIZ_PRO_FOLLOWER = "PRO_FOLLOWER";



    public static String getEventQueueKey() {
        return BIZ_EVENTQUEUE;
    }

    public static String getBizRegisterKey(String username) {
        return BIZ_REGISTER + SPLIT + username;
    }

    public static String getBizFindPassword(String username) {
        return BIZ_FIND_PASSWORD + SPLIT + username;
    }

    public static String getBizApplyingPro(String username) {
        return BIZ_APPLYING_PRO + SPLIT + username;
    }

    public static String getBizProApplicant(String projectName) {
        return BIZ_PRO_APPLICANT + SPLIT + projectName;
    }

    public static String getBizJoinFail(String username) {
        return BIZ_JOIN_FAIL + SPLIT + username;
    }

    public static String getBizJoinSuccess(String username) {
        return BIZ_JOIN_SUCCESS + SPLIT + username;
    }

    public static String getBizProApplying(String projectName) {
        return BIZ_PRO_APPLYING + SPLIT + projectName;
    }

    public static String getBizProApplyFail(String projectName) {
        return BIZ_PRO_APPLY_FAIL + SPLIT + projectName;
    }

    public static String getBizProClickNum(String projectName) {
        return BIZ_PRO_CLICK_NUM + SPLIT + projectName;
    }

    public static String getBizAttentionPro(String username) {
        return BIZ_ATTENTION_PRO + SPLIT + username;
    }

    public static String getBizProFollower(String projectName) {
        return BIZ_PRO_FOLLOWER + SPLIT + projectName;
    }
}
