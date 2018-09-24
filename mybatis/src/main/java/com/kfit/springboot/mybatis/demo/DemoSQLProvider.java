package com.kfit.springboot.mybatis.demo;

import org.apache.ibatis.jdbc.SQL;

public class DemoSQLProvider {
    public String providreQuery1(Demo demo){
        StringBuffer sql = new StringBuffer("select * from test2 where 1=1 ");
        if(demo.getName() != null){
            sql.append("and name=#{name} ");
        }
        if(demo.getTestName() != null){
            sql.append("and test_name=#{testName}");
        }
        return sql.toString();
    }
    public String providerQuery2(Demo demo){
        return new SQL(){{
            SELECT("id,name");FROM("test2");
            if(demo.getName() !=null){
                WHERE("name=#{name}");
            }
            if(demo.getTestName() != null){
                WHERE("test_name=#{testName}");
            }
        }}.toString();
    }

    public String insert(Demo demo) {
        return new SQL(){{
            INSERT_INTO("test2");
            VALUES("createDate","#{createDate}");
//            INTO_COLUMNS("name","test_name","createDate");
            if(demo.getName()!=null){
                VALUES("name","#{name}");
            }
            if(demo.getTestName()!=null){
                VALUES("test_name","#{testName}");
            }
        }}.toString();
    }

    public String update(final Demo demo){
        return new SQL(){{
            UPDATE("test2");
            if(demo.getName()!=null){
                SET("name=#{name}");
            }
            if(demo.getTestName()!=null){
                SET("test_name=#{testName}");
            }
            WHERE("id=#{id}");
        }}.toString();
    }
}
