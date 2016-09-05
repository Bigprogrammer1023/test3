package com.example.qpf.myapplication0905;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by QPF on 2016/9/5.
 */
public class DbManager
{
    private File newFile;
    public DbManager(Context context)
    {
        File file = context.getExternalFilesDir("");
        newFile = new File(file,"text.db");
        if (newFile.exists())
        {
            return;
        }
        else
        {
            copy(context);
        }
    }
    private void copy(Context context)
    {
        try
        {
            OutputStream out = new FileOutputStream(newFile);
            InputStream in = context.getResources().openRawResource(R.raw.sms);
            byte [] b = new byte[1024];
            int len = 0;
            while((len=in.read(b))!=-1)
            {
                out.write(b,0,len);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void insert(int id)
    {
        String sql = "insert into ";
    }
}
