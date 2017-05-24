import com.sun.org.apache.xerces.internal.xs.StringList;
import org.apache.commons.lang.StringUtils;

/**
 * github:https://github.com/Brioal
 * email:brioal@foxmail.com
 * Created by Brioal on 2017/5/24.
 */
public class StringUtilsTest {

    public static void main(String[] args) {
        System.out.println("-------判断是否是以某段字符串开头的---------");
        System.out.println(StringUtils.startsWith("advs","a"));
        System.out.println(StringUtils.startsWith("bgdwa", "a"));
        System.out.println("-------判断是否以某段字符串开始,不区分大小写---------");
        System.out.println(StringUtils.startsWithIgnoreCase("sadc","s"));
        System.out.println(StringUtils.startsWithIgnoreCase("Ssadc","s"));
        System.out.println(StringUtils.startsWithIgnoreCase("dsadc","s"));
        System.out.println("-------判断开始字符串,多项匹配---------");
        System.out.println(StringUtils.startsWithAny("abcde",new String[]{"a","d"}));
        System.out.println(StringUtils.startsWithAny("dbcde",new String[]{"a","d"}));
        System.out.println("-------判断结束的字符串---------");
        System.out.println(StringUtils.endsWith("adcde", "e"));
        System.out.println(StringUtils.endsWith("adcde", "f"));
        System.out.println("-------替换字符串,指定次数---------");
        System.out.println(StringUtils.replace("sssadc", "s", "a"));//全部替换
        System.out.println(StringUtils.replaceOnce("sssadc", "s", "a"));//一次替换
        System.out.println(StringUtils.replace("sssadc", "s", "a",2));//两次替换
        System.out.println("-------替换字符串,分别匹配---------");
        System.out.println(StringUtils.replaceEach("www.baidu.com",new String[]{"baidu","com"},new String[]{"taobao","net"}));
        System.out.println("-------判断字符串是否相等,是否区分大小写---------");
        System.out.println(StringUtils.equals("",""));
        System.out.println(StringUtils.equals(null,""));
        System.out.println(StringUtils.equals("s","s"));
        System.out.println(StringUtils.equalsIgnoreCase("S","s"));
        System.out.println("-------字符第一次出现的位置---------");
        System.out.println(StringUtils.indexOfIgnoreCase("abcdefgh", "4"));
        System.out.println(StringUtils.indexOfIgnoreCase("abcdefgh", "c"));
        System.out.println("-------字符最后一次出现的位置---------");
        System.out.println(StringUtils.lastIndexOf("abcdefgh","4"));
        System.out.println(StringUtils.lastIndexOf("abcdecfghc","c"));
        System.out.println("-------字符最后一次出现的位置,匹配数组---------");
        System.out.println(StringUtils.lastIndexOfAny("abcdef",new String[]{"d","c"}));
        System.out.println(StringUtils.lastIndexOfAny("abcdef",new String[]{"g","h"}));
        System.out.println("-------字符不在字符串中的第一次出现的位置---------");
        System.out.println(StringUtils.indexOfAnyBut("abcdef", "g"));
        System.out.println(StringUtils.indexOfAnyBut("abcdef", "a"));
        System.out.println("-------连续共有的长度---------");
        System.out.println(StringUtils.indexOfDifference("abcd","abc"));
        System.out.println(StringUtils.indexOfDifference("abcd","a"));
        System.out.println("-------连续共有部分---------");
        //参数1比较参数2,参数1缺少的部分
        System.out.println(StringUtils.difference("abc","abcd"));
        System.out.println(StringUtils.difference("a", "asadasd"));
        System.out.println("-------指定位置查找---------");
        System.out.println(StringUtils.indexOfIgnoreCase("abcdefgh", "f"));
        System.out.println(StringUtils.indexOfIgnoreCase("abfcdefgh", "f",3));
        System.out.println("-------指定位置开始截取字符串---------");
        System.out.println(StringUtils.substring("abcdefgh",3));
        System.out.println(StringUtils.substringBefore("abcdefghj","e"));
        System.out.println("-------截取参数2和参数3中间的字符---------");
        System.out.println(StringUtils.substringBetween("dskeabcedeh", "ds"));
        System.out.println(StringUtils.substringBetween("dskeabcedeh", "ds",
                "e"));
        System.out.println("-------分割字符串---------");
        System.out.println(StringUtils.split("123,456,789",",")[0]);
        System.out.println("-------按不同类型进行分割字符串---------");
        System.out.println(StringUtils.splitByCharacterType("123ABCabc")[0]);
        System.out.println("-------指定位数,不足的时候左边用字符补充---------");
        System.out.println(StringUtils.leftPad("abc", 10, "a"));
        System.out.println("-------将数组里面的字符串用指定字符拼接起来---------");
        System.out.println(StringUtils.join(new String[]{"abc","def","ght"},":"));
        System.out.println("-------字符串中开头字符大写(空格隔开)---------");
        System.out.println(StringUtils.capitalize("hello test main"));
        System.out.println("-------计算一个字符在字符串中出现的次数---------");
        System.out.println(StringUtils.countMatches("adwqadfwea","ad"));
        System.out.println("-------计算两个字符串之间的最少编辑次数---------");
        System.out.println(StringUtils.getLevenshteinDistance("Brioal","bmob"));
    }
}
