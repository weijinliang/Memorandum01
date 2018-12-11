package com.example.administrator.memorandum01;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2018/12/10 0010.
 */
public class DbHelper extends SQLiteOpenHelper{
        public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version){
           super(context,name,factory,version);
        }
    @Override
    public void onCreate(SQLiteDatabase db){
        StringBuilder sql=new StringBuilder();
        //创建数据库表
        sql.append("create table if not exists tb_bwl(")
                //主键id
                .append("id integer primary key autoincrement,")
                //标题
                .append("title varchar(50),")
                //文本
                .append("content varchar(200),")
                //时间
                .append("createDate varchar(10),")
                .append("noticeDate varchar(10),")
                .append("noticeTime varchar(5) )");
                db.execSQL(sql.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0,int arg1,int arg2){

    }

}
