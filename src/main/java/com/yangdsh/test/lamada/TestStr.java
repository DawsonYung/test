package com.yangdsh.test.lamada;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2018/12/25 14:55
 * @Version 1.0
 */
public class TestStr {
    public static void main(String[] args) {
        String str = "[{\"companyName\":\"杨得胜\"},{\"roleList\":[{\"roleName\":\"PLATFORM_ADMIN\"},{\"roleName\":\"ROLE_USER\"}],\"username\":\"admin\"}]";
        String newStr = str.substring(str.indexOf("{"),str.indexOf("}")+1);
        System.out.println(newStr);

        String str1 = "helppwer";
//        System.out.println(str1.substring(4));
        System.out.println(str1.substring(0,3));

    }
}
