package org.god.core;

/**
 * Created 12-03-2022  4:18 PM
 * Author  Dino
 */
public class GodMappedStatement {
    private String sqlId;
    private String resultType;
    private String sql;
    private String parameterType;

    public GodMappedStatement(String sqlId, String resultType, String sql, String parameterType, String sqlType) {
        this.sqlId = sqlId;
        this.resultType = resultType;
        this.sql = sql;
        this.parameterType = parameterType;
    }



    @Override
    public String toString() {
        return "GodMappedStatement{" +
                "sqlId='" + sqlId + '\'' +
                ", resultType='" + resultType + '\'' +
                ", sql='" + sql + '\'' +
                ", parameterType='" + parameterType + '\'' +
                '}';
    }

    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public GodMappedStatement() {
    }
}
