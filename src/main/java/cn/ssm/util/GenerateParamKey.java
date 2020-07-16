package cn.ssm.util;

/**
 * @author zhoujl
 */
public class GenerateParamKey {
    private static SnowflakeAlgorithm SNOWFLAKE = new SnowflakeAlgorithm(1,1,1);
    private GenerateParamKey(){}
    public static long snowflakeGenerate(){
        return SNOWFLAKE.nextId();
    }
}
