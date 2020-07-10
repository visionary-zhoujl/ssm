package cn.ssm.util;

/**
 * @author zhoujl
 */
public class GenerateParmeKey {
    private static SnowflakeAlgorithm SNOWFLAKE = new SnowflakeAlgorithm(1,1,1);
    private GenerateParmeKey(){}
    public static long snowflakeGenerate(){
        return SNOWFLAKE.nextId();
    }
}
