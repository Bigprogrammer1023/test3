package com.example.qpf.myapplication0905;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.qpf.myapplication0905.pojo.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbManager dbManager = new DbManager(this);
//        SQLiteOpenHelper sqLiteOpenHelper = new SQliteopenHelper(this,"student.db",null,1);
//        SQLiteDatabase db = sqLiteOpenHelper.getWritableDatabase();
//        String sql = "insert into student(name,age,sex) values('张三',18,'true')";
//        db.execSQL(sql);
//        ContentValues cv = new ContentValues();
//        cv.put("name","qiu");
//        cv.put("age",20);
//        cv.put("sex","true");
//        db.insert("student","id",cv);
//        db.close();
//        String sql = "delete from student where name = 'by'";
//        db.execSQL(sql);
//        db.close();
//        db.delete("student","id = ?",new String[]{"3"});
//        db.close();
//        String sql = "update student set name = 'qiupengfei' where id = '1' ";
//        db.execSQL(sql);
//        db.close();
//        ContentValues cv = new ContentValues();
//        cv.put("name","仇鹏飞");
//        cv.put("age",18);
//        db.update("student",cv,"id = ?",new String[]{"1"});
//        db.close();
//        Cursor c = db.query("student",new String[]{"name","age"},null,null,null,null,null);
//        List<Student> list = new ArrayList<>();
//        while (c.moveToNext())
//        {
//            Student student = new Student();
//            String name = c.getString(0);
//            int age = c.getInt(1);
//            student.setName(name);
//            student.setAge(age);
//            list.add(student);
//        }
//        TextView textView = (TextView) findViewById(R.id.main_textview);
//        textView.setText("");
//        for (Student s :list)
//        {
//            textView.append(s.getName()+" "+s.getAge()+"\n");
//        }
        // 在/res/raw下操作数据库
//        InputStream in = getResources().openRawResource(R.raw.sms);
//        File file = getExternalFilesDir("");
//        File newFile = new File(file,"sms.db");
//        try
//        {
//            OutputStream out = new FileOutputStream(newFile);
//            byte [] b = new byte[1024];
//            int len = 0;
//            while((len=in.read(b))!=-1)
//            {
//                out.write(b,0,len);
//            }
//            out.close();
//            in.close();
//        } catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        TextView textView = (TextView) findViewById(R.id.main_textview);
//        textView.setText("");
//        String sql = "select zname from ZSMSCATEGORY";
//        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(newFile,null);
//        Cursor cursor = db.rawQuery(sql,null);
//        while(cursor.moveToNext())
//        {
//            String name = cursor.getString(0);
//            textView.append(name+"\n");
//        }
        //在/assets下操作数据库
//        InputStream in = null;
//        try {
//            in = getAssets().open("sms.db");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        File file = getExternalFilesDir("");
//        File newFile = new File(file,"test.db");
//        try
//        {
//            OutputStream out = new FileOutputStream(newFile);
//            int len = 0;
//            byte [] b = new byte[1024];
//            while ((len=in.read(b))!=-1)
//            {
//                out.write(b,0,len);
//            }
//            out.close();
//            in.close();
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        TextView textView = (TextView) findViewById(R.id.main_textview);
//        textView.setText("");
//        String sql = "select zname from ZSMSCATEGORY";
//        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(newFile,null);
//        Cursor cursor = db.rawQuery(sql,null);
//        while(cursor.moveToNext())
//        {
//            String name = cursor.getString(0);
//            textView.append(name+"\n");
//        }
//        cursor.close();
    }
}
