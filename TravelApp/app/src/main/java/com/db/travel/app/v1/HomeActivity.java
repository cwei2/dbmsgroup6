package com.db.travel.app.v1;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.db.travel.app.v1.constant.SQLCommand;
import com.db.travel.app.v1.util.DBOperator;


public class HomeActivity extends Activity implements View.OnClickListener {

    Button searchBtn;
    EditText region, destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        region = (EditText) this.findViewById(R.id.region_editText);
        destination = (EditText) this.findViewById(R.id.dest_editText);
        searchBtn = (Button) this.findViewById(R.id.search_btn);
        searchBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        Cursor cursor = DBOperator.getInstance().execQuery(SQLCommand.QUERY_2,
                this.getArgs(true));

        while(cursor.moveToNext()) {
            int regId = Integer.parseInt(cursor.getString(0));
            System.out.println("Reg Id = "+regId);
        }
        int id=v.getId();
        if (id==R.id.search_btn){
            Intent intent = new Intent(this, SelectActivity.class); //Need to put the activity class of the next page
            this.startActivity(intent);
        }
    }

    private String[] getArgs(boolean region1) {
        String args[] = null;
        args[0] = region.getText().toString();
        return args;
    }
}
