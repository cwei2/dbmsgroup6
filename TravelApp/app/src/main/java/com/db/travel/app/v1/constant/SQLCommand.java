package com.db.travel.app.v1.constant;

public abstract class SQLCommand
{
    public static String QUERY_1 = "select dest_name from destination;";
    public static String QUERY_2 = "select reg_id from region where reg_name=?";

}
