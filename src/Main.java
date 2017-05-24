import org.apache.commons.lang.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 判断一个字符串是不是全为数字的判断你方法
 */
public class Main {

    public static void main(String[] args) {
        String str = "1312987989";
        String str1 = "13129qwdqwd87989";
        System.out.println("第一种方法:str:"+judge1(str));
        System.out.println("第一种方法:str1:" + judge1(str1));

        System.out.println("第二种方法:str:"+judge2(str));
        System.out.println("第二种方法:str1:"+judge2(str1));
        System.out.println("第三种方法:str:"+judge3(str));
        System.out.println("第三种方法:str1:"+judge3(str1));
    }

    /**
     * 用java自带的方法来判断是否全是数字
     *
     * @param str
     * @return
     */
    public static boolean judge1(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 正则表达式来判断是否全是数字
     *
     * @param str
     * @return
     */
    public static boolean judge2(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 使用StringUtil来判断
     *
     * @param str
     * @return
     */
    public static boolean judge3(String str) {
        return StringUtils.isNumeric(str);
    }
}
