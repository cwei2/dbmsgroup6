package com.db.travel.app.v1;

import android.app.Activity;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;

/**
 * Created by Nupurb on 15-11-2015.
 */
public class WelcomeActivity extends Activity implements View.OnClickListener{

    @Override
    public void onClick(View v)
    {
        int id=v.getId();
        if (id== R.id.Welcome_Page_Btn){
            Intent intent = new Intent(this, HomeActivity.class); 
            this.startActivity(intent);
        }
    }
}
